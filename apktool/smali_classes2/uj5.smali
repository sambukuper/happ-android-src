.class public final Luj5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lf91;


# instance fields
.field public final X:Lc6;


# direct methods
.method public constructor <init>(Lc6;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Luj5;->X:Lc6;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object p0, p0, Luj5;->X:Lc6;

    .line 2
    .line 3
    iget-object p0, p0, Lc6;->k0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Landroid/view/View;

    .line 6
    .line 7
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    instance-of v1, p0, Lhk5;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast p0, Lhk5;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    :goto_0
    if-nez p0, :cond_1

    .line 23
    .line 24
    return v0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lhk5;->r()Lgk5;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-object p0, p0, Lgk5;->X:Lfu6;

    .line 30
    .line 31
    iget-object p0, p0, Lfu6;->f0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0
.end method

.method public final d()V
    .locals 2

    .line 1
    invoke-static {p0}, Lhi5;->a0(Lf91;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lue3;->y(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object p0, p0, Luj5;->X:Lc6;

    .line 10
    .line 11
    iget-object v1, p0, Lc6;->m0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Landroid/widget/LinearLayout;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lc6;->n0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Landroid/widget/LinearLayout;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lc6;->l0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Landroid/widget/LinearLayout;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Luj5;->X:Lc6;

    .line 2
    .line 3
    iget-object v1, v0, Lc6;->m0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    new-instance v2, Lek5;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v2, p0, v3}, Lek5;-><init>(Luj5;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, Lc6;->n0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Landroid/widget/LinearLayout;

    .line 19
    .line 20
    new-instance v2, Lek5;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-direct {v2, p0, v3}, Lek5;-><init>(Luj5;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v0, Lc6;->l0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Landroid/widget/LinearLayout;

    .line 32
    .line 33
    new-instance v1, Lek5;

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    invoke-direct {v1, p0, v2}, Lek5;-><init>(Luj5;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final q()Lov8;
    .locals 0

    .line 1
    iget-object p0, p0, Luj5;->X:Lc6;

    .line 2
    .line 3
    return-object p0
.end method
