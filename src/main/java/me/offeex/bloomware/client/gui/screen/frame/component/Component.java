package me.offeex.bloomware.client.gui.screen.frame.component;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

public abstract class Component {
    public final static MinecraftClient mc = MinecraftClient.getInstance();
    public final static int COMPONENT_HEIGHT = 14;
    public int offsetNested = 5;

    public abstract void render(MatrixStack matrix);

    public void updateComponent(double mouseX, double mouseY) {}

    public void mouseClicked(double mouseX, double mouseY, int button) {}

    public void mouseReleased(double mouseX,  double mouseY,  int mouseButton) {}

    public void keyTyped(int key) {}

    public void setOffsetY(int offsetY) {}

    public int getHeight() { return 0; }
}
