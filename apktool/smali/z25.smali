.class public final Lz25;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lye8;
.implements Lt25;


# instance fields
.field public q0:Lt25;

.field public r0:Lz47;

.field public s0:Lz25;

.field public final t0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lt25;Lz47;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljx4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz25;->q0:Lt25;

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    new-instance p2, Lz47;

    .line 9
    .line 10
    const/16 p1, 0x19

    .line 11
    .line 12
    invoke-direct {p2, p1}, Lz47;-><init>(B)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iput-object p2, p0, Lz25;->r0:Lz47;

    .line 16
    .line 17
    const-string p1, "androidx.compose.ui.input.nestedscroll.NestedScrollNode"

    .line 18
    .line 19
    iput-object p1, p0, Lz25;->t0:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final B(JJLq51;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v1, p5

    .line 2
    .line 3
    instance-of v2, v1, Lx25;

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lx25;

    .line 9
    .line 10
    iget v3, v2, Lx25;->j0:I

    .line 11
    .line 12
    const/high16 v4, -0x80000000

    .line 13
    .line 14
    and-int v5, v3, v4

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    sub-int/2addr v3, v4

    .line 19
    iput v3, v2, Lx25;->j0:I

    .line 20
    .line 21
    :goto_0
    move-object v8, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v2, Lx25;

    .line 24
    .line 25
    check-cast v1, Ls51;

    .line 26
    .line 27
    invoke-direct {v2, p0, v1}, Lx25;-><init>(Lz25;Ls51;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v8, Lx25;->h0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v2, v8, Lx25;->j0:I

    .line 34
    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x2

    .line 37
    const/4 v3, 0x1

    .line 38
    sget-object v11, Lc71;->X:Lc71;

    .line 39
    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    if-eq v2, v3, :cond_2

    .line 43
    .line 44
    if-ne v2, v10, :cond_1

    .line 45
    .line 46
    iget-wide v2, v8, Lx25;->f0:J

    .line 47
    .line 48
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_5

    .line 52
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v9

    .line 58
    :cond_2
    iget-wide v2, v8, Lx25;->g0:J

    .line 59
    .line 60
    iget-wide v4, v8, Lx25;->f0:J

    .line 61
    .line 62
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lz25;->q0:Lt25;

    .line 70
    .line 71
    iput-wide p1, v8, Lx25;->f0:J

    .line 72
    .line 73
    move-wide v6, p3

    .line 74
    iput-wide v6, v8, Lx25;->g0:J

    .line 75
    .line 76
    iput v3, v8, Lx25;->j0:I

    .line 77
    .line 78
    move-wide v4, p1

    .line 79
    move-object v3, v1

    .line 80
    invoke-interface/range {v3 .. v8}, Lt25;->B(JJLq51;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-ne v1, v11, :cond_4

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_4
    move-wide v4, p1

    .line 88
    move-wide v2, p3

    .line 89
    :goto_2
    check-cast v1, Ltu8;

    .line 90
    .line 91
    iget-wide v6, v1, Ltu8;->a:J

    .line 92
    .line 93
    iget-boolean v1, p0, Ljx4;->p0:Z

    .line 94
    .line 95
    if-eqz v1, :cond_5

    .line 96
    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    invoke-virtual {p0}, Lz25;->Z0()Lz25;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    goto :goto_3

    .line 104
    :cond_5
    iget-object v9, p0, Lz25;->s0:Lz25;

    .line 105
    .line 106
    :cond_6
    :goto_3
    if-eqz v9, :cond_8

    .line 107
    .line 108
    invoke-static {v4, v5, v6, v7}, Ltu8;->e(JJ)J

    .line 109
    .line 110
    .line 111
    move-result-wide v0

    .line 112
    invoke-static {v2, v3, v6, v7}, Ltu8;->d(JJ)J

    .line 113
    .line 114
    .line 115
    move-result-wide v2

    .line 116
    iput-wide v6, v8, Lx25;->f0:J

    .line 117
    .line 118
    iput v10, v8, Lx25;->j0:I

    .line 119
    .line 120
    move-wide p1, v0

    .line 121
    move-wide p3, v2

    .line 122
    move-object/from16 p5, v8

    .line 123
    .line 124
    move-object p0, v9

    .line 125
    invoke-virtual/range {p0 .. p5}, Lz25;->B(JJLq51;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-ne v1, v11, :cond_7

    .line 130
    .line 131
    :goto_4
    return-object v11

    .line 132
    :cond_7
    move-wide v2, v6

    .line 133
    :goto_5
    check-cast v1, Ltu8;

    .line 134
    .line 135
    iget-wide v0, v1, Ltu8;->a:J

    .line 136
    .line 137
    move-wide v6, v2

    .line 138
    goto :goto_6

    .line 139
    :cond_8
    const-wide/16 v0, 0x0

    .line 140
    .line 141
    :goto_6
    invoke-static {v6, v7, v0, v1}, Ltu8;->e(JJ)J

    .line 142
    .line 143
    .line 144
    move-result-wide v0

    .line 145
    new-instance v2, Ltu8;

    .line 146
    .line 147
    invoke-direct {v2, v0, v1}, Ltu8;-><init>(J)V

    .line 148
    .line 149
    .line 150
    return-object v2
.end method

.method public final N(IJ)J
    .locals 2

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lz25;->Z0()Lz25;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Lz25;->N(IJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    :goto_1
    iget-object p0, p0, Lz25;->q0:Lt25;

    .line 21
    .line 22
    invoke-static {p2, p3, v0, v1}, Lz85;->e(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p2

    .line 26
    invoke-interface {p0, p1, p2, p3}, Lt25;->N(IJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    invoke-static {v0, v1, p0, p1}, Lz85;->f(JJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    return-wide p0
.end method

.method public final Q0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz25;->r0:Lz47;

    .line 2
    .line 3
    iput-object p0, v0, Lz47;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, v0, Lz47;->Z:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object v1, p0, Lz25;->s0:Lz25;

    .line 9
    .line 10
    new-instance v1, Ltb2;

    .line 11
    .line 12
    const/16 v2, 0x18

    .line 13
    .line 14
    invoke-direct {v1, p0, v2}, Ltb2;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Lz47;->f0:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iput-object p0, v0, Lz47;->g0:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

.method public final R0()V
    .locals 3

    .line 1
    new-instance v0, Lea6;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lnb;

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-direct {v1, v0, v2}, Lnb;-><init>(Lea6;B)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v1}, Lts7;->h(Lye8;Lgn2;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lea6;->X:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lye8;

    .line 18
    .line 19
    check-cast v0, Lz25;

    .line 20
    .line 21
    iput-object v0, p0, Lz25;->s0:Lz25;

    .line 22
    .line 23
    iget-object v1, p0, Lz25;->r0:Lz47;

    .line 24
    .line 25
    iput-object v0, v1, Lz47;->Z:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v0, v1, Lz47;->Y:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lz25;

    .line 30
    .line 31
    if-ne v0, p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    iput-object p0, v1, Lz47;->Y:Ljava/lang/Object;

    .line 35
    .line 36
    iput-object p0, v1, Lz47;->g0:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object p0, Lzc1;->b:Ldw4;

    .line 39
    .line 40
    iput-object p0, v1, Lz47;->f0:Ljava/lang/Object;

    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public final Y0()Lb71;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lz25;->Z0()Lz25;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lz25;->Y0()Lb71;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-static {v0}, Lgv3;->E(Lb71;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x1

    .line 21
    if-ne v2, v3, :cond_1

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    iget-object p0, p0, Lz25;->r0:Lz47;

    .line 25
    .line 26
    iget-object p0, p0, Lz47;->g0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lb71;

    .line 29
    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    const-string p0, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 34
    .line 35
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v1
.end method

.method public final Z0()Lz25;
    .locals 11

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_c

    .line 5
    .line 6
    iget-object v0, p0, Ljx4;->X:Ljx4;

    .line 7
    .line 8
    iget-boolean v0, v0, Ljx4;->p0:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "visitAncestors called on an unattached node"

    .line 13
    .line 14
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Ljx4;->X:Ljx4;

    .line 18
    .line 19
    iget-object v0, v0, Ljx4;->g0:Ljx4;

    .line 20
    .line 21
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :goto_0
    if-eqz v2, :cond_b

    .line 26
    .line 27
    iget-object v3, v2, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 28
    .line 29
    iget-object v3, v3, Lt6;->i0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljx4;

    .line 32
    .line 33
    iget v3, v3, Ljx4;->f0:I

    .line 34
    .line 35
    const/high16 v4, 0x40000

    .line 36
    .line 37
    and-int/2addr v3, v4

    .line 38
    if-eqz v3, :cond_9

    .line 39
    .line 40
    :goto_1
    if-eqz v0, :cond_9

    .line 41
    .line 42
    iget v3, v0, Ljx4;->Z:I

    .line 43
    .line 44
    and-int/2addr v3, v4

    .line 45
    if-eqz v3, :cond_8

    .line 46
    .line 47
    move-object v3, v0

    .line 48
    move-object v5, v1

    .line 49
    :goto_2
    if-eqz v3, :cond_8

    .line 50
    .line 51
    instance-of v6, v3, Lye8;

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    move-object v6, v3

    .line 56
    check-cast v6, Lye8;

    .line 57
    .line 58
    iget-object v7, p0, Lz25;->t0:Ljava/lang/String;

    .line 59
    .line 60
    invoke-interface {v6}, Lye8;->o()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-static {v7, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_1

    .line 69
    .line 70
    const-class v7, Lz25;

    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    if-ne v7, v8, :cond_1

    .line 77
    .line 78
    move-object v1, v6

    .line 79
    goto :goto_5

    .line 80
    :cond_1
    iget v6, v3, Ljx4;->Z:I

    .line 81
    .line 82
    and-int/2addr v6, v4

    .line 83
    if-eqz v6, :cond_7

    .line 84
    .line 85
    instance-of v6, v3, Loh1;

    .line 86
    .line 87
    if-eqz v6, :cond_7

    .line 88
    .line 89
    move-object v6, v3

    .line 90
    check-cast v6, Loh1;

    .line 91
    .line 92
    iget-object v6, v6, Loh1;->r0:Ljx4;

    .line 93
    .line 94
    const/4 v7, 0x0

    .line 95
    move v8, v7

    .line 96
    :goto_3
    const/4 v9, 0x1

    .line 97
    if-eqz v6, :cond_6

    .line 98
    .line 99
    iget v10, v6, Ljx4;->Z:I

    .line 100
    .line 101
    and-int/2addr v10, v4

    .line 102
    if-eqz v10, :cond_5

    .line 103
    .line 104
    add-int/lit8 v8, v8, 0x1

    .line 105
    .line 106
    if-ne v8, v9, :cond_2

    .line 107
    .line 108
    move-object v3, v6

    .line 109
    goto :goto_4

    .line 110
    :cond_2
    if-nez v5, :cond_3

    .line 111
    .line 112
    new-instance v5, Lc15;

    .line 113
    .line 114
    const/16 v9, 0x10

    .line 115
    .line 116
    new-array v9, v9, [Ljx4;

    .line 117
    .line 118
    invoke-direct {v5, v7, v9}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    if-eqz v3, :cond_4

    .line 122
    .line 123
    invoke-virtual {v5, v3}, Lc15;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    move-object v3, v1

    .line 127
    :cond_4
    invoke-virtual {v5, v6}, Lc15;->b(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    :goto_4
    iget-object v6, v6, Ljx4;->h0:Ljx4;

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    if-ne v8, v9, :cond_7

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_7
    invoke-static {v5}, Lyn0;->T(Lc15;)Ljx4;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    goto :goto_2

    .line 141
    :cond_8
    iget-object v0, v0, Ljx4;->g0:Ljx4;

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_9
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    if-eqz v2, :cond_a

    .line 149
    .line 150
    iget-object v0, v2, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 151
    .line 152
    if-eqz v0, :cond_a

    .line 153
    .line 154
    iget-object v0, v0, Lt6;->h0:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v0, Lf18;

    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_a
    move-object v0, v1

    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_b
    :goto_5
    check-cast v1, Lz25;

    .line 164
    .line 165
    :cond_c
    return-object v1
.end method

.method public final o()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lz25;->t0:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final s0(IJJ)J
    .locals 6

    .line 1
    iget-object v0, p0, Lz25;->q0:Lt25;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    invoke-interface/range {v0 .. v5}, Lt25;->s0(IJJ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    iget-boolean p3, p0, Ljx4;->p0:Z

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lz25;->Z0()Lz25;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    move-object v0, p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    goto :goto_0

    .line 22
    :goto_1
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-static {v2, v3, p1, p2}, Lz85;->f(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-static {v4, v5, p1, p2}, Lz85;->e(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    invoke-virtual/range {v0 .. v5}, Lz25;->s0(IJJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide p3

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    const-wide/16 p3, 0x0

    .line 38
    .line 39
    :goto_2
    invoke-static {p1, p2, p3, p4}, Lz85;->f(JJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide p0

    .line 43
    return-wide p0
.end method

.method public final z0(JLq51;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Ly25;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ly25;

    .line 7
    .line 8
    iget v1, v0, Ly25;->i0:I

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
    iput v1, v0, Ly25;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ly25;

    .line 21
    .line 22
    check-cast p3, Ls51;

    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Ly25;-><init>(Lz25;Ls51;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, v0, Ly25;->g0:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, Ly25;->i0:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x2

    .line 33
    const/4 v4, 0x1

    .line 34
    sget-object v5, Lc71;->X:Lc71;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    if-ne v1, v3, :cond_1

    .line 41
    .line 42
    iget-wide p0, v0, Ly25;->f0:J

    .line 43
    .line 44
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_2
    iget-wide p1, v0, Ly25;->f0:J

    .line 55
    .line 56
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-boolean p3, p0, Ljx4;->p0:Z

    .line 64
    .line 65
    if-eqz p3, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Lz25;->Z0()Lz25;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    :cond_4
    if-eqz v2, :cond_6

    .line 72
    .line 73
    iput-wide p1, v0, Ly25;->f0:J

    .line 74
    .line 75
    iput v4, v0, Ly25;->i0:I

    .line 76
    .line 77
    invoke-virtual {v2, p1, p2, v0}, Lz25;->z0(JLq51;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    if-ne p3, v5, :cond_5

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    :goto_1
    check-cast p3, Ltu8;

    .line 85
    .line 86
    iget-wide v1, p3, Ltu8;->a:J

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_6
    const-wide/16 v1, 0x0

    .line 90
    .line 91
    :goto_2
    iget-object p0, p0, Lz25;->q0:Lt25;

    .line 92
    .line 93
    invoke-static {p1, p2, v1, v2}, Ltu8;->d(JJ)J

    .line 94
    .line 95
    .line 96
    move-result-wide p1

    .line 97
    iput-wide v1, v0, Ly25;->f0:J

    .line 98
    .line 99
    iput v3, v0, Ly25;->i0:I

    .line 100
    .line 101
    invoke-interface {p0, p1, p2, v0}, Lt25;->z0(JLq51;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    if-ne p3, v5, :cond_7

    .line 106
    .line 107
    :goto_3
    return-object v5

    .line 108
    :cond_7
    move-wide p0, v1

    .line 109
    :goto_4
    check-cast p3, Ltu8;

    .line 110
    .line 111
    iget-wide p2, p3, Ltu8;->a:J

    .line 112
    .line 113
    invoke-static {p0, p1, p2, p3}, Ltu8;->e(JJ)J

    .line 114
    .line 115
    .line 116
    move-result-wide p0

    .line 117
    new-instance p2, Ltu8;

    .line 118
    .line 119
    invoke-direct {p2, p0, p1}, Ltu8;-><init>(J)V

    .line 120
    .line 121
    .line 122
    return-object p2
.end method
