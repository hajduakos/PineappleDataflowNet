package hu.bme.mit.mdsd.pineapple.dataflownet.ui.generator;

import com.google.common.collect.Iterables;
import dataflownet.DataflowSystem;
import hu.bme.mit.mdsd.pineapple.dataflownet.ui.generator.helper.GeneratorHelper;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import typehierarchy.ComplexType;
import typehierarchy.Type;
import typehierarchy.UserType;

@SuppressWarnings("all")
public class UIGenerator {
  public IFile generate(final Resource res) {
    try {
      IFile _xblockexpression = null;
      {
        EList<EObject> _contents = res.getContents();
        EObject content = _contents.get(0);
        IFile _xifexpression = null;
        if ((content instanceof DataflowSystem)) {
          IFile _xblockexpression_1 = null;
          {
            DataflowSystem ds = ((DataflowSystem) content);
            String namespace = "hu.bme.mit.mdsd.pineapple.dataflownet.process.ui";
            GeneratorHelper.createProject(namespace);
            CharSequence _generateChannelMediator = this.generateChannelMediator(ds);
            _xblockexpression_1 = GeneratorHelper.createJavaFile(namespace, namespace, "ChannelMediator", Boolean.valueOf(false), _generateChannelMediator);
          }
          _xifexpression = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence generateChannelMediator(final DataflowSystem ds) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package hu.bme.mit.mdsd.pineapple.dataflownet.process.ui;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.Channel;");
    _builder.newLine();
    _builder.append("import hu.bme.mit.mdsd.pineapple.dataflownet.process.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ChannelMediator {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static boolean putToChannel(Channel<? extends Comparable<?>> channel, String valueString){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(channel.getClazz() == String.class){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("channel.put(valueString);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("else if (channel.getClazz() == Integer.class) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("try{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Integer intValue = Integer.parseInt(valueString);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("channel.put(intValue);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("} catch (NumberFormatException ex){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("else if (channel.getClazz() == Double.class) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("try{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Double doubleValue = Double.parseDouble(valueString);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("channel.put(doubleValue);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("} catch (NumberFormatException ex){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("else if (channel.getClazz() == Boolean.class) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (!valueString.toLowerCase().equals(\"true\") && !valueString.toLowerCase().equals(\"false\"))return false;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("boolean boolValue = Boolean.parseBoolean(valueString);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("channel.put(boolValue);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    {
      EList<Type> _types = ds.getTypes();
      Iterable<UserType> _filter = Iterables.<UserType>filter(_types, UserType.class);
      for(final UserType userType : _filter) {
        _builder.append("\t\t");
        _builder.append("else if (channel.getClazz() == ");
        String _name = userType.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "\t\t");
        _builder.append(".class) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("try {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        String _name_1 = userType.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
        _builder.append(_firstUpper_1, "\t\t\t\t");
        _builder.append(" enumValue = ");
        String _name_2 = userType.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper_2, "\t\t\t\t");
        _builder.append(".valueOf(valueString);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("channel.put(enumValue);");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("}catch(IllegalArgumentException ex) {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      EList<Type> _types_1 = ds.getTypes();
      Iterable<ComplexType> _filter_1 = Iterables.<ComplexType>filter(_types_1, ComplexType.class);
      for(final ComplexType complexType : _filter_1) {
        _builder.append("\t\t");
        _builder.append("else if (channel.getClazz() == ");
        String _name_3 = complexType.getName();
        String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
        _builder.append(_firstUpper_3, "\t\t");
        _builder.append(".class) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        String _name_4 = complexType.getName();
        String _firstUpper_4 = StringExtensions.toFirstUpper(_name_4);
        _builder.append(_firstUpper_4, "\t\t\t");
        _builder.append(" complexValue = ");
        String _name_5 = complexType.getName();
        String _firstUpper_5 = StringExtensions.toFirstUpper(_name_5);
        _builder.append(_firstUpper_5, "\t\t\t");
        _builder.append(".convertTo(valueString);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("if(complexValue != null){");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("channel.put(complexValue);");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("} else {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("return false;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
