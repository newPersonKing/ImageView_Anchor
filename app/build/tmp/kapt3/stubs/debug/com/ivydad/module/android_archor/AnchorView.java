package com.ivydad.module.android_archor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJD\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0002J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003JF\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006!"}, d2 = {"Lcom/ivydad/module/android_archor/AnchorView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "containerImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "getContainerImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "setContainerImageView", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "addAnchor", "", "loadImgWidth", "loadImgHeight", "anchorInfo", "Lcom/ivydad/module/android_archor/AnchorInfo;", "anchorClick", "Lkotlin/Function1;", "anchorWidth", "anchorHeight", "initView", "setAnchorData", "anchorinfos", "", "contentUrl", "", "app_debug"})
public final class AnchorView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.widget.AppCompatImageView containerImageView;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.widget.AppCompatImageView getContainerImageView() {
        return null;
    }
    
    public final void setContainerImageView(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.AppCompatImageView p0) {
    }
    
    public final void initView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void setAnchorData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ivydad.module.android_archor.AnchorInfo> anchorinfos, @org.jetbrains.annotations.NotNull()
    java.lang.String contentUrl, int anchorWidth, int anchorHeight, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ivydad.module.android_archor.AnchorInfo, kotlin.Unit> anchorClick) {
    }
    
    private final void addAnchor(int loadImgWidth, int loadImgHeight, com.ivydad.module.android_archor.AnchorInfo anchorInfo, kotlin.jvm.functions.Function1<? super com.ivydad.module.android_archor.AnchorInfo, kotlin.Unit> anchorClick, int anchorWidth, int anchorHeight) {
    }
    
    public AnchorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public AnchorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public AnchorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
}