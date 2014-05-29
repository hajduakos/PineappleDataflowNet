package hu.bme.mit.mdsd.pineapple.ui.buttons.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public abstract class AbstractDataflowNetHandler extends AbstractHandler {
  
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ISelection selection = HandlerUtil.getCurrentSelection(event);

        if (selection instanceof IStructuredSelection) {

            for (Object element : ((IStructuredSelection) selection).toList()) {
                if (element instanceof IFile) {
                    IFile file = (IFile) element;
                    handleFile(event,file);
                }
            }
        }
        return null;
    }

    protected abstract void handleFile(ExecutionEvent event, IFile file);


}
