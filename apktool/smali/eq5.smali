.class public final Leq5;
.super Lc13;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# virtual methods
.method public final Z0(Lfq5;)V
    .locals 1

    .line 1
    sget-object v0, Ly01;->w:Lox1;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lgq5;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    check-cast p0, Lwb;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    sget-object p1, Lfq5;->a:Llh4;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object p1, Lci8;->c:Lsf;

    .line 21
    .line 22
    :cond_0
    sget-object v0, Lmc;->a:Lmc;

    .line 23
    .line 24
    iget-object p0, p0, Lwb;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 25
    .line 26
    invoke-virtual {v0, p0, p1}, Lmc;->a(Landroid/view/View;Lfq5;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final o()Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p0, "androidx.compose.ui.input.pointer.PointerHoverIcon"

    .line 2
    .line 3
    return-object p0
.end method
