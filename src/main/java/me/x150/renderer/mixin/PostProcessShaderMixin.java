package me.x150.renderer.mixin;

import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.PostProcessShader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(PostProcessShader.class)
public interface PostProcessShaderMixin {
    @Mutable
    @Accessor("input")
    void setInput(Framebuffer framebuffer);

    @Mutable
    @Accessor("output")
    void setOutput(Framebuffer framebuffer);
}
