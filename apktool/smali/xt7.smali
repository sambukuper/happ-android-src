.class public abstract Lxt7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static final a(Lps7;Lgn2;Lkx4;Llp2;I)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const v1, 0x3599da89

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3, v1}, Llp2;->X(I)Llp2;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v1, p4, 0x6

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v2

    .line 27
    :goto_0
    or-int/2addr v1, p4

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, p4

    .line 30
    :goto_1
    and-int/lit8 v4, p4, 0x30

    .line 31
    .line 32
    if-nez v4, :cond_3

    .line 33
    .line 34
    invoke-virtual {p3, p1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    const/16 v4, 0x20

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/16 v4, 0x10

    .line 44
    .line 45
    :goto_2
    or-int/2addr v1, v4

    .line 46
    :cond_3
    and-int/lit16 v4, p4, 0x180

    .line 47
    .line 48
    if-nez v4, :cond_5

    .line 49
    .line 50
    invoke-virtual {p3, p2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    const/16 v4, 0x100

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_4
    const/16 v4, 0x80

    .line 60
    .line 61
    :goto_3
    or-int/2addr v1, v4

    .line 62
    :cond_5
    and-int/lit16 v4, v1, 0x93

    .line 63
    .line 64
    const/16 v5, 0x92

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v10, 0x1

    .line 68
    if-eq v4, v5, :cond_6

    .line 69
    .line 70
    move v4, v10

    .line 71
    goto :goto_4

    .line 72
    :cond_6
    move v4, v6

    .line 73
    :goto_4
    and-int/2addr v1, v10

    .line 74
    invoke-virtual {p3, v1, v4}, Llp2;->N(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_8

    .line 79
    .line 80
    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 81
    .line 82
    iget-object v1, p0, Lps7;->a:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v1, p3, v2}, Lz68;->A0(Ljava/lang/String;Llp2;I)Ly68;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    sget-object v2, Lht;->c:Ldt;

    .line 89
    .line 90
    sget-object v5, Lpz2;->q0:Ln50;

    .line 91
    .line 92
    invoke-static {v2, v5, p3, v6}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    iget-wide v5, p3, Llp2;->T:J

    .line 97
    .line 98
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    invoke-virtual {p3}, Llp2;->l()Lkl5;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-static {p3, p2}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    sget-object v9, Luz0;->j:Lpz2;

    .line 111
    .line 112
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p3}, Llp2;->Z()V

    .line 116
    .line 117
    .line 118
    iget-boolean v9, p3, Llp2;->S:Z

    .line 119
    .line 120
    if-eqz v9, :cond_7

    .line 121
    .line 122
    invoke-virtual {p3}, Llp2;->k()V

    .line 123
    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_7
    invoke-virtual {p3}, Llp2;->j0()V

    .line 127
    .line 128
    .line 129
    :goto_5
    sget-object v9, Lpz2;->B0:Ldx0;

    .line 130
    .line 131
    invoke-static {v9, p3, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object v2, Lpz2;->A0:Ldx0;

    .line 135
    .line 136
    invoke-static {v2, p3, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    sget-object v5, Lpz2;->C0:Ldx0;

    .line 144
    .line 145
    invoke-static {v5, p3, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-static {p3}, Lpn7;->l(Llp2;)V

    .line 149
    .line 150
    .line 151
    sget-object v2, Lpz2;->z0:Ldx0;

    .line 152
    .line 153
    invoke-static {v2, p3, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    sget v2, Ly46;->sub_properties_ua_title:I

    .line 157
    .line 158
    invoke-static {v2, p3}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    new-instance v2, Lh64;

    .line 163
    .line 164
    invoke-direct {v2, p0, p1, v4, v1}, Lh64;-><init>(Lps7;Lgn2;Lkx4;Ly68;)V

    .line 165
    .line 166
    .line 167
    const v1, 0x6a1991f3

    .line 168
    .line 169
    .line 170
    invoke-static {v1, v2, p3}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    const/16 v8, 0x186

    .line 175
    .line 176
    const/4 v9, 0x0

    .line 177
    move-object v7, p3

    .line 178
    invoke-static/range {v4 .. v9}, Lci8;->a(Lkx4;Ljava/lang/String;Lzy0;Llp2;II)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p3, v10}, Llp2;->p(Z)V

    .line 182
    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_8
    invoke-virtual {p3}, Llp2;->Q()V

    .line 186
    .line 187
    .line 188
    :goto_6
    invoke-virtual {p3}, Llp2;->r()Lj86;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    if-eqz v6, :cond_9

    .line 193
    .line 194
    new-instance v0, Lg8;

    .line 195
    .line 196
    const/16 v5, 0x15

    .line 197
    .line 198
    move-object v1, p0

    .line 199
    move-object v2, p1

    .line 200
    move-object v3, p2

    .line 201
    move v4, p4

    .line 202
    invoke-direct/range {v0 .. v5}, Lg8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 203
    .line 204
    .line 205
    iput-object v0, v6, Lj86;->d:Lrn2;

    .line 206
    .line 207
    :cond_9
    return-void
.end method

.method public static final b(Ljava/util/ArrayList;Ljava/util/List;Lho2;)Ljava/util/ArrayList;
    .locals 16

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    invoke-static/range {p0 .. p1}, Lwv0;->e1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/16 v2, 0xa

    .line 17
    .line 18
    invoke-static {v0, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lqg5;

    .line 40
    .line 41
    iget-object v3, v2, Lqg5;->X:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v10, v3

    .line 44
    check-cast v10, Lt14;

    .line 45
    .line 46
    iget-object v2, v2, Lqg5;->Y:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lot8;

    .line 49
    .line 50
    new-instance v4, Lot8;

    .line 51
    .line 52
    iget v7, v2, Lot8;->j0:I

    .line 53
    .line 54
    invoke-virtual {v2}, Lcw0;->getAnnotations()Lsm;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-virtual {v2}, Lfd1;->getName()Lv15;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Lot8;->I0()Z

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    iget-boolean v12, v2, Lot8;->l0:Z

    .line 70
    .line 71
    iget-boolean v13, v2, Lot8;->m0:Z

    .line 72
    .line 73
    iget-object v3, v2, Lot8;->n0:Lt14;

    .line 74
    .line 75
    if-eqz v3, :cond_0

    .line 76
    .line 77
    sget v3, Lel1;->a:I

    .line 78
    .line 79
    invoke-static/range {p2 .. p2}, Lbl1;->c(Led1;)Lvx4;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-interface {v3}, Lvx4;->f()Lzz3;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v3, v10}, Lzz3;->f(Lt14;)Lt14;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    :goto_1
    move-object v14, v3

    .line 95
    goto :goto_2

    .line 96
    :cond_0
    const/4 v3, 0x0

    .line 97
    goto :goto_1

    .line 98
    :goto_2
    invoke-virtual {v2}, Lhd1;->getSource()Lke7;

    .line 99
    .line 100
    .line 101
    move-result-object v15

    .line 102
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    move-object/from16 v5, p2

    .line 107
    .line 108
    invoke-direct/range {v4 .. v15}, Lot8;-><init>(Ljd0;Lot8;ILsm;Lv15;Lt14;ZZZLt14;Lke7;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_1
    return-object v1
.end method

.method public static final c(Lsx4;)Lh54;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget v0, Lel1;->a:I

    .line 5
    .line 6
    invoke-virtual {p0}, Lsx4;->X()Laa7;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lt14;->n0()Llh8;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Llh8;->c()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lt14;

    .line 34
    .line 35
    invoke-static {v0}, Lzz3;->y(Lt14;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Lt14;->n0()Llh8;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0}, Llh8;->x()Lot0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v2, Lus0;->X:Lus0;

    .line 50
    .line 51
    invoke-static {v0, v2}, Lbl1;->l(Led1;Lus0;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_1

    .line 56
    .line 57
    sget-object v2, Lus0;->Z:Lus0;

    .line 58
    .line 59
    invoke-static {v0, v2}, Lbl1;->l(Led1;Lus0;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    check-cast v0, Lsx4;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move-object v0, v1

    .line 72
    :goto_0
    if-nez v0, :cond_3

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_3
    invoke-virtual {v0}, Lsx4;->o0()Let4;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    instance-of v2, p0, Lh54;

    .line 80
    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    move-object v1, p0

    .line 84
    check-cast v1, Lh54;

    .line 85
    .line 86
    :cond_4
    if-nez v1, :cond_5

    .line 87
    .line 88
    invoke-static {v0}, Lxt7;->c(Lsx4;)Lh54;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :cond_5
    return-object v1
.end method

.method public static final d(Lo88;Lz24;)Lo88;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lo88;

    .line 4
    .line 5
    iget-object v2, v0, Lo88;->a:Lqe7;

    .line 6
    .line 7
    sget-object v3, Lre7;->d:Lf78;

    .line 8
    .line 9
    iget-object v3, v2, Lqe7;->a:Lf78;

    .line 10
    .line 11
    sget-object v4, Le78;->a:Le78;

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    :goto_0
    move-object v5, v3

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    sget-object v3, Lre7;->d:Lf78;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :goto_1
    iget-wide v3, v2, Lqe7;->b:J

    .line 25
    .line 26
    sget-object v6, Lv88;->b:[Lw88;

    .line 27
    .line 28
    const-wide v24, 0xff00000000L

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long v6, v3, v24

    .line 34
    .line 35
    const-wide/16 v26, 0x0

    .line 36
    .line 37
    cmp-long v6, v6, v26

    .line 38
    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    sget-wide v3, Lre7;->a:J

    .line 42
    .line 43
    :cond_1
    move-wide v6, v3

    .line 44
    iget-object v3, v2, Lqe7;->c:Ldj2;

    .line 45
    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    sget-object v3, Ldj2;->g0:Ldj2;

    .line 49
    .line 50
    :cond_2
    move-object v8, v3

    .line 51
    iget-object v3, v2, Lqe7;->d:Lbj2;

    .line 52
    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    iget v3, v3, Lbj2;->a:I

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    const/4 v3, 0x0

    .line 59
    :goto_2
    new-instance v9, Lbj2;

    .line 60
    .line 61
    invoke-direct {v9, v3}, Lbj2;-><init>(I)V

    .line 62
    .line 63
    .line 64
    iget-object v3, v2, Lqe7;->e:Lcj2;

    .line 65
    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    iget v3, v3, Lcj2;->a:I

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const v3, 0xffff

    .line 72
    .line 73
    .line 74
    :goto_3
    new-instance v10, Lcj2;

    .line 75
    .line 76
    invoke-direct {v10, v3}, Lcj2;-><init>(I)V

    .line 77
    .line 78
    .line 79
    iget-object v3, v2, Lqe7;->f:Lgi2;

    .line 80
    .line 81
    if-nez v3, :cond_5

    .line 82
    .line 83
    sget-object v3, Lgi2;->a:Lqe1;

    .line 84
    .line 85
    :cond_5
    move-object v11, v3

    .line 86
    iget-object v3, v2, Lqe7;->g:Ljava/lang/String;

    .line 87
    .line 88
    if-nez v3, :cond_6

    .line 89
    .line 90
    const-string v3, ""

    .line 91
    .line 92
    :cond_6
    move-object v12, v3

    .line 93
    iget-wide v3, v2, Lqe7;->h:J

    .line 94
    .line 95
    and-long v13, v3, v24

    .line 96
    .line 97
    cmp-long v13, v13, v26

    .line 98
    .line 99
    if-nez v13, :cond_7

    .line 100
    .line 101
    sget-wide v3, Lre7;->b:J

    .line 102
    .line 103
    :cond_7
    move-wide v13, v3

    .line 104
    iget-object v3, v2, Lqe7;->i:Lx20;

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    if-eqz v3, :cond_8

    .line 108
    .line 109
    iget v3, v3, Lx20;->a:F

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_8
    move v3, v4

    .line 113
    :goto_4
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 114
    .line 115
    .line 116
    move-result v15

    .line 117
    if-eqz v15, :cond_9

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_9
    move v4, v3

    .line 121
    :goto_5
    new-instance v15, Lx20;

    .line 122
    .line 123
    invoke-direct {v15, v4}, Lx20;-><init>(F)V

    .line 124
    .line 125
    .line 126
    iget-object v3, v2, Lqe7;->j:Lg78;

    .line 127
    .line 128
    if-nez v3, :cond_a

    .line 129
    .line 130
    sget-object v3, Lg78;->c:Lg78;

    .line 131
    .line 132
    :cond_a
    move-object/from16 v16, v3

    .line 133
    .line 134
    iget-object v3, v2, Lqe7;->k:Lge4;

    .line 135
    .line 136
    if-nez v3, :cond_b

    .line 137
    .line 138
    sget-object v3, Lge4;->Z:Lge4;

    .line 139
    .line 140
    sget-object v3, Luo5;->a:Llr;

    .line 141
    .line 142
    invoke-virtual {v3}, Llr;->l()Lge4;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    :cond_b
    move-object/from16 v17, v3

    .line 147
    .line 148
    iget-wide v3, v2, Lqe7;->l:J

    .line 149
    .line 150
    const-wide/16 v18, 0x10

    .line 151
    .line 152
    cmp-long v18, v3, v18

    .line 153
    .line 154
    if-eqz v18, :cond_c

    .line 155
    .line 156
    :goto_6
    move-wide/from16 v18, v3

    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_c
    sget-wide v3, Lre7;->c:J

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :goto_7
    iget-object v3, v2, Lqe7;->m:Lx38;

    .line 163
    .line 164
    if-nez v3, :cond_d

    .line 165
    .line 166
    sget-object v3, Lx38;->b:Lx38;

    .line 167
    .line 168
    :cond_d
    move-object/from16 v20, v3

    .line 169
    .line 170
    iget-object v3, v2, Lqe7;->n:Lt67;

    .line 171
    .line 172
    if-nez v3, :cond_e

    .line 173
    .line 174
    sget-object v3, Lt67;->d:Lt67;

    .line 175
    .line 176
    :cond_e
    move-object/from16 v21, v3

    .line 177
    .line 178
    iget-object v3, v2, Lqe7;->o:Lqp5;

    .line 179
    .line 180
    iget-object v2, v2, Lqe7;->p:Ltv1;

    .line 181
    .line 182
    if-nez v2, :cond_f

    .line 183
    .line 184
    sget-object v2, Lea2;->a:Lea2;

    .line 185
    .line 186
    :cond_f
    move-object/from16 v23, v2

    .line 187
    .line 188
    new-instance v4, Lqe7;

    .line 189
    .line 190
    move-object/from16 v22, v3

    .line 191
    .line 192
    invoke-direct/range {v4 .. v23}, Lqe7;-><init>(Lf78;JLdj2;Lbj2;Lcj2;Lgi2;Ljava/lang/String;JLx20;Lg78;Lge4;JLx38;Lt67;Lqp5;Ltv1;)V

    .line 193
    .line 194
    .line 195
    iget-object v2, v0, Lo88;->b:Lxg5;

    .line 196
    .line 197
    sget v3, Lyg5;->b:I

    .line 198
    .line 199
    new-instance v5, Lxg5;

    .line 200
    .line 201
    iget v3, v2, Lxg5;->a:I

    .line 202
    .line 203
    const/4 v6, 0x5

    .line 204
    if-nez v3, :cond_10

    .line 205
    .line 206
    move v3, v6

    .line 207
    :cond_10
    iget v7, v2, Lxg5;->b:I

    .line 208
    .line 209
    const/4 v8, 0x3

    .line 210
    const/4 v9, 0x0

    .line 211
    const/4 v10, 0x1

    .line 212
    if-ne v7, v8, :cond_13

    .line 213
    .line 214
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    if-eqz v7, :cond_12

    .line 219
    .line 220
    if-ne v7, v10, :cond_11

    .line 221
    .line 222
    :goto_8
    move v7, v6

    .line 223
    goto :goto_9

    .line 224
    :cond_11
    invoke-static {}, Lb61;->c()V

    .line 225
    .line 226
    .line 227
    return-object v9

    .line 228
    :cond_12
    const/4 v6, 0x4

    .line 229
    goto :goto_8

    .line 230
    :cond_13
    if-nez v7, :cond_16

    .line 231
    .line 232
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    if-eqz v6, :cond_15

    .line 237
    .line 238
    if-ne v6, v10, :cond_14

    .line 239
    .line 240
    const/4 v6, 0x2

    .line 241
    goto :goto_8

    .line 242
    :cond_14
    invoke-static {}, Lb61;->c()V

    .line 243
    .line 244
    .line 245
    return-object v9

    .line 246
    :cond_15
    move v7, v10

    .line 247
    :cond_16
    :goto_9
    iget-wide v8, v2, Lxg5;->c:J

    .line 248
    .line 249
    and-long v11, v8, v24

    .line 250
    .line 251
    cmp-long v6, v11, v26

    .line 252
    .line 253
    if-nez v6, :cond_17

    .line 254
    .line 255
    sget-wide v8, Lyg5;->a:J

    .line 256
    .line 257
    :cond_17
    iget-object v6, v2, Lxg5;->d:Li78;

    .line 258
    .line 259
    if-nez v6, :cond_18

    .line 260
    .line 261
    sget-object v6, Li78;->c:Li78;

    .line 262
    .line 263
    :cond_18
    iget-object v11, v2, Lxg5;->e:Lfp5;

    .line 264
    .line 265
    iget-object v12, v2, Lxg5;->f:Laa4;

    .line 266
    .line 267
    iget v13, v2, Lxg5;->g:I

    .line 268
    .line 269
    if-nez v13, :cond_19

    .line 270
    .line 271
    sget v13, Lv94;->b:I

    .line 272
    .line 273
    :cond_19
    iget v14, v2, Lxg5;->h:I

    .line 274
    .line 275
    if-nez v14, :cond_1a

    .line 276
    .line 277
    move v14, v10

    .line 278
    :cond_1a
    iget-object v2, v2, Lxg5;->i:Le88;

    .line 279
    .line 280
    if-nez v2, :cond_1b

    .line 281
    .line 282
    sget-object v2, Le88;->c:Le88;

    .line 283
    .line 284
    :cond_1b
    move-object v15, v2

    .line 285
    move-object v10, v6

    .line 286
    move v6, v3

    .line 287
    invoke-direct/range {v5 .. v15}, Lxg5;-><init>(IIJLi78;Lfp5;Laa4;IILe88;)V

    .line 288
    .line 289
    .line 290
    iget-object v0, v0, Lo88;->c:Lup5;

    .line 291
    .line 292
    invoke-direct {v1, v4, v5, v0}, Lo88;-><init>(Lqe7;Lxg5;Lup5;)V

    .line 293
    .line 294
    .line 295
    return-object v1
.end method

.method public static final e(Ljava/util/Set;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Enum;Z)Ljava/lang/Object;
    .locals 1

    .line 1
    if-eqz p4, :cond_4

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p4, :cond_0

    .line 9
    .line 10
    move-object p0, p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    move-object p0, p2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object p0, v0

    .line 21
    :goto_0
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    invoke-static {p3, p2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_2
    if-nez p3, :cond_3

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    return-object p3

    .line 38
    :cond_4
    if-eqz p3, :cond_5

    .line 39
    .line 40
    invoke-static {p0, p3}, Lq57;->a0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :cond_5
    check-cast p0, Ljava/lang/Iterable;

    .line 49
    .line 50
    invoke-static {p0}, Lwv0;->P0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public static f(Landroid/view/Window;Z)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Lb4;->r(Landroid/view/Window;Z)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/16 v1, 0x1e

    .line 12
    .line 13
    if-lt v0, v1, :cond_1

    .line 14
    .line 15
    invoke-static {p0, p1}, Lb4;->q(Landroid/view/Window;Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    and-int/lit16 p1, v0, -0x701

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    or-int/lit16 p1, v0, 0x700

    .line 33
    .line 34
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
