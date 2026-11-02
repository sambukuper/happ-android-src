.class public final Lz9;
.super Lxu1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public L0:Lla;

.field public M0:Ljava/lang/Boolean;

.field public N0:Lxc7;

.field public O0:Lhe2;

.field public P0:Lfi1;


# virtual methods
.method public final Q0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lz9;->N0:Lxc7;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz9;->v1(Lxc7;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxu1;->I()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 13
    .line 14
    iget-object v1, p0, Lz9;->P0:Lfi1;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    :cond_0
    iput-object v0, p0, Lz9;->P0:Lfi1;

    .line 25
    .line 26
    iget-object v0, p0, Lz9;->N0:Lxc7;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lz9;->v1(Lxc7;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public final c1(Lpi;Lwu1;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lz9;->L0:Lla;

    .line 2
    .line 3
    new-instance v1, Lu9;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    invoke-direct {v1, p1, p0, v6}, Lu9;-><init>(Lpi;Lz9;Lq51;)V

    .line 7
    .line 8
    .line 9
    iget-object v4, v0, Lla;->b:Lm15;

    .line 10
    .line 11
    new-instance v5, Lda;

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    invoke-direct {v5, v0, v1, v6, p0}, Lda;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v2, Lkg3;

    .line 21
    .line 22
    const/4 v7, 0x1

    .line 23
    sget-object v3, Lf15;->X:Lf15;

    .line 24
    .line 25
    invoke-direct/range {v2 .. v7}, Lkg3;-><init>(Lf15;Ljava/lang/Object;Lgn2;Lq51;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v2, p2}, Lgv3;->n(Lrn2;Lq51;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object p1, Ldn8;->a:Ldn8;

    .line 33
    .line 34
    sget-object p2, Lc71;->X:Lc71;

    .line 35
    .line 36
    if-ne p0, p2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object p0, p1

    .line 40
    :goto_0
    if-ne p0, p2, :cond_1

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_1
    return-object p1
.end method

.method public final q1()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lz9;->L0:Lla;

    .line 2
    .line 3
    iget-object p0, p0, Lla;->h:Lrh5;

    .line 4
    .line 5
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final t1(FLs51;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, Lv9;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lv9;

    .line 7
    .line 8
    iget v1, v0, Lv9;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lv9;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lv9;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lv9;-><init>(Lz9;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lv9;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lv9;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x2

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    if-eq v1, v2, :cond_2

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Lv9;->f0:Lba6;

    .line 38
    .line 39
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object p2

    .line 54
    :cond_3
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lz9;->L0:Lla;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance p2, Lba6;

    .line 63
    .line 64
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    iput p1, p2, Lba6;->X:F

    .line 68
    .line 69
    iget-object v1, p0, Lz9;->L0:Lla;

    .line 70
    .line 71
    new-instance v4, Lx9;

    .line 72
    .line 73
    const/4 v9, 0x0

    .line 74
    invoke-direct {v4, p0, p2, p1, v9}, Lx9;-><init>(Lz9;Lba6;FLq51;)V

    .line 75
    .line 76
    .line 77
    iput-object p2, v0, Lv9;->f0:Lba6;

    .line 78
    .line 79
    iput v3, v0, Lv9;->i0:I

    .line 80
    .line 81
    iget-object v7, v1, Lla;->b:Lm15;

    .line 82
    .line 83
    new-instance v8, Lda;

    .line 84
    .line 85
    invoke-direct {v8, v1, v4, v9, v2}, Lda;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance v5, Lkg3;

    .line 92
    .line 93
    const/4 v10, 0x1

    .line 94
    sget-object v6, Lf15;->X:Lf15;

    .line 95
    .line 96
    invoke-direct/range {v5 .. v10}, Lkg3;-><init>(Lf15;Ljava/lang/Object;Lgn2;Lq51;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {v5, v0}, Lgv3;->n(Lrn2;Lq51;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    sget-object p1, Lc71;->X:Lc71;

    .line 104
    .line 105
    if-ne p0, p1, :cond_4

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    sget-object p0, Ldn8;->a:Ldn8;

    .line 109
    .line 110
    :goto_1
    if-ne p0, p1, :cond_5

    .line 111
    .line 112
    return-object p1

    .line 113
    :cond_5
    move-object p0, p2

    .line 114
    :goto_2
    iget p0, p0, Lba6;->X:F

    .line 115
    .line 116
    new-instance p1, Ljava/lang/Float;

    .line 117
    .line 118
    invoke-direct {p1, p0}, Ljava/lang/Float;-><init>(F)V

    .line 119
    .line 120
    .line 121
    return-object p1
.end method

.method public final u1()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lz9;->M0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 10
    .line 11
    sget-object v1, Lz24;->Y:Lz24;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lxu1;->s0:Lsd5;

    .line 16
    .line 17
    sget-object v0, Lsd5;->Y:Lsd5;

    .line 18
    .line 19
    if-ne p0, v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final v1(Lxc7;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lg9;->a:Lsg8;

    .line 4
    .line 5
    sget-object v0, Lg9;->b:Ly2;

    .line 6
    .line 7
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v1, v1, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 12
    .line 13
    iput-object v1, p0, Lz9;->P0:Lfi1;

    .line 14
    .line 15
    iget-object v2, p0, Lz9;->L0:Lla;

    .line 16
    .line 17
    new-instance v3, Lo7;

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    invoke-direct {v3, v1, v4}, Lo7;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Llr;

    .line 24
    .line 25
    const/4 v4, 0x6

    .line 26
    invoke-direct {v1, v2, v0, v3, v4}, Llr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lxc7;

    .line 30
    .line 31
    invoke-direct {v0, v1, p1}, Lxc7;-><init>(Llr;Lpk;)V

    .line 32
    .line 33
    .line 34
    move-object p1, v0

    .line 35
    :cond_0
    iput-object p1, p0, Lz9;->O0:Lhe2;

    .line 36
    .line 37
    return-void
.end method
