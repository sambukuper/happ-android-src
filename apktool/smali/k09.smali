.class public abstract Lk09;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lmi1;


# instance fields
.field public a:I

.field public b:Lm31;

.field public c:Lbr6;

.field public d:I

.field public final e:Lzo1;

.field public f:I

.field public g:Z

.field public final h:Lsi1;

.field public final i:Lsi1;

.field public j:I


# direct methods
.method public constructor <init>(Lm31;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lzo1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lzo1;-><init>(Lk09;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lk09;->e:Lzo1;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lk09;->f:I

    .line 13
    .line 14
    iput-boolean v0, p0, Lk09;->g:Z

    .line 15
    .line 16
    new-instance v0, Lsi1;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lsi1;-><init>(Lk09;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lk09;->h:Lsi1;

    .line 22
    .line 23
    new-instance v0, Lsi1;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lsi1;-><init>(Lk09;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lk09;->i:Lsi1;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    iput v0, p0, Lk09;->j:I

    .line 32
    .line 33
    iput-object p1, p0, Lk09;->b:Lm31;

    .line 34
    .line 35
    return-void
.end method

.method public static b(Lsi1;Lsi1;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsi1;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iput p2, p0, Lsi1;->f:I

    .line 7
    .line 8
    iget-object p1, p1, Lsi1;->k:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static h(Lu21;)Lsi1;
    .locals 2

    .line 1
    iget-object p0, p0, Lu21;->f:Lu21;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lu21;->d:Lm31;

    .line 7
    .line 8
    iget p0, p0, Lu21;->e:I

    .line 9
    .line 10
    invoke-static {p0}, Lp61;->B(I)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq p0, v1, :cond_5

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq p0, v1, :cond_4

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq p0, v1, :cond_3

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-eq p0, v1, :cond_2

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    if-eq p0, v1, :cond_1

    .line 28
    .line 29
    :goto_0
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :cond_1
    iget-object p0, v0, Lm31;->e:Lkv8;

    .line 32
    .line 33
    iget-object p0, p0, Lkv8;->k:Lsi1;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_2
    iget-object p0, v0, Lm31;->e:Lkv8;

    .line 37
    .line 38
    iget-object p0, p0, Lk09;->i:Lsi1;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_3
    iget-object p0, v0, Lm31;->d:Ly03;

    .line 42
    .line 43
    iget-object p0, p0, Lk09;->i:Lsi1;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_4
    iget-object p0, v0, Lm31;->e:Lkv8;

    .line 47
    .line 48
    iget-object p0, p0, Lk09;->h:Lsi1;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_5
    iget-object p0, v0, Lm31;->d:Ly03;

    .line 52
    .line 53
    iget-object p0, p0, Lk09;->h:Lsi1;

    .line 54
    .line 55
    return-object p0
.end method

.method public static i(Lu21;I)Lsi1;
    .locals 1

    .line 1
    iget-object p0, p0, Lu21;->f:Lu21;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, Lu21;->d:Lm31;

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    iget-object p1, v0, Lm31;->d:Ly03;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iget-object p1, v0, Lm31;->e:Lkv8;

    .line 14
    .line 15
    :goto_0
    iget p0, p0, Lu21;->e:I

    .line 16
    .line 17
    invoke-static {p0}, Lp61;->B(I)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/4 v0, 0x1

    .line 22
    if-eq p0, v0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    if-eq p0, v0, :cond_3

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    if-eq p0, v0, :cond_2

    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    if-eq p0, v0, :cond_2

    .line 32
    .line 33
    :goto_1
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_2
    iget-object p0, p1, Lk09;->i:Lsi1;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_3
    iget-object p0, p1, Lk09;->h:Lsi1;

    .line 39
    .line 40
    return-object p0
.end method


# virtual methods
.method public final c(Lsi1;Lsi1;ILzo1;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lsi1;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lsi1;->l:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object p0, p0, Lk09;->e:Lzo1;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iput p3, p1, Lsi1;->h:I

    .line 14
    .line 15
    iput-object p4, p1, Lsi1;->i:Lzo1;

    .line 16
    .line 17
    iget-object p0, p2, Lsi1;->k:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    iget-object p0, p4, Lsi1;->k:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public d()V
    .locals 13

    .line 1
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 2
    .line 3
    iget-boolean v1, v0, Lm31;->a:Z

    .line 4
    .line 5
    iget-object v2, p0, Lk09;->e:Lzo1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lm31;->q()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {v2, v0}, Lzo1;->d(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-boolean v0, v2, Lsi1;->j:Z

    .line 17
    .line 18
    iget-object v1, v2, Lsi1;->k:Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object v3, v2, Lsi1;->l:Ljava/util/ArrayList;

    .line 21
    .line 22
    const/4 v4, 0x3

    .line 23
    const/4 v5, 0x4

    .line 24
    const/4 v6, 0x1

    .line 25
    const/4 v7, 0x0

    .line 26
    iget-object v8, p0, Lk09;->i:Lsi1;

    .line 27
    .line 28
    iget-object v9, p0, Lk09;->h:Lsi1;

    .line 29
    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 33
    .line 34
    iget-object v10, v0, Lm31;->p0:[I

    .line 35
    .line 36
    aget v10, v10, v7

    .line 37
    .line 38
    iput v10, p0, Lk09;->d:I

    .line 39
    .line 40
    if-eq v10, v4, :cond_5

    .line 41
    .line 42
    if-ne v10, v5, :cond_2

    .line 43
    .line 44
    iget-object v11, v0, Lm31;->T:Ln31;

    .line 45
    .line 46
    if-eqz v11, :cond_2

    .line 47
    .line 48
    iget-object v12, v11, Lm31;->p0:[I

    .line 49
    .line 50
    aget v12, v12, v7

    .line 51
    .line 52
    if-eq v12, v6, :cond_1

    .line 53
    .line 54
    if-ne v12, v5, :cond_2

    .line 55
    .line 56
    :cond_1
    invoke-virtual {v11}, Lm31;->q()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v1, p0, Lk09;->b:Lm31;

    .line 61
    .line 62
    iget-object v1, v1, Lm31;->I:Lu21;

    .line 63
    .line 64
    invoke-virtual {v1}, Lu21;->e()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    sub-int/2addr v0, v1

    .line 69
    iget-object v1, p0, Lk09;->b:Lm31;

    .line 70
    .line 71
    iget-object v1, v1, Lm31;->K:Lu21;

    .line 72
    .line 73
    invoke-virtual {v1}, Lu21;->e()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    sub-int/2addr v0, v1

    .line 78
    iget-object v1, v11, Lm31;->d:Ly03;

    .line 79
    .line 80
    iget-object v1, v1, Lk09;->h:Lsi1;

    .line 81
    .line 82
    iget-object v3, p0, Lk09;->b:Lm31;

    .line 83
    .line 84
    iget-object v3, v3, Lm31;->I:Lu21;

    .line 85
    .line 86
    invoke-virtual {v3}, Lu21;->e()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    invoke-static {v9, v1, v3}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 91
    .line 92
    .line 93
    iget-object v1, v11, Lm31;->d:Ly03;

    .line 94
    .line 95
    iget-object v1, v1, Lk09;->i:Lsi1;

    .line 96
    .line 97
    iget-object p0, p0, Lk09;->b:Lm31;

    .line 98
    .line 99
    iget-object p0, p0, Lm31;->K:Lu21;

    .line 100
    .line 101
    invoke-virtual {p0}, Lu21;->e()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    neg-int p0, p0

    .line 106
    invoke-static {v8, v1, p0}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v0}, Lzo1;->d(I)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_2
    if-ne v10, v6, :cond_5

    .line 114
    .line 115
    invoke-virtual {v0}, Lm31;->q()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-virtual {v2, v0}, Lzo1;->d(I)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_3
    iget v0, p0, Lk09;->d:I

    .line 124
    .line 125
    if-ne v0, v5, :cond_5

    .line 126
    .line 127
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 128
    .line 129
    iget-object v10, v0, Lm31;->T:Ln31;

    .line 130
    .line 131
    if-eqz v10, :cond_5

    .line 132
    .line 133
    iget-object v11, v10, Lm31;->p0:[I

    .line 134
    .line 135
    aget v11, v11, v7

    .line 136
    .line 137
    if-eq v11, v6, :cond_4

    .line 138
    .line 139
    if-ne v11, v5, :cond_5

    .line 140
    .line 141
    :cond_4
    iget-object v1, v10, Lm31;->d:Ly03;

    .line 142
    .line 143
    iget-object v1, v1, Lk09;->h:Lsi1;

    .line 144
    .line 145
    iget-object v0, v0, Lm31;->I:Lu21;

    .line 146
    .line 147
    invoke-virtual {v0}, Lu21;->e()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    invoke-static {v9, v1, v0}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 152
    .line 153
    .line 154
    iget-object v0, v10, Lm31;->d:Ly03;

    .line 155
    .line 156
    iget-object v0, v0, Lk09;->i:Lsi1;

    .line 157
    .line 158
    iget-object p0, p0, Lk09;->b:Lm31;

    .line 159
    .line 160
    iget-object p0, p0, Lm31;->K:Lu21;

    .line 161
    .line 162
    invoke-virtual {p0}, Lu21;->e()I

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    neg-int p0, p0

    .line 167
    invoke-static {v8, v0, p0}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_5
    :goto_0
    iget-boolean v0, v2, Lsi1;->j:Z

    .line 172
    .line 173
    if-eqz v0, :cond_c

    .line 174
    .line 175
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 176
    .line 177
    iget-boolean v10, v0, Lm31;->a:Z

    .line 178
    .line 179
    if-eqz v10, :cond_c

    .line 180
    .line 181
    iget-object v1, v0, Lm31;->Q:[Lu21;

    .line 182
    .line 183
    aget-object v3, v1, v7

    .line 184
    .line 185
    iget-object v4, v3, Lu21;->f:Lu21;

    .line 186
    .line 187
    if-eqz v4, :cond_9

    .line 188
    .line 189
    aget-object v5, v1, v6

    .line 190
    .line 191
    iget-object v5, v5, Lu21;->f:Lu21;

    .line 192
    .line 193
    if-eqz v5, :cond_9

    .line 194
    .line 195
    invoke-virtual {v0}, Lm31;->x()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    iget-object v1, p0, Lk09;->b:Lm31;

    .line 200
    .line 201
    if-eqz v0, :cond_6

    .line 202
    .line 203
    iget-object v0, v1, Lm31;->Q:[Lu21;

    .line 204
    .line 205
    aget-object v0, v0, v7

    .line 206
    .line 207
    invoke-virtual {v0}, Lu21;->e()I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    iput v0, v9, Lsi1;->f:I

    .line 212
    .line 213
    iget-object p0, p0, Lk09;->b:Lm31;

    .line 214
    .line 215
    iget-object p0, p0, Lm31;->Q:[Lu21;

    .line 216
    .line 217
    aget-object p0, p0, v6

    .line 218
    .line 219
    invoke-virtual {p0}, Lu21;->e()I

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    neg-int p0, p0

    .line 224
    iput p0, v8, Lsi1;->f:I

    .line 225
    .line 226
    return-void

    .line 227
    :cond_6
    iget-object v0, v1, Lm31;->Q:[Lu21;

    .line 228
    .line 229
    aget-object v0, v0, v7

    .line 230
    .line 231
    invoke-static {v0}, Lk09;->h(Lu21;)Lsi1;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    if-eqz v0, :cond_7

    .line 236
    .line 237
    iget-object v1, p0, Lk09;->b:Lm31;

    .line 238
    .line 239
    iget-object v1, v1, Lm31;->Q:[Lu21;

    .line 240
    .line 241
    aget-object v1, v1, v7

    .line 242
    .line 243
    invoke-virtual {v1}, Lu21;->e()I

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    invoke-static {v9, v0, v1}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 248
    .line 249
    .line 250
    :cond_7
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 251
    .line 252
    iget-object v0, v0, Lm31;->Q:[Lu21;

    .line 253
    .line 254
    aget-object v0, v0, v6

    .line 255
    .line 256
    invoke-static {v0}, Lk09;->h(Lu21;)Lsi1;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-eqz v0, :cond_8

    .line 261
    .line 262
    iget-object p0, p0, Lk09;->b:Lm31;

    .line 263
    .line 264
    iget-object p0, p0, Lm31;->Q:[Lu21;

    .line 265
    .line 266
    aget-object p0, p0, v6

    .line 267
    .line 268
    invoke-virtual {p0}, Lu21;->e()I

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    neg-int p0, p0

    .line 273
    invoke-static {v8, v0, p0}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 274
    .line 275
    .line 276
    :cond_8
    iput-boolean v6, v9, Lsi1;->b:Z

    .line 277
    .line 278
    iput-boolean v6, v8, Lsi1;->b:Z

    .line 279
    .line 280
    return-void

    .line 281
    :cond_9
    if-eqz v4, :cond_a

    .line 282
    .line 283
    invoke-static {v3}, Lk09;->h(Lu21;)Lsi1;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    if-eqz v0, :cond_1a

    .line 288
    .line 289
    iget-object p0, p0, Lk09;->b:Lm31;

    .line 290
    .line 291
    iget-object p0, p0, Lm31;->Q:[Lu21;

    .line 292
    .line 293
    aget-object p0, p0, v7

    .line 294
    .line 295
    invoke-virtual {p0}, Lu21;->e()I

    .line 296
    .line 297
    .line 298
    move-result p0

    .line 299
    invoke-static {v9, v0, p0}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 300
    .line 301
    .line 302
    iget p0, v2, Lsi1;->g:I

    .line 303
    .line 304
    invoke-static {v8, v9, p0}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :cond_a
    aget-object v1, v1, v6

    .line 309
    .line 310
    iget-object v3, v1, Lu21;->f:Lu21;

    .line 311
    .line 312
    if-eqz v3, :cond_b

    .line 313
    .line 314
    invoke-static {v1}, Lk09;->h(Lu21;)Lsi1;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    if-eqz v0, :cond_1a

    .line 319
    .line 320
    iget-object p0, p0, Lk09;->b:Lm31;

    .line 321
    .line 322
    iget-object p0, p0, Lm31;->Q:[Lu21;

    .line 323
    .line 324
    aget-object p0, p0, v6

    .line 325
    .line 326
    invoke-virtual {p0}, Lu21;->e()I

    .line 327
    .line 328
    .line 329
    move-result p0

    .line 330
    neg-int p0, p0

    .line 331
    invoke-static {v8, v0, p0}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 332
    .line 333
    .line 334
    iget p0, v2, Lsi1;->g:I

    .line 335
    .line 336
    neg-int p0, p0

    .line 337
    invoke-static {v9, v8, p0}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 338
    .line 339
    .line 340
    return-void

    .line 341
    :cond_b
    instance-of v1, v0, Lxz2;

    .line 342
    .line 343
    if-nez v1, :cond_1a

    .line 344
    .line 345
    iget-object v1, v0, Lm31;->T:Ln31;

    .line 346
    .line 347
    if-eqz v1, :cond_1a

    .line 348
    .line 349
    const/4 v1, 0x7

    .line 350
    invoke-virtual {v0, v1}, Lm31;->i(I)Lu21;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    iget-object v0, v0, Lu21;->f:Lu21;

    .line 355
    .line 356
    if-nez v0, :cond_1a

    .line 357
    .line 358
    iget-object p0, p0, Lk09;->b:Lm31;

    .line 359
    .line 360
    iget-object v0, p0, Lm31;->T:Ln31;

    .line 361
    .line 362
    iget-object v0, v0, Lm31;->d:Ly03;

    .line 363
    .line 364
    iget-object v0, v0, Lk09;->h:Lsi1;

    .line 365
    .line 366
    invoke-virtual {p0}, Lm31;->r()I

    .line 367
    .line 368
    .line 369
    move-result p0

    .line 370
    invoke-static {v9, v0, p0}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 371
    .line 372
    .line 373
    iget p0, v2, Lsi1;->g:I

    .line 374
    .line 375
    invoke-static {v8, v9, p0}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 376
    .line 377
    .line 378
    return-void

    .line 379
    :cond_c
    iget v0, p0, Lk09;->d:I

    .line 380
    .line 381
    if-ne v0, v4, :cond_13

    .line 382
    .line 383
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 384
    .line 385
    iget v10, v0, Lm31;->r:I

    .line 386
    .line 387
    const/4 v11, 0x2

    .line 388
    if-eq v10, v11, :cond_11

    .line 389
    .line 390
    if-eq v10, v4, :cond_d

    .line 391
    .line 392
    goto/16 :goto_1

    .line 393
    .line 394
    :cond_d
    iget v10, v0, Lm31;->s:I

    .line 395
    .line 396
    if-ne v10, v4, :cond_10

    .line 397
    .line 398
    iput-object p0, v9, Lsi1;->a:Lk09;

    .line 399
    .line 400
    iput-object p0, v8, Lsi1;->a:Lk09;

    .line 401
    .line 402
    iget-object v4, v0, Lm31;->e:Lkv8;

    .line 403
    .line 404
    iget-object v10, v4, Lk09;->h:Lsi1;

    .line 405
    .line 406
    iput-object p0, v10, Lsi1;->a:Lk09;

    .line 407
    .line 408
    iget-object v4, v4, Lk09;->i:Lsi1;

    .line 409
    .line 410
    iput-object p0, v4, Lsi1;->a:Lk09;

    .line 411
    .line 412
    iput-object p0, v2, Lsi1;->a:Lk09;

    .line 413
    .line 414
    invoke-virtual {v0}, Lm31;->y()Z

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    if-eqz v0, :cond_e

    .line 419
    .line 420
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 421
    .line 422
    iget-object v0, v0, Lm31;->e:Lkv8;

    .line 423
    .line 424
    iget-object v0, v0, Lk09;->e:Lzo1;

    .line 425
    .line 426
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 430
    .line 431
    iget-object v0, v0, Lm31;->e:Lkv8;

    .line 432
    .line 433
    iget-object v0, v0, Lk09;->e:Lzo1;

    .line 434
    .line 435
    iget-object v0, v0, Lsi1;->k:Ljava/util/ArrayList;

    .line 436
    .line 437
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 441
    .line 442
    iget-object v0, v0, Lm31;->e:Lkv8;

    .line 443
    .line 444
    iget-object v1, v0, Lk09;->e:Lzo1;

    .line 445
    .line 446
    iput-object p0, v1, Lsi1;->a:Lk09;

    .line 447
    .line 448
    iget-object v0, v0, Lk09;->h:Lsi1;

    .line 449
    .line 450
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 454
    .line 455
    iget-object v0, v0, Lm31;->e:Lkv8;

    .line 456
    .line 457
    iget-object v0, v0, Lk09;->i:Lsi1;

    .line 458
    .line 459
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 463
    .line 464
    iget-object v0, v0, Lm31;->e:Lkv8;

    .line 465
    .line 466
    iget-object v0, v0, Lk09;->h:Lsi1;

    .line 467
    .line 468
    iget-object v0, v0, Lsi1;->k:Ljava/util/ArrayList;

    .line 469
    .line 470
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 474
    .line 475
    iget-object v0, v0, Lm31;->e:Lkv8;

    .line 476
    .line 477
    iget-object v0, v0, Lk09;->i:Lsi1;

    .line 478
    .line 479
    iget-object v0, v0, Lsi1;->k:Ljava/util/ArrayList;

    .line 480
    .line 481
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    goto/16 :goto_1

    .line 485
    .line 486
    :cond_e
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 487
    .line 488
    invoke-virtual {v0}, Lm31;->x()Z

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    iget-object v3, p0, Lk09;->b:Lm31;

    .line 493
    .line 494
    if-eqz v0, :cond_f

    .line 495
    .line 496
    iget-object v0, v3, Lm31;->e:Lkv8;

    .line 497
    .line 498
    iget-object v0, v0, Lk09;->e:Lzo1;

    .line 499
    .line 500
    iget-object v0, v0, Lsi1;->l:Ljava/util/ArrayList;

    .line 501
    .line 502
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 506
    .line 507
    iget-object v0, v0, Lm31;->e:Lkv8;

    .line 508
    .line 509
    iget-object v0, v0, Lk09;->e:Lzo1;

    .line 510
    .line 511
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    goto :goto_1

    .line 515
    :cond_f
    iget-object v0, v3, Lm31;->e:Lkv8;

    .line 516
    .line 517
    iget-object v0, v0, Lk09;->e:Lzo1;

    .line 518
    .line 519
    iget-object v0, v0, Lsi1;->l:Ljava/util/ArrayList;

    .line 520
    .line 521
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    goto :goto_1

    .line 525
    :cond_10
    iget-object v0, v0, Lm31;->e:Lkv8;

    .line 526
    .line 527
    iget-object v0, v0, Lk09;->e:Lzo1;

    .line 528
    .line 529
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    iget-object v0, v0, Lsi1;->k:Ljava/util/ArrayList;

    .line 533
    .line 534
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 538
    .line 539
    iget-object v0, v0, Lm31;->e:Lkv8;

    .line 540
    .line 541
    iget-object v0, v0, Lk09;->h:Lsi1;

    .line 542
    .line 543
    iget-object v0, v0, Lsi1;->k:Ljava/util/ArrayList;

    .line 544
    .line 545
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 549
    .line 550
    iget-object v0, v0, Lm31;->e:Lkv8;

    .line 551
    .line 552
    iget-object v0, v0, Lk09;->i:Lsi1;

    .line 553
    .line 554
    iget-object v0, v0, Lsi1;->k:Ljava/util/ArrayList;

    .line 555
    .line 556
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    iput-boolean v6, v2, Lsi1;->b:Z

    .line 560
    .line 561
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    iget-object v0, v9, Lsi1;->l:Ljava/util/ArrayList;

    .line 568
    .line 569
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    iget-object v0, v8, Lsi1;->l:Ljava/util/ArrayList;

    .line 573
    .line 574
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    goto :goto_1

    .line 578
    :cond_11
    iget-object v0, v0, Lm31;->T:Ln31;

    .line 579
    .line 580
    if-nez v0, :cond_12

    .line 581
    .line 582
    goto :goto_1

    .line 583
    :cond_12
    iget-object v0, v0, Lm31;->e:Lkv8;

    .line 584
    .line 585
    iget-object v0, v0, Lk09;->e:Lzo1;

    .line 586
    .line 587
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    iget-object v0, v0, Lsi1;->k:Ljava/util/ArrayList;

    .line 591
    .line 592
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    iput-boolean v6, v2, Lsi1;->b:Z

    .line 596
    .line 597
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    :cond_13
    :goto_1
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 604
    .line 605
    iget-object v1, v0, Lm31;->Q:[Lu21;

    .line 606
    .line 607
    aget-object v3, v1, v7

    .line 608
    .line 609
    iget-object v4, v3, Lu21;->f:Lu21;

    .line 610
    .line 611
    if-eqz v4, :cond_17

    .line 612
    .line 613
    aget-object v10, v1, v6

    .line 614
    .line 615
    iget-object v10, v10, Lu21;->f:Lu21;

    .line 616
    .line 617
    if-eqz v10, :cond_17

    .line 618
    .line 619
    invoke-virtual {v0}, Lm31;->x()Z

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    iget-object v1, p0, Lk09;->b:Lm31;

    .line 624
    .line 625
    if-eqz v0, :cond_14

    .line 626
    .line 627
    iget-object v0, v1, Lm31;->Q:[Lu21;

    .line 628
    .line 629
    aget-object v0, v0, v7

    .line 630
    .line 631
    invoke-virtual {v0}, Lu21;->e()I

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    iput v0, v9, Lsi1;->f:I

    .line 636
    .line 637
    iget-object p0, p0, Lk09;->b:Lm31;

    .line 638
    .line 639
    iget-object p0, p0, Lm31;->Q:[Lu21;

    .line 640
    .line 641
    aget-object p0, p0, v6

    .line 642
    .line 643
    invoke-virtual {p0}, Lu21;->e()I

    .line 644
    .line 645
    .line 646
    move-result p0

    .line 647
    neg-int p0, p0

    .line 648
    iput p0, v8, Lsi1;->f:I

    .line 649
    .line 650
    return-void

    .line 651
    :cond_14
    iget-object v0, v1, Lm31;->Q:[Lu21;

    .line 652
    .line 653
    aget-object v0, v0, v7

    .line 654
    .line 655
    invoke-static {v0}, Lk09;->h(Lu21;)Lsi1;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    iget-object v1, p0, Lk09;->b:Lm31;

    .line 660
    .line 661
    iget-object v1, v1, Lm31;->Q:[Lu21;

    .line 662
    .line 663
    aget-object v1, v1, v6

    .line 664
    .line 665
    invoke-static {v1}, Lk09;->h(Lu21;)Lsi1;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    if-eqz v0, :cond_15

    .line 670
    .line 671
    invoke-virtual {v0, p0}, Lsi1;->b(Lk09;)V

    .line 672
    .line 673
    .line 674
    :cond_15
    if-eqz v1, :cond_16

    .line 675
    .line 676
    invoke-virtual {v1, p0}, Lsi1;->b(Lk09;)V

    .line 677
    .line 678
    .line 679
    :cond_16
    iput v5, p0, Lk09;->j:I

    .line 680
    .line 681
    return-void

    .line 682
    :cond_17
    if-eqz v4, :cond_18

    .line 683
    .line 684
    invoke-static {v3}, Lk09;->h(Lu21;)Lsi1;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    if-eqz v0, :cond_1a

    .line 689
    .line 690
    iget-object v1, p0, Lk09;->b:Lm31;

    .line 691
    .line 692
    iget-object v1, v1, Lm31;->Q:[Lu21;

    .line 693
    .line 694
    aget-object v1, v1, v7

    .line 695
    .line 696
    invoke-virtual {v1}, Lu21;->e()I

    .line 697
    .line 698
    .line 699
    move-result v1

    .line 700
    invoke-static {v9, v0, v1}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {p0, v8, v9, v6, v2}, Lk09;->c(Lsi1;Lsi1;ILzo1;)V

    .line 704
    .line 705
    .line 706
    return-void

    .line 707
    :cond_18
    aget-object v1, v1, v6

    .line 708
    .line 709
    iget-object v3, v1, Lu21;->f:Lu21;

    .line 710
    .line 711
    if-eqz v3, :cond_19

    .line 712
    .line 713
    invoke-static {v1}, Lk09;->h(Lu21;)Lsi1;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    if-eqz v0, :cond_1a

    .line 718
    .line 719
    iget-object v1, p0, Lk09;->b:Lm31;

    .line 720
    .line 721
    iget-object v1, v1, Lm31;->Q:[Lu21;

    .line 722
    .line 723
    aget-object v1, v1, v6

    .line 724
    .line 725
    invoke-virtual {v1}, Lu21;->e()I

    .line 726
    .line 727
    .line 728
    move-result v1

    .line 729
    neg-int v1, v1

    .line 730
    invoke-static {v8, v0, v1}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 731
    .line 732
    .line 733
    const/4 v0, -0x1

    .line 734
    invoke-virtual {p0, v9, v8, v0, v2}, Lk09;->c(Lsi1;Lsi1;ILzo1;)V

    .line 735
    .line 736
    .line 737
    return-void

    .line 738
    :cond_19
    instance-of v1, v0, Lxz2;

    .line 739
    .line 740
    if-nez v1, :cond_1a

    .line 741
    .line 742
    iget-object v1, v0, Lm31;->T:Ln31;

    .line 743
    .line 744
    if-eqz v1, :cond_1a

    .line 745
    .line 746
    iget-object v1, v1, Lm31;->d:Ly03;

    .line 747
    .line 748
    iget-object v1, v1, Lk09;->h:Lsi1;

    .line 749
    .line 750
    invoke-virtual {v0}, Lm31;->r()I

    .line 751
    .line 752
    .line 753
    move-result v0

    .line 754
    invoke-static {v9, v1, v0}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 755
    .line 756
    .line 757
    invoke-virtual {p0, v8, v9, v6, v2}, Lk09;->c(Lsi1;Lsi1;ILzo1;)V

    .line 758
    .line 759
    .line 760
    :cond_1a
    return-void
.end method

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lav2;

    .line 5
    .line 6
    iget v1, v1, Lav2;->u0:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    iget-object p0, p0, Lk09;->h:Lsi1;

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget p0, p0, Lsi1;->g:I

    .line 14
    .line 15
    iput p0, v0, Lm31;->Y:I

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget p0, p0, Lsi1;->g:I

    .line 19
    .line 20
    iput p0, v0, Lm31;->Z:I

    .line 21
    .line 22
    return-void
.end method

.method public f()V
    .locals 0

    .line 1
    iget-object p0, p0, Lk09;->h:Lsi1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lsi1;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(II)I
    .locals 0

    .line 1
    iget-object p0, p0, Lk09;->b:Lm31;

    .line 2
    .line 3
    if-nez p2, :cond_1

    .line 4
    .line 5
    iget p2, p0, Lm31;->v:I

    .line 6
    .line 7
    iget p0, p0, Lm31;->u:I

    .line 8
    .line 9
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-lez p2, :cond_0

    .line 14
    .line 15
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    :cond_0
    if-eq p0, p1, :cond_3

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    iget p2, p0, Lm31;->y:I

    .line 23
    .line 24
    iget p0, p0, Lm31;->x:I

    .line 25
    .line 26
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-lez p2, :cond_2

    .line 31
    .line 32
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    :cond_2
    if-eq p0, p1, :cond_3

    .line 37
    .line 38
    return p0

    .line 39
    :cond_3
    return p1
.end method

.method public j()J
    .locals 2

    .line 1
    iget-object p0, p0, Lk09;->e:Lzo1;

    .line 2
    .line 3
    iget-boolean v0, p0, Lsi1;->j:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p0, p0, Lsi1;->g:I

    .line 8
    .line 9
    int-to-long v0, p0

    .line 10
    return-wide v0

    .line 11
    :cond_0
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    return-wide v0
.end method

.method public k()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final l(Lu21;Lu21;I)V
    .locals 11

    .line 1
    invoke-static {p1}, Lk09;->h(Lu21;)Lsi1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p2}, Lk09;->h(Lu21;)Lsi1;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-boolean v2, v0, Lsi1;->j:Z

    .line 10
    .line 11
    if-eqz v2, :cond_f

    .line 12
    .line 13
    iget-boolean v2, v1, Lsi1;->j:Z

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto/16 :goto_5

    .line 18
    .line 19
    :cond_0
    iget v2, v0, Lsi1;->g:I

    .line 20
    .line 21
    invoke-virtual {p1}, Lu21;->e()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    add-int/2addr p1, v2

    .line 26
    iget v2, v1, Lsi1;->g:I

    .line 27
    .line 28
    invoke-virtual {p2}, Lu21;->e()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    sub-int/2addr v2, p2

    .line 33
    sub-int p2, v2, p1

    .line 34
    .line 35
    iget-object v3, p0, Lk09;->e:Lzo1;

    .line 36
    .line 37
    iget-boolean v4, v3, Lsi1;->j:Z

    .line 38
    .line 39
    const/high16 v5, 0x3f000000    # 0.5f

    .line 40
    .line 41
    if-nez v4, :cond_a

    .line 42
    .line 43
    iget v4, p0, Lk09;->d:I

    .line 44
    .line 45
    const/4 v6, 0x3

    .line 46
    if-ne v4, v6, :cond_a

    .line 47
    .line 48
    iget v4, p0, Lk09;->a:I

    .line 49
    .line 50
    if-eqz v4, :cond_9

    .line 51
    .line 52
    const/4 v7, 0x1

    .line 53
    if-eq v4, v7, :cond_8

    .line 54
    .line 55
    const/4 v8, 0x2

    .line 56
    if-eq v4, v8, :cond_5

    .line 57
    .line 58
    if-eq v4, v6, :cond_1

    .line 59
    .line 60
    goto/16 :goto_3

    .line 61
    .line 62
    :cond_1
    iget-object v4, p0, Lk09;->b:Lm31;

    .line 63
    .line 64
    iget-object v8, v4, Lm31;->d:Ly03;

    .line 65
    .line 66
    iget v9, v8, Lk09;->d:I

    .line 67
    .line 68
    if-ne v9, v6, :cond_2

    .line 69
    .line 70
    iget v9, v8, Lk09;->a:I

    .line 71
    .line 72
    if-ne v9, v6, :cond_2

    .line 73
    .line 74
    iget-object v9, v4, Lm31;->e:Lkv8;

    .line 75
    .line 76
    iget v10, v9, Lk09;->d:I

    .line 77
    .line 78
    if-ne v10, v6, :cond_2

    .line 79
    .line 80
    iget v9, v9, Lk09;->a:I

    .line 81
    .line 82
    if-ne v9, v6, :cond_2

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_2
    if-nez p3, :cond_3

    .line 86
    .line 87
    iget-object v8, v4, Lm31;->e:Lkv8;

    .line 88
    .line 89
    :cond_3
    iget-object v6, v8, Lk09;->e:Lzo1;

    .line 90
    .line 91
    iget-boolean v8, v6, Lsi1;->j:Z

    .line 92
    .line 93
    if-eqz v8, :cond_a

    .line 94
    .line 95
    iget v4, v4, Lm31;->W:F

    .line 96
    .line 97
    iget v6, v6, Lsi1;->g:I

    .line 98
    .line 99
    if-ne p3, v7, :cond_4

    .line 100
    .line 101
    int-to-float v6, v6

    .line 102
    div-float/2addr v6, v4

    .line 103
    add-float/2addr v6, v5

    .line 104
    float-to-int v4, v6

    .line 105
    goto :goto_0

    .line 106
    :cond_4
    int-to-float v6, v6

    .line 107
    mul-float/2addr v4, v6

    .line 108
    add-float/2addr v4, v5

    .line 109
    float-to-int v4, v4

    .line 110
    :goto_0
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    iget-object v4, p0, Lk09;->b:Lm31;

    .line 115
    .line 116
    iget-object v6, v4, Lm31;->T:Ln31;

    .line 117
    .line 118
    if-eqz v6, :cond_a

    .line 119
    .line 120
    if-nez p3, :cond_6

    .line 121
    .line 122
    iget-object v6, v6, Lm31;->d:Ly03;

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_6
    iget-object v6, v6, Lm31;->e:Lkv8;

    .line 126
    .line 127
    :goto_1
    iget-object v6, v6, Lk09;->e:Lzo1;

    .line 128
    .line 129
    iget-boolean v7, v6, Lsi1;->j:Z

    .line 130
    .line 131
    if-eqz v7, :cond_a

    .line 132
    .line 133
    if-nez p3, :cond_7

    .line 134
    .line 135
    iget v4, v4, Lm31;->w:F

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_7
    iget v4, v4, Lm31;->z:F

    .line 139
    .line 140
    :goto_2
    iget v6, v6, Lsi1;->g:I

    .line 141
    .line 142
    int-to-float v6, v6

    .line 143
    mul-float/2addr v6, v4

    .line 144
    add-float/2addr v6, v5

    .line 145
    float-to-int v4, v6

    .line 146
    invoke-virtual {p0, v4, p3}, Lk09;->g(II)I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_8
    iget v4, v3, Lzo1;->m:I

    .line 155
    .line 156
    invoke-virtual {p0, v4, p3}, Lk09;->g(II)I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    invoke-static {v4, p2}, Ljava/lang/Math;->min(II)I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_9
    invoke-virtual {p0, p2, p3}, Lk09;->g(II)I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    invoke-virtual {v3, v4}, Lzo1;->d(I)V

    .line 173
    .line 174
    .line 175
    :cond_a
    :goto_3
    iget-boolean v4, v3, Lsi1;->j:Z

    .line 176
    .line 177
    if-nez v4, :cond_b

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_b
    iget v4, v3, Lsi1;->g:I

    .line 181
    .line 182
    iget-object v6, p0, Lk09;->i:Lsi1;

    .line 183
    .line 184
    iget-object v7, p0, Lk09;->h:Lsi1;

    .line 185
    .line 186
    if-ne v4, p2, :cond_c

    .line 187
    .line 188
    invoke-virtual {v7, p1}, Lsi1;->d(I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v6, v2}, Lsi1;->d(I)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :cond_c
    iget-object p0, p0, Lk09;->b:Lm31;

    .line 196
    .line 197
    if-nez p3, :cond_d

    .line 198
    .line 199
    iget p0, p0, Lm31;->d0:F

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_d
    iget p0, p0, Lm31;->e0:F

    .line 203
    .line 204
    :goto_4
    if-ne v0, v1, :cond_e

    .line 205
    .line 206
    iget p1, v0, Lsi1;->g:I

    .line 207
    .line 208
    iget v2, v1, Lsi1;->g:I

    .line 209
    .line 210
    move p0, v5

    .line 211
    :cond_e
    sub-int/2addr v2, p1

    .line 212
    sub-int/2addr v2, v4

    .line 213
    int-to-float p1, p1

    .line 214
    add-float/2addr p1, v5

    .line 215
    int-to-float p2, v2

    .line 216
    mul-float/2addr p2, p0

    .line 217
    add-float/2addr p2, p1

    .line 218
    float-to-int p0, p2

    .line 219
    invoke-virtual {v7, p0}, Lsi1;->d(I)V

    .line 220
    .line 221
    .line 222
    iget p0, v7, Lsi1;->g:I

    .line 223
    .line 224
    iget p1, v3, Lsi1;->g:I

    .line 225
    .line 226
    add-int/2addr p0, p1

    .line 227
    invoke-virtual {v6, p0}, Lsi1;->d(I)V

    .line 228
    .line 229
    .line 230
    :cond_f
    :goto_5
    return-void
.end method
