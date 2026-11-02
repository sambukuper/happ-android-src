.class public final Lyx8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public X:Ln97;

.field public Y:Log7;

.field public Z:Lxx8;

.field public f0:Z


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lyx8;->Z:Lxx8;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lyx8;->f0:Z

    .line 8
    .line 9
    iget-object p0, p1, Lxx8;->X:Lv76;

    .line 10
    .line 11
    iget-object p1, p1, Lxx8;->Y:Lv63;

    .line 12
    .line 13
    iget-object v0, p0, Lv76;->b:Lm51;

    .line 14
    .line 15
    iget-object v1, p0, Lv76;->a:Ls76;

    .line 16
    .line 17
    iget-object v1, v1, Ls76;->c:Lvz7;

    .line 18
    .line 19
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ls61;

    .line 24
    .line 25
    new-instance v2, Lt76;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-direct {v2, p0, p1, v3, v4}, Lt76;-><init>(Lv76;Lv63;Lq51;B)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x2

    .line 33
    invoke-static {v0, v1, v2, p0}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p1, p0}, Lw39;->J(Lv63;Lyg1;)Lbq1;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lyx8;->Z:Lxx8;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lxx8;->f0:Lg94;

    .line 6
    .line 7
    iget-object v0, p0, Lxx8;->g0:Lbm3;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-interface {v0, v1}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lxx8;->Z:Llq2;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lg94;->f(Lc94;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lg94;->f(Lc94;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method
