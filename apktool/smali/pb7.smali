.class public final Lpb7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lpb7;

.field public static final b:F

.field public static final c:F

.field public static final d:Llf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lpb7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpb7;->a:Lpb7;

    .line 7
    .line 8
    sget v0, Lu15;->v:F

    .line 9
    .line 10
    sput v0, Lpb7;->b:F

    .line 11
    .line 12
    sput v0, Lpb7;->c:F

    .line 13
    .line 14
    invoke-static {}, Lnf;->a()Llf;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lpb7;->d:Llf;

    .line 19
    .line 20
    return-void
.end method

.method public static d(Lsv1;Lsd5;JJJFF)V
    .locals 22

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    invoke-static/range {p8 .. p8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    int-to-long v2, v2

    .line 8
    invoke-static/range {p8 .. p8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    int-to-long v4, v4

    .line 13
    const/16 v6, 0x20

    .line 14
    .line 15
    shl-long/2addr v2, v6

    .line 16
    const-wide v7, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr v4, v7

    .line 22
    or-long v14, v2, v4

    .line 23
    .line 24
    invoke-static/range {p9 .. p9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    int-to-long v2, v2

    .line 29
    invoke-static/range {p9 .. p9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    int-to-long v4, v4

    .line 34
    shl-long/2addr v2, v6

    .line 35
    and-long/2addr v4, v7

    .line 36
    or-long v16, v2, v4

    .line 37
    .line 38
    sget-object v2, Lsd5;->X:Lsd5;

    .line 39
    .line 40
    move-object/from16 v3, p1

    .line 41
    .line 42
    if-ne v3, v2, :cond_0

    .line 43
    .line 44
    shr-long v2, p4, v6

    .line 45
    .line 46
    long-to-int v2, v2

    .line 47
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    and-long v3, p4, v7

    .line 52
    .line 53
    long-to-int v3, v3

    .line 54
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    int-to-long v4, v2

    .line 63
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    int-to-long v2, v2

    .line 68
    shl-long/2addr v4, v6

    .line 69
    and-long/2addr v2, v7

    .line 70
    or-long/2addr v2, v4

    .line 71
    invoke-static {v0, v1, v2, v3}, Lu70;->n(JJ)Ls86;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    new-instance v9, Lem6;

    .line 76
    .line 77
    iget v10, v0, Ls86;->a:F

    .line 78
    .line 79
    iget v11, v0, Ls86;->b:F

    .line 80
    .line 81
    iget v12, v0, Ls86;->c:F

    .line 82
    .line 83
    iget v13, v0, Ls86;->d:F

    .line 84
    .line 85
    move-wide/from16 v18, v16

    .line 86
    .line 87
    move-wide/from16 v16, v14

    .line 88
    .line 89
    move-wide/from16 v20, v18

    .line 90
    .line 91
    invoke-direct/range {v9 .. v21}, Lem6;-><init>(FFFFJJJJ)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    move-wide/from16 v18, v16

    .line 96
    .line 97
    shr-long v2, p4, v6

    .line 98
    .line 99
    long-to-int v2, v2

    .line 100
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    and-long v3, p4, v7

    .line 105
    .line 106
    long-to-int v3, v3

    .line 107
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    int-to-long v4, v2

    .line 116
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    int-to-long v2, v2

    .line 121
    shl-long/2addr v4, v6

    .line 122
    and-long/2addr v2, v7

    .line 123
    or-long/2addr v2, v4

    .line 124
    invoke-static {v0, v1, v2, v3}, Lu70;->n(JJ)Ls86;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    new-instance v9, Lem6;

    .line 129
    .line 130
    iget v10, v0, Ls86;->a:F

    .line 131
    .line 132
    iget v11, v0, Ls86;->b:F

    .line 133
    .line 134
    iget v12, v0, Ls86;->c:F

    .line 135
    .line 136
    iget v13, v0, Ls86;->d:F

    .line 137
    .line 138
    move-wide/from16 v20, v14

    .line 139
    .line 140
    invoke-direct/range {v9 .. v21}, Lem6;-><init>(FFFFJJJJ)V

    .line 141
    .line 142
    .line 143
    :goto_0
    sget-object v0, Lpb7;->d:Llf;

    .line 144
    .line 145
    invoke-static {v0, v9}, Llf;->c(Llf;Lem6;)V

    .line 146
    .line 147
    .line 148
    move-object/from16 v1, p0

    .line 149
    .line 150
    move-wide/from16 v2, p6

    .line 151
    .line 152
    invoke-interface {v1, v0, v2, v3}, Lsv1;->C0(Llf;J)V

    .line 153
    .line 154
    .line 155
    iget-object v0, v0, Llf;->a:Landroid/graphics/Path;

    .line 156
    .line 157
    invoke-virtual {v0}, Landroid/graphics/Path;->rewind()V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public static e(Liw0;)Ljb7;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Liw0;->a0:Ljb7;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v2, Ljb7;

    .line 8
    .line 9
    sget-object v1, Lu15;->p:Ljw0;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkw0;->b(Liw0;Ljw0;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    sget-object v1, Lu15;->i:Ljw0;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkw0;->b(Liw0;Ljw0;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    sget-object v7, Lu15;->t:Ljw0;

    .line 22
    .line 23
    invoke-static {v0, v7}, Lkw0;->b(Liw0;Ljw0;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v8

    .line 27
    invoke-static {v0, v7}, Lkw0;->b(Liw0;Ljw0;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v10

    .line 31
    invoke-static {v0, v1}, Lkw0;->b(Liw0;Ljw0;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v12

    .line 35
    sget-object v1, Lu15;->l:Ljw0;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkw0;->b(Liw0;Ljw0;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v14

    .line 41
    sget v1, Lu15;->m:F

    .line 42
    .line 43
    invoke-static {v1, v14, v15}, Ldw0;->b(FJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide v14

    .line 47
    move-object v7, v2

    .line 48
    iget-wide v1, v0, Liw0;->p:J

    .line 49
    .line 50
    invoke-static {v14, v15, v1, v2}, Lz51;->s(JJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    sget-object v14, Lu15;->j:Ljw0;

    .line 55
    .line 56
    move-wide v15, v1

    .line 57
    invoke-static {v0, v14}, Lkw0;->b(Liw0;Ljw0;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v1

    .line 61
    move-wide/from16 v17, v3

    .line 62
    .line 63
    sget v3, Lu15;->k:F

    .line 64
    .line 65
    invoke-static {v3, v1, v2}, Ldw0;->b(FJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    sget-object v4, Lu15;->n:Ljw0;

    .line 70
    .line 71
    move-wide/from16 v19, v1

    .line 72
    .line 73
    invoke-static {v0, v4}, Lkw0;->b(Liw0;Ljw0;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    move-wide/from16 v21, v5

    .line 78
    .line 79
    sget v5, Lu15;->o:F

    .line 80
    .line 81
    invoke-static {v5, v1, v2}, Ldw0;->b(FJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide v1

    .line 85
    move-wide/from16 v23, v1

    .line 86
    .line 87
    invoke-static {v0, v4}, Lkw0;->b(Liw0;Ljw0;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v1

    .line 91
    invoke-static {v5, v1, v2}, Ldw0;->b(FJ)J

    .line 92
    .line 93
    .line 94
    move-result-wide v1

    .line 95
    invoke-static {v0, v14}, Lkw0;->b(Liw0;Ljw0;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v4

    .line 99
    invoke-static {v3, v4, v5}, Ldw0;->b(FJ)J

    .line 100
    .line 101
    .line 102
    move-result-wide v3

    .line 103
    move-wide v5, v1

    .line 104
    move-object v2, v7

    .line 105
    move-wide v7, v8

    .line 106
    move-wide v9, v10

    .line 107
    move-wide v11, v12

    .line 108
    move-wide v13, v15

    .line 109
    move-wide/from16 v15, v19

    .line 110
    .line 111
    move-wide/from16 v19, v5

    .line 112
    .line 113
    move-wide/from16 v5, v21

    .line 114
    .line 115
    move-wide/from16 v21, v3

    .line 116
    .line 117
    move-wide/from16 v3, v17

    .line 118
    .line 119
    move-wide/from16 v17, v23

    .line 120
    .line 121
    invoke-direct/range {v2 .. v22}, Ljb7;-><init>(JJJJJJJJJJ)V

    .line 122
    .line 123
    .line 124
    iput-object v2, v0, Liw0;->a0:Ljb7;

    .line 125
    .line 126
    return-object v2

    .line 127
    :cond_0
    return-object v1
.end method


# virtual methods
.method public final a(Lxz4;Lkx4;Ljb7;JLlp2;I)V
    .locals 16

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v0, p6

    .line 6
    .line 7
    const v1, -0x114d4821

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Llp2;->X(I)Llp2;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v3, 0x4

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    move v1, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x2

    .line 23
    :goto_0
    or-int v1, p7, v1

    .line 24
    .line 25
    or-int/lit8 v1, v1, 0x30

    .line 26
    .line 27
    invoke-virtual {v0, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    const/16 v5, 0x100

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v5, 0x80

    .line 37
    .line 38
    :goto_1
    or-int/2addr v1, v5

    .line 39
    const/4 v5, 0x1

    .line 40
    invoke-virtual {v0, v5}, Llp2;->g(Z)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    const/16 v6, 0x800

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v6, 0x400

    .line 50
    .line 51
    :goto_2
    or-int/2addr v1, v6

    .line 52
    or-int/lit16 v1, v1, 0x6000

    .line 53
    .line 54
    const v6, 0x12493

    .line 55
    .line 56
    .line 57
    and-int/2addr v6, v1

    .line 58
    const v7, 0x12492

    .line 59
    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    if-eq v6, v7, :cond_3

    .line 63
    .line 64
    move v6, v5

    .line 65
    goto :goto_3

    .line 66
    :cond_3
    move v6, v8

    .line 67
    :goto_3
    and-int/lit8 v7, v1, 0x1

    .line 68
    .line 69
    invoke-virtual {v0, v7, v6}, Llp2;->N(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_b

    .line 74
    .line 75
    invoke-virtual {v0}, Llp2;->S()V

    .line 76
    .line 77
    .line 78
    and-int/lit8 v6, p7, 0x1

    .line 79
    .line 80
    if-eqz v6, :cond_5

    .line 81
    .line 82
    invoke-virtual {v0}, Llp2;->x()Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-eqz v6, :cond_4

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_4
    invoke-virtual {v0}, Llp2;->Q()V

    .line 90
    .line 91
    .line 92
    move-object/from16 v9, p2

    .line 93
    .line 94
    move-wide/from16 v6, p4

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_5
    :goto_4
    sget-wide v6, Lvb7;->c:J

    .line 98
    .line 99
    sget-object v9, Lhx4;->X:Lhx4;

    .line 100
    .line 101
    :goto_5
    invoke-virtual {v0}, Llp2;->q()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    sget-object v11, Lzz0;->a:Lbe;

    .line 109
    .line 110
    if-ne v10, v11, :cond_6

    .line 111
    .line 112
    new-instance v10, Lvd7;

    .line 113
    .line 114
    invoke-direct {v10}, Lvd7;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_6
    check-cast v10, Lvd7;

    .line 121
    .line 122
    and-int/lit8 v1, v1, 0xe

    .line 123
    .line 124
    if-ne v1, v3, :cond_7

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_7
    move v5, v8

    .line 128
    :goto_6
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    if-nez v5, :cond_8

    .line 133
    .line 134
    if-ne v1, v11, :cond_9

    .line 135
    .line 136
    :cond_8
    new-instance v1, Lt17;

    .line 137
    .line 138
    const/4 v3, 0x5

    .line 139
    const/4 v5, 0x0

    .line 140
    invoke-direct {v1, v2, v10, v5, v3}, Lt17;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_9
    check-cast v1, Lrn2;

    .line 147
    .line 148
    invoke-static {v1, v0, v2}, Lu70;->h(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v10}, Lvd7;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-nez v1, :cond_a

    .line 156
    .line 157
    invoke-static {v6, v7}, Lnt1;->b(J)F

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    const/high16 v3, 0x40000000    # 2.0f

    .line 162
    .line 163
    div-float/2addr v1, v3

    .line 164
    invoke-static {v6, v7}, Lnt1;->a(J)F

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    int-to-long v10, v1

    .line 173
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    int-to-long v12, v1

    .line 178
    const/16 v1, 0x20

    .line 179
    .line 180
    shl-long/2addr v10, v1

    .line 181
    const-wide v14, 0xffffffffL

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    and-long/2addr v12, v14

    .line 187
    or-long/2addr v10, v12

    .line 188
    goto :goto_7

    .line 189
    :cond_a
    move-wide v10, v6

    .line 190
    :goto_7
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 191
    .line 192
    invoke-static {v10, v11}, Lnt1;->b(J)F

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    invoke-static {v10, v11}, Lnt1;->a(J)F

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    invoke-static {v9, v1, v3}, Landroidx/compose/foundation/layout/b;->h(Lkx4;FF)Lkx4;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-static {v1, v2}, Lu15;->z(Lkx4;Lxz4;)Lkx4;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    iget-wide v10, v4, Ljb7;->a:J

    .line 209
    .line 210
    sget-object v3, Lu15;->r:Ld77;

    .line 211
    .line 212
    invoke-static {v3, v0}, Lq77;->b(Ld77;Llp2;)Lx67;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-static {v1, v10, v11, v3}, Lu15;->f(Lkx4;JLx67;)Lkx4;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-static {v0, v1}, Lch3;->f(Llp2;Lkx4;)V

    .line 221
    .line 222
    .line 223
    move-wide v5, v6

    .line 224
    move-object v3, v9

    .line 225
    goto :goto_8

    .line 226
    :cond_b
    invoke-virtual {v0}, Llp2;->Q()V

    .line 227
    .line 228
    .line 229
    move-object/from16 v3, p2

    .line 230
    .line 231
    move-wide/from16 v5, p4

    .line 232
    .line 233
    :goto_8
    invoke-virtual {v0}, Llp2;->r()Lj86;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    if-eqz v8, :cond_c

    .line 238
    .line 239
    new-instance v0, Lmb7;

    .line 240
    .line 241
    move-object/from16 v1, p0

    .line 242
    .line 243
    move/from16 v7, p7

    .line 244
    .line 245
    invoke-direct/range {v0 .. v7}, Lmb7;-><init>(Lpb7;Lxz4;Lkx4;Ljb7;JI)V

    .line 246
    .line 247
    .line 248
    iput-object v0, v8, Lj86;->d:Lrn2;

    .line 249
    .line 250
    :cond_c
    return-void
.end method

.method public final b(Lwb7;Lkx4;Ljb7;Lrn2;Lsn2;FFLlp2;I)V
    .locals 12

    .line 1
    move-object/from16 v8, p8

    .line 2
    .line 3
    move/from16 v11, p9

    .line 4
    .line 5
    const v0, 0x2fab503

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v0}, Llp2;->X(I)Llp2;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, v11, 0x6

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v8, p1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    :goto_0
    or-int/2addr v0, v11

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v0, v11

    .line 27
    :goto_1
    or-int/lit8 v0, v0, 0x30

    .line 28
    .line 29
    and-int/lit16 v1, v11, 0x180

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    const/16 v4, 0x100

    .line 33
    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    invoke-virtual {v8, v2}, Llp2;->g(Z)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    move v1, v4

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v1, 0x80

    .line 45
    .line 46
    :goto_2
    or-int/2addr v0, v1

    .line 47
    :cond_3
    and-int/lit16 v1, v11, 0xc00

    .line 48
    .line 49
    const/16 v5, 0x800

    .line 50
    .line 51
    if-nez v1, :cond_5

    .line 52
    .line 53
    invoke-virtual {v8, p3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    move v1, v5

    .line 60
    goto :goto_3

    .line 61
    :cond_4
    const/16 v1, 0x400

    .line 62
    .line 63
    :goto_3
    or-int/2addr v0, v1

    .line 64
    :cond_5
    and-int/lit16 v1, v11, 0x6000

    .line 65
    .line 66
    if-nez v1, :cond_6

    .line 67
    .line 68
    or-int/lit16 v0, v0, 0x2000

    .line 69
    .line 70
    :cond_6
    const/high16 v1, 0xdb0000

    .line 71
    .line 72
    or-int/2addr v0, v1

    .line 73
    const/high16 v1, 0x6000000

    .line 74
    .line 75
    and-int/2addr v1, v11

    .line 76
    if-nez v1, :cond_8

    .line 77
    .line 78
    invoke-virtual {v8, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_7

    .line 83
    .line 84
    const/high16 v1, 0x4000000

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_7
    const/high16 v1, 0x2000000

    .line 88
    .line 89
    :goto_4
    or-int/2addr v0, v1

    .line 90
    :cond_8
    const v1, 0x2492493

    .line 91
    .line 92
    .line 93
    and-int/2addr v1, v0

    .line 94
    const v6, 0x2492492

    .line 95
    .line 96
    .line 97
    const/4 v7, 0x0

    .line 98
    if-eq v1, v6, :cond_9

    .line 99
    .line 100
    move v1, v2

    .line 101
    goto :goto_5

    .line 102
    :cond_9
    move v1, v7

    .line 103
    :goto_5
    and-int/lit8 v6, v0, 0x1

    .line 104
    .line 105
    invoke-virtual {v8, v6, v1}, Llp2;->N(IZ)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_13

    .line 110
    .line 111
    invoke-virtual {v8}, Llp2;->S()V

    .line 112
    .line 113
    .line 114
    and-int/lit8 v1, v11, 0x1

    .line 115
    .line 116
    const v6, -0xe001

    .line 117
    .line 118
    .line 119
    if-eqz v1, :cond_b

    .line 120
    .line 121
    invoke-virtual {v8}, Llp2;->x()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_a

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_a
    invoke-virtual {v8}, Llp2;->Q()V

    .line 129
    .line 130
    .line 131
    and-int/2addr v0, v6

    .line 132
    move-object v2, p2

    .line 133
    move-object/from16 v4, p4

    .line 134
    .line 135
    move-object/from16 v5, p5

    .line 136
    .line 137
    move/from16 v6, p6

    .line 138
    .line 139
    move/from16 v7, p7

    .line 140
    .line 141
    goto :goto_9

    .line 142
    :cond_b
    :goto_6
    and-int/lit16 v1, v0, 0x1c00

    .line 143
    .line 144
    xor-int/lit16 v1, v1, 0xc00

    .line 145
    .line 146
    if-le v1, v5, :cond_c

    .line 147
    .line 148
    invoke-virtual {v8, p3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_d

    .line 153
    .line 154
    :cond_c
    and-int/lit16 v1, v0, 0xc00

    .line 155
    .line 156
    if-ne v1, v5, :cond_e

    .line 157
    .line 158
    :cond_d
    move v1, v2

    .line 159
    goto :goto_7

    .line 160
    :cond_e
    move v1, v7

    .line 161
    :goto_7
    and-int/lit16 v5, v0, 0x380

    .line 162
    .line 163
    if-ne v5, v4, :cond_f

    .line 164
    .line 165
    goto :goto_8

    .line 166
    :cond_f
    move v2, v7

    .line 167
    :goto_8
    or-int/2addr v1, v2

    .line 168
    invoke-virtual {v8}, Llp2;->K()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    sget-object v4, Lzz0;->a:Lbe;

    .line 173
    .line 174
    if-nez v1, :cond_10

    .line 175
    .line 176
    if-ne v2, v4, :cond_11

    .line 177
    .line 178
    :cond_10
    new-instance v2, Lb1;

    .line 179
    .line 180
    const/16 v1, 0x16

    .line 181
    .line 182
    invoke-direct {v2, p3, v1}, Lb1;-><init>(Ljava/lang/Object;B)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v8, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_11
    move-object v1, v2

    .line 189
    check-cast v1, Lrn2;

    .line 190
    .line 191
    and-int/2addr v0, v6

    .line 192
    invoke-virtual {v8}, Llp2;->K()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    if-ne v2, v4, :cond_12

    .line 197
    .line 198
    sget-object v2, Loe0;->g0:Loe0;

    .line 199
    .line 200
    invoke-virtual {v8, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :cond_12
    check-cast v2, Lsn2;

    .line 204
    .line 205
    sget v4, Lvb7;->d:F

    .line 206
    .line 207
    sget v5, Lvb7;->e:F

    .line 208
    .line 209
    sget-object v6, Lhx4;->X:Lhx4;

    .line 210
    .line 211
    move v7, v5

    .line 212
    move-object v5, v2

    .line 213
    move-object v2, v6

    .line 214
    move v6, v4

    .line 215
    move-object v4, v1

    .line 216
    :goto_9
    invoke-virtual {v8}, Llp2;->q()V

    .line 217
    .line 218
    .line 219
    const v1, 0x30000030

    .line 220
    .line 221
    .line 222
    and-int/lit8 v9, v0, 0xe

    .line 223
    .line 224
    or-int/2addr v1, v9

    .line 225
    shl-int/lit8 v9, v0, 0x3

    .line 226
    .line 227
    and-int/lit16 v10, v9, 0x380

    .line 228
    .line 229
    or-int/2addr v1, v10

    .line 230
    and-int/lit16 v10, v9, 0x1c00

    .line 231
    .line 232
    or-int/2addr v1, v10

    .line 233
    const v10, 0xe000

    .line 234
    .line 235
    .line 236
    and-int/2addr v10, v9

    .line 237
    or-int/2addr v1, v10

    .line 238
    const/high16 v10, 0x380000

    .line 239
    .line 240
    and-int/2addr v10, v9

    .line 241
    or-int/2addr v1, v10

    .line 242
    const/high16 v10, 0x1c00000

    .line 243
    .line 244
    and-int/2addr v10, v9

    .line 245
    or-int/2addr v1, v10

    .line 246
    const/high16 v10, 0xe000000

    .line 247
    .line 248
    and-int/2addr v9, v10

    .line 249
    or-int/2addr v9, v1

    .line 250
    shr-int/lit8 v0, v0, 0x15

    .line 251
    .line 252
    and-int/lit8 v0, v0, 0x70

    .line 253
    .line 254
    or-int/lit8 v10, v0, 0x6

    .line 255
    .line 256
    move-object v0, p0

    .line 257
    move-object v1, p1

    .line 258
    move-object v3, p3

    .line 259
    invoke-virtual/range {v0 .. v10}, Lpb7;->c(Lwb7;Lkx4;Ljb7;Lrn2;Lsn2;FFLlp2;II)V

    .line 260
    .line 261
    .line 262
    move-object v3, v2

    .line 263
    move v8, v7

    .line 264
    move v7, v6

    .line 265
    move-object v6, v5

    .line 266
    move-object v5, v4

    .line 267
    goto :goto_a

    .line 268
    :cond_13
    invoke-virtual/range {p8 .. p8}, Llp2;->Q()V

    .line 269
    .line 270
    .line 271
    move-object v3, p2

    .line 272
    move-object/from16 v5, p4

    .line 273
    .line 274
    move-object/from16 v6, p5

    .line 275
    .line 276
    move/from16 v7, p6

    .line 277
    .line 278
    move/from16 v8, p7

    .line 279
    .line 280
    :goto_a
    invoke-virtual/range {p8 .. p8}, Llp2;->r()Lj86;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    if-eqz v10, :cond_14

    .line 285
    .line 286
    new-instance v0, Llb7;

    .line 287
    .line 288
    move-object v1, p0

    .line 289
    move-object v2, p1

    .line 290
    move-object v4, p3

    .line 291
    move v9, v11

    .line 292
    invoke-direct/range {v0 .. v9}, Llb7;-><init>(Lpb7;Lwb7;Lkx4;Ljb7;Lrn2;Lsn2;FFI)V

    .line 293
    .line 294
    .line 295
    iput-object v0, v10, Lj86;->d:Lrn2;

    .line 296
    .line 297
    :cond_14
    return-void
.end method

.method public final c(Lwb7;Lkx4;Ljb7;Lrn2;Lsn2;FFLlp2;II)V
    .locals 22

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v14, p2

    .line 4
    .line 5
    move-object/from16 v15, p3

    .line 6
    .line 7
    move-object/from16 v0, p8

    .line 8
    .line 9
    move/from16 v2, p9

    .line 10
    .line 11
    const v3, 0x7f37829    # 3.66332E-34f

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v3}, Llp2;->X(I)Llp2;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v3, v2, 0x6

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    const/4 v3, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v3, v4

    .line 31
    :goto_0
    or-int/2addr v3, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v3, v2

    .line 34
    :goto_1
    and-int/lit8 v6, v2, 0x30

    .line 35
    .line 36
    if-nez v6, :cond_3

    .line 37
    .line 38
    const/high16 v6, 0x7fc00000    # Float.NaN

    .line 39
    .line 40
    invoke-virtual {v0, v6}, Llp2;->c(F)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    const/16 v6, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v6, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v3, v6

    .line 52
    :cond_3
    and-int/lit16 v6, v2, 0x180

    .line 53
    .line 54
    if-nez v6, :cond_5

    .line 55
    .line 56
    invoke-virtual {v0, v14}, Llp2;->f(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_4

    .line 61
    .line 62
    const/16 v6, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v6, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v3, v6

    .line 68
    :cond_5
    and-int/lit16 v6, v2, 0xc00

    .line 69
    .line 70
    const/4 v8, 0x1

    .line 71
    if-nez v6, :cond_7

    .line 72
    .line 73
    invoke-virtual {v0, v8}, Llp2;->g(Z)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_6

    .line 78
    .line 79
    const/16 v6, 0x800

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v6, 0x400

    .line 83
    .line 84
    :goto_4
    or-int/2addr v3, v6

    .line 85
    :cond_7
    and-int/lit16 v6, v2, 0x6000

    .line 86
    .line 87
    if-nez v6, :cond_9

    .line 88
    .line 89
    invoke-virtual {v0, v15}, Llp2;->f(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_8

    .line 94
    .line 95
    const/16 v6, 0x4000

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_8
    const/16 v6, 0x2000

    .line 99
    .line 100
    :goto_5
    or-int/2addr v3, v6

    .line 101
    :cond_9
    const/high16 v6, 0x30000

    .line 102
    .line 103
    and-int/2addr v6, v2

    .line 104
    move-object/from16 v12, p4

    .line 105
    .line 106
    if-nez v6, :cond_b

    .line 107
    .line 108
    invoke-virtual {v0, v12}, Llp2;->h(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-eqz v6, :cond_a

    .line 113
    .line 114
    const/high16 v6, 0x20000

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_a
    const/high16 v6, 0x10000

    .line 118
    .line 119
    :goto_6
    or-int/2addr v3, v6

    .line 120
    :cond_b
    const/high16 v6, 0x180000

    .line 121
    .line 122
    and-int/2addr v6, v2

    .line 123
    if-nez v6, :cond_d

    .line 124
    .line 125
    move-object/from16 v6, p5

    .line 126
    .line 127
    invoke-virtual {v0, v6}, Llp2;->h(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    if-eqz v11, :cond_c

    .line 132
    .line 133
    const/high16 v11, 0x100000

    .line 134
    .line 135
    goto :goto_7

    .line 136
    :cond_c
    const/high16 v11, 0x80000

    .line 137
    .line 138
    :goto_7
    or-int/2addr v3, v11

    .line 139
    goto :goto_8

    .line 140
    :cond_d
    move-object/from16 v6, p5

    .line 141
    .line 142
    :goto_8
    const/high16 v11, 0xc00000

    .line 143
    .line 144
    and-int/2addr v11, v2

    .line 145
    if-nez v11, :cond_f

    .line 146
    .line 147
    move/from16 v11, p6

    .line 148
    .line 149
    invoke-virtual {v0, v11}, Llp2;->c(F)Z

    .line 150
    .line 151
    .line 152
    move-result v16

    .line 153
    if-eqz v16, :cond_e

    .line 154
    .line 155
    const/high16 v16, 0x800000

    .line 156
    .line 157
    goto :goto_9

    .line 158
    :cond_e
    const/high16 v16, 0x400000

    .line 159
    .line 160
    :goto_9
    or-int v3, v3, v16

    .line 161
    .line 162
    goto :goto_a

    .line 163
    :cond_f
    move/from16 v11, p6

    .line 164
    .line 165
    :goto_a
    const/high16 v16, 0x6000000

    .line 166
    .line 167
    and-int v16, v2, v16

    .line 168
    .line 169
    move/from16 v5, p7

    .line 170
    .line 171
    if-nez v16, :cond_11

    .line 172
    .line 173
    invoke-virtual {v0, v5}, Llp2;->c(F)Z

    .line 174
    .line 175
    .line 176
    move-result v18

    .line 177
    if-eqz v18, :cond_10

    .line 178
    .line 179
    const/high16 v18, 0x4000000

    .line 180
    .line 181
    goto :goto_b

    .line 182
    :cond_10
    const/high16 v18, 0x2000000

    .line 183
    .line 184
    :goto_b
    or-int v3, v3, v18

    .line 185
    .line 186
    :cond_11
    const/high16 v18, 0x30000000

    .line 187
    .line 188
    and-int v18, v2, v18

    .line 189
    .line 190
    const/4 v10, 0x0

    .line 191
    if-nez v18, :cond_13

    .line 192
    .line 193
    invoke-virtual {v0, v10}, Llp2;->g(Z)Z

    .line 194
    .line 195
    .line 196
    move-result v18

    .line 197
    if-eqz v18, :cond_12

    .line 198
    .line 199
    const/high16 v18, 0x20000000

    .line 200
    .line 201
    goto :goto_c

    .line 202
    :cond_12
    const/high16 v18, 0x10000000

    .line 203
    .line 204
    :goto_c
    or-int v3, v3, v18

    .line 205
    .line 206
    :cond_13
    and-int/lit8 v18, p10, 0x6

    .line 207
    .line 208
    if-nez v18, :cond_15

    .line 209
    .line 210
    invoke-virtual {v0, v10}, Llp2;->g(Z)Z

    .line 211
    .line 212
    .line 213
    move-result v18

    .line 214
    if-eqz v18, :cond_14

    .line 215
    .line 216
    const/16 v18, 0x4

    .line 217
    .line 218
    goto :goto_d

    .line 219
    :cond_14
    move/from16 v18, v4

    .line 220
    .line 221
    :goto_d
    or-int v18, p10, v18

    .line 222
    .line 223
    goto :goto_e

    .line 224
    :cond_15
    move/from16 v18, p10

    .line 225
    .line 226
    :goto_e
    const v19, 0x12492493

    .line 227
    .line 228
    .line 229
    and-int v10, v3, v19

    .line 230
    .line 231
    const v9, 0x12492492

    .line 232
    .line 233
    .line 234
    if-ne v10, v9, :cond_17

    .line 235
    .line 236
    and-int/lit8 v9, v18, 0x3

    .line 237
    .line 238
    if-eq v9, v4, :cond_16

    .line 239
    .line 240
    goto :goto_f

    .line 241
    :cond_16
    const/4 v4, 0x0

    .line 242
    goto :goto_10

    .line 243
    :cond_17
    :goto_f
    const/4 v4, 0x1

    .line 244
    :goto_10
    and-int/lit8 v9, v3, 0x1

    .line 245
    .line 246
    invoke-virtual {v0, v9, v4}, Llp2;->N(IZ)Z

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    if-eqz v4, :cond_25

    .line 251
    .line 252
    move v4, v3

    .line 253
    iget-wide v2, v15, Ljb7;->d:J

    .line 254
    .line 255
    move v9, v4

    .line 256
    iget-wide v4, v15, Ljb7;->b:J

    .line 257
    .line 258
    move/from16 v20, v9

    .line 259
    .line 260
    iget-wide v8, v15, Ljb7;->e:J

    .line 261
    .line 262
    iget-wide v10, v15, Ljb7;->c:J

    .line 263
    .line 264
    iget-object v13, v1, Lwb7;->n0:Lsd5;

    .line 265
    .line 266
    sget-object v7, Lsd5;->X:Lsd5;

    .line 267
    .line 268
    if-ne v13, v7, :cond_18

    .line 269
    .line 270
    sget v7, Lvb7;->a:F

    .line 271
    .line 272
    invoke-static {v14, v7}, Landroidx/compose/foundation/layout/b;->k(Lkx4;F)Lkx4;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    sget-object v13, Landroidx/compose/foundation/layout/b;->b:Landroidx/compose/foundation/layout/FillElement;

    .line 277
    .line 278
    invoke-interface {v7, v13}, Lkx4;->y(Lkx4;)Lkx4;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    goto :goto_11

    .line 283
    :cond_18
    sget-object v7, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 284
    .line 285
    invoke-interface {v14, v7}, Lkx4;->y(Lkx4;)Lkx4;

    .line 286
    .line 287
    .line 288
    move-result-object v7

    .line 289
    sget v13, Lvb7;->a:F

    .line 290
    .line 291
    invoke-static {v7, v13}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    :goto_11
    and-int/lit8 v13, v20, 0x70

    .line 296
    .line 297
    const/16 v6, 0x20

    .line 298
    .line 299
    if-ne v13, v6, :cond_19

    .line 300
    .line 301
    const/4 v6, 0x1

    .line 302
    goto :goto_12

    .line 303
    :cond_19
    const/4 v6, 0x0

    .line 304
    :goto_12
    invoke-virtual {v0, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v21

    .line 308
    or-int v6, v6, v21

    .line 309
    .line 310
    move/from16 v21, v6

    .line 311
    .line 312
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v6

    .line 316
    sget-object v12, Lzz0;->a:Lbe;

    .line 317
    .line 318
    if-nez v21, :cond_1a

    .line 319
    .line 320
    if-ne v6, v12, :cond_1b

    .line 321
    .line 322
    :cond_1a
    new-instance v6, Lm30;

    .line 323
    .line 324
    const/16 v14, 0x8

    .line 325
    .line 326
    invoke-direct {v6, v1, v14}, Lm30;-><init>(Ljava/lang/Object;B)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    :cond_1b
    check-cast v6, Lsn2;

    .line 333
    .line 334
    sget-object v14, Lhx4;->X:Lhx4;

    .line 335
    .line 336
    invoke-static {v14, v6}, Lz68;->q0(Lkx4;Lsn2;)Lkx4;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    invoke-interface {v7, v6}, Lkx4;->y(Lkx4;)Lkx4;

    .line 341
    .line 342
    .line 343
    move-result-object v14

    .line 344
    const/16 v6, 0x20

    .line 345
    .line 346
    if-ne v13, v6, :cond_1c

    .line 347
    .line 348
    const/4 v6, 0x1

    .line 349
    goto :goto_13

    .line 350
    :cond_1c
    const/4 v6, 0x0

    .line 351
    :goto_13
    invoke-virtual {v0, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v7

    .line 355
    or-int/2addr v6, v7

    .line 356
    invoke-virtual {v0, v2, v3}, Llp2;->e(J)Z

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    or-int/2addr v6, v7

    .line 361
    invoke-virtual {v0, v4, v5}, Llp2;->e(J)Z

    .line 362
    .line 363
    .line 364
    move-result v7

    .line 365
    or-int/2addr v6, v7

    .line 366
    invoke-virtual {v0, v8, v9}, Llp2;->e(J)Z

    .line 367
    .line 368
    .line 369
    move-result v7

    .line 370
    or-int/2addr v6, v7

    .line 371
    invoke-virtual {v0, v10, v11}, Llp2;->e(J)Z

    .line 372
    .line 373
    .line 374
    move-result v7

    .line 375
    or-int/2addr v6, v7

    .line 376
    const/high16 v7, 0x1c00000

    .line 377
    .line 378
    and-int v7, v20, v7

    .line 379
    .line 380
    const/high16 v13, 0x800000

    .line 381
    .line 382
    if-ne v7, v13, :cond_1d

    .line 383
    .line 384
    const/4 v7, 0x1

    .line 385
    goto :goto_14

    .line 386
    :cond_1d
    const/4 v7, 0x0

    .line 387
    :goto_14
    or-int/2addr v6, v7

    .line 388
    const/high16 v7, 0xe000000

    .line 389
    .line 390
    and-int v7, v20, v7

    .line 391
    .line 392
    const/high16 v13, 0x4000000

    .line 393
    .line 394
    if-ne v7, v13, :cond_1e

    .line 395
    .line 396
    const/4 v7, 0x1

    .line 397
    goto :goto_15

    .line 398
    :cond_1e
    const/4 v7, 0x0

    .line 399
    :goto_15
    or-int/2addr v6, v7

    .line 400
    const/high16 v7, 0x70000

    .line 401
    .line 402
    and-int v7, v20, v7

    .line 403
    .line 404
    const/high16 v13, 0x20000

    .line 405
    .line 406
    if-ne v7, v13, :cond_1f

    .line 407
    .line 408
    const/4 v7, 0x1

    .line 409
    goto :goto_16

    .line 410
    :cond_1f
    const/4 v7, 0x0

    .line 411
    :goto_16
    or-int/2addr v6, v7

    .line 412
    const/high16 v7, 0x380000

    .line 413
    .line 414
    and-int v7, v20, v7

    .line 415
    .line 416
    const/high16 v13, 0x100000

    .line 417
    .line 418
    if-ne v7, v13, :cond_20

    .line 419
    .line 420
    const/4 v7, 0x1

    .line 421
    goto :goto_17

    .line 422
    :cond_20
    const/4 v7, 0x0

    .line 423
    :goto_17
    or-int/2addr v6, v7

    .line 424
    const/high16 v7, 0x70000000

    .line 425
    .line 426
    and-int v7, v20, v7

    .line 427
    .line 428
    const/high16 v13, 0x20000000

    .line 429
    .line 430
    if-ne v7, v13, :cond_21

    .line 431
    .line 432
    const/4 v7, 0x1

    .line 433
    goto :goto_18

    .line 434
    :cond_21
    const/4 v7, 0x0

    .line 435
    :goto_18
    or-int/2addr v6, v7

    .line 436
    and-int/lit8 v7, v18, 0xe

    .line 437
    .line 438
    const/4 v13, 0x4

    .line 439
    if-ne v7, v13, :cond_22

    .line 440
    .line 441
    const/16 v17, 0x1

    .line 442
    .line 443
    goto :goto_19

    .line 444
    :cond_22
    const/16 v17, 0x0

    .line 445
    .line 446
    :goto_19
    or-int v6, v6, v17

    .line 447
    .line 448
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v7

    .line 452
    if-nez v6, :cond_24

    .line 453
    .line 454
    if-ne v7, v12, :cond_23

    .line 455
    .line 456
    goto :goto_1a

    .line 457
    :cond_23
    move-object v15, v0

    .line 458
    goto :goto_1b

    .line 459
    :cond_24
    :goto_1a
    new-instance v0, Lnb7;

    .line 460
    .line 461
    move-object/from16 v12, p4

    .line 462
    .line 463
    move-object/from16 v13, p5

    .line 464
    .line 465
    move-object/from16 v15, p8

    .line 466
    .line 467
    move-wide v6, v8

    .line 468
    move-wide v8, v10

    .line 469
    move/from16 v10, p6

    .line 470
    .line 471
    move/from16 v11, p7

    .line 472
    .line 473
    invoke-direct/range {v0 .. v13}, Lnb7;-><init>(Lwb7;JJJJFFLrn2;Lsn2;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v15, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    move-object v7, v0

    .line 480
    :goto_1b
    check-cast v7, Lgn2;

    .line 481
    .line 482
    const/4 v0, 0x0

    .line 483
    invoke-static {v0, v7, v15, v14}, Lyn0;->b(ILgn2;Llp2;Lkx4;)V

    .line 484
    .line 485
    .line 486
    goto :goto_1c

    .line 487
    :cond_25
    move-object v15, v0

    .line 488
    invoke-virtual {v15}, Llp2;->Q()V

    .line 489
    .line 490
    .line 491
    :goto_1c
    invoke-virtual {v15}, Llp2;->r()Lj86;

    .line 492
    .line 493
    .line 494
    move-result-object v11

    .line 495
    if-eqz v11, :cond_26

    .line 496
    .line 497
    new-instance v0, Lob7;

    .line 498
    .line 499
    move-object/from16 v1, p0

    .line 500
    .line 501
    move-object/from16 v2, p1

    .line 502
    .line 503
    move-object/from16 v3, p2

    .line 504
    .line 505
    move-object/from16 v4, p3

    .line 506
    .line 507
    move-object/from16 v5, p4

    .line 508
    .line 509
    move-object/from16 v6, p5

    .line 510
    .line 511
    move/from16 v7, p6

    .line 512
    .line 513
    move/from16 v8, p7

    .line 514
    .line 515
    move/from16 v9, p9

    .line 516
    .line 517
    move/from16 v10, p10

    .line 518
    .line 519
    invoke-direct/range {v0 .. v10}, Lob7;-><init>(Lpb7;Lwb7;Lkx4;Ljb7;Lrn2;Lsn2;FFII)V

    .line 520
    .line 521
    .line 522
    iput-object v0, v11, Lj86;->d:Lrn2;

    .line 523
    .line 524
    :cond_26
    return-void
.end method
