package dev.avian_games.Quested;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = "quested")
@Config(name = "quested-config", wrapperName = "QuestedConfig")
public class QuestedConfig {
    public int anIntOption = 16;
    public boolean aBooleanToggle = false;

    public Choices anEnumOption = Choices.ANOTHER_CHOICE;

    public enum Choices {
        A_CHOICE, ANOTHER_CHOICE;
    }
}
