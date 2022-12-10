package dev.avian_games.Quested;

import io.wispforest.owo.ui.base.BaseOwoScreen;
import io.wispforest.owo.ui.base.BaseUIModelScreen;
import io.wispforest.owo.ui.component.ButtonComponent;
import io.wispforest.owo.ui.component.Components;
import io.wispforest.owo.ui.container.CollapsibleContainer;
import io.wispforest.owo.ui.container.Containers;
import io.wispforest.owo.ui.container.FlowLayout;
import io.wispforest.owo.ui.core.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class QuestedMenu extends BaseOwoScreen<FlowLayout> {

    @Override
    protected @NotNull OwoUIAdapter<FlowLayout> createAdapter() {
        return OwoUIAdapter.create(this, Containers::verticalFlow);
    }
    @Override
    protected void build(FlowLayout rootComponent) {
        rootComponent
        .surface(Surface.VANILLA_TRANSLUCENT)
        .horizontalAlignment(HorizontalAlignment.CENTER)
        .verticalAlignment(VerticalAlignment.CENTER);
        rootComponent.child(
                Containers.verticalFlow(Sizing.content(), Sizing.content())
                .child(Containers.collapsible(Sizing.content(), Sizing.content(), Text.literal("Quests"), false)
                .child(Components.button(Text.literal("A Button"), (ButtonComponent button) -> { System.out.println("click"); }))
                )
                .padding(Insets.of(5))
                .surface(Surface.DARK_PANEL)
                .verticalAlignment(VerticalAlignment.CENTER)
                .horizontalAlignment(HorizontalAlignment.CENTER)
                .positioning(Positioning.absolute(3,5))

        );
    }
}
