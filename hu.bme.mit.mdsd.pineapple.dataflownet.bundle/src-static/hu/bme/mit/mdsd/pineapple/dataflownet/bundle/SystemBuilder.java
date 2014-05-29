package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;

import java.util.List;
import java.util.Set;

public interface SystemBuilder extends IDataflowNetView {
    void init();
    void startStateMachines();
    void stopStateMachines();
    void addListener(IDataflowNetView view);
    void removeListener(IDataflowNetView view);
    List<StateMachine> getStateMachines();
    Set<String> getChannelNames();
    Channel<? extends Comparable<?>> getChannelByName(String name);
}
