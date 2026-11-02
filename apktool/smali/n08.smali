.class public final Ln08;
.super Lne3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public t0:Lgn2;

.field public u0:Lc29;


# virtual methods
.method public final Q0()V
    .locals 3

    .line 1
    invoke-static {p0}, Lys0;->S(Lnh1;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lc29;->w:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-static {v0}, Lhw7;->c(Landroid/view/View;)Lc29;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1, v0}, Lc29;->a(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Ln08;->t0:Lgn2;

    .line 15
    .line 16
    invoke-interface {v0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lv09;

    .line 21
    .line 22
    iget-object v2, p0, Lne3;->s0:Lv09;

    .line 23
    .line 24
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    iput-object v0, p0, Lne3;->s0:Lv09;

    .line 31
    .line 32
    invoke-virtual {p0}, Lne3;->Z0()V

    .line 33
    .line 34
    .line 35
    :cond_0
    iput-object v1, p0, Ln08;->u0:Lc29;

    .line 36
    .line 37
    invoke-super {p0}, Lie3;->Q0()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final R0()V
    .locals 3

    .line 1
    invoke-static {p0}, Lys0;->S(Lnh1;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ln08;->u0:Lc29;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget v2, v1, Lc29;->u:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    iput v2, v1, Lc29;->u:I

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    sget-object v2, Lcw8;->a:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v0, v2}, Luv8;->c(Landroid/view/View;Lp95;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v2}, Lc19;->a(Landroid/view/View;Ljv0;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, v1, Lc29;->v:Lke3;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-super {p0}, Lie3;->R0()V

    .line 32
    .line 33
    .line 34
    return-void
.end method
