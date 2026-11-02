.class public final Lmc8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lxr4;


# instance fields
.field public final a:Lre2;

.field public final b:F


# direct methods
.method public constructor <init>(Lre2;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmc8;->a:Lre2;

    .line 5
    .line 6
    iput p2, p0, Lmc8;->b:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Lzr4;Ljava/util/List;J)Lyr4;
    .locals 21

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    const/4 v4, 0x0

    .line 14
    const-string v5, "Collection contains no element matching the predicate."

    .line 15
    .line 16
    if-ge v3, v1, :cond_b

    .line 17
    .line 18
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    check-cast v6, Ltr4;

    .line 23
    .line 24
    invoke-static {v6}, Lx97;->z(Ltr4;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v9

    .line 28
    const-string v10, "navigationIcon"

    .line 29
    .line 30
    invoke-static {v9, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    if-eqz v9, :cond_a

    .line 35
    .line 36
    const/4 v15, 0x0

    .line 37
    const/16 v16, 0xe

    .line 38
    .line 39
    const/4 v12, 0x0

    .line 40
    const/4 v13, 0x0

    .line 41
    const/4 v14, 0x0

    .line 42
    move-wide/from16 v10, p3

    .line 43
    .line 44
    invoke-static/range {v10 .. v16}, Lq31;->a(JIIIII)J

    .line 45
    .line 46
    .line 47
    move-result-wide v12

    .line 48
    invoke-interface {v6, v12, v13}, Ltr4;->o(J)Leo5;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    move v6, v2

    .line 57
    :goto_1
    if-ge v6, v3, :cond_9

    .line 58
    .line 59
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    check-cast v9, Ltr4;

    .line 64
    .line 65
    invoke-static {v9}, Lx97;->z(Ltr4;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    const-string v11, "actionIcons"

    .line 70
    .line 71
    invoke-static {v10, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-eqz v10, :cond_8

    .line 76
    .line 77
    const/16 v19, 0x0

    .line 78
    .line 79
    const/16 v20, 0xe

    .line 80
    .line 81
    const/16 v16, 0x0

    .line 82
    .line 83
    const/16 v17, 0x0

    .line 84
    .line 85
    const/16 v18, 0x0

    .line 86
    .line 87
    move-wide/from16 v14, p3

    .line 88
    .line 89
    invoke-static/range {v14 .. v20}, Lq31;->a(JIIIII)J

    .line 90
    .line 91
    .line 92
    move-result-wide v10

    .line 93
    invoke-interface {v9, v10, v11}, Ltr4;->o(J)Leo5;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-static/range {p3 .. p4}, Lq31;->h(J)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    const v9, 0x7fffffff

    .line 102
    .line 103
    .line 104
    if-ne v6, v9, :cond_1

    .line 105
    .line 106
    invoke-static/range {p3 .. p4}, Lq31;->h(J)I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    :cond_0
    :goto_2
    move/from16 v17, v6

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_1
    invoke-static/range {p3 .. p4}, Lq31;->h(J)I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    iget v10, v1, Leo5;->X:I

    .line 118
    .line 119
    sub-int/2addr v6, v10

    .line 120
    iget v10, v3, Leo5;->X:I

    .line 121
    .line 122
    sub-int/2addr v6, v10

    .line 123
    if-gez v6, :cond_0

    .line 124
    .line 125
    move v6, v2

    .line 126
    goto :goto_2

    .line 127
    :goto_3
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    move v10, v2

    .line 132
    :goto_4
    if-ge v10, v6, :cond_7

    .line 133
    .line 134
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    check-cast v11, Ltr4;

    .line 139
    .line 140
    invoke-static {v11}, Lx97;->z(Ltr4;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    const-string v13, "title"

    .line 145
    .line 146
    invoke-static {v12, v13}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    if-eqz v12, :cond_6

    .line 151
    .line 152
    const/16 v19, 0x0

    .line 153
    .line 154
    const/16 v20, 0xc

    .line 155
    .line 156
    const/16 v16, 0x0

    .line 157
    .line 158
    const/16 v18, 0x0

    .line 159
    .line 160
    move-wide/from16 v14, p3

    .line 161
    .line 162
    invoke-static/range {v14 .. v20}, Lq31;->a(JIIIII)J

    .line 163
    .line 164
    .line 165
    move-result-wide v4

    .line 166
    invoke-interface {v11, v4, v5}, Ltr4;->o(J)Leo5;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    sget-object v4, Lu8;->b:Lt03;

    .line 171
    .line 172
    invoke-virtual {v0, v4}, Leo5;->N(Lr8;)I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    const/high16 v6, -0x80000000

    .line 177
    .line 178
    if-eq v5, v6, :cond_2

    .line 179
    .line 180
    invoke-virtual {v0, v4}, Leo5;->N(Lr8;)I

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    goto :goto_5

    .line 185
    :cond_2
    move v4, v2

    .line 186
    :goto_5
    iget-object v5, v8, Lmc8;->a:Lre2;

    .line 187
    .line 188
    invoke-interface {v5}, Lre2;->invoke()F

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 193
    .line 194
    .line 195
    move-result v6

    .line 196
    if-eqz v6, :cond_3

    .line 197
    .line 198
    move v5, v2

    .line 199
    goto :goto_6

    .line 200
    :cond_3
    invoke-static {v5}, Lnr4;->O(F)I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    :goto_6
    iget v6, v8, Lmc8;->b:F

    .line 205
    .line 206
    invoke-interface {v7, v6}, Lfi1;->x0(F)I

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    iget v10, v0, Leo5;->Y:I

    .line 211
    .line 212
    invoke-static {v6, v10}, Ljava/lang/Math;->max(II)I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    invoke-static/range {p3 .. p4}, Lq31;->g(J)I

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    if-ne v6, v9, :cond_4

    .line 221
    .line 222
    move v2, v10

    .line 223
    goto :goto_7

    .line 224
    :cond_4
    add-int/2addr v5, v10

    .line 225
    if-gez v5, :cond_5

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_5
    move v2, v5

    .line 229
    :goto_7
    invoke-static/range {p3 .. p4}, Lq31;->h(J)I

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    move v9, v4

    .line 234
    move-object v4, v3

    .line 235
    move-object v3, v0

    .line 236
    new-instance v0, Llc8;

    .line 237
    .line 238
    move-wide/from16 v5, p3

    .line 239
    .line 240
    invoke-direct/range {v0 .. v10}, Llc8;-><init>(Leo5;ILeo5;Leo5;JLzr4;Lmc8;II)V

    .line 241
    .line 242
    .line 243
    sget-object v1, Le02;->X:Le02;

    .line 244
    .line 245
    invoke-interface {v7, v11, v2, v1, v0}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    return-object v0

    .line 250
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 251
    .line 252
    move-object/from16 v8, p0

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_7
    invoke-static {v5}, Ltb4;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 256
    .line 257
    .line 258
    invoke-static {}, Lb61;->n()V

    .line 259
    .line 260
    .line 261
    return-object v4

    .line 262
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 263
    .line 264
    move-object/from16 v8, p0

    .line 265
    .line 266
    goto/16 :goto_1

    .line 267
    .line 268
    :cond_9
    invoke-static {v5}, Ltb4;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 269
    .line 270
    .line 271
    invoke-static {}, Lb61;->n()V

    .line 272
    .line 273
    .line 274
    return-object v4

    .line 275
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 276
    .line 277
    move-object/from16 v8, p0

    .line 278
    .line 279
    goto/16 :goto_0

    .line 280
    .line 281
    :cond_b
    invoke-static {v5}, Ltb4;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 282
    .line 283
    .line 284
    invoke-static {}, Lb61;->n()V

    .line 285
    .line 286
    .line 287
    return-object v4
.end method

.method public final d(Li55;Ljava/util/List;I)I
    .locals 5

    .line 1
    iget p0, p0, Lmc8;->b:F

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lfi1;->x0(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ltr4;

    .line 21
    .line 22
    invoke-interface {p1, p3}, Ltr4;->a(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x1

    .line 35
    sub-int/2addr v1, v2

    .line 36
    if-gt v2, v1, :cond_2

    .line 37
    .line 38
    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ltr4;

    .line 43
    .line 44
    invoke-interface {v3, p3}, Ltr4;->a(I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-lez v4, :cond_1

    .line 57
    .line 58
    move-object p1, v3

    .line 59
    :cond_1
    if-eq v2, v1, :cond_2

    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    :cond_3
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    return p0
.end method

.method public final f(Li55;Ljava/util/List;I)I
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, 0x0

    .line 6
    move v0, p1

    .line 7
    :goto_0
    if-ge p1, p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ltr4;

    .line 14
    .line 15
    invoke-interface {v1, p3}, Ltr4;->k(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return v0
.end method

.method public final g(Li55;Ljava/util/List;I)I
    .locals 5

    .line 1
    iget p0, p0, Lmc8;->b:F

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lfi1;->x0(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ltr4;

    .line 21
    .line 22
    invoke-interface {p1, p3}, Ltr4;->K(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x1

    .line 35
    sub-int/2addr v1, v2

    .line 36
    if-gt v2, v1, :cond_2

    .line 37
    .line 38
    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ltr4;

    .line 43
    .line 44
    invoke-interface {v3, p3}, Ltr4;->K(I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-lez v4, :cond_1

    .line 57
    .line 58
    move-object p1, v3

    .line 59
    :cond_1
    if-eq v2, v1, :cond_2

    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    :cond_3
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    return p0
.end method

.method public final i(Li55;Ljava/util/List;I)I
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, 0x0

    .line 6
    move v0, p1

    .line 7
    :goto_0
    if-ge p1, p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ltr4;

    .line 14
    .line 15
    invoke-interface {v1, p3}, Ltr4;->m(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return v0
.end method
