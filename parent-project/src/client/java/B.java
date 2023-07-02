import net.fabricmc.api.ClientModInitializer;

public class B implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("THAT IS BRILLIANT!");
    }
}
