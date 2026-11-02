.class public final Lri1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/util/RandomAccess;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public static g(Landroidx/compose/ui/node/LayoutNode;Lq31;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/LayoutNode;->k0:Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    if-eqz p1, :cond_2

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v1, Lr34;->q:Lbj4;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-wide v3, p1, Lq31;->a:J

    .line 19
    .line 20
    invoke-virtual {v0, v3, v4}, Lbj4;->r0(J)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move p1, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    iget-object p1, v1, Lr34;->q:Lbj4;

    .line 28
    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget-object v1, p1, Lbj4;->p0:Lq31;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-eqz v1, :cond_1

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-wide v0, v1, Lq31;->a:J

    .line 43
    .line 44
    invoke-virtual {p1, v0, v1}, Lbj4;->r0(J)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz p1, :cond_6

    .line 53
    .line 54
    if-eqz v0, :cond_6

    .line 55
    .line 56
    iget-object v1, v0, Landroidx/compose/ui/node/LayoutNode;->k0:Landroidx/compose/ui/node/LayoutNode;

    .line 57
    .line 58
    const/4 v3, 0x3

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    invoke-static {v0, v2, v3}, Landroidx/compose/ui/node/LayoutNode;->Y(Landroidx/compose/ui/node/LayoutNode;ZI)V

    .line 62
    .line 63
    .line 64
    return p1

    .line 65
    :cond_4
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->s()Lm34;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v4, Lm34;->X:Lm34;

    .line 70
    .line 71
    if-ne v1, v4, :cond_5

    .line 72
    .line 73
    invoke-static {v0, v2, v3}, Landroidx/compose/ui/node/LayoutNode;->W(Landroidx/compose/ui/node/LayoutNode;ZI)V

    .line 74
    .line 75
    .line 76
    return p1

    .line 77
    :cond_5
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->s()Lm34;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    sget-object v1, Lm34;->Y:Lm34;

    .line 82
    .line 83
    if-ne p0, v1, :cond_6

    .line 84
    .line 85
    invoke-virtual {v0, v2}, Landroidx/compose/ui/node/LayoutNode;->V(Z)V

    .line 86
    .line 87
    .line 88
    :cond_6
    return p1
.end method

.method public static h(Landroidx/compose/ui/node/LayoutNode;Lq31;)Z
    .locals 4

    .line 1
    sget-object v0, Lm34;->Z:Lm34;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, Landroidx/compose/ui/node/LayoutNode;->E0:Lm34;

    .line 7
    .line 8
    if-ne v2, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->e()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 14
    .line 15
    iget-object v0, v0, Lr34;->p:Lwr4;

    .line 16
    .line 17
    iget-wide v2, p1, Lq31;->a:J

    .line 18
    .line 19
    invoke-virtual {v0, v2, v3}, Lwr4;->r0(J)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget-object p1, p0, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 25
    .line 26
    iget-object p1, p1, Lr34;->p:Lwr4;

    .line 27
    .line 28
    iget-boolean v2, p1, Lwr4;->l0:Z

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    iget-wide v2, p1, Leo5;->f0:J

    .line 33
    .line 34
    new-instance p1, Lq31;

    .line 35
    .line 36
    invoke-direct {p1, v2, v3}, Lq31;-><init>(J)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/4 p1, 0x0

    .line 41
    :goto_0
    if-eqz p1, :cond_4

    .line 42
    .line 43
    iget-object v2, p0, Landroidx/compose/ui/node/LayoutNode;->E0:Lm34;

    .line 44
    .line 45
    if-ne v2, v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->e()V

    .line 48
    .line 49
    .line 50
    :cond_3
    iget-object v0, p0, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 51
    .line 52
    iget-object v0, v0, Lr34;->p:Lwr4;

    .line 53
    .line 54
    iget-wide v2, p1, Lq31;->a:J

    .line 55
    .line 56
    invoke-virtual {v0, v2, v3}, Lwr4;->r0(J)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move p1, v1

    .line 65
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz p1, :cond_6

    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->r()Lm34;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    sget-object v3, Lm34;->X:Lm34;

    .line 78
    .line 79
    if-ne v2, v3, :cond_5

    .line 80
    .line 81
    const/4 p0, 0x3

    .line 82
    invoke-static {v0, v1, p0}, Landroidx/compose/ui/node/LayoutNode;->Y(Landroidx/compose/ui/node/LayoutNode;ZI)V

    .line 83
    .line 84
    .line 85
    return p1

    .line 86
    :cond_5
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->r()Lm34;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    sget-object v2, Lm34;->Y:Lm34;

    .line 91
    .line 92
    if-ne p0, v2, :cond_6

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Landroidx/compose/ui/node/LayoutNode;->X(Z)V

    .line 95
    .line 96
    .line 97
    :cond_6
    return p1
.end method

.method public static n(Landroidx/compose/ui/node/LayoutNode;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 2
    .line 3
    iget-boolean v0, v0, Lr34;->e:Z

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->s()Lm34;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lm34;->Z:Lm34;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 17
    .line 18
    iget-object p0, p0, Lr34;->q:Lbj4;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Lbj4;->u0:Lo34;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lo34;->e()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-ne p0, v2, :cond_1

    .line 31
    .line 32
    :cond_0
    return v2

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public static o(Landroidx/compose/ui/node/LayoutNode;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->r()Lm34;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lm34;->Z:Lm34;

    .line 12
    .line 13
    if-ne v0, v1, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 16
    .line 17
    iget-object v0, v0, Lr34;->p:Lwr4;

    .line 18
    .line 19
    iget-object v0, v0, Lwr4;->A0:Lo34;

    .line 20
    .line 21
    invoke-virtual {v0}, Lo34;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, v0, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 34
    .line 35
    iget-object v0, v0, Lr34;->d:Lk34;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    :goto_0
    sget-object v1, Lk34;->X:Lk34;

    .line 40
    .line 41
    if-ne v0, v1, :cond_4

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-nez p0, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->L()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 59
    return p0
.end method

.method public static p(Landroidx/compose/ui/node/LayoutNode;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->L()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-object v1, v0, Lr34;->p:Lwr4;

    .line 11
    .line 12
    iget-boolean v1, v1, Lwr4;->w0:Z

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, Lri1;->o(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->M()Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-static {p0}, Lri1;->n(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lr34;->p:Lwr4;

    .line 41
    .line 42
    iget-object p0, p0, Lwr4;->A0:Lo34;

    .line 43
    .line 44
    invoke-virtual {p0}, Lo34;->e()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    iget-object p0, v0, Lr34;->q:Lbj4;

    .line 51
    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    iget-object p0, p0, Lbj4;->u0:Lo34;

    .line 55
    .line 56
    if-eqz p0, :cond_0

    .line 57
    .line 58
    invoke-virtual {p0}, Lo34;->e()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-ne p0, v2, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const/4 p0, 0x0

    .line 66
    return p0

    .line 67
    :cond_1
    :goto_0
    return v2
.end method


# virtual methods
.method public A(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lri1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/compose/ui/node/LayoutNode;

    .line 4
    .line 5
    iget-object v1, p0, Lri1;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lq31;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-wide v1, v1, Lq31;->a:J

    .line 14
    .line 15
    invoke-static {v1, v2, p1, p2}, Lq31;->b(JJ)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    if-nez v1, :cond_5

    .line 20
    .line 21
    iget-boolean v1, p0, Lri1;->a:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const-string v1, "updateRootConstraints called while measuring"

    .line 26
    .line 27
    invoke-static {v1}, Lwc3;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    new-instance v1, Lq31;

    .line 31
    .line 32
    invoke-direct {v1, p1, p2}, Lq31;-><init>(J)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lri1;->h:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->K()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget-object p2, v0, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    iget-object p1, v0, Landroidx/compose/ui/node/LayoutNode;->k0:Landroidx/compose/ui/node/LayoutNode;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iput-boolean v1, p2, Lr34;->e:Z

    .line 52
    .line 53
    :cond_3
    iget-object p2, p2, Lr34;->p:Lwr4;

    .line 54
    .line 55
    iput-boolean v1, p2, Lwr4;->x0:Z

    .line 56
    .line 57
    iget-object p0, p0, Lri1;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Llr;

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    sget-object p1, Lbi3;->X:Lbi3;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    sget-object p1, Lbi3;->Z:Lbi3;

    .line 67
    .line 68
    :goto_1
    invoke-virtual {p0, v0, p1}, Llr;->a(Landroidx/compose/ui/node/LayoutNode;Lbi3;)V

    .line 69
    .line 70
    .line 71
    :cond_5
    :goto_2
    return-void
.end method

.method public a(Lsi1;ILjava/util/ArrayList;Lbr6;)V
    .locals 6

    .line 1
    iget-object p1, p1, Lsi1;->d:Lk09;

    .line 2
    .line 3
    iget-object v0, p1, Lk09;->c:Lbr6;

    .line 4
    .line 5
    iget-object v1, p1, Lk09;->i:Lsi1;

    .line 6
    .line 7
    iget-object v2, p1, Lk09;->h:Lsi1;

    .line 8
    .line 9
    if-nez v0, :cond_a

    .line 10
    .line 11
    iget-object v0, p0, Lri1;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ln31;

    .line 14
    .line 15
    iget-object v3, v0, Lm31;->d:Ly03;

    .line 16
    .line 17
    if-eq p1, v3, :cond_a

    .line 18
    .line 19
    iget-object v0, v0, Lm31;->e:Lkv8;

    .line 20
    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_0
    if-nez p4, :cond_1

    .line 26
    .line 27
    new-instance p4, Lbr6;

    .line 28
    .line 29
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, p4, Lbr6;->a:Lk09;

    .line 34
    .line 35
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p4, Lbr6;->b:Ljava/util/ArrayList;

    .line 41
    .line 42
    iput-object p1, p4, Lbr6;->a:Lk09;

    .line 43
    .line 44
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_1
    iput-object p4, p1, Lk09;->c:Lbr6;

    .line 48
    .line 49
    iget-object v0, p4, Lbr6;->b:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    iget-object v0, v2, Lsi1;->k:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Lmi1;

    .line 71
    .line 72
    instance-of v4, v3, Lsi1;

    .line 73
    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    check-cast v3, Lsi1;

    .line 77
    .line 78
    invoke-virtual {p0, v3, p2, p3, p4}, Lri1;->a(Lsi1;ILjava/util/ArrayList;Lbr6;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    iget-object v0, v1, Lsi1;->k:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, Lmi1;

    .line 99
    .line 100
    instance-of v4, v3, Lsi1;

    .line 101
    .line 102
    if-eqz v4, :cond_4

    .line 103
    .line 104
    check-cast v3, Lsi1;

    .line 105
    .line 106
    invoke-virtual {p0, v3, p2, p3, p4}, Lri1;->a(Lsi1;ILjava/util/ArrayList;Lbr6;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    const/4 v0, 0x1

    .line 111
    if-ne p2, v0, :cond_7

    .line 112
    .line 113
    instance-of v3, p1, Lkv8;

    .line 114
    .line 115
    if-eqz v3, :cond_7

    .line 116
    .line 117
    move-object v3, p1

    .line 118
    check-cast v3, Lkv8;

    .line 119
    .line 120
    iget-object v3, v3, Lkv8;->k:Lsi1;

    .line 121
    .line 122
    iget-object v3, v3, Lsi1;->k:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_7

    .line 133
    .line 134
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    check-cast v4, Lmi1;

    .line 139
    .line 140
    instance-of v5, v4, Lsi1;

    .line 141
    .line 142
    if-eqz v5, :cond_6

    .line 143
    .line 144
    check-cast v4, Lsi1;

    .line 145
    .line 146
    invoke-virtual {p0, v4, p2, p3, p4}, Lri1;->a(Lsi1;ILjava/util/ArrayList;Lbr6;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_7
    iget-object v2, v2, Lsi1;->l:Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_8

    .line 161
    .line 162
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, Lsi1;

    .line 167
    .line 168
    invoke-virtual {p0, v3, p2, p3, p4}, Lri1;->a(Lsi1;ILjava/util/ArrayList;Lbr6;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_8
    iget-object v1, v1, Lsi1;->l:Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_9

    .line 183
    .line 184
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, Lsi1;

    .line 189
    .line 190
    invoke-virtual {p0, v2, p2, p3, p4}, Lri1;->a(Lsi1;ILjava/util/ArrayList;Lbr6;)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_9
    if-ne p2, v0, :cond_a

    .line 195
    .line 196
    instance-of v0, p1, Lkv8;

    .line 197
    .line 198
    if-eqz v0, :cond_a

    .line 199
    .line 200
    check-cast p1, Lkv8;

    .line 201
    .line 202
    iget-object p1, p1, Lkv8;->k:Lsi1;

    .line 203
    .line 204
    iget-object p1, p1, Lsi1;->l:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_a

    .line 215
    .line 216
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, Lsi1;

    .line 221
    .line 222
    invoke-virtual {p0, v0, p2, p3, p4}, Lri1;->a(Lsi1;ILjava/util/ArrayList;Lbr6;)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_a
    :goto_6
    return-void
.end method

.method public b(Ln31;)V
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Ln31;->q0:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, v0, Lm31;->p0:[I

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_2b

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    move-object v9, v3

    .line 22
    check-cast v9, Lm31;

    .line 23
    .line 24
    iget-object v3, v9, Lm31;->p0:[I

    .line 25
    .line 26
    iget-object v4, v9, Lm31;->Q:[Lu21;

    .line 27
    .line 28
    iget-object v5, v9, Lm31;->L:Lu21;

    .line 29
    .line 30
    iget-object v6, v9, Lm31;->J:Lu21;

    .line 31
    .line 32
    iget-object v7, v9, Lm31;->K:Lu21;

    .line 33
    .line 34
    iget-object v8, v9, Lm31;->I:Lu21;

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    aget v11, v3, v10

    .line 38
    .line 39
    const/4 v12, 0x1

    .line 40
    aget v3, v3, v12

    .line 41
    .line 42
    iget v13, v9, Lm31;->g0:I

    .line 43
    .line 44
    const/16 v14, 0x8

    .line 45
    .line 46
    if-ne v13, v14, :cond_1

    .line 47
    .line 48
    iput-boolean v12, v9, Lm31;->a:Z

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iget v13, v9, Lm31;->w:F

    .line 52
    .line 53
    const/high16 v14, 0x3f800000    # 1.0f

    .line 54
    .line 55
    cmpg-float v15, v13, v14

    .line 56
    .line 57
    move/from16 v16, v10

    .line 58
    .line 59
    const/4 v10, 0x3

    .line 60
    move/from16 v17, v14

    .line 61
    .line 62
    const/4 v14, 0x2

    .line 63
    if-gez v15, :cond_2

    .line 64
    .line 65
    if-ne v11, v10, :cond_2

    .line 66
    .line 67
    iput v14, v9, Lm31;->r:I

    .line 68
    .line 69
    :cond_2
    iget v15, v9, Lm31;->z:F

    .line 70
    .line 71
    cmpg-float v18, v15, v17

    .line 72
    .line 73
    if-gez v18, :cond_3

    .line 74
    .line 75
    if-ne v3, v10, :cond_3

    .line 76
    .line 77
    iput v14, v9, Lm31;->s:I

    .line 78
    .line 79
    :cond_3
    iget v14, v9, Lm31;->W:F

    .line 80
    .line 81
    const/16 v19, 0x0

    .line 82
    .line 83
    cmpl-float v14, v14, v19

    .line 84
    .line 85
    const/4 v12, 0x2

    .line 86
    if-lez v14, :cond_9

    .line 87
    .line 88
    const/4 v14, 0x1

    .line 89
    if-ne v11, v10, :cond_5

    .line 90
    .line 91
    if-eq v3, v12, :cond_4

    .line 92
    .line 93
    if-ne v3, v14, :cond_5

    .line 94
    .line 95
    :cond_4
    iput v10, v9, Lm31;->r:I

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    if-ne v3, v10, :cond_7

    .line 99
    .line 100
    if-eq v11, v12, :cond_6

    .line 101
    .line 102
    if-ne v11, v14, :cond_7

    .line 103
    .line 104
    :cond_6
    iput v10, v9, Lm31;->s:I

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_7
    if-ne v11, v10, :cond_9

    .line 108
    .line 109
    if-ne v3, v10, :cond_9

    .line 110
    .line 111
    iget v14, v9, Lm31;->r:I

    .line 112
    .line 113
    if-nez v14, :cond_8

    .line 114
    .line 115
    iput v10, v9, Lm31;->r:I

    .line 116
    .line 117
    :cond_8
    iget v14, v9, Lm31;->s:I

    .line 118
    .line 119
    if-nez v14, :cond_9

    .line 120
    .line 121
    iput v10, v9, Lm31;->s:I

    .line 122
    .line 123
    :cond_9
    :goto_1
    if-ne v11, v10, :cond_b

    .line 124
    .line 125
    iget v14, v9, Lm31;->r:I

    .line 126
    .line 127
    const/4 v12, 0x1

    .line 128
    if-ne v14, v12, :cond_b

    .line 129
    .line 130
    iget-object v12, v8, Lu21;->f:Lu21;

    .line 131
    .line 132
    if-eqz v12, :cond_a

    .line 133
    .line 134
    iget-object v12, v7, Lu21;->f:Lu21;

    .line 135
    .line 136
    if-nez v12, :cond_b

    .line 137
    .line 138
    :cond_a
    const/4 v11, 0x2

    .line 139
    :cond_b
    if-ne v3, v10, :cond_d

    .line 140
    .line 141
    iget v12, v9, Lm31;->s:I

    .line 142
    .line 143
    const/4 v14, 0x1

    .line 144
    if-ne v12, v14, :cond_d

    .line 145
    .line 146
    iget-object v12, v6, Lu21;->f:Lu21;

    .line 147
    .line 148
    if-eqz v12, :cond_c

    .line 149
    .line 150
    iget-object v12, v5, Lu21;->f:Lu21;

    .line 151
    .line 152
    if-nez v12, :cond_d

    .line 153
    .line 154
    :cond_c
    const/4 v3, 0x2

    .line 155
    :cond_d
    iget-object v12, v9, Lm31;->d:Ly03;

    .line 156
    .line 157
    iput v11, v12, Lk09;->d:I

    .line 158
    .line 159
    iget v14, v9, Lm31;->r:I

    .line 160
    .line 161
    iput v14, v12, Lk09;->a:I

    .line 162
    .line 163
    iget-object v12, v9, Lm31;->e:Lkv8;

    .line 164
    .line 165
    iput v3, v12, Lk09;->d:I

    .line 166
    .line 167
    iget v10, v9, Lm31;->s:I

    .line 168
    .line 169
    iput v10, v12, Lk09;->a:I

    .line 170
    .line 171
    const/4 v12, 0x4

    .line 172
    if-eq v11, v12, :cond_e

    .line 173
    .line 174
    const/4 v12, 0x1

    .line 175
    if-eq v11, v12, :cond_e

    .line 176
    .line 177
    const/4 v12, 0x2

    .line 178
    if-ne v11, v12, :cond_10

    .line 179
    .line 180
    :cond_e
    const/4 v12, 0x4

    .line 181
    if-eq v3, v12, :cond_f

    .line 182
    .line 183
    const/4 v12, 0x1

    .line 184
    if-eq v3, v12, :cond_28

    .line 185
    .line 186
    const/4 v12, 0x2

    .line 187
    if-ne v3, v12, :cond_10

    .line 188
    .line 189
    :cond_f
    const/16 v20, 0x1

    .line 190
    .line 191
    goto/16 :goto_c

    .line 192
    .line 193
    :cond_10
    const/high16 v21, 0x3f000000    # 0.5f

    .line 194
    .line 195
    const/4 v5, 0x3

    .line 196
    if-ne v11, v5, :cond_1a

    .line 197
    .line 198
    if-eq v3, v12, :cond_12

    .line 199
    .line 200
    const/4 v7, 0x1

    .line 201
    if-ne v3, v7, :cond_11

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_11
    move/from16 v23, v7

    .line 205
    .line 206
    move v7, v3

    .line 207
    move v3, v5

    .line 208
    move/from16 v5, v23

    .line 209
    .line 210
    goto/16 :goto_5

    .line 211
    .line 212
    :cond_12
    :goto_2
    if-ne v14, v5, :cond_14

    .line 213
    .line 214
    if-ne v3, v12, :cond_13

    .line 215
    .line 216
    const/4 v6, 0x0

    .line 217
    const/4 v8, 0x0

    .line 218
    move v7, v12

    .line 219
    move-object/from16 v4, p0

    .line 220
    .line 221
    move v5, v12

    .line 222
    invoke-virtual/range {v4 .. v9}, Lri1;->q(IIIILm31;)V

    .line 223
    .line 224
    .line 225
    :cond_13
    invoke-virtual {v9}, Lm31;->k()I

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    int-to-float v3, v8

    .line 230
    iget v4, v9, Lm31;->W:F

    .line 231
    .line 232
    mul-float/2addr v3, v4

    .line 233
    add-float v3, v3, v21

    .line 234
    .line 235
    float-to-int v6, v3

    .line 236
    const/16 v20, 0x1

    .line 237
    .line 238
    move/from16 v7, v20

    .line 239
    .line 240
    move-object/from16 v4, p0

    .line 241
    .line 242
    move/from16 v5, v20

    .line 243
    .line 244
    invoke-virtual/range {v4 .. v9}, Lri1;->q(IIIILm31;)V

    .line 245
    .line 246
    .line 247
    iget-object v3, v9, Lm31;->d:Ly03;

    .line 248
    .line 249
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 250
    .line 251
    invoke-virtual {v9}, Lm31;->q()I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 256
    .line 257
    .line 258
    iget-object v3, v9, Lm31;->e:Lkv8;

    .line 259
    .line 260
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 261
    .line 262
    invoke-virtual {v9}, Lm31;->k()I

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 267
    .line 268
    .line 269
    const/4 v12, 0x1

    .line 270
    iput-boolean v12, v9, Lm31;->a:Z

    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :cond_14
    move v7, v12

    .line 275
    const/4 v5, 0x1

    .line 276
    const/4 v12, 0x1

    .line 277
    if-ne v14, v12, :cond_15

    .line 278
    .line 279
    const/4 v6, 0x0

    .line 280
    const/4 v8, 0x0

    .line 281
    move-object/from16 v4, p0

    .line 282
    .line 283
    move v5, v7

    .line 284
    move v7, v3

    .line 285
    invoke-virtual/range {v4 .. v9}, Lri1;->q(IIIILm31;)V

    .line 286
    .line 287
    .line 288
    iget-object v3, v9, Lm31;->d:Ly03;

    .line 289
    .line 290
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 291
    .line 292
    invoke-virtual {v9}, Lm31;->q()I

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    iput v4, v3, Lzo1;->m:I

    .line 297
    .line 298
    goto/16 :goto_0

    .line 299
    .line 300
    :cond_15
    move v12, v7

    .line 301
    move v7, v3

    .line 302
    const/4 v3, 0x2

    .line 303
    if-ne v14, v3, :cond_18

    .line 304
    .line 305
    aget v3, v2, v16

    .line 306
    .line 307
    if-eq v3, v5, :cond_17

    .line 308
    .line 309
    const/4 v6, 0x4

    .line 310
    if-ne v3, v6, :cond_16

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_16
    :goto_3
    const/4 v3, 0x3

    .line 314
    goto :goto_5

    .line 315
    :cond_17
    :goto_4
    invoke-virtual {v0}, Lm31;->q()I

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    int-to-float v3, v3

    .line 320
    mul-float/2addr v13, v3

    .line 321
    add-float v13, v13, v21

    .line 322
    .line 323
    float-to-int v6, v13

    .line 324
    invoke-virtual {v9}, Lm31;->k()I

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    move-object/from16 v4, p0

    .line 329
    .line 330
    invoke-virtual/range {v4 .. v9}, Lri1;->q(IIIILm31;)V

    .line 331
    .line 332
    .line 333
    iget-object v3, v9, Lm31;->d:Ly03;

    .line 334
    .line 335
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 336
    .line 337
    invoke-virtual {v9}, Lm31;->q()I

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 342
    .line 343
    .line 344
    iget-object v3, v9, Lm31;->e:Lkv8;

    .line 345
    .line 346
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 347
    .line 348
    invoke-virtual {v9}, Lm31;->k()I

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 353
    .line 354
    .line 355
    const/4 v3, 0x1

    .line 356
    iput-boolean v3, v9, Lm31;->a:Z

    .line 357
    .line 358
    goto/16 :goto_0

    .line 359
    .line 360
    :cond_18
    const/4 v3, 0x1

    .line 361
    aget-object v6, v4, v16

    .line 362
    .line 363
    iget-object v6, v6, Lu21;->f:Lu21;

    .line 364
    .line 365
    if-eqz v6, :cond_19

    .line 366
    .line 367
    aget-object v6, v4, v3

    .line 368
    .line 369
    iget-object v3, v6, Lu21;->f:Lu21;

    .line 370
    .line 371
    if-nez v3, :cond_16

    .line 372
    .line 373
    :cond_19
    const/4 v6, 0x0

    .line 374
    const/4 v8, 0x0

    .line 375
    move-object/from16 v4, p0

    .line 376
    .line 377
    move v5, v12

    .line 378
    invoke-virtual/range {v4 .. v9}, Lri1;->q(IIIILm31;)V

    .line 379
    .line 380
    .line 381
    iget-object v3, v9, Lm31;->d:Ly03;

    .line 382
    .line 383
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 384
    .line 385
    invoke-virtual {v9}, Lm31;->q()I

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 390
    .line 391
    .line 392
    iget-object v3, v9, Lm31;->e:Lkv8;

    .line 393
    .line 394
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 395
    .line 396
    invoke-virtual {v9}, Lm31;->k()I

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 401
    .line 402
    .line 403
    const/4 v12, 0x1

    .line 404
    iput-boolean v12, v9, Lm31;->a:Z

    .line 405
    .line 406
    goto/16 :goto_0

    .line 407
    .line 408
    :cond_1a
    move v7, v3

    .line 409
    const/4 v5, 0x1

    .line 410
    goto :goto_3

    .line 411
    :goto_5
    if-ne v7, v3, :cond_25

    .line 412
    .line 413
    if-eq v11, v12, :cond_1c

    .line 414
    .line 415
    if-ne v11, v5, :cond_1b

    .line 416
    .line 417
    goto :goto_7

    .line 418
    :cond_1b
    move v4, v3

    .line 419
    move v3, v7

    .line 420
    move v7, v12

    .line 421
    :goto_6
    const/4 v12, 0x1

    .line 422
    goto/16 :goto_a

    .line 423
    .line 424
    :cond_1c
    :goto_7
    if-ne v10, v3, :cond_1f

    .line 425
    .line 426
    if-ne v11, v12, :cond_1d

    .line 427
    .line 428
    const/4 v6, 0x0

    .line 429
    const/4 v8, 0x0

    .line 430
    move v7, v12

    .line 431
    move-object/from16 v4, p0

    .line 432
    .line 433
    move/from16 v20, v5

    .line 434
    .line 435
    move v5, v12

    .line 436
    invoke-virtual/range {v4 .. v9}, Lri1;->q(IIIILm31;)V

    .line 437
    .line 438
    .line 439
    goto :goto_8

    .line 440
    :cond_1d
    move/from16 v20, v5

    .line 441
    .line 442
    :goto_8
    invoke-virtual {v9}, Lm31;->q()I

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    iget v3, v9, Lm31;->W:F

    .line 447
    .line 448
    iget v4, v9, Lm31;->X:I

    .line 449
    .line 450
    const/4 v5, -0x1

    .line 451
    if-ne v4, v5, :cond_1e

    .line 452
    .line 453
    div-float v3, v17, v3

    .line 454
    .line 455
    :cond_1e
    int-to-float v4, v6

    .line 456
    mul-float/2addr v4, v3

    .line 457
    add-float v4, v4, v21

    .line 458
    .line 459
    float-to-int v8, v4

    .line 460
    move/from16 v7, v20

    .line 461
    .line 462
    move-object/from16 v4, p0

    .line 463
    .line 464
    move/from16 v5, v20

    .line 465
    .line 466
    invoke-virtual/range {v4 .. v9}, Lri1;->q(IIIILm31;)V

    .line 467
    .line 468
    .line 469
    iget-object v3, v9, Lm31;->d:Ly03;

    .line 470
    .line 471
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 472
    .line 473
    invoke-virtual {v9}, Lm31;->q()I

    .line 474
    .line 475
    .line 476
    move-result v4

    .line 477
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 478
    .line 479
    .line 480
    iget-object v3, v9, Lm31;->e:Lkv8;

    .line 481
    .line 482
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 483
    .line 484
    invoke-virtual {v9}, Lm31;->k()I

    .line 485
    .line 486
    .line 487
    move-result v4

    .line 488
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 489
    .line 490
    .line 491
    const/4 v12, 0x1

    .line 492
    iput-boolean v12, v9, Lm31;->a:Z

    .line 493
    .line 494
    goto/16 :goto_0

    .line 495
    .line 496
    :cond_1f
    move v3, v7

    .line 497
    move v7, v12

    .line 498
    const/4 v12, 0x1

    .line 499
    if-ne v10, v12, :cond_20

    .line 500
    .line 501
    const/4 v6, 0x0

    .line 502
    const/4 v8, 0x0

    .line 503
    move-object/from16 v4, p0

    .line 504
    .line 505
    move v5, v11

    .line 506
    invoke-virtual/range {v4 .. v9}, Lri1;->q(IIIILm31;)V

    .line 507
    .line 508
    .line 509
    iget-object v3, v9, Lm31;->e:Lkv8;

    .line 510
    .line 511
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 512
    .line 513
    invoke-virtual {v9}, Lm31;->k()I

    .line 514
    .line 515
    .line 516
    move-result v4

    .line 517
    iput v4, v3, Lzo1;->m:I

    .line 518
    .line 519
    goto/16 :goto_0

    .line 520
    .line 521
    :cond_20
    const/4 v6, 0x2

    .line 522
    if-ne v10, v6, :cond_23

    .line 523
    .line 524
    aget v4, v2, v12

    .line 525
    .line 526
    if-eq v4, v5, :cond_22

    .line 527
    .line 528
    const/4 v6, 0x4

    .line 529
    if-ne v4, v6, :cond_21

    .line 530
    .line 531
    goto :goto_9

    .line 532
    :cond_21
    const/4 v4, 0x3

    .line 533
    goto :goto_6

    .line 534
    :cond_22
    :goto_9
    invoke-virtual {v9}, Lm31;->q()I

    .line 535
    .line 536
    .line 537
    move-result v6

    .line 538
    invoke-virtual {v0}, Lm31;->k()I

    .line 539
    .line 540
    .line 541
    move-result v3

    .line 542
    int-to-float v3, v3

    .line 543
    mul-float/2addr v15, v3

    .line 544
    add-float v15, v15, v21

    .line 545
    .line 546
    float-to-int v8, v15

    .line 547
    move-object/from16 v4, p0

    .line 548
    .line 549
    move v7, v5

    .line 550
    move v5, v11

    .line 551
    invoke-virtual/range {v4 .. v9}, Lri1;->q(IIIILm31;)V

    .line 552
    .line 553
    .line 554
    iget-object v3, v9, Lm31;->d:Ly03;

    .line 555
    .line 556
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 557
    .line 558
    invoke-virtual {v9}, Lm31;->q()I

    .line 559
    .line 560
    .line 561
    move-result v4

    .line 562
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 563
    .line 564
    .line 565
    iget-object v3, v9, Lm31;->e:Lkv8;

    .line 566
    .line 567
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 568
    .line 569
    invoke-virtual {v9}, Lm31;->k()I

    .line 570
    .line 571
    .line 572
    move-result v4

    .line 573
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 574
    .line 575
    .line 576
    const/4 v12, 0x1

    .line 577
    iput-boolean v12, v9, Lm31;->a:Z

    .line 578
    .line 579
    goto/16 :goto_0

    .line 580
    .line 581
    :cond_23
    move/from16 v18, v6

    .line 582
    .line 583
    aget-object v6, v4, v18

    .line 584
    .line 585
    iget-object v6, v6, Lu21;->f:Lu21;

    .line 586
    .line 587
    if-eqz v6, :cond_24

    .line 588
    .line 589
    const/16 v22, 0x3

    .line 590
    .line 591
    aget-object v4, v4, v22

    .line 592
    .line 593
    iget-object v4, v4, Lu21;->f:Lu21;

    .line 594
    .line 595
    if-nez v4, :cond_21

    .line 596
    .line 597
    :cond_24
    const/4 v6, 0x0

    .line 598
    const/4 v8, 0x0

    .line 599
    move-object/from16 v4, p0

    .line 600
    .line 601
    move v5, v7

    .line 602
    move v7, v3

    .line 603
    invoke-virtual/range {v4 .. v9}, Lri1;->q(IIIILm31;)V

    .line 604
    .line 605
    .line 606
    iget-object v3, v9, Lm31;->d:Ly03;

    .line 607
    .line 608
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 609
    .line 610
    invoke-virtual {v9}, Lm31;->q()I

    .line 611
    .line 612
    .line 613
    move-result v4

    .line 614
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 615
    .line 616
    .line 617
    iget-object v3, v9, Lm31;->e:Lkv8;

    .line 618
    .line 619
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 620
    .line 621
    invoke-virtual {v9}, Lm31;->k()I

    .line 622
    .line 623
    .line 624
    move-result v4

    .line 625
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 626
    .line 627
    .line 628
    const/4 v12, 0x1

    .line 629
    iput-boolean v12, v9, Lm31;->a:Z

    .line 630
    .line 631
    goto/16 :goto_0

    .line 632
    .line 633
    :cond_25
    move v3, v7

    .line 634
    move v7, v12

    .line 635
    const/4 v12, 0x1

    .line 636
    const/4 v4, 0x3

    .line 637
    :goto_a
    if-ne v11, v4, :cond_0

    .line 638
    .line 639
    if-ne v3, v4, :cond_0

    .line 640
    .line 641
    if-eq v14, v12, :cond_27

    .line 642
    .line 643
    if-ne v10, v12, :cond_26

    .line 644
    .line 645
    goto :goto_b

    .line 646
    :cond_26
    const/4 v3, 0x2

    .line 647
    if-ne v10, v3, :cond_0

    .line 648
    .line 649
    if-ne v14, v3, :cond_0

    .line 650
    .line 651
    aget v3, v2, v16

    .line 652
    .line 653
    if-ne v3, v5, :cond_0

    .line 654
    .line 655
    aget v3, v2, v12

    .line 656
    .line 657
    if-ne v3, v5, :cond_0

    .line 658
    .line 659
    invoke-virtual {v0}, Lm31;->q()I

    .line 660
    .line 661
    .line 662
    move-result v3

    .line 663
    int-to-float v3, v3

    .line 664
    mul-float/2addr v13, v3

    .line 665
    add-float v13, v13, v21

    .line 666
    .line 667
    float-to-int v6, v13

    .line 668
    invoke-virtual {v0}, Lm31;->k()I

    .line 669
    .line 670
    .line 671
    move-result v3

    .line 672
    int-to-float v3, v3

    .line 673
    mul-float/2addr v15, v3

    .line 674
    add-float v15, v15, v21

    .line 675
    .line 676
    float-to-int v8, v15

    .line 677
    move v7, v5

    .line 678
    move-object/from16 v4, p0

    .line 679
    .line 680
    invoke-virtual/range {v4 .. v9}, Lri1;->q(IIIILm31;)V

    .line 681
    .line 682
    .line 683
    iget-object v3, v9, Lm31;->d:Ly03;

    .line 684
    .line 685
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 686
    .line 687
    invoke-virtual {v9}, Lm31;->q()I

    .line 688
    .line 689
    .line 690
    move-result v4

    .line 691
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 692
    .line 693
    .line 694
    iget-object v3, v9, Lm31;->e:Lkv8;

    .line 695
    .line 696
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 697
    .line 698
    invoke-virtual {v9}, Lm31;->k()I

    .line 699
    .line 700
    .line 701
    move-result v4

    .line 702
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 703
    .line 704
    .line 705
    const/4 v12, 0x1

    .line 706
    iput-boolean v12, v9, Lm31;->a:Z

    .line 707
    .line 708
    goto/16 :goto_0

    .line 709
    .line 710
    :cond_27
    :goto_b
    const/4 v6, 0x0

    .line 711
    const/4 v8, 0x0

    .line 712
    move v5, v7

    .line 713
    move-object/from16 v4, p0

    .line 714
    .line 715
    invoke-virtual/range {v4 .. v9}, Lri1;->q(IIIILm31;)V

    .line 716
    .line 717
    .line 718
    iget-object v3, v9, Lm31;->d:Ly03;

    .line 719
    .line 720
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 721
    .line 722
    invoke-virtual {v9}, Lm31;->q()I

    .line 723
    .line 724
    .line 725
    move-result v4

    .line 726
    iput v4, v3, Lzo1;->m:I

    .line 727
    .line 728
    iget-object v3, v9, Lm31;->e:Lkv8;

    .line 729
    .line 730
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 731
    .line 732
    invoke-virtual {v9}, Lm31;->k()I

    .line 733
    .line 734
    .line 735
    move-result v4

    .line 736
    iput v4, v3, Lzo1;->m:I

    .line 737
    .line 738
    goto/16 :goto_0

    .line 739
    .line 740
    :cond_28
    move/from16 v20, v12

    .line 741
    .line 742
    :goto_c
    invoke-virtual {v9}, Lm31;->q()I

    .line 743
    .line 744
    .line 745
    move-result v4

    .line 746
    const/4 v12, 0x4

    .line 747
    if-ne v11, v12, :cond_29

    .line 748
    .line 749
    invoke-virtual {v0}, Lm31;->q()I

    .line 750
    .line 751
    .line 752
    move-result v4

    .line 753
    iget v8, v8, Lu21;->g:I

    .line 754
    .line 755
    sub-int/2addr v4, v8

    .line 756
    iget v7, v7, Lu21;->g:I

    .line 757
    .line 758
    sub-int/2addr v4, v7

    .line 759
    move/from16 v11, v20

    .line 760
    .line 761
    :cond_29
    invoke-virtual {v9}, Lm31;->k()I

    .line 762
    .line 763
    .line 764
    move-result v7

    .line 765
    if-ne v3, v12, :cond_2a

    .line 766
    .line 767
    invoke-virtual {v0}, Lm31;->k()I

    .line 768
    .line 769
    .line 770
    move-result v3

    .line 771
    iget v6, v6, Lu21;->g:I

    .line 772
    .line 773
    sub-int/2addr v3, v6

    .line 774
    iget v5, v5, Lu21;->g:I

    .line 775
    .line 776
    sub-int v7, v3, v5

    .line 777
    .line 778
    move v8, v7

    .line 779
    move/from16 v7, v20

    .line 780
    .line 781
    :goto_d
    move v6, v4

    .line 782
    move v5, v11

    .line 783
    move-object/from16 v4, p0

    .line 784
    .line 785
    goto :goto_e

    .line 786
    :cond_2a
    move v8, v7

    .line 787
    move v7, v3

    .line 788
    goto :goto_d

    .line 789
    :goto_e
    invoke-virtual/range {v4 .. v9}, Lri1;->q(IIIILm31;)V

    .line 790
    .line 791
    .line 792
    iget-object v3, v9, Lm31;->d:Ly03;

    .line 793
    .line 794
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 795
    .line 796
    invoke-virtual {v9}, Lm31;->q()I

    .line 797
    .line 798
    .line 799
    move-result v4

    .line 800
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 801
    .line 802
    .line 803
    iget-object v3, v9, Lm31;->e:Lkv8;

    .line 804
    .line 805
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 806
    .line 807
    invoke-virtual {v9}, Lm31;->k()I

    .line 808
    .line 809
    .line 810
    move-result v4

    .line 811
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 812
    .line 813
    .line 814
    const/4 v12, 0x1

    .line 815
    iput-boolean v12, v9, Lm31;->a:Z

    .line 816
    .line 817
    goto/16 :goto_0

    .line 818
    .line 819
    :cond_2b
    return-void
.end method

.method public c()V
    .locals 10

    .line 1
    iget-object v0, p0, Lri1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln31;

    .line 4
    .line 5
    iget-object v1, p0, Lri1;->f:Ljava/util/RandomAccess;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, p0, Lri1;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, Lri1;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Ln31;

    .line 19
    .line 20
    iget-object v4, v3, Lm31;->d:Ly03;

    .line 21
    .line 22
    invoke-virtual {v4}, Ly03;->f()V

    .line 23
    .line 24
    .line 25
    iget-object v4, v3, Lm31;->e:Lkv8;

    .line 26
    .line 27
    invoke-virtual {v4}, Lkv8;->f()V

    .line 28
    .line 29
    .line 30
    iget-object v4, v3, Lm31;->d:Ly03;

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget-object v4, v3, Lm31;->e:Lkv8;

    .line 36
    .line 37
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    iget-object v4, v3, Ln31;->q0:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const/4 v5, 0x0

    .line 47
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    const/4 v7, 0x1

    .line 52
    const/4 v8, 0x0

    .line 53
    if-eqz v6, :cond_8

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    check-cast v6, Lm31;

    .line 60
    .line 61
    instance-of v9, v6, Lav2;

    .line 62
    .line 63
    if-eqz v9, :cond_1

    .line 64
    .line 65
    new-instance v7, Lbv2;

    .line 66
    .line 67
    invoke-direct {v7, v6}, Lk09;-><init>(Lm31;)V

    .line 68
    .line 69
    .line 70
    iget-object v8, v6, Lm31;->d:Ly03;

    .line 71
    .line 72
    invoke-virtual {v8}, Ly03;->f()V

    .line 73
    .line 74
    .line 75
    iget-object v8, v6, Lm31;->e:Lkv8;

    .line 76
    .line 77
    invoke-virtual {v8}, Lkv8;->f()V

    .line 78
    .line 79
    .line 80
    check-cast v6, Lav2;

    .line 81
    .line 82
    iget v6, v6, Lav2;->u0:I

    .line 83
    .line 84
    iput v6, v7, Lk09;->f:I

    .line 85
    .line 86
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {v6}, Lm31;->x()Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_4

    .line 95
    .line 96
    iget-object v9, v6, Lm31;->b:Lxo0;

    .line 97
    .line 98
    if-nez v9, :cond_2

    .line 99
    .line 100
    new-instance v9, Lxo0;

    .line 101
    .line 102
    invoke-direct {v9, v6, v8}, Lxo0;-><init>(Lm31;I)V

    .line 103
    .line 104
    .line 105
    iput-object v9, v6, Lm31;->b:Lxo0;

    .line 106
    .line 107
    :cond_2
    if-nez v5, :cond_3

    .line 108
    .line 109
    new-instance v5, Ljava/util/HashSet;

    .line 110
    .line 111
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 112
    .line 113
    .line 114
    :cond_3
    iget-object v8, v6, Lm31;->b:Lxo0;

    .line 115
    .line 116
    invoke-virtual {v5, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    iget-object v8, v6, Lm31;->d:Ly03;

    .line 121
    .line 122
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    :goto_1
    invoke-virtual {v6}, Lm31;->y()Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-eqz v8, :cond_7

    .line 130
    .line 131
    iget-object v8, v6, Lm31;->c:Lxo0;

    .line 132
    .line 133
    if-nez v8, :cond_5

    .line 134
    .line 135
    new-instance v8, Lxo0;

    .line 136
    .line 137
    invoke-direct {v8, v6, v7}, Lxo0;-><init>(Lm31;I)V

    .line 138
    .line 139
    .line 140
    iput-object v8, v6, Lm31;->c:Lxo0;

    .line 141
    .line 142
    :cond_5
    if-nez v5, :cond_6

    .line 143
    .line 144
    new-instance v5, Ljava/util/HashSet;

    .line 145
    .line 146
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 147
    .line 148
    .line 149
    :cond_6
    iget-object v7, v6, Lm31;->c:Lxo0;

    .line 150
    .line 151
    invoke-virtual {v5, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_7
    iget-object v7, v6, Lm31;->e:Lkv8;

    .line 156
    .line 157
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    :goto_2
    instance-of v7, v6, Lxz2;

    .line 161
    .line 162
    if-eqz v7, :cond_0

    .line 163
    .line 164
    new-instance v7, Lwz2;

    .line 165
    .line 166
    invoke-direct {v7, v6}, Lk09;-><init>(Lm31;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_8
    if-eqz v5, :cond_9

    .line 174
    .line 175
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 176
    .line 177
    .line 178
    :cond_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-eqz v5, :cond_a

    .line 187
    .line 188
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    check-cast v5, Lk09;

    .line 193
    .line 194
    invoke-virtual {v5}, Lk09;->f()V

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-eqz v4, :cond_c

    .line 207
    .line 208
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    check-cast v4, Lk09;

    .line 213
    .line 214
    iget-object v5, v4, Lk09;->b:Lm31;

    .line 215
    .line 216
    if-ne v5, v3, :cond_b

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_b
    invoke-virtual {v4}, Lk09;->d()V

    .line 220
    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 224
    .line 225
    .line 226
    iget-object v2, v0, Lm31;->d:Ly03;

    .line 227
    .line 228
    invoke-virtual {p0, v2, v8, v1}, Lri1;->k(Lk09;ILjava/util/ArrayList;)V

    .line 229
    .line 230
    .line 231
    iget-object v0, v0, Lm31;->e:Lkv8;

    .line 232
    .line 233
    invoke-virtual {p0, v0, v7, v1}, Lri1;->k(Lk09;ILjava/util/ArrayList;)V

    .line 234
    .line 235
    .line 236
    iput-boolean v8, p0, Lri1;->a:Z

    .line 237
    .line 238
    return-void
.end method

.method public d()V
    .locals 15

    .line 1
    iget-object p0, p0, Lri1;->f:Ljava/util/RandomAccess;

    .line 2
    .line 3
    check-cast p0, Lc15;

    .line 4
    .line 5
    iget-object v0, p0, Lc15;->X:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v1, p0, Lc15;->Z:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_b

    .line 12
    .line 13
    aget-object v4, v0, v3

    .line 14
    .line 15
    check-cast v4, Landroidx/compose/ui/node/LayoutNode;

    .line 16
    .line 17
    iget-object v4, v4, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 18
    .line 19
    iget-object v5, v4, Lt6;->f0:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v5, Lfd3;

    .line 22
    .line 23
    const/high16 v6, 0x400000

    .line 24
    .line 25
    invoke-static {v6}, Lj55;->g(I)Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    iget-object v8, v5, Lfd3;->e1:Lf18;

    .line 30
    .line 31
    if-eqz v7, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iget-object v8, v8, Ljx4;->g0:Ljx4;

    .line 35
    .line 36
    if-nez v8, :cond_1

    .line 37
    .line 38
    goto/16 :goto_7

    .line 39
    .line 40
    :cond_1
    :goto_1
    sget-object v9, Li55;->X0:Ldx4;

    .line 41
    .line 42
    invoke-virtual {v5, v7}, Li55;->Y0(Z)Ljx4;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    :goto_2
    if-eqz v5, :cond_a

    .line 47
    .line 48
    iget v7, v5, Ljx4;->f0:I

    .line 49
    .line 50
    and-int/2addr v7, v6

    .line 51
    if-eqz v7, :cond_a

    .line 52
    .line 53
    iget v7, v5, Ljx4;->Z:I

    .line 54
    .line 55
    and-int/2addr v7, v6

    .line 56
    if-eqz v7, :cond_9

    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    move-object v9, v5

    .line 60
    move-object v10, v7

    .line 61
    :goto_3
    if-eqz v9, :cond_9

    .line 62
    .line 63
    instance-of v11, v9, Lw24;

    .line 64
    .line 65
    if-eqz v11, :cond_2

    .line 66
    .line 67
    check-cast v9, Lw24;

    .line 68
    .line 69
    iget-object v11, v4, Lt6;->f0:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v11, Lfd3;

    .line 72
    .line 73
    invoke-interface {v9, v11}, Lw24;->n(Ly24;)V

    .line 74
    .line 75
    .line 76
    goto :goto_6

    .line 77
    :cond_2
    iget v11, v9, Ljx4;->Z:I

    .line 78
    .line 79
    and-int/2addr v11, v6

    .line 80
    if-eqz v11, :cond_8

    .line 81
    .line 82
    instance-of v11, v9, Loh1;

    .line 83
    .line 84
    if-eqz v11, :cond_8

    .line 85
    .line 86
    move-object v11, v9

    .line 87
    check-cast v11, Loh1;

    .line 88
    .line 89
    iget-object v11, v11, Loh1;->r0:Ljx4;

    .line 90
    .line 91
    move v12, v2

    .line 92
    :goto_4
    const/4 v13, 0x1

    .line 93
    if-eqz v11, :cond_7

    .line 94
    .line 95
    iget v14, v11, Ljx4;->Z:I

    .line 96
    .line 97
    and-int/2addr v14, v6

    .line 98
    if-eqz v14, :cond_6

    .line 99
    .line 100
    add-int/lit8 v12, v12, 0x1

    .line 101
    .line 102
    if-ne v12, v13, :cond_3

    .line 103
    .line 104
    move-object v9, v11

    .line 105
    goto :goto_5

    .line 106
    :cond_3
    if-nez v10, :cond_4

    .line 107
    .line 108
    new-instance v10, Lc15;

    .line 109
    .line 110
    const/16 v13, 0x10

    .line 111
    .line 112
    new-array v13, v13, [Ljx4;

    .line 113
    .line 114
    invoke-direct {v10, v2, v13}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_4
    if-eqz v9, :cond_5

    .line 118
    .line 119
    invoke-virtual {v10, v9}, Lc15;->b(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    move-object v9, v7

    .line 123
    :cond_5
    invoke-virtual {v10, v11}, Lc15;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    :goto_5
    iget-object v11, v11, Ljx4;->h0:Ljx4;

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_7
    if-ne v12, v13, :cond_8

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_8
    :goto_6
    invoke-static {v10}, Lyn0;->T(Lc15;)Ljx4;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    goto :goto_3

    .line 137
    :cond_9
    if-eq v5, v8, :cond_a

    .line 138
    .line 139
    iget-object v5, v5, Ljx4;->h0:Ljx4;

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_a
    :goto_7
    add-int/lit8 v3, v3, 0x1

    .line 143
    .line 144
    goto/16 :goto_0

    .line 145
    .line 146
    :cond_b
    invoke-virtual {p0}, Lc15;->g()V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public e(Ln31;I)I
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v1, v1, Lri1;->f:Ljava/util/RandomAccess;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    move-wide v7, v4

    .line 19
    :goto_0
    if-ge v6, v3, :cond_d

    .line 20
    .line 21
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    check-cast v9, Lbr6;

    .line 26
    .line 27
    iget-object v9, v9, Lbr6;->a:Lk09;

    .line 28
    .line 29
    instance-of v10, v9, Lxo0;

    .line 30
    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    move-object v10, v9

    .line 34
    check-cast v10, Lxo0;

    .line 35
    .line 36
    iget v10, v10, Lk09;->f:I

    .line 37
    .line 38
    if-eq v10, v2, :cond_2

    .line 39
    .line 40
    :goto_1
    move-object/from16 p0, v1

    .line 41
    .line 42
    move-wide v0, v4

    .line 43
    move/from16 v16, v6

    .line 44
    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_0
    if-nez v2, :cond_1

    .line 48
    .line 49
    instance-of v10, v9, Ly03;

    .line 50
    .line 51
    if-nez v10, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    instance-of v10, v9, Lkv8;

    .line 55
    .line 56
    if-nez v10, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    if-nez v2, :cond_3

    .line 60
    .line 61
    iget-object v10, v0, Lm31;->d:Ly03;

    .line 62
    .line 63
    :goto_2
    iget-object v10, v10, Lk09;->h:Lsi1;

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    iget-object v10, v0, Lm31;->e:Lkv8;

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :goto_3
    if-nez v2, :cond_4

    .line 70
    .line 71
    iget-object v11, v0, Lm31;->d:Ly03;

    .line 72
    .line 73
    :goto_4
    iget-object v11, v11, Lk09;->i:Lsi1;

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_4
    iget-object v11, v0, Lm31;->e:Lkv8;

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :goto_5
    iget-object v12, v9, Lk09;->h:Lsi1;

    .line 80
    .line 81
    iget-object v13, v9, Lk09;->i:Lsi1;

    .line 82
    .line 83
    iget-object v14, v12, Lsi1;->l:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    iget-object v14, v13, Lsi1;->l:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    invoke-virtual {v9}, Lk09;->j()J

    .line 96
    .line 97
    .line 98
    move-result-wide v14

    .line 99
    if-eqz v10, :cond_a

    .line 100
    .line 101
    if-eqz v11, :cond_a

    .line 102
    .line 103
    invoke-static {v12, v4, v5}, Lbr6;->b(Lsi1;J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v10

    .line 107
    move-object/from16 p0, v1

    .line 108
    .line 109
    invoke-static {v13, v4, v5}, Lbr6;->a(Lsi1;J)J

    .line 110
    .line 111
    .line 112
    move-result-wide v0

    .line 113
    sub-long/2addr v10, v14

    .line 114
    iget v4, v13, Lsi1;->f:I

    .line 115
    .line 116
    neg-int v5, v4

    .line 117
    move/from16 v16, v6

    .line 118
    .line 119
    int-to-long v5, v5

    .line 120
    cmp-long v5, v10, v5

    .line 121
    .line 122
    if-ltz v5, :cond_5

    .line 123
    .line 124
    int-to-long v4, v4

    .line 125
    add-long/2addr v10, v4

    .line 126
    :cond_5
    neg-long v0, v0

    .line 127
    sub-long/2addr v0, v14

    .line 128
    iget v4, v12, Lsi1;->f:I

    .line 129
    .line 130
    int-to-long v4, v4

    .line 131
    sub-long/2addr v0, v4

    .line 132
    cmp-long v6, v0, v4

    .line 133
    .line 134
    if-ltz v6, :cond_6

    .line 135
    .line 136
    sub-long/2addr v0, v4

    .line 137
    :cond_6
    iget-object v4, v9, Lk09;->b:Lm31;

    .line 138
    .line 139
    if-nez v2, :cond_7

    .line 140
    .line 141
    iget v4, v4, Lm31;->d0:F

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_7
    const/4 v5, 0x1

    .line 145
    if-ne v2, v5, :cond_8

    .line 146
    .line 147
    iget v4, v4, Lm31;->e0:F

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    const/high16 v4, -0x40800000    # -1.0f

    .line 154
    .line 155
    :goto_6
    const/4 v5, 0x0

    .line 156
    cmpl-float v5, v4, v5

    .line 157
    .line 158
    const/high16 v6, 0x3f800000    # 1.0f

    .line 159
    .line 160
    if-lez v5, :cond_9

    .line 161
    .line 162
    long-to-float v0, v0

    .line 163
    div-float/2addr v0, v4

    .line 164
    long-to-float v1, v10

    .line 165
    sub-float v5, v6, v4

    .line 166
    .line 167
    div-float/2addr v1, v5

    .line 168
    add-float/2addr v1, v0

    .line 169
    float-to-long v0, v1

    .line 170
    goto :goto_7

    .line 171
    :cond_9
    const-wide/16 v0, 0x0

    .line 172
    .line 173
    :goto_7
    long-to-float v0, v0

    .line 174
    mul-float v1, v0, v4

    .line 175
    .line 176
    const/high16 v5, 0x3f000000    # 0.5f

    .line 177
    .line 178
    add-float/2addr v1, v5

    .line 179
    float-to-long v9, v1

    .line 180
    invoke-static {v6, v4, v0, v5}, Lp61;->e(FFFF)F

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    float-to-long v0, v0

    .line 185
    add-long/2addr v9, v14

    .line 186
    add-long/2addr v9, v0

    .line 187
    iget v0, v12, Lsi1;->f:I

    .line 188
    .line 189
    int-to-long v0, v0

    .line 190
    add-long/2addr v0, v9

    .line 191
    iget v4, v13, Lsi1;->f:I

    .line 192
    .line 193
    int-to-long v4, v4

    .line 194
    sub-long/2addr v0, v4

    .line 195
    goto :goto_8

    .line 196
    :cond_a
    move-object/from16 p0, v1

    .line 197
    .line 198
    move/from16 v16, v6

    .line 199
    .line 200
    if-eqz v10, :cond_b

    .line 201
    .line 202
    iget v0, v12, Lsi1;->f:I

    .line 203
    .line 204
    int-to-long v0, v0

    .line 205
    invoke-static {v12, v0, v1}, Lbr6;->b(Lsi1;J)J

    .line 206
    .line 207
    .line 208
    move-result-wide v0

    .line 209
    iget v4, v12, Lsi1;->f:I

    .line 210
    .line 211
    int-to-long v4, v4

    .line 212
    add-long/2addr v4, v14

    .line 213
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 214
    .line 215
    .line 216
    move-result-wide v0

    .line 217
    goto :goto_8

    .line 218
    :cond_b
    if-eqz v11, :cond_c

    .line 219
    .line 220
    iget v0, v13, Lsi1;->f:I

    .line 221
    .line 222
    int-to-long v0, v0

    .line 223
    invoke-static {v13, v0, v1}, Lbr6;->a(Lsi1;J)J

    .line 224
    .line 225
    .line 226
    move-result-wide v0

    .line 227
    iget v4, v13, Lsi1;->f:I

    .line 228
    .line 229
    neg-int v4, v4

    .line 230
    int-to-long v4, v4

    .line 231
    add-long/2addr v4, v14

    .line 232
    neg-long v0, v0

    .line 233
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 234
    .line 235
    .line 236
    move-result-wide v0

    .line 237
    goto :goto_8

    .line 238
    :cond_c
    iget v0, v12, Lsi1;->f:I

    .line 239
    .line 240
    int-to-long v0, v0

    .line 241
    invoke-virtual {v9}, Lk09;->j()J

    .line 242
    .line 243
    .line 244
    move-result-wide v4

    .line 245
    add-long/2addr v4, v0

    .line 246
    iget v0, v13, Lsi1;->f:I

    .line 247
    .line 248
    int-to-long v0, v0

    .line 249
    sub-long v0, v4, v0

    .line 250
    .line 251
    :goto_8
    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 252
    .line 253
    .line 254
    move-result-wide v7

    .line 255
    add-int/lit8 v6, v16, 0x1

    .line 256
    .line 257
    move-object/from16 v1, p0

    .line 258
    .line 259
    move-object/from16 v0, p1

    .line 260
    .line 261
    const-wide/16 v4, 0x0

    .line 262
    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :cond_d
    long-to-int v0, v7

    .line 266
    return v0
.end method

.method public f(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lri1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzz2;

    .line 4
    .line 5
    iget-object v1, v0, Lzz2;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lc15;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lri1;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Landroidx/compose/ui/node/LayoutNode;

    .line 14
    .line 15
    iget p1, p0, Landroidx/compose/ui/node/LayoutNode;->P0:I

    .line 16
    .line 17
    if-lez p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Lc15;->g()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p0}, Lc15;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Landroidx/compose/ui/node/LayoutNode;->O0:Z

    .line 27
    .line 28
    :cond_0
    iget p0, v1, Lc15;->Z:I

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    const-string p0, "Compose:onPositionedCallbacks"

    .line 33
    .line 34
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :try_start_0
    invoke-virtual {v0}, Lzz2;->T()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 46
    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    return-void
.end method

.method public i()V
    .locals 7

    .line 1
    iget-object p0, p0, Lri1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lc15;

    .line 4
    .line 5
    iget v0, p0, Lc15;->Z:I

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v1, p0, Lc15;->X:[Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v0, :cond_2

    .line 13
    .line 14
    aget-object v3, v1, v2

    .line 15
    .line 16
    check-cast v3, Lur4;

    .line 17
    .line 18
    iget-object v4, v3, Lur4;->a:Landroidx/compose/ui/node/LayoutNode;

    .line 19
    .line 20
    invoke-virtual {v4}, Landroidx/compose/ui/node/LayoutNode;->K()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    iget-boolean v4, v3, Lur4;->b:Z

    .line 27
    .line 28
    iget-object v5, v3, Lur4;->a:Landroidx/compose/ui/node/LayoutNode;

    .line 29
    .line 30
    iget-boolean v3, v3, Lur4;->c:Z

    .line 31
    .line 32
    const/4 v6, 0x2

    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    invoke-static {v5, v3, v6}, Landroidx/compose/ui/node/LayoutNode;->Y(Landroidx/compose/ui/node/LayoutNode;ZI)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-static {v5, v3, v6}, Landroidx/compose/ui/node/LayoutNode;->W(Landroidx/compose/ui/node/LayoutNode;ZI)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p0}, Lc15;->g()V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
.end method

.method public j(Landroidx/compose/ui/node/LayoutNode;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->C()Lc15;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Lc15;->X:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, Lc15;->Z:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_2

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, Landroidx/compose/ui/node/LayoutNode;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->M()Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-static {v3, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    iget-boolean v3, v2, Landroidx/compose/ui/node/LayoutNode;->Q0:Z

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    iget-object v3, p0, Lri1;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Llr;

    .line 35
    .line 36
    invoke-virtual {v3, v2}, Llr;->f(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->N()V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0, v2}, Lri1;->j(Landroidx/compose/ui/node/LayoutNode;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-void
.end method

.method public k(Lk09;ILjava/util/ArrayList;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lk09;->h:Lsi1;

    .line 2
    .line 3
    iget-object v1, p1, Lk09;->i:Lsi1;

    .line 4
    .line 5
    iget-object v0, v0, Lsi1;->k:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lmi1;

    .line 23
    .line 24
    instance-of v4, v2, Lsi1;

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    check-cast v2, Lsi1;

    .line 29
    .line 30
    invoke-virtual {p0, v2, p2, p3, v3}, Lri1;->a(Lsi1;ILjava/util/ArrayList;Lbr6;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    instance-of v4, v2, Lk09;

    .line 35
    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    check-cast v2, Lk09;

    .line 39
    .line 40
    iget-object v2, v2, Lk09;->h:Lsi1;

    .line 41
    .line 42
    invoke-virtual {p0, v2, p2, p3, v3}, Lri1;->a(Lsi1;ILjava/util/ArrayList;Lbr6;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object v0, v1, Lsi1;->k:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lmi1;

    .line 63
    .line 64
    instance-of v2, v1, Lsi1;

    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    check-cast v1, Lsi1;

    .line 69
    .line 70
    invoke-virtual {p0, v1, p2, p3, v3}, Lri1;->a(Lsi1;ILjava/util/ArrayList;Lbr6;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    instance-of v2, v1, Lk09;

    .line 75
    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    check-cast v1, Lk09;

    .line 79
    .line 80
    iget-object v1, v1, Lk09;->i:Lsi1;

    .line 81
    .line 82
    invoke-virtual {p0, v1, p2, p3, v3}, Lri1;->a(Lsi1;ILjava/util/ArrayList;Lbr6;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    const/4 v0, 0x1

    .line 87
    if-ne p2, v0, :cond_7

    .line 88
    .line 89
    check-cast p1, Lkv8;

    .line 90
    .line 91
    iget-object p1, p1, Lkv8;->k:Lsi1;

    .line 92
    .line 93
    iget-object p1, p1, Lsi1;->k:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_7

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Lmi1;

    .line 110
    .line 111
    instance-of v1, v0, Lsi1;

    .line 112
    .line 113
    if-eqz v1, :cond_6

    .line 114
    .line 115
    check-cast v0, Lsi1;

    .line 116
    .line 117
    invoke-virtual {p0, v0, p2, p3, v3}, Lri1;->a(Lsi1;ILjava/util/ArrayList;Lbr6;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_7
    return-void
.end method

.method public l(Landroidx/compose/ui/node/LayoutNode;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lri1;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "forceMeasureTheSubtree should be executed during the measureAndLayout pass"

    .line 6
    .line 7
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-object v0, p1, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 13
    .line 14
    iget-boolean v0, v0, Lr34;->e:Z

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->q()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v0, "node not yet measured"

    .line 24
    .line 25
    invoke-static {v0}, Lwc3;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0, p1, p2}, Lri1;->m(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public m(Landroidx/compose/ui/node/LayoutNode;Z)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->C()Lc15;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lc15;->X:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v0, v0, Lc15;->Z:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_8

    .line 11
    .line 12
    aget-object v3, v1, v2

    .line 13
    .line 14
    check-cast v3, Landroidx/compose/ui/node/LayoutNode;

    .line 15
    .line 16
    sget-object v4, Lm34;->X:Lm34;

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->r()Lm34;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    if-eq v6, v4, :cond_1

    .line 26
    .line 27
    iget-object v6, v3, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 28
    .line 29
    iget-object v6, v6, Lr34;->p:Lwr4;

    .line 30
    .line 31
    iget-object v6, v6, Lwr4;->A0:Lo34;

    .line 32
    .line 33
    invoke-virtual {v6}, Lo34;->e()Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    if-eqz p2, :cond_7

    .line 41
    .line 42
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->s()Lm34;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    if-eq v6, v4, :cond_1

    .line 47
    .line 48
    iget-object v4, v3, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 49
    .line 50
    iget-object v4, v4, Lr34;->q:Lbj4;

    .line 51
    .line 52
    if-eqz v4, :cond_7

    .line 53
    .line 54
    iget-object v4, v4, Lbj4;->u0:Lo34;

    .line 55
    .line 56
    if-eqz v4, :cond_7

    .line 57
    .line 58
    invoke-virtual {v4}, Lo34;->e()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-ne v4, v5, :cond_7

    .line 63
    .line 64
    :cond_1
    :goto_1
    invoke-static {v3}, Los4;->t(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    iget-object v6, v3, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 69
    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    if-nez p2, :cond_3

    .line 73
    .line 74
    iget-boolean v4, v6, Lr34;->e:Z

    .line 75
    .line 76
    if-eqz v4, :cond_2

    .line 77
    .line 78
    iget-object v4, p0, Lri1;->d:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, Llr;

    .line 81
    .line 82
    invoke-virtual {v4, v3}, Llr;->f(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_2

    .line 87
    .line 88
    invoke-virtual {p0, v3, v5}, Lri1;->w(Landroidx/compose/ui/node/LayoutNode;Z)Z

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    invoke-virtual {p0, v3, v5}, Lri1;->l(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 93
    .line 94
    .line 95
    :cond_3
    :goto_2
    if-eqz p2, :cond_4

    .line 96
    .line 97
    iget-boolean v4, v6, Lr34;->e:Z

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_4
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->q()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    :goto_3
    if-eqz v4, :cond_5

    .line 105
    .line 106
    invoke-virtual {p0, v3, p2}, Lri1;->w(Landroidx/compose/ui/node/LayoutNode;Z)Z

    .line 107
    .line 108
    .line 109
    :cond_5
    if-eqz p2, :cond_6

    .line 110
    .line 111
    iget-boolean v4, v6, Lr34;->e:Z

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_6
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->q()Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    :goto_4
    if-nez v4, :cond_7

    .line 119
    .line 120
    invoke-virtual {p0, v3, p2}, Lri1;->m(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 121
    .line 122
    .line 123
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_8
    if-eqz p2, :cond_9

    .line 127
    .line 128
    iget-object v0, p1, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 129
    .line 130
    iget-boolean v0, v0, Lr34;->e:Z

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_9
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->q()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    :goto_5
    if-eqz v0, :cond_a

    .line 138
    .line 139
    invoke-virtual {p0, p1, p2}, Lri1;->w(Landroidx/compose/ui/node/LayoutNode;Z)Z

    .line 140
    .line 141
    .line 142
    :cond_a
    return-void
.end method

.method public q(IIIILm31;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lri1;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld30;

    .line 4
    .line 5
    iput p1, v0, Ld30;->a:I

    .line 6
    .line 7
    iput p3, v0, Ld30;->b:I

    .line 8
    .line 9
    iput p2, v0, Ld30;->c:I

    .line 10
    .line 11
    iput p4, v0, Ld30;->d:I

    .line 12
    .line 13
    iget-object p0, p0, Lri1;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Le30;

    .line 16
    .line 17
    check-cast p0, Landroidx/constraintlayout/widget/b;

    .line 18
    .line 19
    invoke-virtual {p0, p5, v0}, Landroidx/constraintlayout/widget/b;->b(Lm31;Ld30;)V

    .line 20
    .line 21
    .line 22
    iget p0, v0, Ld30;->e:I

    .line 23
    .line 24
    invoke-virtual {p5, p0}, Lm31;->O(I)V

    .line 25
    .line 26
    .line 27
    iget p0, v0, Ld30;->f:I

    .line 28
    .line 29
    invoke-virtual {p5, p0}, Lm31;->L(I)V

    .line 30
    .line 31
    .line 32
    iget-boolean p0, v0, Ld30;->h:Z

    .line 33
    .line 34
    iput-boolean p0, p5, Lm31;->E:Z

    .line 35
    .line 36
    iget p0, v0, Ld30;->g:I

    .line 37
    .line 38
    invoke-virtual {p5, p0}, Lm31;->I(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public r(Ldn2;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lri1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llr;

    .line 4
    .line 5
    iget-object v1, v0, Llr;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lyr2;

    .line 8
    .line 9
    iget-object v2, p0, Lri1;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroidx/compose/ui/node/LayoutNode;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->K()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    const-string v3, "performMeasureAndLayout called with unattached root"

    .line 20
    .line 21
    invoke-static {v3}, Lwc3;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->L()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    const-string v3, "performMeasureAndLayout called with unplaced root"

    .line 31
    .line 32
    invoke-static {v3}, Lwc3;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-boolean v3, p0, Lri1;->a:Z

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    const-string v3, "performMeasureAndLayout called during measure layout"

    .line 40
    .line 41
    invoke-static {v3}, Lwc3;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object v3, p0, Lri1;->h:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, Lq31;

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    if-eqz v3, :cond_e

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    iput-boolean v3, p0, Lri1;->a:Z

    .line 53
    .line 54
    iput-boolean v3, p0, Lri1;->b:Z

    .line 55
    .line 56
    :try_start_0
    invoke-virtual {v0}, Llr;->w()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_c

    .line 61
    .line 62
    move v5, v4

    .line 63
    :cond_3
    :goto_0
    iget-object v6, v0, Llr;->f0:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v6, Lyr2;

    .line 66
    .line 67
    iget-object v7, v6, Lyr2;->Y:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v7, Lhe7;

    .line 70
    .line 71
    iget-object v8, v0, Llr;->Z:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v8, Lyr2;

    .line 74
    .line 75
    iget-object v9, v8, Lyr2;->Y:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v9, Lhe7;

    .line 78
    .line 79
    iget-object v10, v1, Lyr2;->Y:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v10, Lhe7;

    .line 82
    .line 83
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    if-nez v10, :cond_5

    .line 88
    .line 89
    iget-object v6, v1, Lyr2;->Y:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v6, Lhe7;

    .line 92
    .line 93
    invoke-virtual {v6}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    check-cast v6, Landroidx/compose/ui/node/LayoutNode;

    .line 98
    .line 99
    invoke-virtual {v1, v6}, Lyr2;->s(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 100
    .line 101
    .line 102
    iget-object v7, v6, Landroidx/compose/ui/node/LayoutNode;->k0:Landroidx/compose/ui/node/LayoutNode;

    .line 103
    .line 104
    if-eqz v7, :cond_4

    .line 105
    .line 106
    move v7, v3

    .line 107
    goto :goto_1

    .line 108
    :cond_4
    move v7, v4

    .line 109
    :goto_1
    move v8, v4

    .line 110
    goto :goto_3

    .line 111
    :catchall_0
    move-exception p1

    .line 112
    goto/16 :goto_6

    .line 113
    .line 114
    :cond_5
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-nez v10, :cond_7

    .line 119
    .line 120
    invoke-virtual {v9}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    check-cast v6, Landroidx/compose/ui/node/LayoutNode;

    .line 125
    .line 126
    invoke-virtual {v8, v6}, Lyr2;->s(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 127
    .line 128
    .line 129
    iget-object v7, v6, Landroidx/compose/ui/node/LayoutNode;->k0:Landroidx/compose/ui/node/LayoutNode;

    .line 130
    .line 131
    if-eqz v7, :cond_6

    .line 132
    .line 133
    move v7, v3

    .line 134
    goto :goto_2

    .line 135
    :cond_6
    move v7, v4

    .line 136
    :goto_2
    move v8, v3

    .line 137
    goto :goto_3

    .line 138
    :cond_7
    invoke-virtual {v7}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    if-nez v8, :cond_b

    .line 143
    .line 144
    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    check-cast v7, Landroidx/compose/ui/node/LayoutNode;

    .line 149
    .line 150
    invoke-virtual {v6, v7}, Lyr2;->s(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 151
    .line 152
    .line 153
    move v8, v3

    .line 154
    move-object v6, v7

    .line 155
    move v7, v4

    .line 156
    :goto_3
    if-eqz v8, :cond_8

    .line 157
    .line 158
    invoke-virtual {p0, v6, v7}, Lri1;->v(Landroidx/compose/ui/node/LayoutNode;Z)Z

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    goto :goto_4

    .line 163
    :cond_8
    invoke-virtual {p0, v6, v7}, Lri1;->w(Landroidx/compose/ui/node/LayoutNode;Z)Z

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    iget-object v8, v6, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 168
    .line 169
    iget-boolean v8, v8, Lr34;->f:Z

    .line 170
    .line 171
    if-eqz v8, :cond_9

    .line 172
    .line 173
    sget-object v8, Lbi3;->Y:Lbi3;

    .line 174
    .line 175
    invoke-virtual {v0, v6, v8}, Llr;->a(Landroidx/compose/ui/node/LayoutNode;Lbi3;)V

    .line 176
    .line 177
    .line 178
    :cond_9
    invoke-virtual {v6}, Landroidx/compose/ui/node/LayoutNode;->p()Z

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    if-eqz v8, :cond_a

    .line 183
    .line 184
    sget-object v8, Lbi3;->f0:Lbi3;

    .line 185
    .line 186
    invoke-virtual {v0, v6, v8}, Llr;->a(Landroidx/compose/ui/node/LayoutNode;Lbi3;)V

    .line 187
    .line 188
    .line 189
    :cond_a
    :goto_4
    if-ne v6, v2, :cond_3

    .line 190
    .line 191
    if-eqz v7, :cond_3

    .line 192
    .line 193
    move v5, v3

    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :cond_b
    if-eqz p1, :cond_d

    .line 197
    .line 198
    invoke-interface {p1}, Ldn2;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_c
    move v5, v4

    .line 203
    :cond_d
    :goto_5
    iput-boolean v4, p0, Lri1;->a:Z

    .line 204
    .line 205
    iput-boolean v4, p0, Lri1;->b:Z

    .line 206
    .line 207
    move v4, v5

    .line 208
    goto :goto_7

    .line 209
    :goto_6
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 210
    :catchall_1
    move-exception p1

    .line 211
    iput-boolean v4, p0, Lri1;->a:Z

    .line 212
    .line 213
    iput-boolean v4, p0, Lri1;->b:Z

    .line 214
    .line 215
    throw p1

    .line 216
    :cond_e
    :goto_7
    invoke-virtual {p0}, Lri1;->d()V

    .line 217
    .line 218
    .line 219
    return v4
.end method

.method public s(Landroidx/compose/ui/node/LayoutNode;J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lri1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/compose/ui/node/LayoutNode;

    .line 4
    .line 5
    iget-boolean v1, p1, Landroidx/compose/ui/node/LayoutNode;->Q0:Z

    .line 6
    .line 7
    iget-object v2, p1, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v1, "measureAndLayout called on root"

    .line 16
    .line 17
    invoke-static {v1}, Lwc3;->a(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->K()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    const-string v1, "performMeasureAndLayout called with unattached root"

    .line 27
    .line 28
    invoke-static {v1}, Lwc3;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->L()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    const-string v0, "performMeasureAndLayout called with unplaced root"

    .line 38
    .line 39
    invoke-static {v0}, Lwc3;->a(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_3
    iget-boolean v0, p0, Lri1;->a:Z

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    const-string v0, "performMeasureAndLayout called during measure layout"

    .line 47
    .line 48
    invoke-static {v0}, Lwc3;->a(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_4
    iget-object v0, p0, Lri1;->h:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lq31;

    .line 54
    .line 55
    if-eqz v0, :cond_b

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    iput-boolean v0, p0, Lri1;->a:Z

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    iput-boolean v1, p0, Lri1;->b:Z

    .line 62
    .line 63
    :try_start_0
    iget-object v3, p0, Lri1;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v3, Llr;

    .line 66
    .line 67
    iget-object v4, v3, Llr;->Y:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v4, Lyr2;

    .line 70
    .line 71
    invoke-virtual {v4, p1}, Lyr2;->s(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 72
    .line 73
    .line 74
    iget-object v4, v3, Llr;->Z:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, Lyr2;

    .line 77
    .line 78
    invoke-virtual {v4, p1}, Lyr2;->s(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 79
    .line 80
    .line 81
    iget-object v3, v3, Llr;->f0:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v3, Lyr2;

    .line 84
    .line 85
    invoke-virtual {v3, p1}, Lyr2;->s(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 86
    .line 87
    .line 88
    new-instance v3, Lq31;

    .line 89
    .line 90
    invoke-direct {v3, p2, p3}, Lq31;-><init>(J)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1, v3}, Lri1;->g(Landroidx/compose/ui/node/LayoutNode;Lq31;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-nez v3, :cond_5

    .line 98
    .line 99
    iget-boolean v3, v2, Lr34;->f:Z

    .line 100
    .line 101
    if-eqz v3, :cond_6

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :catchall_0
    move-exception p1

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_1
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->M()Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-static {v3, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_6

    .line 117
    .line 118
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->N()V

    .line 119
    .line 120
    .line 121
    :cond_6
    invoke-virtual {p0, p1}, Lri1;->j(Landroidx/compose/ui/node/LayoutNode;)V

    .line 122
    .line 123
    .line 124
    iget-object v3, p1, Landroidx/compose/ui/node/LayoutNode;->E0:Lm34;

    .line 125
    .line 126
    sget-object v4, Lm34;->Z:Lm34;

    .line 127
    .line 128
    if-ne v3, v4, :cond_7

    .line 129
    .line 130
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->e()V

    .line 131
    .line 132
    .line 133
    :cond_7
    iget-object v2, v2, Lr34;->p:Lwr4;

    .line 134
    .line 135
    invoke-virtual {v2, p2, p3}, Lwr4;->r0(J)Z

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    if-eqz p2, :cond_9

    .line 144
    .line 145
    if-eqz p3, :cond_9

    .line 146
    .line 147
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->r()Lm34;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    sget-object v2, Lm34;->X:Lm34;

    .line 152
    .line 153
    if-ne p2, v2, :cond_8

    .line 154
    .line 155
    const/4 p2, 0x3

    .line 156
    invoke-static {p3, v1, p2}, Landroidx/compose/ui/node/LayoutNode;->Y(Landroidx/compose/ui/node/LayoutNode;ZI)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_8
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->r()Lm34;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    sget-object v2, Lm34;->Y:Lm34;

    .line 165
    .line 166
    if-ne p2, v2, :cond_9

    .line 167
    .line 168
    invoke-virtual {p3, v1}, Landroidx/compose/ui/node/LayoutNode;->X(Z)V

    .line 169
    .line 170
    .line 171
    :cond_9
    :goto_2
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->p()Z

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    if-eqz p2, :cond_a

    .line 176
    .line 177
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->L()Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-eqz p2, :cond_a

    .line 182
    .line 183
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->U()V

    .line 184
    .line 185
    .line 186
    iget-object p2, p0, Lri1;->e:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast p2, Lzz2;

    .line 189
    .line 190
    iget p3, p1, Landroidx/compose/ui/node/LayoutNode;->P0:I

    .line 191
    .line 192
    if-lez p3, :cond_a

    .line 193
    .line 194
    iget-object p2, p2, Lzz2;->Y:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p2, Lc15;

    .line 197
    .line 198
    invoke-virtual {p2, p1}, Lc15;->b(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    iput-boolean v0, p1, Landroidx/compose/ui/node/LayoutNode;->O0:Z

    .line 202
    .line 203
    :cond_a
    invoke-virtual {p0}, Lri1;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 204
    .line 205
    .line 206
    iput-boolean v1, p0, Lri1;->a:Z

    .line 207
    .line 208
    iput-boolean v1, p0, Lri1;->b:Z

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :goto_3
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 212
    :catchall_1
    move-exception p1

    .line 213
    iput-boolean v1, p0, Lri1;->a:Z

    .line 214
    .line 215
    iput-boolean v1, p0, Lri1;->b:Z

    .line 216
    .line 217
    throw p1

    .line 218
    :cond_b
    :goto_4
    invoke-virtual {p0}, Lri1;->d()V

    .line 219
    .line 220
    .line 221
    return-void
.end method

.method public t()V
    .locals 5

    .line 1
    iget-object v0, p0, Lri1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/compose/ui/node/LayoutNode;

    .line 4
    .line 5
    iget-object v1, p0, Lri1;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Llr;

    .line 8
    .line 9
    invoke-virtual {v1}, Llr;->w()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_6

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->K()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    const-string v2, "performMeasureAndLayout called with unattached root"

    .line 22
    .line 23
    invoke-static {v2}, Lwc3;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->L()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    const-string v2, "performMeasureAndLayout called with unplaced root"

    .line 33
    .line 34
    invoke-static {v2}, Lwc3;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-boolean v2, p0, Lri1;->a:Z

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    const-string v2, "performMeasureAndLayout called during measure layout"

    .line 42
    .line 43
    invoke-static {v2}, Lwc3;->a(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v2, p0, Lri1;->h:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lq31;

    .line 49
    .line 50
    if-eqz v2, :cond_6

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    iput-boolean v2, p0, Lri1;->a:Z

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    iput-boolean v3, p0, Lri1;->b:Z

    .line 57
    .line 58
    :try_start_0
    iget-object v4, v1, Llr;->f0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, Lyr2;

    .line 61
    .line 62
    iget-object v4, v4, Lyr2;->Y:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v4, Lhe7;

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_3

    .line 71
    .line 72
    iget-object v1, v1, Llr;->Y:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Lyr2;

    .line 75
    .line 76
    iget-object v1, v1, Lyr2;->Y:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Lhe7;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_3

    .line 85
    .line 86
    move v1, v2

    .line 87
    goto :goto_0

    .line 88
    :cond_3
    move v1, v3

    .line 89
    :goto_0
    if-eqz v1, :cond_5

    .line 90
    .line 91
    iget-object v1, v0, Landroidx/compose/ui/node/LayoutNode;->k0:Landroidx/compose/ui/node/LayoutNode;

    .line 92
    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    invoke-virtual {p0, v0, v2}, Lri1;->y(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    goto :goto_2

    .line 101
    :cond_4
    invoke-virtual {p0, v0}, Lri1;->x(Landroidx/compose/ui/node/LayoutNode;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    :goto_1
    invoke-virtual {p0, v0, v3}, Lri1;->y(Landroidx/compose/ui/node/LayoutNode;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    iput-boolean v3, p0, Lri1;->a:Z

    .line 108
    .line 109
    iput-boolean v3, p0, Lri1;->b:Z

    .line 110
    .line 111
    return-void

    .line 112
    :goto_2
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    iput-boolean v3, p0, Lri1;->a:Z

    .line 115
    .line 116
    iput-boolean v3, p0, Lri1;->b:Z

    .line 117
    .line 118
    throw v0

    .line 119
    :cond_6
    return-void
.end method

.method public u()V
    .locals 15

    .line 1
    iget-object v0, p0, Lri1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln31;

    .line 4
    .line 5
    iget-object v0, v0, Ln31;->q0:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_b

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    move-object v7, v1

    .line 22
    check-cast v7, Lm31;

    .line 23
    .line 24
    iget-boolean v1, v7, Lm31;->a:Z

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v1, v7, Lm31;->p0:[I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    aget v8, v1, v2

    .line 33
    .line 34
    const/4 v9, 0x1

    .line 35
    aget v1, v1, v9

    .line 36
    .line 37
    iget v3, v7, Lm31;->r:I

    .line 38
    .line 39
    iget v4, v7, Lm31;->s:I

    .line 40
    .line 41
    const/4 v10, 0x3

    .line 42
    const/4 v5, 0x2

    .line 43
    if-eq v8, v5, :cond_2

    .line 44
    .line 45
    if-ne v8, v10, :cond_1

    .line 46
    .line 47
    if-ne v3, v9, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v3, v2

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    :goto_1
    move v3, v9

    .line 53
    :goto_2
    if-eq v1, v5, :cond_3

    .line 54
    .line 55
    if-ne v1, v10, :cond_4

    .line 56
    .line 57
    if-ne v4, v9, :cond_4

    .line 58
    .line 59
    :cond_3
    move v2, v9

    .line 60
    :cond_4
    iget-object v4, v7, Lm31;->d:Ly03;

    .line 61
    .line 62
    iget-object v4, v4, Lk09;->e:Lzo1;

    .line 63
    .line 64
    iget-boolean v6, v4, Lsi1;->j:Z

    .line 65
    .line 66
    iget-object v11, v7, Lm31;->e:Lkv8;

    .line 67
    .line 68
    iget-object v11, v11, Lk09;->e:Lzo1;

    .line 69
    .line 70
    iget-boolean v12, v11, Lsi1;->j:Z

    .line 71
    .line 72
    move v13, v3

    .line 73
    const/4 v3, 0x1

    .line 74
    if-eqz v6, :cond_5

    .line 75
    .line 76
    if-eqz v12, :cond_5

    .line 77
    .line 78
    iget v4, v4, Lsi1;->g:I

    .line 79
    .line 80
    iget v6, v11, Lsi1;->g:I

    .line 81
    .line 82
    move v5, v3

    .line 83
    move-object v2, p0

    .line 84
    invoke-virtual/range {v2 .. v7}, Lri1;->q(IIIILm31;)V

    .line 85
    .line 86
    .line 87
    iput-boolean v9, v7, Lm31;->a:Z

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    if-eqz v6, :cond_7

    .line 91
    .line 92
    if-eqz v2, :cond_7

    .line 93
    .line 94
    iget v4, v4, Lsi1;->g:I

    .line 95
    .line 96
    iget v6, v11, Lsi1;->g:I

    .line 97
    .line 98
    move-object v2, p0

    .line 99
    invoke-virtual/range {v2 .. v7}, Lri1;->q(IIIILm31;)V

    .line 100
    .line 101
    .line 102
    iget-object p0, v7, Lm31;->e:Lkv8;

    .line 103
    .line 104
    if-ne v1, v10, :cond_6

    .line 105
    .line 106
    iget-object p0, p0, Lk09;->e:Lzo1;

    .line 107
    .line 108
    invoke-virtual {v7}, Lm31;->k()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    iput v1, p0, Lzo1;->m:I

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    iget-object p0, p0, Lk09;->e:Lzo1;

    .line 116
    .line 117
    invoke-virtual {v7}, Lm31;->k()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-virtual {p0, v1}, Lzo1;->d(I)V

    .line 122
    .line 123
    .line 124
    iput-boolean v9, v7, Lm31;->a:Z

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_7
    move-object v2, p0

    .line 128
    if-eqz v12, :cond_9

    .line 129
    .line 130
    if-eqz v13, :cond_9

    .line 131
    .line 132
    iget v4, v4, Lsi1;->g:I

    .line 133
    .line 134
    iget v6, v11, Lsi1;->g:I

    .line 135
    .line 136
    move v14, v5

    .line 137
    move v5, v3

    .line 138
    move v3, v14

    .line 139
    invoke-virtual/range {v2 .. v7}, Lri1;->q(IIIILm31;)V

    .line 140
    .line 141
    .line 142
    iget-object p0, v7, Lm31;->d:Ly03;

    .line 143
    .line 144
    if-ne v8, v10, :cond_8

    .line 145
    .line 146
    iget-object p0, p0, Lk09;->e:Lzo1;

    .line 147
    .line 148
    invoke-virtual {v7}, Lm31;->q()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    iput v1, p0, Lzo1;->m:I

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_8
    iget-object p0, p0, Lk09;->e:Lzo1;

    .line 156
    .line 157
    invoke-virtual {v7}, Lm31;->q()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    invoke-virtual {p0, v1}, Lzo1;->d(I)V

    .line 162
    .line 163
    .line 164
    iput-boolean v9, v7, Lm31;->a:Z

    .line 165
    .line 166
    :cond_9
    :goto_3
    iget-boolean p0, v7, Lm31;->a:Z

    .line 167
    .line 168
    if-eqz p0, :cond_a

    .line 169
    .line 170
    iget-object p0, v7, Lm31;->e:Lkv8;

    .line 171
    .line 172
    iget-object p0, p0, Lkv8;->l:Lw20;

    .line 173
    .line 174
    if-eqz p0, :cond_a

    .line 175
    .line 176
    iget v1, v7, Lm31;->a0:I

    .line 177
    .line 178
    invoke-virtual {p0, v1}, Lzo1;->d(I)V

    .line 179
    .line 180
    .line 181
    :cond_a
    move-object p0, v2

    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_b
    return-void
.end method

.method public v(Landroidx/compose/ui/node/LayoutNode;Z)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lri1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/compose/ui/node/LayoutNode;

    .line 4
    .line 5
    iget-boolean v1, p1, Landroidx/compose/ui/node/LayoutNode;->Q0:Z

    .line 6
    .line 7
    iget-object v2, p1, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Lri1;->p(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_c

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lri1;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lq31;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v1, 0x0

    .line 31
    :goto_0
    if-eqz p2, :cond_4

    .line 32
    .line 33
    iget-boolean p2, v2, Lr34;->e:Z

    .line 34
    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    invoke-static {p1, v1}, Lri1;->g(Landroidx/compose/ui/node/LayoutNode;Lq31;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    :cond_2
    if-nez v3, :cond_3

    .line 42
    .line 43
    iget-boolean p2, v2, Lr34;->f:Z

    .line 44
    .line 45
    if-eqz p2, :cond_b

    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->M()Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-static {p2, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eqz p2, :cond_b

    .line 58
    .line 59
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->N()V

    .line 60
    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_4
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->q()Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_5

    .line 68
    .line 69
    invoke-static {p1, v1}, Lri1;->h(Landroidx/compose/ui/node/LayoutNode;Lq31;)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    goto :goto_1

    .line 74
    :cond_5
    move p2, v3

    .line 75
    :goto_1
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->p()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_a

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    if-eq p1, v0, :cond_6

    .line 83
    .line 84
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    if-eqz v4, :cond_a

    .line 89
    .line 90
    invoke-virtual {v4}, Landroidx/compose/ui/node/LayoutNode;->L()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-ne v4, v1, :cond_a

    .line 95
    .line 96
    iget-object v4, v2, Lr34;->p:Lwr4;

    .line 97
    .line 98
    iget-boolean v4, v4, Lwr4;->w0:Z

    .line 99
    .line 100
    if-eqz v4, :cond_a

    .line 101
    .line 102
    :cond_6
    if-ne p1, v0, :cond_9

    .line 103
    .line 104
    iget-object v0, p1, Landroidx/compose/ui/node/LayoutNode;->E0:Lm34;

    .line 105
    .line 106
    sget-object v4, Lm34;->Z:Lm34;

    .line 107
    .line 108
    if-ne v0, v4, :cond_7

    .line 109
    .line 110
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->f()V

    .line 111
    .line 112
    .line 113
    :cond_7
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-eqz v0, :cond_8

    .line 118
    .line 119
    iget-object v0, v0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 120
    .line 121
    iget-object v0, v0, Lt6;->f0:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, Lfd3;

    .line 124
    .line 125
    iget-object v0, v0, Lvi4;->r0:Lwi4;

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_8
    invoke-static {p1}, Lq34;->a(Landroidx/compose/ui/node/LayoutNode;)Lmf5;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-interface {v0}, Lmf5;->getPlacementScope()Ldo5;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    :goto_2
    iget-object v2, v2, Lr34;->p:Lwr4;

    .line 137
    .line 138
    invoke-static {v0, v2, v3, v3}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_9
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->U()V

    .line 143
    .line 144
    .line 145
    :goto_3
    iget-object v0, p0, Lri1;->e:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Lzz2;

    .line 148
    .line 149
    iget v2, p1, Landroidx/compose/ui/node/LayoutNode;->P0:I

    .line 150
    .line 151
    if-lez v2, :cond_a

    .line 152
    .line 153
    iget-object v0, v0, Lzz2;->Y:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lc15;

    .line 156
    .line 157
    invoke-virtual {v0, p1}, Lc15;->b(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iput-boolean v1, p1, Landroidx/compose/ui/node/LayoutNode;->O0:Z

    .line 161
    .line 162
    :cond_a
    move v3, p2

    .line 163
    :cond_b
    :goto_4
    invoke-virtual {p0}, Lri1;->i()V

    .line 164
    .line 165
    .line 166
    :cond_c
    :goto_5
    return v3
.end method

.method public w(Landroidx/compose/ui/node/LayoutNode;Z)Z
    .locals 2

    .line 1
    iget-boolean v0, p1, Landroidx/compose/ui/node/LayoutNode;->Q0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    invoke-static {p1}, Lri1;->p(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    iget-object v0, p0, Lri1;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroidx/compose/ui/node/LayoutNode;

    .line 16
    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lri1;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lq31;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-eqz p2, :cond_2

    .line 29
    .line 30
    iget-object p2, p1, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 31
    .line 32
    iget-boolean p2, p2, Lr34;->e:Z

    .line 33
    .line 34
    if-eqz p2, :cond_3

    .line 35
    .line 36
    invoke-static {p1, v0}, Lri1;->g(Landroidx/compose/ui/node/LayoutNode;Lq31;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->q()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_3

    .line 46
    .line 47
    invoke-static {p1, v0}, Lri1;->h(Landroidx/compose/ui/node/LayoutNode;Lq31;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lri1;->i()V

    .line 52
    .line 53
    .line 54
    :cond_4
    :goto_2
    return v1
.end method

.method public x(Landroidx/compose/ui/node/LayoutNode;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->C()Lc15;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Lc15;->X:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, Lc15;->Z:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_3

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, Landroidx/compose/ui/node/LayoutNode;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->r()Lm34;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Lm34;->X:Lm34;

    .line 21
    .line 22
    if-eq v3, v4, :cond_0

    .line 23
    .line 24
    iget-object v3, v2, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 25
    .line 26
    iget-object v3, v3, Lr34;->p:Lwr4;

    .line 27
    .line 28
    iget-object v3, v3, Lwr4;->A0:Lo34;

    .line 29
    .line 30
    invoke-virtual {v3}, Lo34;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    :cond_0
    invoke-static {v2}, Los4;->t(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-virtual {p0, v2, v3}, Lri1;->y(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {p0, v2}, Lri1;->x(Landroidx/compose/ui/node/LayoutNode;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return-void
.end method

.method public y(Landroidx/compose/ui/node/LayoutNode;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Landroidx/compose/ui/node/LayoutNode;->Q0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lri1;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/compose/ui/node/LayoutNode;

    .line 9
    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Lri1;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lq31;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    :goto_0
    if-eqz p2, :cond_2

    .line 22
    .line 23
    invoke-static {p1, p0}, Lri1;->g(Landroidx/compose/ui/node/LayoutNode;Lq31;)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    invoke-static {p1, p0}, Lri1;->h(Landroidx/compose/ui/node/LayoutNode;Lq31;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public z(Landroidx/compose/ui/node/LayoutNode;Z)Z
    .locals 4

    .line 1
    iget-object v0, p1, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 2
    .line 3
    iget-object v0, v0, Lr34;->d:Lk34;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v2, :cond_6

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    if-eq v0, v3, :cond_5

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    if-eq v0, v3, :cond_5

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    if-ne v0, v3, :cond_4

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->q()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    if-nez p2, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object p2, p1, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 34
    .line 35
    iget-object p2, p2, Lr34;->p:Lwr4;

    .line 36
    .line 37
    iput-boolean v2, p2, Lwr4;->x0:Z

    .line 38
    .line 39
    iget-boolean p2, p1, Landroidx/compose/ui/node/LayoutNode;->Q0:Z

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->L()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-nez p2, :cond_2

    .line 49
    .line 50
    invoke-static {p1}, Lri1;->o(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_6

    .line 55
    .line 56
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    invoke-virtual {p2}, Landroidx/compose/ui/node/LayoutNode;->q()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-ne p2, v2, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    iget-object p2, p0, Lri1;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p2, Llr;

    .line 72
    .line 73
    sget-object v0, Lbi3;->Z:Lbi3;

    .line 74
    .line 75
    invoke-virtual {p2, p1, v0}, Llr;->a(Landroidx/compose/ui/node/LayoutNode;Lbi3;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    iget-boolean p0, p0, Lri1;->b:Z

    .line 79
    .line 80
    if-nez p0, :cond_6

    .line 81
    .line 82
    return v2

    .line 83
    :cond_4
    invoke-static {}, Lb61;->c()V

    .line 84
    .line 85
    .line 86
    return v1

    .line 87
    :cond_5
    iget-object p0, p0, Lri1;->g:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Lc15;

    .line 90
    .line 91
    new-instance v0, Lur4;

    .line 92
    .line 93
    invoke-direct {v0, p1, v1, p2}, Lur4;-><init>(Landroidx/compose/ui/node/LayoutNode;ZZ)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v0}, Lc15;->b(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    :goto_1
    return v1
.end method
