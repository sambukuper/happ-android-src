.class public abstract Lec8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lig5;

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lig5;

    .line 2
    .line 3
    const/high16 v1, 0x41000000    # 8.0f

    .line 4
    .line 5
    const/high16 v2, 0x40800000    # 4.0f

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v1, v2}, Lig5;-><init>(FFFF)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lec8;->a:Lig5;

    .line 11
    .line 12
    const/high16 v0, 0x41800000    # 16.0f

    .line 13
    .line 14
    sput v0, Lec8;->b:F

    .line 15
    .line 16
    return-void
.end method

.method public static final a(Lhc8;Lkx4;FLx67;JJLzy0;Llp2;I)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v9, p8

    .line 4
    .line 5
    move-object/from16 v0, p9

    .line 6
    .line 7
    move/from16 v2, p10

    .line 8
    .line 9
    const v3, -0x147d586e

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v3}, Llp2;->X(I)Llp2;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v3, v2, 0x6

    .line 16
    .line 17
    if-nez v3, :cond_2

    .line 18
    .line 19
    and-int/lit8 v3, v2, 0x8

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v0, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    :goto_0
    if-eqz v3, :cond_1

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/4 v3, 0x2

    .line 37
    :goto_1
    or-int/2addr v3, v2

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move v3, v2

    .line 40
    :goto_2
    or-int/lit16 v4, v3, 0xdb0

    .line 41
    .line 42
    and-int/lit16 v5, v2, 0x6000

    .line 43
    .line 44
    if-nez v5, :cond_3

    .line 45
    .line 46
    or-int/lit16 v4, v3, 0x2db0

    .line 47
    .line 48
    :cond_3
    const/high16 v3, 0x30000

    .line 49
    .line 50
    and-int/2addr v3, v2

    .line 51
    if-nez v3, :cond_4

    .line 52
    .line 53
    const/high16 v3, 0x10000

    .line 54
    .line 55
    or-int/2addr v4, v3

    .line 56
    :cond_4
    const/high16 v3, 0x180000

    .line 57
    .line 58
    and-int/2addr v3, v2

    .line 59
    if-nez v3, :cond_5

    .line 60
    .line 61
    const/high16 v3, 0x80000

    .line 62
    .line 63
    or-int/2addr v4, v3

    .line 64
    :cond_5
    const/high16 v3, 0x6c00000

    .line 65
    .line 66
    or-int/2addr v3, v4

    .line 67
    const/high16 v4, 0x30000000

    .line 68
    .line 69
    and-int/2addr v4, v2

    .line 70
    if-nez v4, :cond_7

    .line 71
    .line 72
    invoke-virtual {v0, v9}, Llp2;->h(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_6

    .line 77
    .line 78
    const/high16 v4, 0x20000000

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_6
    const/high16 v4, 0x10000000

    .line 82
    .line 83
    :goto_3
    or-int/2addr v3, v4

    .line 84
    :cond_7
    const v4, 0x12492493

    .line 85
    .line 86
    .line 87
    and-int/2addr v4, v3

    .line 88
    const v5, 0x12492492

    .line 89
    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    if-eq v4, v5, :cond_8

    .line 93
    .line 94
    const/4 v4, 0x1

    .line 95
    goto :goto_4

    .line 96
    :cond_8
    move v4, v6

    .line 97
    :goto_4
    and-int/lit8 v5, v3, 0x1

    .line 98
    .line 99
    invoke-virtual {v0, v5, v4}, Llp2;->N(IZ)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_b

    .line 104
    .line 105
    invoke-virtual {v0}, Llp2;->S()V

    .line 106
    .line 107
    .line 108
    and-int/lit8 v4, v2, 0x1

    .line 109
    .line 110
    const v5, -0x3fe001

    .line 111
    .line 112
    .line 113
    if-eqz v4, :cond_a

    .line 114
    .line 115
    invoke-virtual {v0}, Llp2;->x()Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_9

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_9
    invoke-virtual {v0}, Llp2;->Q()V

    .line 123
    .line 124
    .line 125
    and-int/2addr v3, v5

    .line 126
    move-object/from16 v10, p1

    .line 127
    .line 128
    move/from16 v4, p2

    .line 129
    .line 130
    move-object/from16 v11, p3

    .line 131
    .line 132
    move-wide/from16 v7, p4

    .line 133
    .line 134
    move-wide/from16 v12, p6

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_a
    :goto_5
    sget v4, Lzb8;->b:F

    .line 138
    .line 139
    sget-object v7, Lu15;->f:Ld77;

    .line 140
    .line 141
    invoke-static {v7, v0}, Lq77;->b(Ld77;Llp2;)Lx67;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    sget-object v8, Lu15;->g:Ljw0;

    .line 146
    .line 147
    invoke-static {v8, v0}, Lkw0;->c(Ljw0;Llp2;)J

    .line 148
    .line 149
    .line 150
    move-result-wide v10

    .line 151
    sget-object v8, Lu15;->e:Ljw0;

    .line 152
    .line 153
    invoke-static {v8, v0}, Lkw0;->c(Ljw0;Llp2;)J

    .line 154
    .line 155
    .line 156
    move-result-wide v12

    .line 157
    and-int/2addr v3, v5

    .line 158
    sget-object v5, Lhx4;->X:Lhx4;

    .line 159
    .line 160
    move-wide/from16 v22, v10

    .line 161
    .line 162
    move-object v11, v7

    .line 163
    move-wide/from16 v7, v22

    .line 164
    .line 165
    move-object v10, v5

    .line 166
    :goto_6
    invoke-virtual {v0}, Llp2;->q()V

    .line 167
    .line 168
    .line 169
    const v5, -0x66828db7

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v5}, Llp2;->W(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v6}, Llp2;->p(Z)V

    .line 176
    .line 177
    .line 178
    new-instance v5, Ldc8;

    .line 179
    .line 180
    invoke-direct {v5, v4, v7, v8, v9}, Ldc8;-><init>(FJLzy0;)V

    .line 181
    .line 182
    .line 183
    const v6, -0x5dd15193

    .line 184
    .line 185
    .line 186
    invoke-static {v6, v5, v0}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 187
    .line 188
    .line 189
    move-result-object v18

    .line 190
    shr-int/lit8 v3, v3, 0x9

    .line 191
    .line 192
    const v5, 0xe000

    .line 193
    .line 194
    .line 195
    and-int/2addr v5, v3

    .line 196
    const/high16 v6, 0xc00000

    .line 197
    .line 198
    or-int/2addr v5, v6

    .line 199
    const/high16 v6, 0x70000

    .line 200
    .line 201
    and-int/2addr v3, v6

    .line 202
    or-int v20, v5, v3

    .line 203
    .line 204
    const/16 v21, 0x48

    .line 205
    .line 206
    const-wide/16 v14, 0x0

    .line 207
    .line 208
    const/16 v16, 0x0

    .line 209
    .line 210
    const/16 v17, 0x0

    .line 211
    .line 212
    move-object/from16 v19, v0

    .line 213
    .line 214
    invoke-static/range {v10 .. v21}, Lay7;->a(Lkx4;Lx67;JJFFLzy0;Llp2;II)V

    .line 215
    .line 216
    .line 217
    move v3, v4

    .line 218
    move-wide v5, v7

    .line 219
    move-object v4, v11

    .line 220
    move-wide v7, v12

    .line 221
    goto :goto_7

    .line 222
    :cond_b
    invoke-virtual/range {p9 .. p9}, Llp2;->Q()V

    .line 223
    .line 224
    .line 225
    move-object/from16 v10, p1

    .line 226
    .line 227
    move/from16 v3, p2

    .line 228
    .line 229
    move-object/from16 v4, p3

    .line 230
    .line 231
    move-wide/from16 v5, p4

    .line 232
    .line 233
    move-wide/from16 v7, p6

    .line 234
    .line 235
    :goto_7
    invoke-virtual/range {p9 .. p9}, Llp2;->r()Lj86;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    if-eqz v11, :cond_c

    .line 240
    .line 241
    new-instance v0, Lbc8;

    .line 242
    .line 243
    move-object/from16 v22, v10

    .line 244
    .line 245
    move v10, v2

    .line 246
    move-object/from16 v2, v22

    .line 247
    .line 248
    invoke-direct/range {v0 .. v10}, Lbc8;-><init>(Lhc8;Lkx4;FLx67;JJLzy0;I)V

    .line 249
    .line 250
    .line 251
    iput-object v0, v11, Lj86;->d:Lrn2;

    .line 252
    .line 253
    :cond_c
    return-void
.end method

.method public static final b(Lhc8;Lkx4;Lx67;FLx67;Lxk6;FLzy0;Llp2;I)V
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v6, p5

    .line 6
    .line 7
    move-object/from16 v0, p8

    .line 8
    .line 9
    move/from16 v2, p9

    .line 10
    .line 11
    const v4, 0xe1582e1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v4}, Llp2;->X(I)Llp2;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v4, v2, 0x6

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    if-nez v4, :cond_2

    .line 21
    .line 22
    and-int/lit8 v4, v2, 0x8

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v0, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    :goto_0
    if-eqz v4, :cond_1

    .line 36
    .line 37
    move v4, v5

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 v4, 0x2

    .line 40
    :goto_1
    or-int/2addr v4, v2

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v4, v2

    .line 43
    :goto_2
    or-int/lit16 v4, v4, 0xdb0

    .line 44
    .line 45
    and-int/lit16 v7, v2, 0x6000

    .line 46
    .line 47
    if-nez v7, :cond_4

    .line 48
    .line 49
    invoke-virtual {v0, v3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_3

    .line 54
    .line 55
    const/16 v7, 0x4000

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    const/16 v7, 0x2000

    .line 59
    .line 60
    :goto_3
    or-int/2addr v4, v7

    .line 61
    :cond_4
    const/high16 v7, 0x30000

    .line 62
    .line 63
    or-int/2addr v7, v4

    .line 64
    const/high16 v9, 0x180000

    .line 65
    .line 66
    and-int/2addr v9, v2

    .line 67
    if-nez v9, :cond_5

    .line 68
    .line 69
    const/high16 v7, 0xb0000

    .line 70
    .line 71
    or-int/2addr v7, v4

    .line 72
    :cond_5
    const/high16 v4, 0xc00000

    .line 73
    .line 74
    and-int v9, v2, v4

    .line 75
    .line 76
    if-nez v9, :cond_7

    .line 77
    .line 78
    invoke-virtual {v0, v6}, Llp2;->f(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    if-eqz v9, :cond_6

    .line 83
    .line 84
    const/high16 v9, 0x800000

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_6
    const/high16 v9, 0x400000

    .line 88
    .line 89
    :goto_4
    or-int/2addr v7, v9

    .line 90
    :cond_7
    const/high16 v9, 0x36000000

    .line 91
    .line 92
    or-int/2addr v7, v9

    .line 93
    const v9, 0x12492493

    .line 94
    .line 95
    .line 96
    and-int/2addr v9, v7

    .line 97
    const v10, 0x12492492

    .line 98
    .line 99
    .line 100
    if-ne v9, v10, :cond_8

    .line 101
    .line 102
    const/4 v9, 0x0

    .line 103
    goto :goto_5

    .line 104
    :cond_8
    const/4 v9, 0x1

    .line 105
    :goto_5
    and-int/lit8 v10, v7, 0x1

    .line 106
    .line 107
    invoke-virtual {v0, v10, v9}, Llp2;->N(IZ)Z

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-eqz v9, :cond_14

    .line 112
    .line 113
    invoke-virtual {v0}, Llp2;->S()V

    .line 114
    .line 115
    .line 116
    and-int/lit8 v9, v2, 0x1

    .line 117
    .line 118
    sget-object v10, Lhx4;->X:Lhx4;

    .line 119
    .line 120
    const v13, -0x380001

    .line 121
    .line 122
    .line 123
    if-eqz v9, :cond_a

    .line 124
    .line 125
    invoke-virtual {v0}, Llp2;->x()Z

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-eqz v9, :cond_9

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_9
    invoke-virtual {v0}, Llp2;->Q()V

    .line 133
    .line 134
    .line 135
    and-int/2addr v7, v13

    .line 136
    move/from16 v9, p3

    .line 137
    .line 138
    move-object/from16 v13, p4

    .line 139
    .line 140
    move/from16 v14, p6

    .line 141
    .line 142
    move v15, v7

    .line 143
    move-object/from16 v7, p1

    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_a
    :goto_6
    sget v9, Lzb8;->c:F

    .line 147
    .line 148
    sget-object v14, Li21;->a0:Ld77;

    .line 149
    .line 150
    invoke-static {v14, v0}, Lq77;->b(Ld77;Llp2;)Lx67;

    .line 151
    .line 152
    .line 153
    move-result-object v14

    .line 154
    and-int/2addr v7, v13

    .line 155
    sget v13, Li21;->Z:F

    .line 156
    .line 157
    move-object v15, v14

    .line 158
    move v14, v13

    .line 159
    move-object v13, v15

    .line 160
    move v15, v7

    .line 161
    move-object v7, v10

    .line 162
    :goto_7
    invoke-virtual {v0}, Llp2;->q()V

    .line 163
    .line 164
    .line 165
    const v16, 0xe000

    .line 166
    .line 167
    .line 168
    move/from16 v17, v4

    .line 169
    .line 170
    const/16 v4, 0x8

    .line 171
    .line 172
    if-eqz v3, :cond_13

    .line 173
    .line 174
    const v12, -0x6ac4016

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v12}, Llp2;->W(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v12

    .line 184
    sget-object v11, Lzz0;->a:Lbe;

    .line 185
    .line 186
    if-ne v12, v11, :cond_b

    .line 187
    .line 188
    invoke-static {}, Lor4;->a()[F

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    new-instance v8, Lor4;

    .line 193
    .line 194
    invoke-direct {v8, v12}, Lor4;-><init>([F)V

    .line 195
    .line 196
    .line 197
    invoke-static {v8}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 198
    .line 199
    .line 200
    move-result-object v12

    .line 201
    invoke-virtual {v0, v12}, Llp2;->g0(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_b
    move-object/from16 v25, v12

    .line 205
    .line 206
    check-cast v25, Ly05;

    .line 207
    .line 208
    sget-object v8, Ly01;->h:Lox1;

    .line 209
    .line 210
    invoke-virtual {v0, v8}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    move-object/from16 v23, v8

    .line 215
    .line 216
    check-cast v23, Lfi1;

    .line 217
    .line 218
    sget-object v8, Ly01;->u:Lox1;

    .line 219
    .line 220
    invoke-virtual {v0, v8}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    check-cast v8, Lt09;

    .line 225
    .line 226
    check-cast v8, Ly74;

    .line 227
    .line 228
    invoke-virtual {v8}, Ly74;->a()J

    .line 229
    .line 230
    .line 231
    move-result-wide v20

    .line 232
    and-int/lit8 v8, v15, 0xe

    .line 233
    .line 234
    if-eq v8, v5, :cond_d

    .line 235
    .line 236
    and-int/lit8 v5, v15, 0x8

    .line 237
    .line 238
    if-eqz v5, :cond_c

    .line 239
    .line 240
    invoke-virtual {v0, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-eqz v5, :cond_c

    .line 245
    .line 246
    goto :goto_8

    .line 247
    :cond_c
    const/4 v5, 0x0

    .line 248
    goto :goto_9

    .line 249
    :cond_d
    :goto_8
    const/4 v5, 0x1

    .line 250
    :goto_9
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    if-nez v5, :cond_e

    .line 255
    .line 256
    if-ne v8, v11, :cond_f

    .line 257
    .line 258
    :cond_e
    new-instance v8, Lpy7;

    .line 259
    .line 260
    invoke-direct {v8, v1, v4}, Lpy7;-><init>(Ljava/lang/Object;B)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0, v8}, Llp2;->g0(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_f
    move-object/from16 v22, v8

    .line 267
    .line 268
    check-cast v22, Lgn2;

    .line 269
    .line 270
    iget-object v5, v1, Lhc8;->b:Lnr5;

    .line 271
    .line 272
    new-instance v19, Lcc8;

    .line 273
    .line 274
    move-object/from16 v24, v5

    .line 275
    .line 276
    invoke-direct/range {v19 .. v25}, Lcc8;-><init>(JLgn2;Lfi1;Lnr5;Ly05;)V

    .line 277
    .line 278
    .line 279
    move-object/from16 v5, v19

    .line 280
    .line 281
    move-object/from16 v12, v25

    .line 282
    .line 283
    invoke-static {v10, v5}, Lz68;->q0(Lkx4;Lsn2;)Lkx4;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-interface {v5, v7}, Lkx4;->y(Lkx4;)Lkx4;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    invoke-virtual {v0, v13}, Llp2;->f(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v8

    .line 295
    and-int v10, v15, v16

    .line 296
    .line 297
    const/16 v4, 0x4000

    .line 298
    .line 299
    if-ne v10, v4, :cond_10

    .line 300
    .line 301
    const/16 v18, 0x1

    .line 302
    .line 303
    goto :goto_a

    .line 304
    :cond_10
    const/16 v18, 0x0

    .line 305
    .line 306
    :goto_a
    or-int v4, v8, v18

    .line 307
    .line 308
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v8

    .line 312
    if-nez v4, :cond_11

    .line 313
    .line 314
    if-ne v8, v11, :cond_12

    .line 315
    .line 316
    :cond_11
    new-instance v8, Lwb8;

    .line 317
    .line 318
    invoke-direct {v8, v12, v13, v3}, Lwb8;-><init>(Ly05;Lx67;Lx67;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v8}, Llp2;->g0(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_12
    check-cast v8, Lwb8;

    .line 325
    .line 326
    const/4 v4, 0x0

    .line 327
    invoke-virtual {v0, v4}, Llp2;->p(Z)V

    .line 328
    .line 329
    .line 330
    goto :goto_b

    .line 331
    :cond_13
    const/4 v4, 0x0

    .line 332
    const v5, -0x6a26766

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v5}, Llp2;->W(I)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0, v4}, Llp2;->p(Z)V

    .line 339
    .line 340
    .line 341
    move-object v5, v7

    .line 342
    move-object v8, v13

    .line 343
    :goto_b
    const/high16 v4, 0x42200000    # 40.0f

    .line 344
    .line 345
    const/high16 v10, 0x41c00000    # 24.0f

    .line 346
    .line 347
    const/16 v11, 0x8

    .line 348
    .line 349
    invoke-static {v5, v4, v10, v9, v11}, Landroidx/compose/foundation/layout/b;->j(Lkx4;FFFI)Lkx4;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    move v5, v9

    .line 354
    iget-wide v9, v6, Lxk6;->a:J

    .line 355
    .line 356
    new-instance v11, Ln40;

    .line 357
    .line 358
    const/4 v12, 0x6

    .line 359
    move-object/from16 v18, v13

    .line 360
    .line 361
    move-object/from16 v13, p7

    .line 362
    .line 363
    invoke-direct {v11, v6, v13, v12}, Ln40;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 364
    .line 365
    .line 366
    const v12, -0x4a7e9c1a

    .line 367
    .line 368
    .line 369
    invoke-static {v12, v11, v0}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 370
    .line 371
    .line 372
    move-result-object v11

    .line 373
    shr-int/lit8 v12, v15, 0xc

    .line 374
    .line 375
    and-int v15, v12, v16

    .line 376
    .line 377
    or-int v15, v15, v17

    .line 378
    .line 379
    const/high16 v16, 0x70000

    .line 380
    .line 381
    and-int v12, v12, v16

    .line 382
    .line 383
    or-int v17, v15, v12

    .line 384
    .line 385
    move-object/from16 v12, v18

    .line 386
    .line 387
    const/16 v18, 0x48

    .line 388
    .line 389
    move-object/from16 v16, v11

    .line 390
    .line 391
    move-object v15, v12

    .line 392
    const-wide/16 v11, 0x0

    .line 393
    .line 394
    const/4 v13, 0x0

    .line 395
    move-object/from16 v26, v16

    .line 396
    .line 397
    move-object/from16 v16, v0

    .line 398
    .line 399
    move-object v0, v15

    .line 400
    move-object/from16 v15, v26

    .line 401
    .line 402
    move-object/from16 v26, v7

    .line 403
    .line 404
    move-object v7, v4

    .line 405
    move-object/from16 v4, v26

    .line 406
    .line 407
    invoke-static/range {v7 .. v18}, Lay7;->a(Lkx4;Lx67;JJFFLzy0;Llp2;II)V

    .line 408
    .line 409
    .line 410
    move v7, v14

    .line 411
    goto :goto_c

    .line 412
    :cond_14
    invoke-virtual/range {p8 .. p8}, Llp2;->Q()V

    .line 413
    .line 414
    .line 415
    move-object/from16 v4, p1

    .line 416
    .line 417
    move/from16 v5, p3

    .line 418
    .line 419
    move-object/from16 v0, p4

    .line 420
    .line 421
    move/from16 v7, p6

    .line 422
    .line 423
    :goto_c
    invoke-virtual/range {p8 .. p8}, Llp2;->r()Lj86;

    .line 424
    .line 425
    .line 426
    move-result-object v10

    .line 427
    if-eqz v10, :cond_15

    .line 428
    .line 429
    move-object v2, v4

    .line 430
    move v4, v5

    .line 431
    move-object v5, v0

    .line 432
    new-instance v0, Llb7;

    .line 433
    .line 434
    move-object/from16 v8, p7

    .line 435
    .line 436
    move/from16 v9, p9

    .line 437
    .line 438
    invoke-direct/range {v0 .. v9}, Llb7;-><init>(Lhc8;Lkx4;Lx67;FLx67;Lxk6;FLzy0;I)V

    .line 439
    .line 440
    .line 441
    iput-object v0, v10, Lj86;->d:Lrn2;

    .line 442
    .line 443
    :cond_15
    return-void
.end method

.method public static final c(Lnr5;Lzy0;Ljc8;Lkx4;ZLzy0;Llp2;I)V
    .locals 10

    .line 1
    move-object/from16 v4, p6

    .line 2
    .line 3
    move/from16 v7, p7

    .line 4
    .line 5
    const v0, -0x11825480

    .line 6
    .line 7
    .line 8
    invoke-virtual {v4, v0}, Llp2;->X(I)Llp2;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, v7, 0x6

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v4, p0}, Llp2;->f(Ljava/lang/Object;)Z

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
    or-int/2addr v0, v7

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v0, v7

    .line 27
    :goto_1
    and-int/lit8 v1, v7, 0x30

    .line 28
    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    invoke-virtual {v4, p1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    const/16 v1, 0x20

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    const/16 v1, 0x10

    .line 41
    .line 42
    :goto_2
    or-int/2addr v0, v1

    .line 43
    :cond_3
    and-int/lit16 v1, v7, 0x180

    .line 44
    .line 45
    if-nez v1, :cond_6

    .line 46
    .line 47
    and-int/lit16 v1, v7, 0x200

    .line 48
    .line 49
    if-nez v1, :cond_4

    .line 50
    .line 51
    invoke-virtual {v4, p2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    goto :goto_3

    .line 56
    :cond_4
    invoke-virtual {v4, p2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    :goto_3
    if-eqz v1, :cond_5

    .line 61
    .line 62
    const/16 v1, 0x100

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_5
    const/16 v1, 0x80

    .line 66
    .line 67
    :goto_4
    or-int/2addr v0, v1

    .line 68
    :cond_6
    const v1, 0xdb6c00

    .line 69
    .line 70
    .line 71
    or-int/2addr v0, v1

    .line 72
    const/high16 v1, 0x6000000

    .line 73
    .line 74
    and-int/2addr v1, v7

    .line 75
    if-nez v1, :cond_8

    .line 76
    .line 77
    invoke-virtual {v4, p5}, Llp2;->h(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_7

    .line 82
    .line 83
    const/high16 v1, 0x4000000

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_7
    const/high16 v1, 0x2000000

    .line 87
    .line 88
    :goto_5
    or-int/2addr v0, v1

    .line 89
    :cond_8
    const v1, 0x2492493

    .line 90
    .line 91
    .line 92
    and-int/2addr v1, v0

    .line 93
    const v2, 0x2492492

    .line 94
    .line 95
    .line 96
    const/4 v8, 0x1

    .line 97
    if-eq v1, v2, :cond_9

    .line 98
    .line 99
    move v1, v8

    .line 100
    goto :goto_6

    .line 101
    :cond_9
    const/4 v1, 0x0

    .line 102
    :goto_6
    and-int/lit8 v2, v0, 0x1

    .line 103
    .line 104
    invoke-virtual {v4, v2, v1}, Llp2;->N(IZ)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_c

    .line 109
    .line 110
    iget-object v1, p2, Ljc8;->c:Lb15;

    .line 111
    .line 112
    const-string v2, "tooltip transition"

    .line 113
    .line 114
    const/16 v3, 0x30

    .line 115
    .line 116
    invoke-static {v1, v2, v4, v3}, Lrq7;->n(Lb15;Ljava/lang/String;Llp2;I)Lce8;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v4}, Llp2;->K()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    sget-object v3, Lzz0;->a:Lbe;

    .line 125
    .line 126
    if-ne v2, v3, :cond_a

    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-static {v2}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v4, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_a
    check-cast v2, Ly05;

    .line 137
    .line 138
    invoke-virtual {v4}, Llp2;->K()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    if-ne v5, v3, :cond_b

    .line 143
    .line 144
    new-instance v5, Lhc8;

    .line 145
    .line 146
    new-instance v3, Leh;

    .line 147
    .line 148
    const/16 v9, 0x8

    .line 149
    .line 150
    invoke-direct {v3, v2, v9}, Leh;-><init>(Ly05;B)V

    .line 151
    .line 152
    .line 153
    invoke-direct {v5, v3, p0}, Lhc8;-><init>(Leh;Lnr5;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_b
    check-cast v5, Lhc8;

    .line 160
    .line 161
    new-instance v3, Ln40;

    .line 162
    .line 163
    const/4 v9, 0x7

    .line 164
    invoke-direct {v3, v2, p5, v9}, Ln40;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 165
    .line 166
    .line 167
    const v2, -0x16cb6ae

    .line 168
    .line 169
    .line 170
    invoke-static {v2, v3, v4}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    new-instance v2, Lzt4;

    .line 175
    .line 176
    invoke-direct {v2, v1, p1, v5}, Lzt4;-><init>(Lce8;Lzy0;Lhc8;)V

    .line 177
    .line 178
    .line 179
    const v1, -0x1f6f824a

    .line 180
    .line 181
    .line 182
    invoke-static {v1, v2, v4}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    and-int/lit8 v2, v0, 0xe

    .line 187
    .line 188
    const v5, 0x6000030

    .line 189
    .line 190
    .line 191
    or-int/2addr v2, v5

    .line 192
    and-int/lit16 v5, v0, 0x380

    .line 193
    .line 194
    or-int/2addr v2, v5

    .line 195
    and-int/lit16 v5, v0, 0x1c00

    .line 196
    .line 197
    or-int/2addr v2, v5

    .line 198
    const v5, 0xe000

    .line 199
    .line 200
    .line 201
    and-int/2addr v5, v0

    .line 202
    or-int/2addr v2, v5

    .line 203
    const/high16 v5, 0x70000

    .line 204
    .line 205
    and-int/2addr v5, v0

    .line 206
    or-int/2addr v2, v5

    .line 207
    const/high16 v5, 0x380000

    .line 208
    .line 209
    and-int/2addr v5, v0

    .line 210
    or-int/2addr v2, v5

    .line 211
    const/high16 v5, 0x1c00000

    .line 212
    .line 213
    and-int/2addr v0, v5

    .line 214
    or-int v5, v2, v0

    .line 215
    .line 216
    move-object v0, p0

    .line 217
    move-object v2, p2

    .line 218
    invoke-static/range {v0 .. v5}, Lz68;->c(Lnr5;Lzy0;Ljc8;Lzy0;Llp2;I)V

    .line 219
    .line 220
    .line 221
    sget-object v0, Lhx4;->X:Lhx4;

    .line 222
    .line 223
    move-object v4, v0

    .line 224
    move v5, v8

    .line 225
    goto :goto_7

    .line 226
    :cond_c
    invoke-virtual/range {p6 .. p6}, Llp2;->Q()V

    .line 227
    .line 228
    .line 229
    move-object v4, p3

    .line 230
    move v5, p4

    .line 231
    :goto_7
    invoke-virtual/range {p6 .. p6}, Llp2;->r()Lj86;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    if-eqz v8, :cond_d

    .line 236
    .line 237
    new-instance v0, Lj40;

    .line 238
    .line 239
    move-object v1, p0

    .line 240
    move-object v2, p1

    .line 241
    move-object v3, p2

    .line 242
    move-object v6, p5

    .line 243
    invoke-direct/range {v0 .. v7}, Lj40;-><init>(Lnr5;Lzy0;Ljc8;Lkx4;ZLzy0;I)V

    .line 244
    .line 245
    .line 246
    iput-object v0, v8, Lj86;->d:Lrn2;

    .line 247
    .line 248
    :cond_d
    return-void
.end method

.method public static final d(FILs86;)F
    .locals 5

    .line 1
    iget v0, p2, Ls86;->a:F

    .line 2
    .line 3
    iget p2, p2, Ls86;->c:F

    .line 4
    .line 5
    add-float v1, v0, p2

    .line 6
    .line 7
    const/high16 v2, 0x40000000    # 2.0f

    .line 8
    .line 9
    div-float/2addr v1, v2

    .line 10
    int-to-float p1, p1

    .line 11
    cmpl-float v3, p0, p1

    .line 12
    .line 13
    if-ltz v3, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    div-float v2, p0, v2

    .line 17
    .line 18
    sub-float v3, v1, v2

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    cmpg-float v3, v3, v4

    .line 22
    .line 23
    if-gez v3, :cond_1

    .line 24
    .line 25
    sub-float/2addr p0, p1

    .line 26
    neg-float p1, v0

    .line 27
    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    :goto_0
    add-float/2addr p0, v1

    .line 32
    return p0

    .line 33
    :cond_1
    add-float v0, v1, v2

    .line 34
    .line 35
    cmpl-float p1, v0, p1

    .line 36
    .line 37
    if-lez p1, :cond_2

    .line 38
    .line 39
    sub-float/2addr p0, p2

    .line 40
    invoke-static {p0, v4}, Ljava/lang/Math;->min(FF)F

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    return v2
.end method

.method public static final e(Llp2;II)Ljc8;
    .locals 5

    .line 1
    and-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    move p2, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move p2, v0

    .line 10
    :goto_0
    sget-object v2, Lh40;->a:Lm15;

    .line 11
    .line 12
    and-int/lit8 v3, p1, 0x70

    .line 13
    .line 14
    xor-int/lit8 v3, v3, 0x30

    .line 15
    .line 16
    const/16 v4, 0x20

    .line 17
    .line 18
    if-le v3, v4, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Llp2;->g(Z)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_3

    .line 25
    .line 26
    :cond_1
    and-int/lit8 p1, p1, 0x30

    .line 27
    .line 28
    if-ne p1, v4, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move v0, v1

    .line 32
    :cond_3
    :goto_1
    invoke-virtual {p0, v2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    or-int/2addr p1, v0

    .line 37
    invoke-virtual {p0}, Llp2;->K()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez p1, :cond_4

    .line 42
    .line 43
    sget-object p1, Lzz0;->a:Lbe;

    .line 44
    .line 45
    if-ne v0, p1, :cond_5

    .line 46
    .line 47
    :cond_4
    new-instance v0, Ljc8;

    .line 48
    .line 49
    invoke-direct {v0, p2, v2}, Ljc8;-><init>(ZLm15;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_5
    check-cast v0, Ljc8;

    .line 56
    .line 57
    return-object v0
.end method
