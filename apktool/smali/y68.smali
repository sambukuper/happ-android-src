.class public final Ly68;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lxd6;

.field public b:Lg48;

.field public final c:Lrh5;

.field public final d:Lrh5;

.field public final e:Lrh5;

.field public final f:Lrh5;

.field public final g:Llr5;

.field public final h:Lc15;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLxd6;)V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    move-object/from16 v0, p4

    .line 5
    .line 6
    iput-object v0, p0, Ly68;->a:Lxd6;

    .line 7
    .line 8
    new-instance v0, Lg48;

    .line 9
    .line 10
    new-instance v1, Lh48;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    move-wide v11, p2

    .line 17
    invoke-static {v2, v11, v12}, Lct7;->d(IJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    const/4 v9, 0x0

    .line 22
    const/16 v10, 0x7c

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    move-object v2, p1

    .line 29
    invoke-direct/range {v1 .. v10}, Lh48;-><init>(Ljava/lang/CharSequence;JLf88;Lqg5;Ljava/util/List;Ljava/util/List;Lc78;I)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    const/16 v5, 0xe

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct/range {v0 .. v5}, Lg48;-><init>(Lh48;Lmj0;Lh48;Lqf3;I)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Ly68;->b:Lg48;

    .line 41
    .line 42
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-static {v0}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iput-object v1, p0, Ly68;->c:Lrh5;

    .line 49
    .line 50
    new-instance v3, Lh48;

    .line 51
    .line 52
    const/4 v11, 0x0

    .line 53
    const/16 v12, 0x7c

    .line 54
    .line 55
    const/4 v10, 0x0

    .line 56
    move-object v4, p1

    .line 57
    move-wide v5, p2

    .line 58
    invoke-direct/range {v3 .. v12}, Lh48;-><init>(Ljava/lang/CharSequence;JLf88;Lqg5;Ljava/util/List;Ljava/util/List;Lc78;I)V

    .line 59
    .line 60
    .line 61
    invoke-static {v3}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Ly68;->d:Lrh5;

    .line 66
    .line 67
    invoke-static {v0}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Ly68;->e:Lrh5;

    .line 72
    .line 73
    invoke-static {v0}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Ly68;->f:Lrh5;

    .line 78
    .line 79
    new-instance p1, Llr5;

    .line 80
    .line 81
    const/16 v0, 0x18

    .line 82
    .line 83
    invoke-direct {p1, p0, v0}, Llr5;-><init>(Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Ly68;->g:Llr5;

    .line 87
    .line 88
    new-instance p1, Lc15;

    .line 89
    .line 90
    const/16 v0, 0x10

    .line 91
    .line 92
    new-array v0, v0, [Llh;

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    invoke-direct {p1, v1, v0}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, Ly68;->h:Lc15;

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final a(Lg48;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lg48;->a()Lmj0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lmj0;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lc15;

    .line 8
    .line 9
    iget v0, v0, Lc15;->Z:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    iget-wide v2, p1, Lg48;->i0:J

    .line 18
    .line 19
    iget-object v4, p0, Ly68;->b:Lg48;

    .line 20
    .line 21
    iget-wide v4, v4, Lg48;->i0:J

    .line 22
    .line 23
    invoke-static {v2, v3, v4, v5}, Lf88;->a(JJ)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    xor-int/2addr v2, v1

    .line 28
    iget-object v3, p1, Lg48;->f0:Lp88;

    .line 29
    .line 30
    iget-object v4, p0, Ly68;->b:Lg48;

    .line 31
    .line 32
    iget-object v4, v4, Lg48;->f0:Lp88;

    .line 33
    .line 34
    invoke-static {v3, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    xor-int/2addr v1, v3

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Ly68;->c()Lh48;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/4 v4, 0x0

    .line 46
    const/16 v5, 0xf

    .line 47
    .line 48
    const-wide/16 v6, 0x0

    .line 49
    .line 50
    invoke-static {p1, v6, v7, v4, v5}, Lg48;->h(Lg48;JLf88;I)Lh48;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {p1}, Lg48;->a()Lmj0;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    sget-object v6, Le58;->Y:Le58;

    .line 59
    .line 60
    invoke-virtual {p0, v3, v4, v5, v6}, Ly68;->d(Lh48;Lh48;Lmj0;Le58;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {p0, p1, v0, v2, v1}, Ly68;->g(Lg48;ZZZ)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final b(Lde3;ZLe58;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-virtual {v0}, Ly68;->c()Lh48;

    .line 10
    .line 11
    .line 12
    move-result-object v7

    .line 13
    iget-object v4, v0, Ly68;->b:Lg48;

    .line 14
    .line 15
    invoke-virtual {v4}, Lg48;->a()Lmj0;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-object v4, v4, Lmj0;->Y:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Lc15;

    .line 22
    .line 23
    iget v4, v4, Lc15;->Z:I

    .line 24
    .line 25
    if-nez v4, :cond_2

    .line 26
    .line 27
    iget-wide v4, v7, Lh48;->f0:J

    .line 28
    .line 29
    iget-object v6, v0, Ly68;->b:Lg48;

    .line 30
    .line 31
    iget-wide v8, v6, Lg48;->i0:J

    .line 32
    .line 33
    invoke-static {v4, v5, v8, v9}, Lf88;->a(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    iget-object v1, v7, Lh48;->g0:Lf88;

    .line 40
    .line 41
    iget-object v3, v0, Ly68;->b:Lg48;

    .line 42
    .line 43
    iget-object v3, v3, Lg48;->j0:Lf88;

    .line 44
    .line 45
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    iget-object v1, v7, Lh48;->h0:Lqg5;

    .line 52
    .line 53
    iget-object v3, v0, Ly68;->b:Lg48;

    .line 54
    .line 55
    iget-object v3, v3, Lg48;->l0:Lqg5;

    .line 56
    .line 57
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    iget-object v1, v7, Lh48;->X:Ljava/util/List;

    .line 64
    .line 65
    iget-object v3, v0, Ly68;->b:Lg48;

    .line 66
    .line 67
    iget-object v3, v3, Lg48;->k0:Lc15;

    .line 68
    .line 69
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    return-void

    .line 77
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ly68;->c()Lh48;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    new-instance v8, Lh48;

    .line 82
    .line 83
    iget-object v3, v0, Ly68;->b:Lg48;

    .line 84
    .line 85
    iget-object v3, v3, Lg48;->Z:Lmi5;

    .line 86
    .line 87
    invoke-virtual {v3}, Lmi5;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    iget-object v3, v0, Ly68;->b:Lg48;

    .line 92
    .line 93
    iget-wide v10, v3, Lg48;->i0:J

    .line 94
    .line 95
    iget-object v12, v3, Lg48;->j0:Lf88;

    .line 96
    .line 97
    iget-object v13, v3, Lg48;->l0:Lqg5;

    .line 98
    .line 99
    iget-object v3, v3, Lg48;->k0:Lc15;

    .line 100
    .line 101
    invoke-static {v12, v3}, Lz68;->y(Lf88;Lc15;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v14

    .line 105
    iget-object v3, v7, Lh48;->Y:Lc78;

    .line 106
    .line 107
    const/16 v17, 0x20

    .line 108
    .line 109
    const/4 v15, 0x0

    .line 110
    move-object/from16 v16, v3

    .line 111
    .line 112
    invoke-direct/range {v8 .. v17}, Lh48;-><init>(Ljava/lang/CharSequence;JLf88;Lqg5;Ljava/util/List;Ljava/util/List;Lc78;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1, v8, v2}, Ly68;->h(Lh48;Lh48;Z)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_2
    iget-object v4, v0, Ly68;->b:Lg48;

    .line 120
    .line 121
    invoke-virtual {v4}, Lg48;->a()Lmj0;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    iget-object v4, v4, Lmj0;->Y:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v4, Lc15;

    .line 128
    .line 129
    iget v4, v4, Lc15;->Z:I

    .line 130
    .line 131
    const/4 v5, 0x0

    .line 132
    const/4 v6, 0x1

    .line 133
    if-eqz v4, :cond_3

    .line 134
    .line 135
    move v4, v6

    .line 136
    goto :goto_1

    .line 137
    :cond_3
    move v4, v5

    .line 138
    :goto_1
    new-instance v8, Lh48;

    .line 139
    .line 140
    iget-object v9, v0, Ly68;->b:Lg48;

    .line 141
    .line 142
    iget-object v9, v9, Lg48;->Z:Lmi5;

    .line 143
    .line 144
    invoke-virtual {v9}, Lmi5;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    iget-object v10, v0, Ly68;->b:Lg48;

    .line 149
    .line 150
    iget-wide v11, v10, Lg48;->i0:J

    .line 151
    .line 152
    move-wide v13, v11

    .line 153
    iget-object v12, v10, Lg48;->j0:Lf88;

    .line 154
    .line 155
    move-wide v14, v13

    .line 156
    iget-object v13, v10, Lg48;->l0:Lqg5;

    .line 157
    .line 158
    iget-object v10, v10, Lg48;->k0:Lc15;

    .line 159
    .line 160
    invoke-static {v12, v10}, Lz68;->y(Lf88;Lc15;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    iget-object v11, v0, Ly68;->b:Lg48;

    .line 165
    .line 166
    invoke-static {v11}, Lz68;->K(Lg48;)Lc78;

    .line 167
    .line 168
    .line 169
    move-result-object v16

    .line 170
    const/16 v17, 0x20

    .line 171
    .line 172
    move-wide/from16 v18, v14

    .line 173
    .line 174
    move-object v14, v10

    .line 175
    move-wide/from16 v10, v18

    .line 176
    .line 177
    const/4 v15, 0x0

    .line 178
    invoke-direct/range {v8 .. v17}, Lh48;-><init>(Ljava/lang/CharSequence;JLf88;Lqg5;Ljava/util/List;Ljava/util/List;Lc78;I)V

    .line 179
    .line 180
    .line 181
    if-nez v1, :cond_5

    .line 182
    .line 183
    if-eqz v4, :cond_4

    .line 184
    .line 185
    if-eqz v2, :cond_4

    .line 186
    .line 187
    move v5, v6

    .line 188
    :cond_4
    invoke-virtual {v0, v7, v8, v5}, Ly68;->h(Lh48;Lh48;Z)V

    .line 189
    .line 190
    .line 191
    iget-object v1, v0, Ly68;->b:Lg48;

    .line 192
    .line 193
    invoke-virtual {v1}, Lg48;->a()Lmj0;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v0, v7, v8, v1, v3}, Ly68;->d(Lh48;Lh48;Lmj0;Le58;)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :cond_5
    iget-object v4, v0, Ly68;->b:Lg48;

    .line 202
    .line 203
    invoke-virtual {v4}, Lg48;->a()Lmj0;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    new-instance v4, Lg48;

    .line 208
    .line 209
    move-object v5, v8

    .line 210
    const/4 v8, 0x0

    .line 211
    const/16 v9, 0x8

    .line 212
    .line 213
    invoke-direct/range {v4 .. v9}, Lg48;-><init>(Lh48;Lmj0;Lh48;Lqf3;I)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v1, v4}, Lde3;->i(Lg48;)V

    .line 217
    .line 218
    .line 219
    iget-object v1, v4, Lg48;->Z:Lmi5;

    .line 220
    .line 221
    invoke-static {v1, v5}, Lmm7;->Q(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    xor-int/lit8 v6, v1, 0x1

    .line 226
    .line 227
    iget-wide v8, v4, Lg48;->i0:J

    .line 228
    .line 229
    iget-wide v10, v5, Lh48;->f0:J

    .line 230
    .line 231
    invoke-static {v8, v9, v10, v11}, Lf88;->a(JJ)Z

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    xor-int/lit8 v9, v8, 0x1

    .line 236
    .line 237
    iget-object v10, v4, Lg48;->f0:Lp88;

    .line 238
    .line 239
    iget-object v11, v5, Lh48;->Y:Lc78;

    .line 240
    .line 241
    if-eqz v11, :cond_6

    .line 242
    .line 243
    iget-object v11, v11, Lc78;->a:Lp88;

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_6
    const/4 v11, 0x0

    .line 247
    :goto_2
    invoke-static {v10, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    xor-int/lit8 v11, v10, 0x1

    .line 252
    .line 253
    if-eqz v1, :cond_8

    .line 254
    .line 255
    if-eqz v8, :cond_8

    .line 256
    .line 257
    if-nez v10, :cond_7

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_7
    iget-object v1, v5, Lh48;->g0:Lf88;

    .line 261
    .line 262
    const/16 v5, 0xd

    .line 263
    .line 264
    const-wide/16 v8, 0x0

    .line 265
    .line 266
    invoke-static {v4, v8, v9, v1, v5}, Lg48;->h(Lg48;JLf88;I)Lh48;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-virtual {v0, v7, v1, v2}, Ly68;->h(Lh48;Lh48;Z)V

    .line 271
    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_8
    :goto_3
    invoke-virtual {v0, v4, v6, v9, v11}, Ly68;->g(Lg48;ZZZ)V

    .line 275
    .line 276
    .line 277
    :goto_4
    invoke-virtual {v0}, Ly68;->c()Lh48;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-virtual {v4}, Lg48;->a()Lmj0;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-virtual {v0, v7, v1, v2, v3}, Ly68;->d(Lh48;Lh48;Lmj0;Le58;)V

    .line 286
    .line 287
    .line 288
    return-void
.end method

.method public final c()Lh48;
    .locals 0

    .line 1
    iget-object p0, p0, Ly68;->d:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lh48;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d(Lh48;Lh48;Lmj0;Le58;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p4

    .line 5
    const/4 v0, 0x1

    .line 6
    iget-object p0, p0, Ly68;->a:Lxd6;

    .line 7
    .line 8
    if-eqz p4, :cond_2

    .line 9
    .line 10
    if-eq p4, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-ne p4, v0, :cond_0

    .line 14
    .line 15
    const/4 p4, 0x0

    .line 16
    invoke-static {p0, p1, p2, p3, p4}, Ldu7;->e(Lxd6;Lh48;Lh48;Lmj0;Z)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {}, Lb61;->c()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lrh5;

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p1, p2}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Lbm8;

    .line 35
    .line 36
    iget-object p1, p0, Lbm8;->b:Lvd7;

    .line 37
    .line 38
    invoke-virtual {p1}, Lvd7;->clear()V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Lbm8;->c:Lvd7;

    .line 42
    .line 43
    invoke-virtual {p0}, Lvd7;->clear()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    invoke-static {p0, p1, p2, p3, v0}, Ldu7;->e(Lxd6;Lh48;Lh48;Lmj0;Z)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final e(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ly68;->f:Lrh5;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final f(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ly68;->e:Lrh5;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final g(Lg48;ZZZ)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ly68;->b:Lg48;

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/16 v6, 0xf

    .line 11
    .line 12
    invoke-static {v2, v3, v4, v5, v6}, Lg48;->h(Lg48;JLf88;I)Lh48;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    if-eqz p4, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    if-eqz p3, :cond_2

    .line 22
    .line 23
    iget-object v7, v0, Ly68;->b:Lg48;

    .line 24
    .line 25
    iget-wide v8, v1, Lg48;->i0:J

    .line 26
    .line 27
    sget v10, Lf88;->c:I

    .line 28
    .line 29
    const/16 v10, 0x20

    .line 30
    .line 31
    shr-long v10, v8, v10

    .line 32
    .line 33
    long-to-int v10, v10

    .line 34
    const-wide v11, 0xffffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v8, v11

    .line 40
    long-to-int v8, v8

    .line 41
    invoke-static {v10, v8}, Lct7;->c(II)J

    .line 42
    .line 43
    .line 44
    move-result-wide v8

    .line 45
    invoke-virtual {v7, v8, v9}, Lg48;->g(J)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :goto_0
    new-instance v10, Lg48;

    .line 50
    .line 51
    new-instance v11, Lh48;

    .line 52
    .line 53
    iget-object v7, v1, Lg48;->Z:Lmi5;

    .line 54
    .line 55
    invoke-virtual {v7}, Lmi5;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v12

    .line 59
    iget-wide v13, v1, Lg48;->i0:J

    .line 60
    .line 61
    invoke-static {v1}, Lz68;->K(Lg48;)Lc78;

    .line 62
    .line 63
    .line 64
    move-result-object v19

    .line 65
    const/16 v20, 0x3c

    .line 66
    .line 67
    const/4 v15, 0x0

    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    const/16 v17, 0x0

    .line 71
    .line 72
    const/16 v18, 0x0

    .line 73
    .line 74
    invoke-direct/range {v11 .. v20}, Lh48;-><init>(Ljava/lang/CharSequence;JLf88;Lqg5;Ljava/util/List;Ljava/util/List;Lc78;I)V

    .line 75
    .line 76
    .line 77
    const/4 v14, 0x0

    .line 78
    const/16 v15, 0xe

    .line 79
    .line 80
    const/4 v12, 0x0

    .line 81
    const/4 v13, 0x0

    .line 82
    invoke-direct/range {v10 .. v15}, Lg48;-><init>(Lh48;Lmj0;Lh48;Lqf3;I)V

    .line 83
    .line 84
    .line 85
    iput-object v10, v0, Ly68;->b:Lg48;

    .line 86
    .line 87
    :cond_2
    :goto_1
    if-nez p2, :cond_3

    .line 88
    .line 89
    if-nez p3, :cond_3

    .line 90
    .line 91
    iget-object v7, v2, Lh48;->g0:Lf88;

    .line 92
    .line 93
    iget-object v1, v1, Lg48;->j0:Lf88;

    .line 94
    .line 95
    invoke-static {v7, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_4

    .line 100
    .line 101
    :cond_3
    iget-object v1, v0, Ly68;->b:Lg48;

    .line 102
    .line 103
    invoke-virtual {v1, v5}, Lg48;->f(Lf88;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    iget-object v1, v0, Ly68;->b:Lg48;

    .line 107
    .line 108
    invoke-static {v1, v3, v4, v5, v6}, Lg48;->h(Lg48;JLf88;I)Lh48;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const/4 v3, 0x1

    .line 113
    invoke-virtual {v0, v2, v1, v3}, Ly68;->h(Lh48;Lh48;Z)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public final h(Lh48;Lh48;Z)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Ly68;->d:Lrh5;

    .line 8
    .line 9
    invoke-virtual {v3, v2}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, v0, Ly68;->h:Lc15;

    .line 13
    .line 14
    iget-object v4, v3, Lc15;->X:[Ljava/lang/Object;

    .line 15
    .line 16
    iget v3, v3, Lc15;->Z:I

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    move v6, v5

    .line 20
    :goto_0
    if-ge v6, v3, :cond_6

    .line 21
    .line 22
    aget-object v7, v4, v6

    .line 23
    .line 24
    check-cast v7, Llh;

    .line 25
    .line 26
    if-eqz p3, :cond_0

    .line 27
    .line 28
    iget-object v8, v1, Lh48;->Z:Ljava/lang/CharSequence;

    .line 29
    .line 30
    invoke-static {v8, v2}, Lmm7;->Q(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    if-nez v8, :cond_0

    .line 35
    .line 36
    iget-object v8, v1, Lh48;->g0:Lf88;

    .line 37
    .line 38
    if-eqz v8, :cond_0

    .line 39
    .line 40
    const/4 v8, 0x1

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    move v8, v5

    .line 43
    :goto_1
    iget-object v7, v7, Llh;->a:Lmj0;

    .line 44
    .line 45
    iget-wide v9, v1, Lh48;->f0:J

    .line 46
    .line 47
    iget-object v11, v1, Lh48;->g0:Lf88;

    .line 48
    .line 49
    iget-wide v12, v2, Lh48;->f0:J

    .line 50
    .line 51
    iget-object v14, v2, Lh48;->g0:Lf88;

    .line 52
    .line 53
    if-eqz v8, :cond_1

    .line 54
    .line 55
    invoke-virtual {v7}, Lmj0;->W()Landroid/view/inputmethod/InputMethodManager;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    iget-object v7, v7, Lmj0;->Y:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual {v8, v7}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_1
    invoke-static {v9, v10, v12, v13}, Lf88;->a(JJ)Z

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    if-eqz v8, :cond_2

    .line 72
    .line 73
    invoke-static {v11, v14}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-nez v8, :cond_5

    .line 78
    .line 79
    :cond_2
    invoke-static {v12, v13}, Lf88;->d(J)I

    .line 80
    .line 81
    .line 82
    move-result v17

    .line 83
    invoke-static {v12, v13}, Lf88;->c(J)I

    .line 84
    .line 85
    .line 86
    move-result v18

    .line 87
    const/4 v8, -0x1

    .line 88
    if-eqz v14, :cond_3

    .line 89
    .line 90
    iget-wide v9, v14, Lf88;->a:J

    .line 91
    .line 92
    invoke-static {v9, v10}, Lf88;->d(J)I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    move/from16 v19, v9

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    move/from16 v19, v8

    .line 100
    .line 101
    :goto_2
    if-eqz v14, :cond_4

    .line 102
    .line 103
    iget-wide v8, v14, Lf88;->a:J

    .line 104
    .line 105
    invoke-static {v8, v9}, Lf88;->c(J)I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    :cond_4
    move/from16 v20, v8

    .line 110
    .line 111
    invoke-virtual {v7}, Lmj0;->W()Landroid/view/inputmethod/InputMethodManager;

    .line 112
    .line 113
    .line 114
    move-result-object v15

    .line 115
    iget-object v7, v7, Lmj0;->Y:Ljava/lang/Object;

    .line 116
    .line 117
    move-object/from16 v16, v7

    .line 118
    .line 119
    check-cast v16, Landroid/view/View;

    .line 120
    .line 121
    invoke-virtual/range {v15 .. v20}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    .line 122
    .line 123
    .line 124
    :cond_5
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_6
    invoke-virtual {v0, v5}, Ly68;->f(Z)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "TextFieldState(selection="

    .line 2
    .line 3
    invoke-static {}, Lyn0;->D()Ldd7;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Ldd7;->e()Lgn2;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    invoke-static {v1}, Lyn0;->P(Ldd7;)Ldd7;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :try_start_0
    invoke-virtual {p0}, Ly68;->c()Lh48;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    iget-wide v4, v4, Lh48;->f0:J

    .line 24
    .line 25
    invoke-static {v4, v5}, Lf88;->f(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {p0}, Ly68;->c()Lh48;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget-object p0, p0, Lh48;->Z:Ljava/lang/CharSequence;

    .line 34
    .line 35
    new-instance v5, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ", text=\""

    .line 44
    .line 45
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p0, "\")"

    .line 52
    .line 53
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    invoke-static {v1, v3, v2}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    invoke-static {v1, v3, v2}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 66
    .line 67
    .line 68
    throw p0
.end method
