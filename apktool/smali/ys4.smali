.class public final Lys4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ljl1;

.field public final b:Ldq;


# direct methods
.method public constructor <init>(Ljl1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lys4;->a:Ljl1;

    .line 5
    .line 6
    new-instance v0, Ldq;

    .line 7
    .line 8
    iget-object p1, p1, Ljl1;->X:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lhl1;

    .line 11
    .line 12
    iget-object v1, p1, Lhl1;->b:Lvx4;

    .line 13
    .line 14
    iget-object p1, p1, Lhl1;->l:Lz47;

    .line 15
    .line 16
    invoke-direct {v0, v1, p1}, Ldq;-><init>(Lvx4;Lz47;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lys4;->b:Ldq;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Led1;)Lwb4;
    .locals 3

    .line 1
    instance-of v0, p1, Ltf5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ld06;

    .line 6
    .line 7
    check-cast p1, Ltf5;

    .line 8
    .line 9
    check-cast p1, Luf5;

    .line 10
    .line 11
    iget-object p1, p1, Luf5;->i0:Lfk2;

    .line 12
    .line 13
    iget-object p0, p0, Lys4;->a:Ljl1;

    .line 14
    .line 15
    iget-object v1, p0, Ljl1;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lw15;

    .line 18
    .line 19
    iget-object v2, p0, Ljl1;->f0:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lux4;

    .line 22
    .line 23
    iget-object p0, p0, Ljl1;->i0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lxl1;

    .line 26
    .line 27
    invoke-direct {v0, p1, v1, v2, p0}, Ld06;-><init>(Lfk2;Lw15;Lux4;Lke7;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    instance-of p0, p1, Lvl1;

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    check-cast p1, Lvl1;

    .line 36
    .line 37
    iget-object p0, p1, Lvl1;->w0:Lc06;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public final b(Ljava/util/List;Ljava/util/List;Ld2;I)Ljava/util/ArrayList;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v8, v1, Lys4;->a:Ljl1;

    .line 4
    .line 5
    iget-object v0, v8, Ljl1;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Led1;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-object v9, v0

    .line 13
    check-cast v9, Ljd0;

    .line 14
    .line 15
    invoke-interface {v9}, Led1;->p()Led1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lys4;->a(Led1;)Lwb4;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v10, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v11

    .line 35
    const/4 v5, 0x0

    .line 36
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    add-int/lit8 v13, v5, 0x1

    .line 47
    .line 48
    if-ltz v5, :cond_3

    .line 49
    .line 50
    move-object v15, v0

    .line 51
    check-cast v15, Lnz5;

    .line 52
    .line 53
    move-object/from16 v0, p2

    .line 54
    .line 55
    invoke-static {v5, v0}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    move-object v6, v3

    .line 60
    check-cast v6, Lvz5;

    .line 61
    .line 62
    if-eqz v6, :cond_0

    .line 63
    .line 64
    iget v3, v6, Lvz5;->Z:I

    .line 65
    .line 66
    const/4 v4, 0x1

    .line 67
    and-int/2addr v3, v4

    .line 68
    if-ne v3, v4, :cond_0

    .line 69
    .line 70
    iget v3, v6, Lvz5;->f0:I

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    const/4 v3, 0x0

    .line 74
    :goto_1
    if-eqz v2, :cond_1

    .line 75
    .line 76
    sget-object v4, Lmd2;->c:Ljd2;

    .line 77
    .line 78
    invoke-virtual {v4, v3}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_1

    .line 87
    .line 88
    new-instance v3, Lu55;

    .line 89
    .line 90
    iget-object v4, v8, Ljl1;->X:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v4, Lhl1;

    .line 93
    .line 94
    iget-object v4, v4, Lhl1;->a:Lve4;

    .line 95
    .line 96
    new-instance v0, Lxs4;

    .line 97
    .line 98
    const/4 v7, 0x1

    .line 99
    move-object v12, v3

    .line 100
    move-object v14, v4

    .line 101
    move-object/from16 v3, p3

    .line 102
    .line 103
    move/from16 v4, p4

    .line 104
    .line 105
    invoke-direct/range {v0 .. v7}, Lxs4;-><init>(Lys4;Lwb4;Ld2;IILvz5;B)V

    .line 106
    .line 107
    .line 108
    invoke-direct {v12, v14, v0}, Lu55;-><init>(Lve4;Ldn2;)V

    .line 109
    .line 110
    .line 111
    move-object v3, v12

    .line 112
    goto :goto_2

    .line 113
    :cond_1
    sget-object v3, Loy1;->f0:Lrm;

    .line 114
    .line 115
    :goto_2
    iget-object v0, v8, Ljl1;->j0:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, Lfc8;

    .line 118
    .line 119
    invoke-virtual {v0, v15}, Lfc8;->i(Lnz5;)Lt14;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const/4 v1, 0x0

    .line 124
    invoke-static {v9, v0, v1, v3, v5}, Lz91;->r(Ljd0;Lt14;Lv15;Lsm;I)Li44;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-eqz v0, :cond_2

    .line 129
    .line 130
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    :cond_2
    move-object/from16 v1, p0

    .line 134
    .line 135
    move v5, v13

    .line 136
    goto :goto_0

    .line 137
    :cond_3
    const/4 v1, 0x0

    .line 138
    invoke-static {}, Li21;->X()V

    .line 139
    .line 140
    .line 141
    throw v1

    .line 142
    :cond_4
    return-object v10
.end method

.method public final c(Ld2;II)Lsm;
    .locals 3

    .line 1
    sget-object v0, Lmd2;->c:Ljd2;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    sget-object p0, Loy1;->f0:Lrm;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance p2, Lu55;

    .line 17
    .line 18
    iget-object v0, p0, Lys4;->a:Ljl1;

    .line 19
    .line 20
    iget-object v0, v0, Ljl1;->X:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lhl1;

    .line 23
    .line 24
    iget-object v0, v0, Lhl1;->a:Lve4;

    .line 25
    .line 26
    new-instance v1, Lvs4;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v1, v2, p3, p0, p1}, Lvs4;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p2, v0, v1}, Lu55;-><init>(Lve4;Ldn2;)V

    .line 33
    .line 34
    .line 35
    return-object p2
.end method

.method public final d(Lcz5;Z)Lsm;
    .locals 3

    .line 1
    sget-object v0, Lmd2;->c:Ljd2;

    .line 2
    .line 3
    iget v1, p1, Lcz5;->f0:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object p0, Loy1;->f0:Lrm;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance v0, Lu55;

    .line 19
    .line 20
    iget-object v1, p0, Lys4;->a:Ljl1;

    .line 21
    .line 22
    iget-object v1, v1, Ljl1;->X:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lhl1;

    .line 25
    .line 26
    iget-object v1, v1, Lhl1;->a:Lve4;

    .line 27
    .line 28
    new-instance v2, Lws4;

    .line 29
    .line 30
    invoke-direct {v2, p0, p2, p1}, Lws4;-><init>(Lys4;ZLcz5;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Lu55;-><init>(Lve4;Ldn2;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public final e(Liy5;Z)Lnl1;
    .locals 14

    .line 1
    iget-object v12, p0, Lys4;->a:Ljl1;

    .line 2
    .line 3
    iget-object v1, v12, Ljl1;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Led1;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v1, Lsx4;

    .line 11
    .line 12
    new-instance v2, Lnl1;

    .line 13
    .line 14
    iget v3, p1, Liy5;->f0:I

    .line 15
    .line 16
    const/4 v13, 0x1

    .line 17
    invoke-virtual {p0, p1, v3, v13}, Lys4;->c(Ld2;II)Lsm;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v0, v12, Ljl1;->Y:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v7, v0

    .line 24
    check-cast v7, Lw15;

    .line 25
    .line 26
    iget-object v0, v12, Ljl1;->f0:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v8, v0

    .line 29
    check-cast v8, Lux4;

    .line 30
    .line 31
    iget-object v0, v12, Ljl1;->g0:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v9, v0

    .line 34
    check-cast v9, Ldv8;

    .line 35
    .line 36
    iget-object v0, v12, Ljl1;->i0:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v10, v0

    .line 39
    check-cast v10, Lxl1;

    .line 40
    .line 41
    move-object v0, v2

    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v5, 0x1

    .line 44
    const/4 v11, 0x0

    .line 45
    move-object v6, p1

    .line 46
    move/from16 v4, p2

    .line 47
    .line 48
    invoke-direct/range {v0 .. v11}, Lnl1;-><init>(Lsx4;La41;Lsm;ZILiy5;Lw15;Lux4;Ldv8;Lxl1;Lke7;)V

    .line 49
    .line 50
    .line 51
    sget-object v2, Ld02;->X:Ld02;

    .line 52
    .line 53
    invoke-static {v12, v0, v2}, Ljl1;->b(Ljl1;Lhd1;Ljava/util/List;)Ljl1;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget-object v2, v2, Ljl1;->k0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Lys4;

    .line 60
    .line 61
    iget-object v3, p1, Liy5;->g0:Ljava/util/List;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v3, p1, v13}, Lys4;->h(Ljava/util/List;Ld2;I)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    sget-object v3, Lmd2;->d:Lkd2;

    .line 71
    .line 72
    iget v4, p1, Liy5;->f0:I

    .line 73
    .line 74
    invoke-virtual {v3, v4}, Lkd2;->e(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Lb06;

    .line 79
    .line 80
    if-nez v3, :cond_0

    .line 81
    .line 82
    const/4 v3, -0x1

    .line 83
    goto :goto_0

    .line 84
    :cond_0
    sget-object v4, Li06;->b:[I

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    aget v3, v4, v3

    .line 91
    .line 92
    :goto_0
    packed-switch v3, :pswitch_data_0

    .line 93
    .line 94
    .line 95
    sget-object v3, Lgl1;->a:Lfl1;

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :pswitch_0
    sget-object v3, Lgl1;->f:Lfl1;

    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :pswitch_1
    sget-object v3, Lgl1;->e:Lfl1;

    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :pswitch_2
    sget-object v3, Lgl1;->c:Lfl1;

    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :pswitch_3
    sget-object v3, Lgl1;->b:Lfl1;

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :pswitch_4
    sget-object v3, Lgl1;->a:Lfl1;

    .line 126
    .line 127
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :pswitch_5
    sget-object v3, Lgl1;->d:Lfl1;

    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    :goto_1
    invoke-virtual {v0, v2, v3}, Lgs0;->U0(Ljava/util/List;Lfl1;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Lsx4;->X()Laa7;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v0, v2}, Ljo2;->P0(Laa7;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v1}, Lts4;->C()Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    iput-boolean v1, v0, Ljo2;->v0:Z

    .line 151
    .line 152
    sget-object v1, Lmd2;->o:Ljd2;

    .line 153
    .line 154
    iget v2, p1, Liy5;->f0:I

    .line 155
    .line 156
    invoke-virtual {v1, v2}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    xor-int/2addr v1, v13

    .line 165
    iput-boolean v1, v0, Ljo2;->z0:Z

    .line 166
    .line 167
    return-object v0

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lvy5;)Ljm1;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    iget-object v12, v0, Lys4;->a:Ljl1;

    .line 6
    .line 7
    iget-object v1, v12, Ljl1;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lw15;

    .line 10
    .line 11
    iget-object v2, v12, Ljl1;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v8, v2

    .line 14
    check-cast v8, Lux4;

    .line 15
    .line 16
    iget v2, v6, Lvy5;->Z:I

    .line 17
    .line 18
    const/4 v13, 0x1

    .line 19
    and-int/2addr v2, v13

    .line 20
    if-ne v2, v13, :cond_0

    .line 21
    .line 22
    iget v2, v6, Lvy5;->f0:I

    .line 23
    .line 24
    :goto_0
    move v14, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget v2, v6, Lvy5;->g0:I

    .line 27
    .line 28
    and-int/lit8 v3, v2, 0x3f

    .line 29
    .line 30
    shr-int/lit8 v2, v2, 0x8

    .line 31
    .line 32
    shl-int/lit8 v2, v2, 0x6

    .line 33
    .line 34
    add-int/2addr v2, v3

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-virtual {v0, v6, v14, v13}, Lys4;->c(Ld2;II)Lsm;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget v2, v6, Lvy5;->Z:I

    .line 41
    .line 42
    and-int/lit8 v4, v2, 0x20

    .line 43
    .line 44
    const/16 v5, 0x20

    .line 45
    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    const/16 v4, 0x40

    .line 50
    .line 51
    and-int/2addr v2, v4

    .line 52
    if-ne v2, v4, :cond_2

    .line 53
    .line 54
    :goto_2
    new-instance v2, Lll1;

    .line 55
    .line 56
    iget-object v4, v12, Ljl1;->X:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v4, Lhl1;

    .line 59
    .line 60
    iget-object v4, v4, Lhl1;->a:Lve4;

    .line 61
    .line 62
    new-instance v5, Lvs4;

    .line 63
    .line 64
    invoke-direct {v5, v13, v13, v0, v6}, Lvs4;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v2, v4, v5}, Lll1;-><init>(Lve4;Ldn2;)V

    .line 68
    .line 69
    .line 70
    :goto_3
    move-object v15, v2

    .line 71
    goto :goto_4

    .line 72
    :cond_2
    sget-object v2, Loy1;->f0:Lrm;

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :goto_4
    iget-object v0, v12, Ljl1;->Z:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Led1;

    .line 78
    .line 79
    invoke-static {v0}, Lel1;->g(Led1;)Lfk2;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget v2, v6, Lvy5;->h0:I

    .line 84
    .line 85
    invoke-static {v1, v2}, Lu70;->S(Lw15;I)Lv15;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v0, v2}, Lfk2;->a(Lv15;)Lfk2;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget-object v2, Lsy7;->a:Lfk2;

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Lfk2;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    sget-object v0, Ldv8;->b:Ldv8;

    .line 102
    .line 103
    :goto_5
    move-object v9, v0

    .line 104
    goto :goto_6

    .line 105
    :cond_3
    iget-object v0, v12, Ljl1;->g0:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Ldv8;

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :goto_6
    new-instance v0, Ljm1;

    .line 111
    .line 112
    iget-object v2, v12, Ljl1;->Z:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v2, Led1;

    .line 115
    .line 116
    iget v4, v6, Lvy5;->h0:I

    .line 117
    .line 118
    invoke-static {v1, v4}, Lu70;->S(Lw15;I)Lv15;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    sget-object v1, Lmd2;->q:Lkd2;

    .line 123
    .line 124
    invoke-virtual {v1, v14}, Lkd2;->e(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, Lwy5;

    .line 129
    .line 130
    invoke-static {v1}, Ldh3;->C(Lwy5;)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    iget-object v1, v12, Ljl1;->Y:Ljava/lang/Object;

    .line 135
    .line 136
    move-object v7, v1

    .line 137
    check-cast v7, Lw15;

    .line 138
    .line 139
    iget-object v1, v12, Ljl1;->i0:Ljava/lang/Object;

    .line 140
    .line 141
    move-object v10, v1

    .line 142
    check-cast v10, Lxl1;

    .line 143
    .line 144
    move-object v1, v2

    .line 145
    const/4 v2, 0x0

    .line 146
    const/4 v11, 0x0

    .line 147
    invoke-direct/range {v0 .. v11}, Ljm1;-><init>(Led1;Lq97;Lsm;Lv15;ILvy5;Lw15;Lux4;Ldv8;Lxl1;Lke7;)V

    .line 148
    .line 149
    .line 150
    iget-object v1, v6, Lvy5;->k0:Ljava/util/List;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {v12, v0, v1}, Ljl1;->b(Ljl1;Lhd1;Ljava/util/List;)Ljl1;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    iget-object v2, v1, Ljl1;->k0:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v2, Lys4;

    .line 162
    .line 163
    iget-object v1, v1, Ljl1;->j0:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v1, Lfc8;

    .line 166
    .line 167
    invoke-static {v6, v8}, Lvr3;->U(Lvy5;Lux4;)Lnz5;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    const/4 v4, 0x0

    .line 172
    if-eqz v3, :cond_5

    .line 173
    .line 174
    sget-object v5, Lmd2;->A:Ljd2;

    .line 175
    .line 176
    invoke-virtual {v5, v14}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-nez v5, :cond_4

    .line 185
    .line 186
    goto :goto_7

    .line 187
    :cond_4
    move-object v3, v4

    .line 188
    :goto_7
    if-eqz v3, :cond_5

    .line 189
    .line 190
    invoke-virtual {v1, v3}, Lfc8;->i(Lnz5;)Lt14;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    if-eqz v3, :cond_5

    .line 195
    .line 196
    invoke-static {v0, v3, v15}, Lz91;->x(Ljd0;Lt14;Lsm;)Li44;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    move-object/from16 v17, v3

    .line 201
    .line 202
    goto :goto_8

    .line 203
    :cond_5
    move-object/from16 v17, v4

    .line 204
    .line 205
    :goto_8
    iget-object v3, v12, Ljl1;->Z:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v3, Led1;

    .line 208
    .line 209
    instance-of v5, v3, Lsx4;

    .line 210
    .line 211
    if-eqz v5, :cond_6

    .line 212
    .line 213
    check-cast v3, Lsx4;

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_6
    move-object v3, v4

    .line 217
    :goto_9
    if-eqz v3, :cond_7

    .line 218
    .line 219
    invoke-virtual {v3}, Lsx4;->p0()Li44;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    goto :goto_a

    .line 224
    :cond_7
    move-object v3, v4

    .line 225
    :goto_a
    if-eqz v3, :cond_8

    .line 226
    .line 227
    sget-object v5, Lmd2;->A:Ljd2;

    .line 228
    .line 229
    invoke-virtual {v5, v14}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-nez v5, :cond_8

    .line 238
    .line 239
    move-object/from16 v18, v3

    .line 240
    .line 241
    goto :goto_b

    .line 242
    :cond_8
    move-object/from16 v18, v4

    .line 243
    .line 244
    :goto_b
    invoke-static {v6, v8}, Lvr3;->q(Lvy5;Lux4;)Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    iget-object v4, v6, Lvy5;->q0:Ljava/util/List;

    .line 249
    .line 250
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2, v3, v4, v6, v13}, Lys4;->b(Ljava/util/List;Ljava/util/List;Ld2;I)Ljava/util/ArrayList;

    .line 254
    .line 255
    .line 256
    move-result-object v19

    .line 257
    invoke-virtual {v1}, Lfc8;->b()Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v20

    .line 261
    iget-object v3, v6, Lvy5;->r0:Ljava/util/List;

    .line 262
    .line 263
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v3, v6, v13}, Lys4;->h(Ljava/util/List;Ld2;I)Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v21

    .line 270
    invoke-static {v6, v8}, Lvr3;->X(Lvy5;Lux4;)Lnz5;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-virtual {v1, v2}, Lfc8;->i(Lnz5;)Lt14;

    .line 275
    .line 276
    .line 277
    move-result-object v22

    .line 278
    sget-object v1, Lmd2;->e:Lkd2;

    .line 279
    .line 280
    invoke-virtual {v1, v14}, Lkd2;->e(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    check-cast v1, Lxy5;

    .line 285
    .line 286
    invoke-static {v1}, Llh4;->R0(Lxy5;)Lfx4;

    .line 287
    .line 288
    .line 289
    move-result-object v23

    .line 290
    sget-object v1, Lmd2;->d:Lkd2;

    .line 291
    .line 292
    invoke-virtual {v1, v14}, Lkd2;->e(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    check-cast v1, Lb06;

    .line 297
    .line 298
    invoke-static {v1}, Ldh3;->q(Lb06;)Lfl1;

    .line 299
    .line 300
    .line 301
    move-result-object v24

    .line 302
    sget-object v25, Le02;->X:Le02;

    .line 303
    .line 304
    move-object/from16 v16, v0

    .line 305
    .line 306
    invoke-virtual/range {v16 .. v25}, Lq97;->U0(Li44;Li44;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt14;Lfx4;Lfl1;Ljava/util/Map;)Lq97;

    .line 307
    .line 308
    .line 309
    sget-object v1, Lmd2;->r:Ljd2;

    .line 310
    .line 311
    invoke-virtual {v1, v14}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    iput-boolean v1, v0, Ljo2;->q0:Z

    .line 320
    .line 321
    sget-object v1, Lmd2;->s:Ljd2;

    .line 322
    .line 323
    invoke-virtual {v1, v14}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    iput-boolean v1, v0, Ljo2;->r0:Z

    .line 332
    .line 333
    sget-object v1, Lmd2;->v:Ljd2;

    .line 334
    .line 335
    invoke-virtual {v1, v14}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    iput-boolean v1, v0, Ljo2;->s0:Z

    .line 344
    .line 345
    sget-object v1, Lmd2;->t:Ljd2;

    .line 346
    .line 347
    invoke-virtual {v1, v14}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    iput-boolean v1, v0, Ljo2;->t0:Z

    .line 356
    .line 357
    sget-object v1, Lmd2;->u:Ljd2;

    .line 358
    .line 359
    invoke-virtual {v1, v14}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    iput-boolean v1, v0, Ljo2;->u0:Z

    .line 368
    .line 369
    sget-object v1, Lmd2;->w:Ljd2;

    .line 370
    .line 371
    invoke-virtual {v1, v14}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    iput-boolean v1, v0, Ljo2;->y0:Z

    .line 380
    .line 381
    sget-object v1, Lmd2;->x:Ljd2;

    .line 382
    .line 383
    invoke-virtual {v1, v14}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    iput-boolean v1, v0, Ljo2;->v0:Z

    .line 392
    .line 393
    sget-object v1, Lmd2;->y:Ljd2;

    .line 394
    .line 395
    invoke-virtual {v1, v14}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    xor-int/2addr v1, v13

    .line 404
    iput-boolean v1, v0, Ljo2;->z0:Z

    .line 405
    .line 406
    iget-object v1, v12, Ljl1;->X:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v1, Lhl1;

    .line 409
    .line 410
    iget-object v1, v1, Lhl1;->m:Lbe;

    .line 411
    .line 412
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    return-object v0
.end method

.method public final g(Lcz5;Z)Lim1;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    sget-object v20, Loy1;->f0:Lrm;

    .line 6
    .line 7
    iget-object v1, v0, Lys4;->a:Ljl1;

    .line 8
    .line 9
    iget-object v2, v1, Ljl1;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lw15;

    .line 12
    .line 13
    iget-object v3, v1, Ljl1;->f0:Ljava/lang/Object;

    .line 14
    .line 15
    move-object/from16 v17, v3

    .line 16
    .line 17
    check-cast v17, Lux4;

    .line 18
    .line 19
    iget v3, v15, Lcz5;->Z:I

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    and-int/2addr v3, v4

    .line 23
    const/16 v21, 0x6

    .line 24
    .line 25
    if-ne v3, v4, :cond_0

    .line 26
    .line 27
    iget v3, v15, Lcz5;->f0:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget v3, v15, Lcz5;->g0:I

    .line 31
    .line 32
    and-int/lit8 v5, v3, 0x3f

    .line 33
    .line 34
    shr-int/lit8 v3, v3, 0x8

    .line 35
    .line 36
    shl-int/lit8 v3, v3, 0x6

    .line 37
    .line 38
    add-int/2addr v3, v5

    .line 39
    :goto_0
    const/4 v5, 0x0

    .line 40
    if-eqz p2, :cond_3

    .line 41
    .line 42
    iget-object v7, v15, Lcz5;->w0:Ljava/util/List;

    .line 43
    .line 44
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v8, Ljava/util/ArrayList;

    .line 48
    .line 49
    const/16 v9, 0xa

    .line 50
    .line 51
    invoke-static {v7, v9}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    if-eqz v9, :cond_1

    .line 67
    .line 68
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    check-cast v9, Lcy5;

    .line 73
    .line 74
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v10, v0, Lys4;->b:Ldq;

    .line 78
    .line 79
    invoke-virtual {v10, v9, v2}, Ldq;->m(Lcy5;Lw15;)Lhm;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_2

    .line 92
    .line 93
    move-object/from16 v7, v20

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    new-instance v7, Lvm;

    .line 97
    .line 98
    invoke-direct {v7, v8, v5}, Lvm;-><init>(Ljava/lang/Object;B)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    const/4 v7, 0x0

    .line 103
    :goto_2
    new-instance v23, Lim1;

    .line 104
    .line 105
    iget-object v8, v1, Ljl1;->Z:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v8, Led1;

    .line 108
    .line 109
    if-nez v7, :cond_4

    .line 110
    .line 111
    const/4 v7, 0x2

    .line 112
    invoke-virtual {v0, v15, v3, v7}, Lys4;->c(Ld2;II)Lsm;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    :cond_4
    sget-object v9, Lmd2;->e:Lkd2;

    .line 117
    .line 118
    invoke-virtual {v9, v3}, Lkd2;->e(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    check-cast v10, Lxy5;

    .line 123
    .line 124
    invoke-static {v10}, Llh4;->R0(Lxy5;)Lfx4;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    sget-object v11, Lmd2;->d:Lkd2;

    .line 129
    .line 130
    invoke-virtual {v11, v3}, Lkd2;->e(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    check-cast v12, Lb06;

    .line 135
    .line 136
    invoke-static {v12}, Ldh3;->q(Lb06;)Lfl1;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    sget-object v13, Lmd2;->B:Ljd2;

    .line 141
    .line 142
    invoke-virtual {v13, v3}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 143
    .line 144
    .line 145
    move-result-object v13

    .line 146
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    iget v14, v15, Lcz5;->h0:I

    .line 151
    .line 152
    invoke-static {v2, v14}, Lu70;->S(Lw15;I)Lv15;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    sget-object v14, Lmd2;->q:Lkd2;

    .line 157
    .line 158
    invoke-virtual {v14, v3}, Lkd2;->e(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v14

    .line 162
    check-cast v14, Lwy5;

    .line 163
    .line 164
    invoke-static {v14}, Ldh3;->C(Lwy5;)I

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    sget-object v4, Lmd2;->F:Ljd2;

    .line 169
    .line 170
    invoke-virtual {v4, v3}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    sget-object v5, Lmd2;->E:Ljd2;

    .line 179
    .line 180
    invoke-virtual {v5, v3}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    sget-object v6, Lmd2;->H:Ljd2;

    .line 189
    .line 190
    invoke-virtual {v6, v3}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    move-object/from16 p2, v2

    .line 199
    .line 200
    sget-object v2, Lmd2;->I:Ljd2;

    .line 201
    .line 202
    invoke-virtual {v2, v3}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    move/from16 v22, v2

    .line 211
    .line 212
    sget-object v2, Lmd2;->J:Ljd2;

    .line 213
    .line 214
    invoke-virtual {v2, v3}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    move/from16 v24, v2

    .line 223
    .line 224
    iget-object v2, v1, Ljl1;->Y:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v2, Lw15;

    .line 227
    .line 228
    move-object/from16 v25, v2

    .line 229
    .line 230
    iget-object v2, v1, Ljl1;->g0:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v2, Ldv8;

    .line 233
    .line 234
    move-object/from16 v26, v2

    .line 235
    .line 236
    iget-object v2, v1, Ljl1;->i0:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v2, Lxl1;

    .line 239
    .line 240
    move/from16 v27, v3

    .line 241
    .line 242
    const/4 v3, 0x0

    .line 243
    move-object v0, v12

    .line 244
    move v12, v6

    .line 245
    move-object v6, v0

    .line 246
    move-object v0, v1

    .line 247
    move-object/from16 v19, v2

    .line 248
    .line 249
    move-object v2, v8

    .line 250
    move-object/from16 v33, v9

    .line 251
    .line 252
    move-object/from16 v34, v11

    .line 253
    .line 254
    move v9, v14

    .line 255
    move-object/from16 v1, v23

    .line 256
    .line 257
    move/from16 v14, v24

    .line 258
    .line 259
    move-object/from16 v16, v25

    .line 260
    .line 261
    move-object/from16 v18, v26

    .line 262
    .line 263
    move-object/from16 v8, p2

    .line 264
    .line 265
    move v11, v5

    .line 266
    move-object v5, v10

    .line 267
    move/from16 p2, v27

    .line 268
    .line 269
    move v10, v4

    .line 270
    move-object v4, v7

    .line 271
    move v7, v13

    .line 272
    move/from16 v13, v22

    .line 273
    .line 274
    invoke-direct/range {v1 .. v19}, Lim1;-><init>(Led1;Lfx5;Lsm;Lfx4;Lfl1;ZLv15;IZZZZZLcz5;Lw15;Lux4;Ldv8;Lxl1;)V

    .line 275
    .line 276
    .line 277
    move-object/from16 v3, v17

    .line 278
    .line 279
    iget-object v2, v15, Lcz5;->k0:Ljava/util/List;

    .line 280
    .line 281
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-static {v0, v1, v2}, Ljl1;->b(Ljl1;Lhd1;Ljava/util/List;)Ljl1;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    iget-object v4, v2, Ljl1;->j0:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v4, Lfc8;

    .line 291
    .line 292
    sget-object v5, Lmd2;->C:Ljd2;

    .line 293
    .line 294
    move/from16 v6, p2

    .line 295
    .line 296
    invoke-virtual {v5, v6}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 301
    .line 302
    .line 303
    move-result v5

    .line 304
    const/4 v7, 0x3

    .line 305
    if-eqz v5, :cond_6

    .line 306
    .line 307
    iget v8, v15, Lcz5;->Z:I

    .line 308
    .line 309
    and-int/lit8 v9, v8, 0x20

    .line 310
    .line 311
    const/16 v10, 0x20

    .line 312
    .line 313
    if-ne v9, v10, :cond_5

    .line 314
    .line 315
    goto :goto_3

    .line 316
    :cond_5
    const/16 v9, 0x40

    .line 317
    .line 318
    and-int/2addr v8, v9

    .line 319
    if-ne v8, v9, :cond_6

    .line 320
    .line 321
    :goto_3
    new-instance v8, Lll1;

    .line 322
    .line 323
    iget-object v9, v0, Ljl1;->X:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v9, Lhl1;

    .line 326
    .line 327
    iget-object v9, v9, Lhl1;->a:Lve4;

    .line 328
    .line 329
    new-instance v10, Lvs4;

    .line 330
    .line 331
    const/4 v11, 0x1

    .line 332
    move-object/from16 v14, p0

    .line 333
    .line 334
    invoke-direct {v10, v11, v7, v14, v15}, Lvs4;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    invoke-direct {v8, v9, v10}, Lll1;-><init>(Lve4;Ldn2;)V

    .line 338
    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_6
    const/4 v11, 0x1

    .line 342
    move-object/from16 v14, p0

    .line 343
    .line 344
    move-object/from16 v8, v20

    .line 345
    .line 346
    :goto_4
    invoke-static {v15, v3}, Lvr3;->Y(Lcz5;Lux4;)Lnz5;

    .line 347
    .line 348
    .line 349
    move-result-object v9

    .line 350
    invoke-virtual {v4, v9}, Lfc8;->i(Lnz5;)Lt14;

    .line 351
    .line 352
    .line 353
    move-result-object v9

    .line 354
    invoke-virtual {v4}, Lfc8;->b()Ljava/util/List;

    .line 355
    .line 356
    .line 357
    move-result-object v10

    .line 358
    iget-object v12, v0, Ljl1;->Z:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v12, Led1;

    .line 361
    .line 362
    instance-of v13, v12, Lsx4;

    .line 363
    .line 364
    if-eqz v13, :cond_7

    .line 365
    .line 366
    check-cast v12, Lsx4;

    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_7
    const/4 v12, 0x0

    .line 370
    :goto_5
    if-eqz v12, :cond_8

    .line 371
    .line 372
    invoke-virtual {v12}, Lsx4;->p0()Li44;

    .line 373
    .line 374
    .line 375
    move-result-object v12

    .line 376
    goto :goto_6

    .line 377
    :cond_8
    const/4 v12, 0x0

    .line 378
    :goto_6
    if-eqz v12, :cond_9

    .line 379
    .line 380
    sget-object v13, Lmd2;->L:Ljd2;

    .line 381
    .line 382
    invoke-virtual {v13, v6}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 383
    .line 384
    .line 385
    move-result-object v13

    .line 386
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 387
    .line 388
    .line 389
    move-result v13

    .line 390
    if-nez v13, :cond_9

    .line 391
    .line 392
    move/from16 v16, v11

    .line 393
    .line 394
    move-object v11, v12

    .line 395
    goto :goto_7

    .line 396
    :cond_9
    move/from16 v16, v11

    .line 397
    .line 398
    const/4 v11, 0x0

    .line 399
    :goto_7
    invoke-static {v15, v3}, Lvr3;->V(Lcz5;Lux4;)Lnz5;

    .line 400
    .line 401
    .line 402
    move-result-object v12

    .line 403
    if-eqz v12, :cond_b

    .line 404
    .line 405
    sget-object v13, Lmd2;->L:Ljd2;

    .line 406
    .line 407
    invoke-virtual {v13, v6}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 408
    .line 409
    .line 410
    move-result-object v13

    .line 411
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 412
    .line 413
    .line 414
    move-result v13

    .line 415
    if-nez v13, :cond_a

    .line 416
    .line 417
    goto :goto_8

    .line 418
    :cond_a
    const/4 v12, 0x0

    .line 419
    :goto_8
    if-eqz v12, :cond_b

    .line 420
    .line 421
    invoke-virtual {v4, v12}, Lfc8;->i(Lnz5;)Lt14;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    if-eqz v4, :cond_b

    .line 426
    .line 427
    invoke-static {v1, v4, v8}, Lz91;->x(Ljd0;Lt14;Lsm;)Li44;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    move-object v12, v4

    .line 432
    goto :goto_9

    .line 433
    :cond_b
    const/4 v12, 0x0

    .line 434
    :goto_9
    iget-object v4, v2, Ljl1;->k0:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v4, Lys4;

    .line 437
    .line 438
    invoke-static {v15, v3}, Lvr3;->r(Lcz5;Lux4;)Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    iget-object v8, v15, Lcz5;->q0:Ljava/util/List;

    .line 443
    .line 444
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v4, v3, v8, v15, v7}, Lys4;->b(Ljava/util/List;Ljava/util/List;Ld2;I)Ljava/util/ArrayList;

    .line 448
    .line 449
    .line 450
    move-result-object v13

    .line 451
    move-object v8, v1

    .line 452
    move/from16 v1, v16

    .line 453
    .line 454
    invoke-virtual/range {v8 .. v13}, Lgx5;->O0(Lt14;Ljava/util/List;Li44;Li44;Ljava/util/List;)V

    .line 455
    .line 456
    .line 457
    move-object/from16 v23, v8

    .line 458
    .line 459
    sget-object v3, Lmd2;->c:Ljd2;

    .line 460
    .line 461
    invoke-virtual {v3, v6}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    move-object/from16 v4, v34

    .line 470
    .line 471
    invoke-virtual {v4, v6}, Lkd2;->e(I)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v8

    .line 475
    check-cast v8, Lb06;

    .line 476
    .line 477
    move-object/from16 v9, v33

    .line 478
    .line 479
    invoke-virtual {v9, v6}, Lkd2;->e(I)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v10

    .line 483
    check-cast v10, Lxy5;

    .line 484
    .line 485
    invoke-static {v3, v8, v10}, Lmd2;->b(ZLb06;Lxy5;)I

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    sget-object v32, Lke7;->G:Lg55;

    .line 490
    .line 491
    if-eqz v5, :cond_e

    .line 492
    .line 493
    iget v5, v15, Lcz5;->Z:I

    .line 494
    .line 495
    const/16 v8, 0x100

    .line 496
    .line 497
    and-int/2addr v5, v8

    .line 498
    if-ne v5, v8, :cond_c

    .line 499
    .line 500
    iget v5, v15, Lcz5;->s0:I

    .line 501
    .line 502
    goto :goto_a

    .line 503
    :cond_c
    move v5, v3

    .line 504
    :goto_a
    sget-object v8, Lmd2;->P:Ljd2;

    .line 505
    .line 506
    invoke-virtual {v8, v5}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 507
    .line 508
    .line 509
    move-result-object v8

    .line 510
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 511
    .line 512
    .line 513
    move-result v8

    .line 514
    sget-object v10, Lmd2;->Q:Ljd2;

    .line 515
    .line 516
    invoke-virtual {v10, v5}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 517
    .line 518
    .line 519
    move-result-object v10

    .line 520
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 521
    .line 522
    .line 523
    move-result v28

    .line 524
    sget-object v10, Lmd2;->R:Ljd2;

    .line 525
    .line 526
    invoke-virtual {v10, v5}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 527
    .line 528
    .line 529
    move-result-object v10

    .line 530
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 531
    .line 532
    .line 533
    move-result v29

    .line 534
    invoke-virtual {v14, v15, v5, v7}, Lys4;->c(Ld2;II)Lsm;

    .line 535
    .line 536
    .line 537
    move-result-object v24

    .line 538
    if-eqz v8, :cond_d

    .line 539
    .line 540
    new-instance v22, Lhx5;

    .line 541
    .line 542
    invoke-virtual {v9, v5}, Lkd2;->e(I)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v7

    .line 546
    check-cast v7, Lxy5;

    .line 547
    .line 548
    invoke-static {v7}, Llh4;->R0(Lxy5;)Lfx4;

    .line 549
    .line 550
    .line 551
    move-result-object v25

    .line 552
    invoke-virtual {v4, v5}, Lkd2;->e(I)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v5

    .line 556
    check-cast v5, Lb06;

    .line 557
    .line 558
    invoke-static {v5}, Ldh3;->q(Lb06;)Lfl1;

    .line 559
    .line 560
    .line 561
    move-result-object v26

    .line 562
    xor-int/lit8 v27, v8, 0x1

    .line 563
    .line 564
    invoke-virtual/range {v23 .. v23}, Lgx5;->r()I

    .line 565
    .line 566
    .line 567
    move-result v30

    .line 568
    const/16 v31, 0x0

    .line 569
    .line 570
    invoke-direct/range {v22 .. v32}, Lhx5;-><init>(Lfx5;Lsm;Lfx4;Lfl1;ZZZILhx5;Lke7;)V

    .line 571
    .line 572
    .line 573
    move-object/from16 v8, v23

    .line 574
    .line 575
    move-object/from16 v5, v22

    .line 576
    .line 577
    goto :goto_b

    .line 578
    :cond_d
    move-object/from16 v8, v23

    .line 579
    .line 580
    move-object/from16 v5, v24

    .line 581
    .line 582
    invoke-static {v8, v5}, Lz91;->s(Lfx5;Lsm;)Lhx5;

    .line 583
    .line 584
    .line 585
    move-result-object v5

    .line 586
    :goto_b
    invoke-virtual {v8}, Lgx5;->j()Lt14;

    .line 587
    .line 588
    .line 589
    move-result-object v7

    .line 590
    invoke-virtual {v5, v7}, Lhx5;->J0(Lt14;)V

    .line 591
    .line 592
    .line 593
    goto :goto_c

    .line 594
    :cond_e
    move-object/from16 v8, v23

    .line 595
    .line 596
    const/4 v5, 0x0

    .line 597
    :goto_c
    sget-object v7, Lmd2;->D:Ljd2;

    .line 598
    .line 599
    invoke-virtual {v7, v6}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 600
    .line 601
    .line 602
    move-result-object v7

    .line 603
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 604
    .line 605
    .line 606
    move-result v7

    .line 607
    if-eqz v7, :cond_12

    .line 608
    .line 609
    iget v7, v15, Lcz5;->Z:I

    .line 610
    .line 611
    const/16 v10, 0x200

    .line 612
    .line 613
    and-int/2addr v7, v10

    .line 614
    if-ne v7, v10, :cond_f

    .line 615
    .line 616
    iget v3, v15, Lcz5;->t0:I

    .line 617
    .line 618
    :cond_f
    sget-object v7, Lmd2;->P:Ljd2;

    .line 619
    .line 620
    invoke-virtual {v7, v3}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 621
    .line 622
    .line 623
    move-result-object v7

    .line 624
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 625
    .line 626
    .line 627
    move-result v7

    .line 628
    sget-object v10, Lmd2;->Q:Ljd2;

    .line 629
    .line 630
    invoke-virtual {v10, v3}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 631
    .line 632
    .line 633
    move-result-object v10

    .line 634
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 635
    .line 636
    .line 637
    move-result v28

    .line 638
    sget-object v10, Lmd2;->R:Ljd2;

    .line 639
    .line 640
    invoke-virtual {v10, v3}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 641
    .line 642
    .line 643
    move-result-object v10

    .line 644
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 645
    .line 646
    .line 647
    move-result v29

    .line 648
    const/4 v10, 0x4

    .line 649
    invoke-virtual {v14, v15, v3, v10}, Lys4;->c(Ld2;II)Lsm;

    .line 650
    .line 651
    .line 652
    move-result-object v24

    .line 653
    if-eqz v7, :cond_11

    .line 654
    .line 655
    new-instance v22, Ltx5;

    .line 656
    .line 657
    invoke-virtual {v9, v3}, Lkd2;->e(I)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v9

    .line 661
    check-cast v9, Lxy5;

    .line 662
    .line 663
    invoke-static {v9}, Llh4;->R0(Lxy5;)Lfx4;

    .line 664
    .line 665
    .line 666
    move-result-object v25

    .line 667
    invoke-virtual {v4, v3}, Lkd2;->e(I)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v3

    .line 671
    check-cast v3, Lb06;

    .line 672
    .line 673
    invoke-static {v3}, Ldh3;->q(Lb06;)Lfl1;

    .line 674
    .line 675
    .line 676
    move-result-object v26

    .line 677
    xor-int/lit8 v27, v7, 0x1

    .line 678
    .line 679
    invoke-virtual {v8}, Lgx5;->r()I

    .line 680
    .line 681
    .line 682
    move-result v30

    .line 683
    const/16 v31, 0x0

    .line 684
    .line 685
    move-object/from16 v23, v8

    .line 686
    .line 687
    invoke-direct/range {v22 .. v32}, Ltx5;-><init>(Lfx5;Lsm;Lfx4;Lfl1;ZZZILtx5;Lke7;)V

    .line 688
    .line 689
    .line 690
    move-object/from16 v3, v22

    .line 691
    .line 692
    sget-object v4, Ld02;->X:Ld02;

    .line 693
    .line 694
    invoke-static {v2, v3, v4}, Ljl1;->b(Ljl1;Lhd1;Ljava/util/List;)Ljl1;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    iget-object v2, v2, Ljl1;->k0:Ljava/lang/Object;

    .line 699
    .line 700
    check-cast v2, Lys4;

    .line 701
    .line 702
    iget-object v4, v15, Lcz5;->r0:Lvz5;

    .line 703
    .line 704
    invoke-static {v4}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 705
    .line 706
    .line 707
    move-result-object v4

    .line 708
    invoke-virtual {v2, v4, v15, v10}, Lys4;->h(Ljava/util/List;Ld2;I)Ljava/util/List;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    invoke-static {v2}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    check-cast v2, Lot8;

    .line 717
    .line 718
    if-eqz v2, :cond_10

    .line 719
    .line 720
    iput-object v2, v3, Ltx5;->q0:Lot8;

    .line 721
    .line 722
    const/4 v2, 0x0

    .line 723
    goto :goto_d

    .line 724
    :cond_10
    invoke-static/range {v21 .. v21}, Ltx5;->B(I)V

    .line 725
    .line 726
    .line 727
    const/4 v2, 0x0

    .line 728
    throw v2

    .line 729
    :cond_11
    move-object/from16 v3, v24

    .line 730
    .line 731
    const/4 v2, 0x0

    .line 732
    invoke-static {v8, v3}, Lz91;->t(Lfx5;Lsm;)Ltx5;

    .line 733
    .line 734
    .line 735
    move-result-object v3

    .line 736
    goto :goto_d

    .line 737
    :cond_12
    const/4 v2, 0x0

    .line 738
    move-object v3, v2

    .line 739
    :goto_d
    sget-object v4, Lmd2;->G:Ljd2;

    .line 740
    .line 741
    invoke-virtual {v4, v6}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 742
    .line 743
    .line 744
    move-result-object v4

    .line 745
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 746
    .line 747
    .line 748
    move-result v4

    .line 749
    if-eqz v4, :cond_13

    .line 750
    .line 751
    new-instance v4, Lus4;

    .line 752
    .line 753
    const/4 v6, 0x0

    .line 754
    invoke-direct {v4, v14, v15, v8, v6}, Lus4;-><init>(Lys4;Lcz5;Lim1;B)V

    .line 755
    .line 756
    .line 757
    invoke-virtual {v8, v2, v4}, Lgx5;->M0(Lse4;Ldn2;)V

    .line 758
    .line 759
    .line 760
    goto :goto_e

    .line 761
    :cond_13
    const/4 v6, 0x0

    .line 762
    :goto_e
    iget-object v0, v0, Ljl1;->Z:Ljava/lang/Object;

    .line 763
    .line 764
    check-cast v0, Led1;

    .line 765
    .line 766
    instance-of v4, v0, Lsx4;

    .line 767
    .line 768
    if-eqz v4, :cond_14

    .line 769
    .line 770
    check-cast v0, Lsx4;

    .line 771
    .line 772
    goto :goto_f

    .line 773
    :cond_14
    move-object v0, v2

    .line 774
    :goto_f
    if-eqz v0, :cond_15

    .line 775
    .line 776
    invoke-virtual {v0}, Lsx4;->g0()Lus0;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    goto :goto_10

    .line 781
    :cond_15
    move-object v0, v2

    .line 782
    :goto_10
    sget-object v4, Lus0;->g0:Lus0;

    .line 783
    .line 784
    if-ne v0, v4, :cond_16

    .line 785
    .line 786
    new-instance v0, Lus4;

    .line 787
    .line 788
    invoke-direct {v0, v14, v15, v8, v1}, Lus4;-><init>(Lys4;Lcz5;Lim1;B)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v8, v2, v0}, Lgx5;->M0(Lse4;Ldn2;)V

    .line 792
    .line 793
    .line 794
    :cond_16
    new-instance v0, Ly82;

    .line 795
    .line 796
    invoke-virtual {v14, v15, v6}, Lys4;->d(Lcz5;Z)Lsm;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    invoke-direct {v0, v2}, Lcw0;-><init>(Lsm;)V

    .line 801
    .line 802
    .line 803
    new-instance v2, Ly82;

    .line 804
    .line 805
    invoke-virtual {v14, v15, v1}, Lys4;->d(Lcz5;Z)Lsm;

    .line 806
    .line 807
    .line 808
    move-result-object v1

    .line 809
    invoke-direct {v2, v1}, Lcw0;-><init>(Lsm;)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v8, v5, v3, v0, v2}, Lgx5;->L0(Lhx5;Ltx5;Ly82;Ly82;)V

    .line 813
    .line 814
    .line 815
    return-object v8
.end method

.method public final h(Ljava/util/List;Ld2;I)Ljava/util/List;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v8, v1, Lys4;->a:Ljl1;

    .line 4
    .line 5
    iget-object v0, v8, Ljl1;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v9, v0

    .line 8
    check-cast v9, Lux4;

    .line 9
    .line 10
    iget-object v0, v8, Ljl1;->j0:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v10, v0

    .line 13
    check-cast v10, Lfc8;

    .line 14
    .line 15
    iget-object v0, v8, Ljl1;->Z:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Led1;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-object v12, v0

    .line 23
    check-cast v12, Ljd0;

    .line 24
    .line 25
    invoke-interface {v12}, Led1;->p()Led1;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lys4;->a(Led1;)Lwb4;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v11, Ljava/util/ArrayList;

    .line 37
    .line 38
    const/16 v0, 0xa

    .line 39
    .line 40
    move-object/from16 v3, p1

    .line 41
    .line 42
    invoke-static {v3, v0}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-direct {v11, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v23

    .line 53
    const/16 v24, 0x0

    .line 54
    .line 55
    move/from16 v14, v24

    .line 56
    .line 57
    :goto_0
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_6

    .line 62
    .line 63
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    add-int/lit8 v25, v14, 0x1

    .line 68
    .line 69
    if-ltz v14, :cond_5

    .line 70
    .line 71
    move-object v6, v0

    .line 72
    check-cast v6, Lvz5;

    .line 73
    .line 74
    iget v0, v6, Lvz5;->Z:I

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    and-int/2addr v0, v3

    .line 78
    if-ne v0, v3, :cond_0

    .line 79
    .line 80
    iget v0, v6, Lvz5;->f0:I

    .line 81
    .line 82
    move v15, v0

    .line 83
    goto :goto_1

    .line 84
    :cond_0
    move/from16 v15, v24

    .line 85
    .line 86
    :goto_1
    if-eqz v2, :cond_1

    .line 87
    .line 88
    sget-object v0, Lmd2;->c:Ljd2;

    .line 89
    .line 90
    invoke-virtual {v0, v15}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    new-instance v0, Lu55;

    .line 101
    .line 102
    iget-object v3, v8, Ljl1;->X:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v3, Lhl1;

    .line 105
    .line 106
    iget-object v3, v3, Lhl1;->a:Lve4;

    .line 107
    .line 108
    move-object v4, v0

    .line 109
    new-instance v0, Lxs4;

    .line 110
    .line 111
    const/4 v7, 0x0

    .line 112
    move-object v13, v3

    .line 113
    move v5, v14

    .line 114
    const/16 p1, 0x0

    .line 115
    .line 116
    move-object/from16 v3, p2

    .line 117
    .line 118
    move-object v14, v4

    .line 119
    move/from16 v4, p3

    .line 120
    .line 121
    invoke-direct/range {v0 .. v7}, Lxs4;-><init>(Lys4;Lwb4;Ld2;IILvz5;B)V

    .line 122
    .line 123
    .line 124
    invoke-direct {v14, v13, v0}, Lu55;-><init>(Lve4;Ldn2;)V

    .line 125
    .line 126
    .line 127
    move-object v0, v14

    .line 128
    goto :goto_2

    .line 129
    :cond_1
    move v5, v14

    .line 130
    const/16 p1, 0x0

    .line 131
    .line 132
    sget-object v0, Loy1;->f0:Lrm;

    .line 133
    .line 134
    :goto_2
    iget-object v1, v8, Ljl1;->Y:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, Lw15;

    .line 137
    .line 138
    iget v3, v6, Lvz5;->g0:I

    .line 139
    .line 140
    invoke-static {v1, v3}, Lu70;->S(Lw15;I)Lv15;

    .line 141
    .line 142
    .line 143
    move-result-object v16

    .line 144
    invoke-static {v6, v9}, Lvr3;->h0(Lvz5;Lux4;)Lnz5;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v10, v1}, Lfc8;->i(Lnz5;)Lt14;

    .line 149
    .line 150
    .line 151
    move-result-object v17

    .line 152
    sget-object v1, Lmd2;->M:Ljd2;

    .line 153
    .line 154
    invoke-virtual {v1, v15}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 159
    .line 160
    .line 161
    move-result v18

    .line 162
    sget-object v1, Lmd2;->N:Ljd2;

    .line 163
    .line 164
    invoke-virtual {v1, v15}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 169
    .line 170
    .line 171
    move-result v19

    .line 172
    sget-object v1, Lmd2;->O:Ljd2;

    .line 173
    .line 174
    invoke-virtual {v1, v15}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result v20

    .line 182
    iget v1, v6, Lvz5;->Z:I

    .line 183
    .line 184
    and-int/lit8 v3, v1, 0x10

    .line 185
    .line 186
    const/16 v4, 0x10

    .line 187
    .line 188
    if-ne v3, v4, :cond_2

    .line 189
    .line 190
    iget-object v1, v6, Lvz5;->j0:Lnz5;

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_2
    and-int/lit8 v1, v1, 0x20

    .line 194
    .line 195
    const/16 v3, 0x20

    .line 196
    .line 197
    if-ne v1, v3, :cond_3

    .line 198
    .line 199
    iget v1, v6, Lvz5;->k0:I

    .line 200
    .line 201
    invoke-virtual {v9, v1}, Lux4;->a(I)Lnz5;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    goto :goto_3

    .line 206
    :cond_3
    move-object/from16 v1, p1

    .line 207
    .line 208
    :goto_3
    if-eqz v1, :cond_4

    .line 209
    .line 210
    invoke-virtual {v10, v1}, Lfc8;->i(Lnz5;)Lt14;

    .line 211
    .line 212
    .line 213
    move-result-object v13

    .line 214
    move-object/from16 v21, v13

    .line 215
    .line 216
    :goto_4
    move-object v1, v11

    .line 217
    goto :goto_5

    .line 218
    :cond_4
    move-object/from16 v21, p1

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :goto_5
    new-instance v11, Lot8;

    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    sget-object v22, Lke7;->G:Lg55;

    .line 225
    .line 226
    move-object v15, v0

    .line 227
    move v14, v5

    .line 228
    invoke-direct/range {v11 .. v22}, Lot8;-><init>(Ljd0;Lot8;ILsm;Lv15;Lt14;ZZZLt14;Lke7;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-object v11, v1

    .line 235
    move/from16 v14, v25

    .line 236
    .line 237
    move-object/from16 v1, p0

    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :cond_5
    const/16 p1, 0x0

    .line 242
    .line 243
    invoke-static {}, Li21;->X()V

    .line 244
    .line 245
    .line 246
    throw p1

    .line 247
    :cond_6
    move-object v1, v11

    .line 248
    invoke-static {v1}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    return-object v0
.end method
