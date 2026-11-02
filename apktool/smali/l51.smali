.class public abstract Ll51;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lh51;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    sget-object v0, Lbg;->a:Lox1;

    .line 2
    .line 3
    new-instance v1, Lh51;

    .line 4
    .line 5
    sget-wide v2, Ldw0;->c:J

    .line 6
    .line 7
    sget-wide v4, Ldw0;->b:J

    .line 8
    .line 9
    const v0, 0x3ec28f5c    # 0.38f

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v4, v5}, Ldw0;->b(FJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide v8

    .line 16
    invoke-static {v0, v4, v5}, Ldw0;->b(FJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v10

    .line 20
    move-wide v6, v4

    .line 21
    invoke-direct/range {v1 .. v11}, Lh51;-><init>(JJJJJ)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Ll51;->a:Lh51;

    .line 25
    .line 26
    return-void
.end method

.method public static final a(Lh51;Lkx4;Lzy0;Llp2;I)V
    .locals 7

    .line 1
    const v0, -0x1f76910f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p4, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p3, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p4

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p4

    .line 23
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p3, p1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 40
    .line 41
    if-nez v1, :cond_5

    .line 42
    .line 43
    invoke-virtual {p3, p2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    const/16 v1, 0x100

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    const/16 v1, 0x80

    .line 53
    .line 54
    :goto_3
    or-int/2addr v0, v1

    .line 55
    :cond_5
    and-int/lit16 v1, v0, 0x93

    .line 56
    .line 57
    const/16 v2, 0x92

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v4, 0x1

    .line 61
    if-eq v1, v2, :cond_6

    .line 62
    .line 63
    move v1, v4

    .line 64
    goto :goto_4

    .line 65
    :cond_6
    move v1, v3

    .line 66
    :goto_4
    and-int/lit8 v2, v0, 0x1

    .line 67
    .line 68
    invoke-virtual {p3, v2, v1}, Llp2;->N(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_8

    .line 73
    .line 74
    sget-object v1, Lj51;->a:Lo50;

    .line 75
    .line 76
    const/high16 v1, 0x40800000    # 4.0f

    .line 77
    .line 78
    invoke-static {v1}, Lkm6;->a(F)Ljm6;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const/high16 v2, 0x40400000    # 3.0f

    .line 83
    .line 84
    invoke-static {p1, v2, v1}, Lmb6;->a0(Lkx4;FLjm6;)Lkx4;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-wide v5, p0, Lh51;->a:J

    .line 89
    .line 90
    sget-object v2, Lu70;->e:Lx03;

    .line 91
    .line 92
    invoke-static {v1, v5, v6, v2}, Lu15;->f(Lkx4;JLx67;)Lkx4;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v1}, Lhi5;->C0(Lkx4;)Lkx4;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const/4 v2, 0x0

    .line 101
    sget v5, Lj51;->d:F

    .line 102
    .line 103
    invoke-static {v1, v2, v5, v4}, Los4;->z(Lkx4;FFI)Lkx4;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {p3}, Ldh3;->G(Llp2;)Lay6;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-static {v1, v2}, Ldh3;->V(Lkx4;Lay6;)Lkx4;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    shl-int/lit8 v0, v0, 0x3

    .line 116
    .line 117
    and-int/lit16 v0, v0, 0x1c00

    .line 118
    .line 119
    sget-object v2, Lht;->c:Ldt;

    .line 120
    .line 121
    sget-object v5, Lpz2;->q0:Ln50;

    .line 122
    .line 123
    invoke-static {v2, v5, p3, v3}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget-wide v5, p3, Llp2;->T:J

    .line 128
    .line 129
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    invoke-virtual {p3}, Llp2;->l()Lkl5;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-static {p3, v1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    sget-object v6, Luz0;->j:Lpz2;

    .line 142
    .line 143
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p3}, Llp2;->Z()V

    .line 147
    .line 148
    .line 149
    iget-boolean v6, p3, Llp2;->S:Z

    .line 150
    .line 151
    if-eqz v6, :cond_7

    .line 152
    .line 153
    invoke-virtual {p3}, Llp2;->k()V

    .line 154
    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_7
    invoke-virtual {p3}, Llp2;->j0()V

    .line 158
    .line 159
    .line 160
    :goto_5
    sget-object v6, Lpz2;->B0:Ldx0;

    .line 161
    .line 162
    invoke-static {v6, p3, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    sget-object v2, Lpz2;->A0:Ldx0;

    .line 166
    .line 167
    invoke-static {v2, p3, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    sget-object v3, Lpz2;->C0:Ldx0;

    .line 175
    .line 176
    invoke-static {v3, p3, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-static {p3}, Lpn7;->l(Llp2;)V

    .line 180
    .line 181
    .line 182
    sget-object v2, Lpz2;->z0:Ldx0;

    .line 183
    .line 184
    invoke-static {v2, p3, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    shr-int/lit8 v0, v0, 0x6

    .line 188
    .line 189
    and-int/lit8 v0, v0, 0x70

    .line 190
    .line 191
    or-int/lit8 v0, v0, 0x6

    .line 192
    .line 193
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    sget-object v1, Luw0;->a:Luw0;

    .line 198
    .line 199
    invoke-virtual {p2, v1, p3, v0}, Lzy0;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p3, v4}, Llp2;->p(Z)V

    .line 203
    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_8
    invoke-virtual {p3}, Llp2;->Q()V

    .line 207
    .line 208
    .line 209
    :goto_6
    invoke-virtual {p3}, Llp2;->r()Lj86;

    .line 210
    .line 211
    .line 212
    move-result-object p3

    .line 213
    if-eqz p3, :cond_9

    .line 214
    .line 215
    new-instance v0, Lg8;

    .line 216
    .line 217
    const/4 v5, 0x5

    .line 218
    move-object v1, p0

    .line 219
    move-object v2, p1

    .line 220
    move-object v3, p2

    .line 221
    move v4, p4

    .line 222
    invoke-direct/range {v0 .. v5}, Lg8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 223
    .line 224
    .line 225
    iput-object v0, p3, Lj86;->d:Lrn2;

    .line 226
    .line 227
    :cond_9
    return-void
.end method

.method public static final b(Lkx4;Lh51;Lgn2;Llp2;II)V
    .locals 8

    .line 1
    const v0, -0x2548d191

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p5, 0x1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    or-int/lit8 v1, p4, 0x6

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p3, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v1, 0x2

    .line 23
    :goto_0
    or-int/2addr v1, p4

    .line 24
    :goto_1
    and-int/lit8 v2, p5, 0x2

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    or-int/lit8 v1, v1, 0x30

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_2
    invoke-virtual {p3, p1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    const/16 v3, 0x20

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    const/16 v3, 0x10

    .line 41
    .line 42
    :goto_2
    or-int/2addr v1, v3

    .line 43
    :goto_3
    invoke-virtual {p3, p2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_4

    .line 48
    .line 49
    const/16 v3, 0x100

    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_4
    const/16 v3, 0x80

    .line 53
    .line 54
    :goto_4
    or-int/2addr v1, v3

    .line 55
    and-int/lit16 v3, v1, 0x93

    .line 56
    .line 57
    const/16 v4, 0x92

    .line 58
    .line 59
    const/4 v5, 0x1

    .line 60
    if-eq v3, v4, :cond_5

    .line 61
    .line 62
    move v3, v5

    .line 63
    goto :goto_5

    .line 64
    :cond_5
    const/4 v3, 0x0

    .line 65
    :goto_5
    and-int/lit8 v4, v1, 0x1

    .line 66
    .line 67
    invoke-virtual {p3, v4, v3}, Llp2;->N(IZ)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_8

    .line 72
    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    sget-object p0, Lhx4;->X:Lhx4;

    .line 76
    .line 77
    :cond_6
    if-eqz v2, :cond_7

    .line 78
    .line 79
    sget-object p1, Ll51;->a:Lh51;

    .line 80
    .line 81
    :cond_7
    new-instance v0, Lo90;

    .line 82
    .line 83
    invoke-direct {v0, p2, p1, v5}, Lo90;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    const v2, -0xeebf658

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v0, p3}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    shr-int/lit8 v2, v1, 0x3

    .line 94
    .line 95
    and-int/lit8 v2, v2, 0xe

    .line 96
    .line 97
    or-int/lit16 v2, v2, 0x180

    .line 98
    .line 99
    shl-int/lit8 v1, v1, 0x3

    .line 100
    .line 101
    and-int/lit8 v1, v1, 0x70

    .line 102
    .line 103
    or-int/2addr v1, v2

    .line 104
    invoke-static {p1, p0, v0, p3, v1}, Ll51;->a(Lh51;Lkx4;Lzy0;Llp2;I)V

    .line 105
    .line 106
    .line 107
    :goto_6
    move-object v3, p0

    .line 108
    move-object v4, p1

    .line 109
    goto :goto_7

    .line 110
    :cond_8
    invoke-virtual {p3}, Llp2;->Q()V

    .line 111
    .line 112
    .line 113
    goto :goto_6

    .line 114
    :goto_7
    invoke-virtual {p3}, Llp2;->r()Lj86;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-eqz p0, :cond_9

    .line 119
    .line 120
    new-instance v2, Lk51;

    .line 121
    .line 122
    move-object v5, p2

    .line 123
    move v6, p4

    .line 124
    move v7, p5

    .line 125
    invoke-direct/range {v2 .. v7}, Lk51;-><init>(Lkx4;Lh51;Lgn2;II)V

    .line 126
    .line 127
    .line 128
    iput-object v2, p0, Lj86;->d:Lrn2;

    .line 129
    .line 130
    :cond_9
    return-void
.end method

.method public static final c(Ljava/lang/String;ZLh51;Lkx4;Lsn2;Ldn2;Llp2;I)V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v12, p1

    .line 4
    .line 5
    move-object/from16 v13, p2

    .line 6
    .line 7
    move-object/from16 v14, p3

    .line 8
    .line 9
    move-object/from16 v15, p4

    .line 10
    .line 11
    move-object/from16 v1, p5

    .line 12
    .line 13
    move-object/from16 v9, p6

    .line 14
    .line 15
    move/from16 v2, p7

    .line 16
    .line 17
    const v3, -0x774762b3

    .line 18
    .line 19
    .line 20
    invoke-virtual {v9, v3}, Llp2;->X(I)Llp2;

    .line 21
    .line 22
    .line 23
    and-int/lit8 v3, v2, 0x6

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v9, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v3, 0x2

    .line 36
    :goto_0
    or-int/2addr v3, v2

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v3, v2

    .line 39
    :goto_1
    and-int/lit8 v5, v2, 0x30

    .line 40
    .line 41
    const/16 v6, 0x20

    .line 42
    .line 43
    if-nez v5, :cond_3

    .line 44
    .line 45
    invoke-virtual {v9, v12}, Llp2;->g(Z)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_2

    .line 50
    .line 51
    move v5, v6

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v5, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v3, v5

    .line 56
    :cond_3
    and-int/lit16 v5, v2, 0x180

    .line 57
    .line 58
    if-nez v5, :cond_5

    .line 59
    .line 60
    invoke-virtual {v9, v13}, Llp2;->f(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_4

    .line 65
    .line 66
    const/16 v5, 0x100

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/16 v5, 0x80

    .line 70
    .line 71
    :goto_3
    or-int/2addr v3, v5

    .line 72
    :cond_5
    and-int/lit16 v5, v2, 0xc00

    .line 73
    .line 74
    if-nez v5, :cond_7

    .line 75
    .line 76
    invoke-virtual {v9, v14}, Llp2;->f(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_6

    .line 81
    .line 82
    const/16 v5, 0x800

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    const/16 v5, 0x400

    .line 86
    .line 87
    :goto_4
    or-int/2addr v3, v5

    .line 88
    :cond_7
    and-int/lit16 v5, v2, 0x6000

    .line 89
    .line 90
    if-nez v5, :cond_9

    .line 91
    .line 92
    invoke-virtual {v9, v15}, Llp2;->h(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-eqz v5, :cond_8

    .line 97
    .line 98
    const/16 v5, 0x4000

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_8
    const/16 v5, 0x2000

    .line 102
    .line 103
    :goto_5
    or-int/2addr v3, v5

    .line 104
    :cond_9
    const/high16 v5, 0x30000

    .line 105
    .line 106
    and-int/2addr v5, v2

    .line 107
    const/high16 v7, 0x20000

    .line 108
    .line 109
    if-nez v5, :cond_b

    .line 110
    .line 111
    invoke-virtual {v9, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_a

    .line 116
    .line 117
    move v5, v7

    .line 118
    goto :goto_6

    .line 119
    :cond_a
    const/high16 v5, 0x10000

    .line 120
    .line 121
    :goto_6
    or-int/2addr v3, v5

    .line 122
    :cond_b
    const v5, 0x12493

    .line 123
    .line 124
    .line 125
    and-int/2addr v5, v3

    .line 126
    const v8, 0x12492

    .line 127
    .line 128
    .line 129
    const/4 v11, 0x1

    .line 130
    if-eq v5, v8, :cond_c

    .line 131
    .line 132
    move v5, v11

    .line 133
    goto :goto_7

    .line 134
    :cond_c
    const/4 v5, 0x0

    .line 135
    :goto_7
    and-int/lit8 v8, v3, 0x1

    .line 136
    .line 137
    invoke-virtual {v9, v8, v5}, Llp2;->N(IZ)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_16

    .line 142
    .line 143
    sget-object v5, Lj51;->a:Lo50;

    .line 144
    .line 145
    sget v8, Lj51;->c:F

    .line 146
    .line 147
    new-instance v10, Lft;

    .line 148
    .line 149
    new-instance v4, Lbt;

    .line 150
    .line 151
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-direct {v10, v8, v4}, Lft;-><init>(FLbt;)V

    .line 155
    .line 156
    .line 157
    and-int/lit8 v4, v3, 0x70

    .line 158
    .line 159
    if-ne v4, v6, :cond_d

    .line 160
    .line 161
    move v4, v11

    .line 162
    goto :goto_8

    .line 163
    :cond_d
    const/4 v4, 0x0

    .line 164
    :goto_8
    const/high16 v6, 0x70000

    .line 165
    .line 166
    and-int/2addr v6, v3

    .line 167
    if-ne v6, v7, :cond_e

    .line 168
    .line 169
    move v6, v11

    .line 170
    goto :goto_9

    .line 171
    :cond_e
    const/4 v6, 0x0

    .line 172
    :goto_9
    or-int/2addr v4, v6

    .line 173
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    if-nez v4, :cond_f

    .line 178
    .line 179
    sget-object v4, Lzz0;->a:Lbe;

    .line 180
    .line 181
    if-ne v6, v4, :cond_10

    .line 182
    .line 183
    :cond_f
    new-instance v6, Lq30;

    .line 184
    .line 185
    invoke-direct {v6, v12, v1, v11}, Lq30;-><init>(ZLjava/lang/Object;B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v9, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_10
    check-cast v6, Ldn2;

    .line 192
    .line 193
    invoke-static {v14, v12, v0, v6}, Lx97;->k(Lkx4;ZLjava/lang/String;Ldn2;)Lkx4;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    sget-object v6, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 198
    .line 199
    invoke-interface {v4, v6}, Lkx4;->y(Lkx4;)Lkx4;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    const/high16 v6, 0x42e00000    # 112.0f

    .line 204
    .line 205
    const/high16 v7, 0x438c0000    # 280.0f

    .line 206
    .line 207
    const/high16 v11, 0x42400000    # 48.0f

    .line 208
    .line 209
    invoke-static {v4, v6, v11, v7, v11}, Landroidx/compose/foundation/layout/b;->i(Lkx4;FFFF)Lkx4;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    const/4 v6, 0x0

    .line 214
    const/4 v7, 0x2

    .line 215
    invoke-static {v4, v8, v6, v7}, Los4;->z(Lkx4;FFI)Lkx4;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    const/16 v6, 0x36

    .line 220
    .line 221
    invoke-static {v10, v5, v9, v6}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    iget-wide v6, v9, Llp2;->T:J

    .line 226
    .line 227
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    invoke-virtual {v9}, Llp2;->l()Lkl5;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    invoke-static {v9, v4}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    sget-object v8, Luz0;->j:Lpz2;

    .line 240
    .line 241
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v9}, Llp2;->Z()V

    .line 245
    .line 246
    .line 247
    iget-boolean v8, v9, Llp2;->S:Z

    .line 248
    .line 249
    if-eqz v8, :cond_11

    .line 250
    .line 251
    invoke-virtual {v9}, Llp2;->k()V

    .line 252
    .line 253
    .line 254
    goto :goto_a

    .line 255
    :cond_11
    invoke-virtual {v9}, Llp2;->j0()V

    .line 256
    .line 257
    .line 258
    :goto_a
    sget-object v8, Lpz2;->B0:Ldx0;

    .line 259
    .line 260
    invoke-static {v8, v9, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    sget-object v5, Lpz2;->A0:Ldx0;

    .line 264
    .line 265
    invoke-static {v5, v9, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    sget-object v7, Lpz2;->C0:Ldx0;

    .line 273
    .line 274
    invoke-static {v7, v9, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v9}, Lpn7;->l(Llp2;)V

    .line 278
    .line 279
    .line 280
    sget-object v6, Lpz2;->z0:Ldx0;

    .line 281
    .line 282
    invoke-static {v6, v9, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    if-nez v15, :cond_12

    .line 286
    .line 287
    const v4, -0x5f3ebcd6

    .line 288
    .line 289
    .line 290
    invoke-virtual {v9, v4}, Llp2;->W(I)V

    .line 291
    .line 292
    .line 293
    const/4 v4, 0x0

    .line 294
    invoke-virtual {v9, v4}, Llp2;->p(Z)V

    .line 295
    .line 296
    .line 297
    goto :goto_d

    .line 298
    :cond_12
    const v4, -0x5f3ebcd5

    .line 299
    .line 300
    .line 301
    invoke-virtual {v9, v4}, Llp2;->W(I)V

    .line 302
    .line 303
    .line 304
    sget v18, Lj51;->e:F

    .line 305
    .line 306
    const/16 v19, 0x0

    .line 307
    .line 308
    const/16 v22, 0x2

    .line 309
    .line 310
    sget-object v17, Lhx4;->X:Lhx4;

    .line 311
    .line 312
    move/from16 v20, v18

    .line 313
    .line 314
    move/from16 v21, v18

    .line 315
    .line 316
    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/b;->f(Lkx4;FFFFI)Lkx4;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    sget-object v10, Lpz2;->Z:Lp50;

    .line 321
    .line 322
    const/4 v11, 0x0

    .line 323
    invoke-static {v10, v11}, Lg80;->c(Lp50;Z)Lxr4;

    .line 324
    .line 325
    .line 326
    move-result-object v10

    .line 327
    iget-wide v0, v9, Llp2;->T:J

    .line 328
    .line 329
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    invoke-virtual {v9}, Llp2;->l()Lkl5;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-static {v9, v4}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    invoke-virtual {v9}, Llp2;->Z()V

    .line 342
    .line 343
    .line 344
    iget-boolean v11, v9, Llp2;->S:Z

    .line 345
    .line 346
    if-eqz v11, :cond_13

    .line 347
    .line 348
    invoke-virtual {v9}, Llp2;->k()V

    .line 349
    .line 350
    .line 351
    goto :goto_b

    .line 352
    :cond_13
    invoke-virtual {v9}, Llp2;->j0()V

    .line 353
    .line 354
    .line 355
    :goto_b
    invoke-static {v8, v9, v10}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    invoke-static {v5, v9, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    invoke-static {v0, v9, v7, v9}, Loi0;->u(ILlp2;Ldx0;Llp2;)V

    .line 362
    .line 363
    .line 364
    invoke-static {v6, v9, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    if-eqz v12, :cond_14

    .line 368
    .line 369
    iget-wide v0, v13, Lh51;->c:J

    .line 370
    .line 371
    goto :goto_c

    .line 372
    :cond_14
    iget-wide v0, v13, Lh51;->e:J

    .line 373
    .line 374
    :goto_c
    new-instance v4, Ldw0;

    .line 375
    .line 376
    invoke-direct {v4, v0, v1}, Ldw0;-><init>(J)V

    .line 377
    .line 378
    .line 379
    const/4 v11, 0x0

    .line 380
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-interface {v15, v4, v9, v0}, Lsn2;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    const/4 v0, 0x1

    .line 388
    invoke-virtual {v9, v0}, Llp2;->p(Z)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v9, v11}, Llp2;->p(Z)V

    .line 392
    .line 393
    .line 394
    :goto_d
    if-eqz v12, :cond_15

    .line 395
    .line 396
    iget-wide v0, v13, Lh51;->b:J

    .line 397
    .line 398
    :goto_e
    move-wide/from16 v18, v0

    .line 399
    .line 400
    goto :goto_f

    .line 401
    :cond_15
    iget-wide v0, v13, Lh51;->d:J

    .line 402
    .line 403
    goto :goto_e

    .line 404
    :goto_f
    sget-byte v26, Lj51;->b:B

    .line 405
    .line 406
    sget-wide v20, Lj51;->h:J

    .line 407
    .line 408
    sget-object v22, Lj51;->i:Ldj2;

    .line 409
    .line 410
    sget-wide v28, Lj51;->j:J

    .line 411
    .line 412
    sget-wide v24, Lj51;->k:J

    .line 413
    .line 414
    new-instance v17, Lo88;

    .line 415
    .line 416
    const/16 v27, 0x0

    .line 417
    .line 418
    const v30, 0xfd7f78

    .line 419
    .line 420
    .line 421
    const/16 v23, 0x0

    .line 422
    .line 423
    invoke-direct/range {v17 .. v30}, Lo88;-><init>(JJLdj2;Lbj2;JIIJI)V

    .line 424
    .line 425
    .line 426
    new-instance v1, Ld44;

    .line 427
    .line 428
    const/high16 v0, 0x3f800000    # 1.0f

    .line 429
    .line 430
    const/4 v4, 0x1

    .line 431
    invoke-direct {v1, v0, v4}, Ld44;-><init>(FZ)V

    .line 432
    .line 433
    .line 434
    and-int/lit8 v0, v3, 0xe

    .line 435
    .line 436
    const/high16 v3, 0x180000

    .line 437
    .line 438
    or-int v10, v0, v3

    .line 439
    .line 440
    const/16 v11, 0x3b8

    .line 441
    .line 442
    const/4 v3, 0x0

    .line 443
    move/from16 v16, v4

    .line 444
    .line 445
    const/4 v4, 0x0

    .line 446
    const/4 v5, 0x0

    .line 447
    const/4 v6, 0x1

    .line 448
    const/4 v7, 0x0

    .line 449
    const/4 v8, 0x0

    .line 450
    move-object/from16 v0, p0

    .line 451
    .line 452
    move/from16 v12, v16

    .line 453
    .line 454
    move-object/from16 v2, v17

    .line 455
    .line 456
    invoke-static/range {v0 .. v11}, Lwl7;->b(Ljava/lang/String;Lkx4;Lo88;Lgn2;IZIILmx;Llp2;II)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v9, v12}, Llp2;->p(Z)V

    .line 460
    .line 461
    .line 462
    goto :goto_10

    .line 463
    :cond_16
    invoke-virtual {v9}, Llp2;->Q()V

    .line 464
    .line 465
    .line 466
    :goto_10
    invoke-virtual {v9}, Llp2;->r()Lj86;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    if-eqz v8, :cond_17

    .line 471
    .line 472
    new-instance v0, Lj40;

    .line 473
    .line 474
    move-object/from16 v1, p0

    .line 475
    .line 476
    move/from16 v2, p1

    .line 477
    .line 478
    move-object/from16 v6, p5

    .line 479
    .line 480
    move/from16 v7, p7

    .line 481
    .line 482
    move-object v3, v13

    .line 483
    move-object v4, v14

    .line 484
    move-object v5, v15

    .line 485
    invoke-direct/range {v0 .. v7}, Lj40;-><init>(Ljava/lang/String;ZLh51;Lkx4;Lsn2;Ldn2;I)V

    .line 486
    .line 487
    .line 488
    iput-object v0, v8, Lj86;->d:Lrn2;

    .line 489
    .line 490
    :cond_17
    return-void
.end method
