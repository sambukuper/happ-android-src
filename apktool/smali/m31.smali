.class public Lm31;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public A:I

.field public B:F

.field public final C:[I

.field public D:F

.field public E:Z

.field public F:Z

.field public G:I

.field public H:I

.field public final I:Lu21;

.field public final J:Lu21;

.field public final K:Lu21;

.field public final L:Lu21;

.field public final M:Lu21;

.field public final N:Lu21;

.field public final O:Lu21;

.field public final P:Lu21;

.field public final Q:[Lu21;

.field public final R:Ljava/util/ArrayList;

.field public final S:[Z

.field public T:Ln31;

.field public U:I

.field public V:I

.field public W:F

.field public X:I

.field public Y:I

.field public Z:I

.field public a:Z

.field public a0:I

.field public b:Lxo0;

.field public b0:I

.field public c:Lxo0;

.field public c0:I

.field public d:Ly03;

.field public d0:F

.field public e:Lkv8;

.field public e0:F

.field public final f:[Z

.field public f0:Landroid/view/View;

.field public g:Z

.field public g0:I

.field public h:I

.field public h0:Ljava/lang/String;

.field public i:I

.field public i0:I

.field public j:Ljava/lang/String;

.field public j0:I

.field public k:Z

.field public final k0:[F

.field public l:Z

.field public final l0:[Lm31;

.field public m:Z

.field public final m0:[Lm31;

.field public n:Z

.field public n0:I

.field public o:I

.field public o0:I

.field public p:I

.field public final p0:[I

.field public q:I

.field public r:I

.field public s:I

.field public final t:[I

.field public u:I

.field public v:I

.field public w:F

.field public x:I

.field public y:I

.field public z:F


# direct methods
.method public constructor <init>()V
    .locals 15

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lm31;->a:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lm31;->d:Ly03;

    .line 9
    .line 10
    iput-object v1, p0, Lm31;->e:Lkv8;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    new-array v3, v2, [Z

    .line 14
    .line 15
    fill-array-data v3, :array_0

    .line 16
    .line 17
    .line 18
    iput-object v3, p0, Lm31;->f:[Z

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    iput-boolean v3, p0, Lm31;->g:Z

    .line 22
    .line 23
    const/4 v4, -0x1

    .line 24
    iput v4, p0, Lm31;->h:I

    .line 25
    .line 26
    iput v4, p0, Lm31;->i:I

    .line 27
    .line 28
    new-instance v5, Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-boolean v0, p0, Lm31;->k:Z

    .line 34
    .line 35
    iput-boolean v0, p0, Lm31;->l:Z

    .line 36
    .line 37
    iput-boolean v0, p0, Lm31;->m:Z

    .line 38
    .line 39
    iput-boolean v0, p0, Lm31;->n:Z

    .line 40
    .line 41
    iput v4, p0, Lm31;->o:I

    .line 42
    .line 43
    iput v4, p0, Lm31;->p:I

    .line 44
    .line 45
    iput v0, p0, Lm31;->q:I

    .line 46
    .line 47
    iput v0, p0, Lm31;->r:I

    .line 48
    .line 49
    iput v0, p0, Lm31;->s:I

    .line 50
    .line 51
    new-array v5, v2, [I

    .line 52
    .line 53
    iput-object v5, p0, Lm31;->t:[I

    .line 54
    .line 55
    iput v0, p0, Lm31;->u:I

    .line 56
    .line 57
    iput v0, p0, Lm31;->v:I

    .line 58
    .line 59
    const/high16 v5, 0x3f800000    # 1.0f

    .line 60
    .line 61
    iput v5, p0, Lm31;->w:F

    .line 62
    .line 63
    iput v0, p0, Lm31;->x:I

    .line 64
    .line 65
    iput v0, p0, Lm31;->y:I

    .line 66
    .line 67
    iput v5, p0, Lm31;->z:F

    .line 68
    .line 69
    iput v4, p0, Lm31;->A:I

    .line 70
    .line 71
    iput v5, p0, Lm31;->B:F

    .line 72
    .line 73
    const v5, 0x7fffffff

    .line 74
    .line 75
    .line 76
    filled-new-array {v5, v5}, [I

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    iput-object v5, p0, Lm31;->C:[I

    .line 81
    .line 82
    const/high16 v5, 0x7fc00000    # Float.NaN

    .line 83
    .line 84
    iput v5, p0, Lm31;->D:F

    .line 85
    .line 86
    iput-boolean v0, p0, Lm31;->E:Z

    .line 87
    .line 88
    iput-boolean v0, p0, Lm31;->F:Z

    .line 89
    .line 90
    iput v0, p0, Lm31;->G:I

    .line 91
    .line 92
    iput v0, p0, Lm31;->H:I

    .line 93
    .line 94
    new-instance v6, Lu21;

    .line 95
    .line 96
    invoke-direct {v6, p0, v2}, Lu21;-><init>(Lm31;I)V

    .line 97
    .line 98
    .line 99
    iput-object v6, p0, Lm31;->I:Lu21;

    .line 100
    .line 101
    new-instance v8, Lu21;

    .line 102
    .line 103
    const/4 v5, 0x3

    .line 104
    invoke-direct {v8, p0, v5}, Lu21;-><init>(Lm31;I)V

    .line 105
    .line 106
    .line 107
    iput-object v8, p0, Lm31;->J:Lu21;

    .line 108
    .line 109
    new-instance v7, Lu21;

    .line 110
    .line 111
    const/4 v5, 0x4

    .line 112
    invoke-direct {v7, p0, v5}, Lu21;-><init>(Lm31;I)V

    .line 113
    .line 114
    .line 115
    iput-object v7, p0, Lm31;->K:Lu21;

    .line 116
    .line 117
    new-instance v9, Lu21;

    .line 118
    .line 119
    const/4 v5, 0x5

    .line 120
    invoke-direct {v9, p0, v5}, Lu21;-><init>(Lm31;I)V

    .line 121
    .line 122
    .line 123
    iput-object v9, p0, Lm31;->L:Lu21;

    .line 124
    .line 125
    new-instance v10, Lu21;

    .line 126
    .line 127
    const/4 v5, 0x6

    .line 128
    invoke-direct {v10, p0, v5}, Lu21;-><init>(Lm31;I)V

    .line 129
    .line 130
    .line 131
    iput-object v10, p0, Lm31;->M:Lu21;

    .line 132
    .line 133
    new-instance v5, Lu21;

    .line 134
    .line 135
    const/16 v11, 0x8

    .line 136
    .line 137
    invoke-direct {v5, p0, v11}, Lu21;-><init>(Lm31;I)V

    .line 138
    .line 139
    .line 140
    iput-object v5, p0, Lm31;->N:Lu21;

    .line 141
    .line 142
    new-instance v12, Lu21;

    .line 143
    .line 144
    const/16 v11, 0x9

    .line 145
    .line 146
    invoke-direct {v12, p0, v11}, Lu21;-><init>(Lm31;I)V

    .line 147
    .line 148
    .line 149
    iput-object v12, p0, Lm31;->O:Lu21;

    .line 150
    .line 151
    new-instance v11, Lu21;

    .line 152
    .line 153
    const/4 v13, 0x7

    .line 154
    invoke-direct {v11, p0, v13}, Lu21;-><init>(Lm31;I)V

    .line 155
    .line 156
    .line 157
    iput-object v11, p0, Lm31;->P:Lu21;

    .line 158
    .line 159
    filled-new-array/range {v6 .. v11}, [Lu21;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    iput-object v13, p0, Lm31;->Q:[Lu21;

    .line 164
    .line 165
    new-instance v13, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    iput-object v13, p0, Lm31;->R:Ljava/util/ArrayList;

    .line 171
    .line 172
    new-array v14, v2, [Z

    .line 173
    .line 174
    iput-object v14, p0, Lm31;->S:[Z

    .line 175
    .line 176
    filled-new-array {v3, v3}, [I

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    iput-object v3, p0, Lm31;->p0:[I

    .line 181
    .line 182
    iput-object v1, p0, Lm31;->T:Ln31;

    .line 183
    .line 184
    iput v0, p0, Lm31;->U:I

    .line 185
    .line 186
    iput v0, p0, Lm31;->V:I

    .line 187
    .line 188
    const/4 v3, 0x0

    .line 189
    iput v3, p0, Lm31;->W:F

    .line 190
    .line 191
    iput v4, p0, Lm31;->X:I

    .line 192
    .line 193
    iput v0, p0, Lm31;->Y:I

    .line 194
    .line 195
    iput v0, p0, Lm31;->Z:I

    .line 196
    .line 197
    iput v0, p0, Lm31;->a0:I

    .line 198
    .line 199
    const/high16 v3, 0x3f000000    # 0.5f

    .line 200
    .line 201
    iput v3, p0, Lm31;->d0:F

    .line 202
    .line 203
    iput v3, p0, Lm31;->e0:F

    .line 204
    .line 205
    iput v0, p0, Lm31;->g0:I

    .line 206
    .line 207
    iput-object v1, p0, Lm31;->h0:Ljava/lang/String;

    .line 208
    .line 209
    iput v0, p0, Lm31;->i0:I

    .line 210
    .line 211
    iput v0, p0, Lm31;->j0:I

    .line 212
    .line 213
    new-array v0, v2, [F

    .line 214
    .line 215
    fill-array-data v0, :array_1

    .line 216
    .line 217
    .line 218
    iput-object v0, p0, Lm31;->k0:[F

    .line 219
    .line 220
    filled-new-array {v1, v1}, [Lm31;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iput-object v0, p0, Lm31;->l0:[Lm31;

    .line 225
    .line 226
    filled-new-array {v1, v1}, [Lm31;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    iput-object v0, p0, Lm31;->m0:[Lm31;

    .line 231
    .line 232
    iput v4, p0, Lm31;->n0:I

    .line 233
    .line 234
    iput v4, p0, Lm31;->o0:I

    .line 235
    .line 236
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    nop

    .line 267
    :array_1
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method public static G(IILjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    const-string p1, " :   "

    .line 8
    .line 9
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, ",\n"

    .line 16
    .line 17
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static H(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V
    .locals 0

    .line 1
    cmpl-float p3, p2, p3

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p1, " :   "

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p1, ",\n"

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static o(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIFI)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    const-string p1, " :  {\n"

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    const-string v0, "FIXED"

    .line 11
    .line 12
    if-eq p8, p1, :cond_3

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    if-eq p8, p1, :cond_2

    .line 16
    .line 17
    const/4 p1, 0x3

    .line 18
    if-eq p8, p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x4

    .line 21
    if-ne p8, p1, :cond_0

    .line 22
    .line 23
    const-string p1, "MATCH_PARENT"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    throw p0

    .line 28
    :cond_1
    const-string p1, "MATCH_CONSTRAINT"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const-string p1, "WRAP_CONTENT"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    move-object p1, v0

    .line 35
    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p8

    .line 39
    if-eqz p8, :cond_4

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_4
    const-string p8, " :   "

    .line 43
    .line 44
    const-string v0, ",\n"

    .line 45
    .line 46
    const-string v1, "      behavior"

    .line 47
    .line 48
    invoke-static {p0, v1, p8, p1, v0}, Loi0;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    const-string p1, "      size"

    .line 52
    .line 53
    const/4 p8, 0x0

    .line 54
    invoke-static {p2, p8, p1, p0}, Lm31;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 55
    .line 56
    .line 57
    const-string p1, "      min"

    .line 58
    .line 59
    invoke-static {p3, p8, p1, p0}, Lm31;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 60
    .line 61
    .line 62
    const-string p1, "      max"

    .line 63
    .line 64
    const p2, 0x7fffffff

    .line 65
    .line 66
    .line 67
    invoke-static {p4, p2, p1, p0}, Lm31;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 68
    .line 69
    .line 70
    const-string p1, "      matchMin"

    .line 71
    .line 72
    invoke-static {p5, p8, p1, p0}, Lm31;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 73
    .line 74
    .line 75
    const-string p1, "      matchDef"

    .line 76
    .line 77
    invoke-static {p6, p8, p1, p0}, Lm31;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 78
    .line 79
    .line 80
    const-string p1, "      matchPercent"

    .line 81
    .line 82
    const/high16 p2, 0x3f800000    # 1.0f

    .line 83
    .line 84
    invoke-static {p0, p1, p7, p2}, Lm31;->H(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    .line 85
    .line 86
    .line 87
    const-string p1, "    },\n"

    .line 88
    .line 89
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public static p(Ljava/lang/StringBuilder;Ljava/lang/String;Lu21;)V
    .locals 2

    .line 1
    iget-object v0, p2, Lu21;->f:Lu21;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "    "

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, " : [ \'"

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object p1, p2, Lu21;->f:Lu21;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, "\'"

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget p1, p2, Lu21;->h:I

    .line 30
    .line 31
    const/high16 v0, -0x80000000

    .line 32
    .line 33
    if-ne p1, v0, :cond_1

    .line 34
    .line 35
    iget p1, p2, Lu21;->g:I

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    :cond_1
    const-string p1, ","

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget v1, p2, Lu21;->g:I

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget v1, p2, Lu21;->h:I

    .line 50
    .line 51
    if-eq v1, v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget p2, p2, Lu21;->h:I

    .line 57
    .line 58
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_2
    const-string p1, " ] ,\n"

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm31;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lm31;->I:Lu21;

    .line 6
    .line 7
    iget-boolean v0, v0, Lu21;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lm31;->K:Lu21;

    .line 12
    .line 13
    iget-boolean p0, p0, Lu21;->c:Z

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm31;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lm31;->J:Lu21;

    .line 6
    .line 7
    iget-boolean v0, v0, Lu21;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lm31;->L:Lu21;

    .line 12
    .line 13
    iget-boolean p0, p0, Lu21;->c:Z

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public C()V
    .locals 5

    .line 1
    iget-object v0, p0, Lm31;->I:Lu21;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu21;->j()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm31;->J:Lu21;

    .line 7
    .line 8
    invoke-virtual {v0}, Lu21;->j()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lm31;->K:Lu21;

    .line 12
    .line 13
    invoke-virtual {v0}, Lu21;->j()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lm31;->L:Lu21;

    .line 17
    .line 18
    invoke-virtual {v0}, Lu21;->j()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lm31;->M:Lu21;

    .line 22
    .line 23
    invoke-virtual {v0}, Lu21;->j()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lm31;->N:Lu21;

    .line 27
    .line 28
    invoke-virtual {v0}, Lu21;->j()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lm31;->O:Lu21;

    .line 32
    .line 33
    invoke-virtual {v0}, Lu21;->j()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lm31;->P:Lu21;

    .line 37
    .line 38
    invoke-virtual {v0}, Lu21;->j()V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lm31;->T:Ln31;

    .line 43
    .line 44
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 45
    .line 46
    iput v1, p0, Lm31;->D:F

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    iput v1, p0, Lm31;->U:I

    .line 50
    .line 51
    iput v1, p0, Lm31;->V:I

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    iput v2, p0, Lm31;->W:F

    .line 55
    .line 56
    const/4 v2, -0x1

    .line 57
    iput v2, p0, Lm31;->X:I

    .line 58
    .line 59
    iput v1, p0, Lm31;->Y:I

    .line 60
    .line 61
    iput v1, p0, Lm31;->Z:I

    .line 62
    .line 63
    iput v1, p0, Lm31;->a0:I

    .line 64
    .line 65
    iput v1, p0, Lm31;->b0:I

    .line 66
    .line 67
    iput v1, p0, Lm31;->c0:I

    .line 68
    .line 69
    const/high16 v3, 0x3f000000    # 0.5f

    .line 70
    .line 71
    iput v3, p0, Lm31;->d0:F

    .line 72
    .line 73
    iput v3, p0, Lm31;->e0:F

    .line 74
    .line 75
    iget-object v3, p0, Lm31;->p0:[I

    .line 76
    .line 77
    const/4 v4, 0x1

    .line 78
    aput v4, v3, v1

    .line 79
    .line 80
    aput v4, v3, v4

    .line 81
    .line 82
    iput-object v0, p0, Lm31;->f0:Landroid/view/View;

    .line 83
    .line 84
    iput v1, p0, Lm31;->g0:I

    .line 85
    .line 86
    iput v1, p0, Lm31;->i0:I

    .line 87
    .line 88
    iput v1, p0, Lm31;->j0:I

    .line 89
    .line 90
    iget-object v0, p0, Lm31;->k0:[F

    .line 91
    .line 92
    const/high16 v3, -0x40800000    # -1.0f

    .line 93
    .line 94
    aput v3, v0, v1

    .line 95
    .line 96
    aput v3, v0, v4

    .line 97
    .line 98
    iput v2, p0, Lm31;->o:I

    .line 99
    .line 100
    iput v2, p0, Lm31;->p:I

    .line 101
    .line 102
    iget-object v0, p0, Lm31;->C:[I

    .line 103
    .line 104
    const v3, 0x7fffffff

    .line 105
    .line 106
    .line 107
    aput v3, v0, v1

    .line 108
    .line 109
    aput v3, v0, v4

    .line 110
    .line 111
    iput v1, p0, Lm31;->r:I

    .line 112
    .line 113
    iput v1, p0, Lm31;->s:I

    .line 114
    .line 115
    const/high16 v0, 0x3f800000    # 1.0f

    .line 116
    .line 117
    iput v0, p0, Lm31;->w:F

    .line 118
    .line 119
    iput v0, p0, Lm31;->z:F

    .line 120
    .line 121
    iput v3, p0, Lm31;->v:I

    .line 122
    .line 123
    iput v3, p0, Lm31;->y:I

    .line 124
    .line 125
    iput v1, p0, Lm31;->u:I

    .line 126
    .line 127
    iput v1, p0, Lm31;->x:I

    .line 128
    .line 129
    iput v2, p0, Lm31;->A:I

    .line 130
    .line 131
    iput v0, p0, Lm31;->B:F

    .line 132
    .line 133
    iget-object v0, p0, Lm31;->f:[Z

    .line 134
    .line 135
    aput-boolean v4, v0, v1

    .line 136
    .line 137
    aput-boolean v4, v0, v4

    .line 138
    .line 139
    iput-boolean v1, p0, Lm31;->F:Z

    .line 140
    .line 141
    iget-object v0, p0, Lm31;->S:[Z

    .line 142
    .line 143
    aput-boolean v1, v0, v1

    .line 144
    .line 145
    aput-boolean v1, v0, v4

    .line 146
    .line 147
    iput-boolean v4, p0, Lm31;->g:Z

    .line 148
    .line 149
    iget-object v0, p0, Lm31;->t:[I

    .line 150
    .line 151
    aput v1, v0, v1

    .line 152
    .line 153
    aput v1, v0, v4

    .line 154
    .line 155
    iput v2, p0, Lm31;->h:I

    .line 156
    .line 157
    iput v2, p0, Lm31;->i:I

    .line 158
    .line 159
    return-void
.end method

.method public final D()V
    .locals 3

    .line 1
    iget-object p0, p0, Lm31;->R:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lu21;

    .line 15
    .line 16
    invoke-virtual {v2}, Lu21;->j()V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public final E()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lm31;->k:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lm31;->l:Z

    .line 5
    .line 6
    iput-boolean v0, p0, Lm31;->m:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lm31;->n:Z

    .line 9
    .line 10
    iget-object p0, p0, Lm31;->R:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    move v2, v0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Lu21;

    .line 24
    .line 25
    iput-boolean v0, v3, Lu21;->c:Z

    .line 26
    .line 27
    iput v0, v3, Lu21;->b:I

    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public F(Llr;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lm31;->I:Lu21;

    .line 2
    .line 3
    invoke-virtual {p1}, Lu21;->k()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm31;->J:Lu21;

    .line 7
    .line 8
    invoke-virtual {p1}, Lu21;->k()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lm31;->K:Lu21;

    .line 12
    .line 13
    invoke-virtual {p1}, Lu21;->k()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lm31;->L:Lu21;

    .line 17
    .line 18
    invoke-virtual {p1}, Lu21;->k()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lm31;->M:Lu21;

    .line 22
    .line 23
    invoke-virtual {p1}, Lu21;->k()V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lm31;->P:Lu21;

    .line 27
    .line 28
    invoke-virtual {p1}, Lu21;->k()V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lm31;->N:Lu21;

    .line 32
    .line 33
    invoke-virtual {p1}, Lu21;->k()V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lm31;->O:Lu21;

    .line 37
    .line 38
    invoke-virtual {p0}, Lu21;->k()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final I(I)V
    .locals 0

    .line 1
    iput p1, p0, Lm31;->a0:I

    .line 2
    .line 3
    if-lez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    iput-boolean p1, p0, Lm31;->E:Z

    .line 9
    .line 10
    return-void
.end method

.method public final J(II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm31;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lm31;->I:Lu21;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lu21;->l(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lm31;->K:Lu21;

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Lu21;->l(I)V

    .line 14
    .line 15
    .line 16
    iput p1, p0, Lm31;->Y:I

    .line 17
    .line 18
    sub-int/2addr p2, p1

    .line 19
    iput p2, p0, Lm31;->U:I

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lm31;->k:Z

    .line 23
    .line 24
    return-void
.end method

.method public final K(II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm31;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lm31;->J:Lu21;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lu21;->l(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lm31;->L:Lu21;

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Lu21;->l(I)V

    .line 14
    .line 15
    .line 16
    iput p1, p0, Lm31;->Z:I

    .line 17
    .line 18
    sub-int/2addr p2, p1

    .line 19
    iput p2, p0, Lm31;->V:I

    .line 20
    .line 21
    iget-boolean p2, p0, Lm31;->E:Z

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    iget p2, p0, Lm31;->a0:I

    .line 26
    .line 27
    add-int/2addr p1, p2

    .line 28
    iget-object p2, p0, Lm31;->M:Lu21;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Lu21;->l(I)V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Lm31;->l:Z

    .line 35
    .line 36
    return-void
.end method

.method public final L(I)V
    .locals 1

    .line 1
    iput p1, p0, Lm31;->V:I

    .line 2
    .line 3
    iget v0, p0, Lm31;->c0:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iput v0, p0, Lm31;->V:I

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final M(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lm31;->p0:[I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aput p1, p0, v0

    .line 5
    .line 6
    return-void
.end method

.method public final N(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lm31;->p0:[I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aput p1, p0, v0

    .line 5
    .line 6
    return-void
.end method

.method public final O(I)V
    .locals 1

    .line 1
    iput p1, p0, Lm31;->U:I

    .line 2
    .line 3
    iget v0, p0, Lm31;->b0:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iput v0, p0, Lm31;->U:I

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public P(ZZ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lm31;->d:Ly03;

    .line 2
    .line 3
    iget-boolean v1, v0, Lk09;->g:Z

    .line 4
    .line 5
    and-int/2addr p1, v1

    .line 6
    iget-object v1, p0, Lm31;->e:Lkv8;

    .line 7
    .line 8
    iget-boolean v2, v1, Lk09;->g:Z

    .line 9
    .line 10
    and-int/2addr p2, v2

    .line 11
    iget-object v2, v0, Lk09;->h:Lsi1;

    .line 12
    .line 13
    iget v2, v2, Lsi1;->g:I

    .line 14
    .line 15
    iget-object v3, v1, Lk09;->h:Lsi1;

    .line 16
    .line 17
    iget v3, v3, Lsi1;->g:I

    .line 18
    .line 19
    iget-object v0, v0, Lk09;->i:Lsi1;

    .line 20
    .line 21
    iget v0, v0, Lsi1;->g:I

    .line 22
    .line 23
    iget-object v1, v1, Lk09;->i:Lsi1;

    .line 24
    .line 25
    iget v1, v1, Lsi1;->g:I

    .line 26
    .line 27
    sub-int v4, v0, v2

    .line 28
    .line 29
    sub-int v5, v1, v3

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    if-ltz v4, :cond_0

    .line 33
    .line 34
    if-ltz v5, :cond_0

    .line 35
    .line 36
    const/high16 v4, -0x80000000

    .line 37
    .line 38
    if-eq v2, v4, :cond_0

    .line 39
    .line 40
    const v5, 0x7fffffff

    .line 41
    .line 42
    .line 43
    if-eq v2, v5, :cond_0

    .line 44
    .line 45
    if-eq v3, v4, :cond_0

    .line 46
    .line 47
    if-eq v3, v5, :cond_0

    .line 48
    .line 49
    if-eq v0, v4, :cond_0

    .line 50
    .line 51
    if-eq v0, v5, :cond_0

    .line 52
    .line 53
    if-eq v1, v4, :cond_0

    .line 54
    .line 55
    if-ne v1, v5, :cond_1

    .line 56
    .line 57
    :cond_0
    move v0, v6

    .line 58
    move v1, v0

    .line 59
    move v2, v1

    .line 60
    move v3, v2

    .line 61
    :cond_1
    sub-int/2addr v0, v2

    .line 62
    sub-int/2addr v1, v3

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    iput v2, p0, Lm31;->Y:I

    .line 66
    .line 67
    :cond_2
    if-eqz p2, :cond_3

    .line 68
    .line 69
    iput v3, p0, Lm31;->Z:I

    .line 70
    .line 71
    :cond_3
    iget v2, p0, Lm31;->g0:I

    .line 72
    .line 73
    const/16 v3, 0x8

    .line 74
    .line 75
    if-ne v2, v3, :cond_4

    .line 76
    .line 77
    iput v6, p0, Lm31;->U:I

    .line 78
    .line 79
    iput v6, p0, Lm31;->V:I

    .line 80
    .line 81
    return-void

    .line 82
    :cond_4
    const/4 v2, 0x1

    .line 83
    iget-object v3, p0, Lm31;->p0:[I

    .line 84
    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    aget p1, v3, v6

    .line 88
    .line 89
    if-ne p1, v2, :cond_5

    .line 90
    .line 91
    iget p1, p0, Lm31;->U:I

    .line 92
    .line 93
    if-ge v0, p1, :cond_5

    .line 94
    .line 95
    move v0, p1

    .line 96
    :cond_5
    iput v0, p0, Lm31;->U:I

    .line 97
    .line 98
    iget p1, p0, Lm31;->b0:I

    .line 99
    .line 100
    if-ge v0, p1, :cond_6

    .line 101
    .line 102
    iput p1, p0, Lm31;->U:I

    .line 103
    .line 104
    :cond_6
    if-eqz p2, :cond_8

    .line 105
    .line 106
    aget p1, v3, v2

    .line 107
    .line 108
    if-ne p1, v2, :cond_7

    .line 109
    .line 110
    iget p1, p0, Lm31;->V:I

    .line 111
    .line 112
    if-ge v1, p1, :cond_7

    .line 113
    .line 114
    move v1, p1

    .line 115
    :cond_7
    iput v1, p0, Lm31;->V:I

    .line 116
    .line 117
    iget p1, p0, Lm31;->c0:I

    .line 118
    .line 119
    if-ge v1, p1, :cond_8

    .line 120
    .line 121
    iput p1, p0, Lm31;->V:I

    .line 122
    .line 123
    :cond_8
    return-void
.end method

.method public Q(Lka4;Z)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lm31;->I:Lu21;

    .line 5
    .line 6
    invoke-static {p1}, Lka4;->n(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object v0, p0, Lm31;->J:Lu21;

    .line 11
    .line 12
    invoke-static {v0}, Lka4;->n(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lm31;->K:Lu21;

    .line 17
    .line 18
    invoke-static {v1}, Lka4;->n(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p0, Lm31;->L:Lu21;

    .line 23
    .line 24
    invoke-static {v2}, Lka4;->n(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    iget-object v3, p0, Lm31;->d:Ly03;

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    iget-object v4, v3, Lk09;->h:Lsi1;

    .line 35
    .line 36
    iget-boolean v5, v4, Lsi1;->j:Z

    .line 37
    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    iget-object v3, v3, Lk09;->i:Lsi1;

    .line 41
    .line 42
    iget-boolean v5, v3, Lsi1;->j:Z

    .line 43
    .line 44
    if-eqz v5, :cond_0

    .line 45
    .line 46
    iget p1, v4, Lsi1;->g:I

    .line 47
    .line 48
    iget v1, v3, Lsi1;->g:I

    .line 49
    .line 50
    :cond_0
    if-eqz p2, :cond_1

    .line 51
    .line 52
    iget-object p2, p0, Lm31;->e:Lkv8;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    iget-object v3, p2, Lk09;->h:Lsi1;

    .line 57
    .line 58
    iget-boolean v4, v3, Lsi1;->j:Z

    .line 59
    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    iget-object p2, p2, Lk09;->i:Lsi1;

    .line 63
    .line 64
    iget-boolean v4, p2, Lsi1;->j:Z

    .line 65
    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    iget v0, v3, Lsi1;->g:I

    .line 69
    .line 70
    iget v2, p2, Lsi1;->g:I

    .line 71
    .line 72
    :cond_1
    sub-int p2, v1, p1

    .line 73
    .line 74
    sub-int v3, v2, v0

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    if-ltz p2, :cond_2

    .line 78
    .line 79
    if-ltz v3, :cond_2

    .line 80
    .line 81
    const/high16 p2, -0x80000000

    .line 82
    .line 83
    if-eq p1, p2, :cond_2

    .line 84
    .line 85
    const v3, 0x7fffffff

    .line 86
    .line 87
    .line 88
    if-eq p1, v3, :cond_2

    .line 89
    .line 90
    if-eq v0, p2, :cond_2

    .line 91
    .line 92
    if-eq v0, v3, :cond_2

    .line 93
    .line 94
    if-eq v1, p2, :cond_2

    .line 95
    .line 96
    if-eq v1, v3, :cond_2

    .line 97
    .line 98
    if-eq v2, p2, :cond_2

    .line 99
    .line 100
    if-ne v2, v3, :cond_3

    .line 101
    .line 102
    :cond_2
    move p1, v4

    .line 103
    move v0, p1

    .line 104
    move v1, v0

    .line 105
    move v2, v1

    .line 106
    :cond_3
    sub-int/2addr v1, p1

    .line 107
    sub-int/2addr v2, v0

    .line 108
    iput p1, p0, Lm31;->Y:I

    .line 109
    .line 110
    iput v0, p0, Lm31;->Z:I

    .line 111
    .line 112
    iget p1, p0, Lm31;->g0:I

    .line 113
    .line 114
    const/16 p2, 0x8

    .line 115
    .line 116
    if-ne p1, p2, :cond_4

    .line 117
    .line 118
    iput v4, p0, Lm31;->U:I

    .line 119
    .line 120
    iput v4, p0, Lm31;->V:I

    .line 121
    .line 122
    return-void

    .line 123
    :cond_4
    iget-object p1, p0, Lm31;->p0:[I

    .line 124
    .line 125
    aget p2, p1, v4

    .line 126
    .line 127
    const/4 v0, 0x1

    .line 128
    if-ne p2, v0, :cond_5

    .line 129
    .line 130
    iget v3, p0, Lm31;->U:I

    .line 131
    .line 132
    if-ge v1, v3, :cond_5

    .line 133
    .line 134
    move v1, v3

    .line 135
    :cond_5
    aget v3, p1, v0

    .line 136
    .line 137
    if-ne v3, v0, :cond_6

    .line 138
    .line 139
    iget v3, p0, Lm31;->V:I

    .line 140
    .line 141
    if-ge v2, v3, :cond_6

    .line 142
    .line 143
    move v2, v3

    .line 144
    :cond_6
    iput v1, p0, Lm31;->U:I

    .line 145
    .line 146
    iput v2, p0, Lm31;->V:I

    .line 147
    .line 148
    iget v3, p0, Lm31;->c0:I

    .line 149
    .line 150
    if-ge v2, v3, :cond_7

    .line 151
    .line 152
    iput v3, p0, Lm31;->V:I

    .line 153
    .line 154
    :cond_7
    iget v3, p0, Lm31;->b0:I

    .line 155
    .line 156
    if-ge v1, v3, :cond_8

    .line 157
    .line 158
    iput v3, p0, Lm31;->U:I

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_8
    move v3, v1

    .line 162
    :goto_0
    iget v4, p0, Lm31;->v:I

    .line 163
    .line 164
    const/4 v5, 0x3

    .line 165
    if-lez v4, :cond_9

    .line 166
    .line 167
    if-ne p2, v5, :cond_9

    .line 168
    .line 169
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    iput p2, p0, Lm31;->U:I

    .line 174
    .line 175
    :cond_9
    iget p2, p0, Lm31;->y:I

    .line 176
    .line 177
    if-lez p2, :cond_a

    .line 178
    .line 179
    aget p1, p1, v0

    .line 180
    .line 181
    if-ne p1, v5, :cond_a

    .line 182
    .line 183
    iget p1, p0, Lm31;->V:I

    .line 184
    .line 185
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    iput p1, p0, Lm31;->V:I

    .line 190
    .line 191
    :cond_a
    iget p1, p0, Lm31;->U:I

    .line 192
    .line 193
    if-eq v1, p1, :cond_b

    .line 194
    .line 195
    iput p1, p0, Lm31;->h:I

    .line 196
    .line 197
    :cond_b
    iget p1, p0, Lm31;->V:I

    .line 198
    .line 199
    if-eq v2, p1, :cond_c

    .line 200
    .line 201
    iput p1, p0, Lm31;->i:I

    .line 202
    .line 203
    :cond_c
    return-void
.end method

.method public final a(Ln31;Lka4;Ljava/util/HashSet;IZ)V
    .locals 8

    .line 1
    if-eqz p5, :cond_1

    .line 2
    .line 3
    invoke-virtual {p3, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_5

    .line 10
    .line 11
    :cond_0
    invoke-static {p1, p2, p0}, Lkm4;->p(Ln31;Lka4;Lm31;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x40

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Ln31;->W(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p0, p2, v1}, Lm31;->b(Lka4;Z)V

    .line 24
    .line 25
    .line 26
    :cond_1
    if-nez p4, :cond_3

    .line 27
    .line 28
    iget-object v1, p0, Lm31;->I:Lu21;

    .line 29
    .line 30
    iget-object v1, v1, Lu21;->a:Ljava/util/HashSet;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lu21;

    .line 49
    .line 50
    iget-object v1, v1, Lu21;->d:Lm31;

    .line 51
    .line 52
    const/4 v6, 0x1

    .line 53
    move-object v2, p1

    .line 54
    move-object v3, p2

    .line 55
    move-object v4, p3

    .line 56
    move v5, p4

    .line 57
    invoke-virtual/range {v1 .. v6}, Lm31;->a(Ln31;Lka4;Ljava/util/HashSet;IZ)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iget-object v0, p0, Lm31;->K:Lu21;

    .line 62
    .line 63
    iget-object v0, v0, Lu21;->a:Ljava/util/HashSet;

    .line 64
    .line 65
    if-eqz v0, :cond_6

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lu21;

    .line 82
    .line 83
    iget-object v0, v0, Lu21;->d:Lm31;

    .line 84
    .line 85
    const/4 v5, 0x1

    .line 86
    move-object v1, p1

    .line 87
    move-object v2, p2

    .line 88
    move-object v3, p3

    .line 89
    move v4, p4

    .line 90
    invoke-virtual/range {v0 .. v5}, Lm31;->a(Ln31;Lka4;Ljava/util/HashSet;IZ)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    iget-object v1, p0, Lm31;->J:Lu21;

    .line 95
    .line 96
    iget-object v1, v1, Lu21;->a:Ljava/util/HashSet;

    .line 97
    .line 98
    if-eqz v1, :cond_4

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_4

    .line 109
    .line 110
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Lu21;

    .line 115
    .line 116
    iget-object v1, v1, Lu21;->d:Lm31;

    .line 117
    .line 118
    const/4 v6, 0x1

    .line 119
    move-object v2, p1

    .line 120
    move-object v3, p2

    .line 121
    move-object v4, p3

    .line 122
    move v5, p4

    .line 123
    invoke-virtual/range {v1 .. v6}, Lm31;->a(Ln31;Lka4;Ljava/util/HashSet;IZ)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    iget-object v1, p0, Lm31;->L:Lu21;

    .line 128
    .line 129
    iget-object v1, v1, Lu21;->a:Ljava/util/HashSet;

    .line 130
    .line 131
    if-eqz v1, :cond_5

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_5

    .line 142
    .line 143
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, Lu21;

    .line 148
    .line 149
    iget-object v1, v1, Lu21;->d:Lm31;

    .line 150
    .line 151
    const/4 v6, 0x1

    .line 152
    move-object v2, p1

    .line 153
    move-object v3, p2

    .line 154
    move-object v4, p3

    .line 155
    move v5, p4

    .line 156
    invoke-virtual/range {v1 .. v6}, Lm31;->a(Ln31;Lka4;Ljava/util/HashSet;IZ)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_5
    iget-object v0, p0, Lm31;->M:Lu21;

    .line 161
    .line 162
    iget-object v0, v0, Lu21;->a:Ljava/util/HashSet;

    .line 163
    .line 164
    if-eqz v0, :cond_6

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_6

    .line 175
    .line 176
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, Lu21;

    .line 181
    .line 182
    iget-object v0, v0, Lu21;->d:Lm31;

    .line 183
    .line 184
    const/4 v5, 0x1

    .line 185
    move-object v1, p1

    .line 186
    move-object v2, p2

    .line 187
    move-object v3, p3

    .line 188
    move v4, p4

    .line 189
    invoke-virtual/range {v0 .. v5}, Lm31;->a(Ln31;Lka4;Ljava/util/HashSet;IZ)V

    .line 190
    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_6
    :goto_5
    return-void
.end method

.method public b(Lka4;Z)V
    .locals 58

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lm31;->I:Lu21;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-object v4, v0, Lm31;->K:Lu21;

    .line 12
    .line 13
    invoke-virtual {v1, v4}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    iget-object v6, v0, Lm31;->J:Lu21;

    .line 18
    .line 19
    invoke-virtual {v1, v6}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    iget-object v8, v0, Lm31;->L:Lu21;

    .line 24
    .line 25
    invoke-virtual {v1, v8}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    iget-object v10, v0, Lm31;->M:Lu21;

    .line 30
    .line 31
    invoke-virtual {v1, v10}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 32
    .line 33
    .line 34
    move-result-object v11

    .line 35
    iget-object v12, v0, Lm31;->T:Ln31;

    .line 36
    .line 37
    const/4 v13, 0x2

    .line 38
    const/4 v15, 0x1

    .line 39
    if-eqz v12, :cond_5

    .line 40
    .line 41
    iget-object v12, v12, Lm31;->p0:[I

    .line 42
    .line 43
    const/16 v17, 0x0

    .line 44
    .line 45
    aget v14, v12, v17

    .line 46
    .line 47
    if-ne v14, v13, :cond_0

    .line 48
    .line 49
    move v14, v15

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move/from16 v14, v17

    .line 52
    .line 53
    :goto_0
    aget v12, v12, v15

    .line 54
    .line 55
    if-ne v12, v13, :cond_1

    .line 56
    .line 57
    move/from16 v18, v15

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move/from16 v18, v17

    .line 61
    .line 62
    :goto_1
    iget v12, v0, Lm31;->q:I

    .line 63
    .line 64
    if-eq v12, v15, :cond_4

    .line 65
    .line 66
    if-eq v12, v13, :cond_3

    .line 67
    .line 68
    const/4 v13, 0x3

    .line 69
    if-eq v12, v13, :cond_2

    .line 70
    .line 71
    :goto_2
    move/from16 v12, v18

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_2
    :goto_3
    move/from16 v12, v17

    .line 75
    .line 76
    move v14, v12

    .line 77
    goto :goto_4

    .line 78
    :cond_3
    move/from16 v14, v17

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move/from16 v12, v17

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_5
    const/16 v17, 0x0

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :goto_4
    iget v13, v0, Lm31;->g0:I

    .line 88
    .line 89
    move/from16 v18, v15

    .line 90
    .line 91
    iget-object v15, v0, Lm31;->S:[Z

    .line 92
    .line 93
    move/from16 v20, v12

    .line 94
    .line 95
    const/16 v12, 0x8

    .line 96
    .line 97
    if-ne v13, v12, :cond_9

    .line 98
    .line 99
    iget-object v13, v0, Lm31;->R:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    move/from16 v22, v14

    .line 106
    .line 107
    move/from16 v14, v17

    .line 108
    .line 109
    :goto_5
    if-ge v14, v12, :cond_8

    .line 110
    .line 111
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v23

    .line 115
    move/from16 v24, v12

    .line 116
    .line 117
    move-object/from16 v12, v23

    .line 118
    .line 119
    check-cast v12, Lu21;

    .line 120
    .line 121
    iget-object v12, v12, Lu21;->a:Ljava/util/HashSet;

    .line 122
    .line 123
    if-nez v12, :cond_6

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_6
    invoke-virtual {v12}, Ljava/util/HashSet;->size()I

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    if-lez v12, :cond_7

    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_7
    :goto_6
    add-int/lit8 v14, v14, 0x1

    .line 134
    .line 135
    move/from16 v12, v24

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_8
    aget-boolean v12, v15, v17

    .line 139
    .line 140
    if-nez v12, :cond_a

    .line 141
    .line 142
    aget-boolean v12, v15, v18

    .line 143
    .line 144
    if-nez v12, :cond_a

    .line 145
    .line 146
    return-void

    .line 147
    :cond_9
    move/from16 v22, v14

    .line 148
    .line 149
    :cond_a
    :goto_7
    iget-boolean v12, v0, Lm31;->k:Z

    .line 150
    .line 151
    if-nez v12, :cond_b

    .line 152
    .line 153
    iget-boolean v13, v0, Lm31;->l:Z

    .line 154
    .line 155
    if-eqz v13, :cond_16

    .line 156
    .line 157
    :cond_b
    if-eqz v12, :cond_f

    .line 158
    .line 159
    iget v12, v0, Lm31;->Y:I

    .line 160
    .line 161
    invoke-virtual {v1, v3, v12}, Lka4;->d(Lge7;I)V

    .line 162
    .line 163
    .line 164
    iget v12, v0, Lm31;->Y:I

    .line 165
    .line 166
    iget v13, v0, Lm31;->U:I

    .line 167
    .line 168
    add-int/2addr v12, v13

    .line 169
    invoke-virtual {v1, v5, v12}, Lka4;->d(Lge7;I)V

    .line 170
    .line 171
    .line 172
    if-eqz v22, :cond_f

    .line 173
    .line 174
    iget-object v12, v0, Lm31;->T:Ln31;

    .line 175
    .line 176
    if-eqz v12, :cond_f

    .line 177
    .line 178
    iget-object v13, v12, Ln31;->H0:Ljava/lang/ref/WeakReference;

    .line 179
    .line 180
    if-eqz v13, :cond_c

    .line 181
    .line 182
    invoke-virtual {v13}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v13

    .line 186
    if-eqz v13, :cond_c

    .line 187
    .line 188
    invoke-virtual {v2}, Lu21;->d()I

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    iget-object v14, v12, Ln31;->H0:Ljava/lang/ref/WeakReference;

    .line 193
    .line 194
    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v14

    .line 198
    check-cast v14, Lu21;

    .line 199
    .line 200
    invoke-virtual {v14}, Lu21;->d()I

    .line 201
    .line 202
    .line 203
    move-result v14

    .line 204
    if-le v13, v14, :cond_d

    .line 205
    .line 206
    :cond_c
    new-instance v13, Ljava/lang/ref/WeakReference;

    .line 207
    .line 208
    invoke-direct {v13, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    iput-object v13, v12, Ln31;->H0:Ljava/lang/ref/WeakReference;

    .line 212
    .line 213
    :cond_d
    iget-object v13, v12, Ln31;->J0:Ljava/lang/ref/WeakReference;

    .line 214
    .line 215
    if-eqz v13, :cond_e

    .line 216
    .line 217
    invoke-virtual {v13}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v13

    .line 221
    if-eqz v13, :cond_e

    .line 222
    .line 223
    invoke-virtual {v4}, Lu21;->d()I

    .line 224
    .line 225
    .line 226
    move-result v13

    .line 227
    iget-object v14, v12, Ln31;->J0:Ljava/lang/ref/WeakReference;

    .line 228
    .line 229
    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v14

    .line 233
    check-cast v14, Lu21;

    .line 234
    .line 235
    invoke-virtual {v14}, Lu21;->d()I

    .line 236
    .line 237
    .line 238
    move-result v14

    .line 239
    if-le v13, v14, :cond_f

    .line 240
    .line 241
    :cond_e
    new-instance v13, Ljava/lang/ref/WeakReference;

    .line 242
    .line 243
    invoke-direct {v13, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    iput-object v13, v12, Ln31;->J0:Ljava/lang/ref/WeakReference;

    .line 247
    .line 248
    :cond_f
    iget-boolean v12, v0, Lm31;->l:Z

    .line 249
    .line 250
    if-eqz v12, :cond_15

    .line 251
    .line 252
    iget v12, v0, Lm31;->Z:I

    .line 253
    .line 254
    invoke-virtual {v1, v7, v12}, Lka4;->d(Lge7;I)V

    .line 255
    .line 256
    .line 257
    iget v12, v0, Lm31;->Z:I

    .line 258
    .line 259
    iget v13, v0, Lm31;->V:I

    .line 260
    .line 261
    add-int/2addr v12, v13

    .line 262
    invoke-virtual {v1, v9, v12}, Lka4;->d(Lge7;I)V

    .line 263
    .line 264
    .line 265
    iget-object v12, v10, Lu21;->a:Ljava/util/HashSet;

    .line 266
    .line 267
    if-nez v12, :cond_10

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_10
    invoke-virtual {v12}, Ljava/util/HashSet;->size()I

    .line 271
    .line 272
    .line 273
    move-result v12

    .line 274
    if-lez v12, :cond_11

    .line 275
    .line 276
    iget v12, v0, Lm31;->Z:I

    .line 277
    .line 278
    iget v13, v0, Lm31;->a0:I

    .line 279
    .line 280
    add-int/2addr v12, v13

    .line 281
    invoke-virtual {v1, v11, v12}, Lka4;->d(Lge7;I)V

    .line 282
    .line 283
    .line 284
    :cond_11
    :goto_8
    if-eqz v20, :cond_15

    .line 285
    .line 286
    iget-object v12, v0, Lm31;->T:Ln31;

    .line 287
    .line 288
    if-eqz v12, :cond_15

    .line 289
    .line 290
    iget-object v13, v12, Ln31;->G0:Ljava/lang/ref/WeakReference;

    .line 291
    .line 292
    if-eqz v13, :cond_12

    .line 293
    .line 294
    invoke-virtual {v13}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v13

    .line 298
    if-eqz v13, :cond_12

    .line 299
    .line 300
    invoke-virtual {v6}, Lu21;->d()I

    .line 301
    .line 302
    .line 303
    move-result v13

    .line 304
    iget-object v14, v12, Ln31;->G0:Ljava/lang/ref/WeakReference;

    .line 305
    .line 306
    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v14

    .line 310
    check-cast v14, Lu21;

    .line 311
    .line 312
    invoke-virtual {v14}, Lu21;->d()I

    .line 313
    .line 314
    .line 315
    move-result v14

    .line 316
    if-le v13, v14, :cond_13

    .line 317
    .line 318
    :cond_12
    new-instance v13, Ljava/lang/ref/WeakReference;

    .line 319
    .line 320
    invoke-direct {v13, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    iput-object v13, v12, Ln31;->G0:Ljava/lang/ref/WeakReference;

    .line 324
    .line 325
    :cond_13
    iget-object v13, v12, Ln31;->I0:Ljava/lang/ref/WeakReference;

    .line 326
    .line 327
    if-eqz v13, :cond_14

    .line 328
    .line 329
    invoke-virtual {v13}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v13

    .line 333
    if-eqz v13, :cond_14

    .line 334
    .line 335
    invoke-virtual {v8}, Lu21;->d()I

    .line 336
    .line 337
    .line 338
    move-result v13

    .line 339
    iget-object v14, v12, Ln31;->I0:Ljava/lang/ref/WeakReference;

    .line 340
    .line 341
    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v14

    .line 345
    check-cast v14, Lu21;

    .line 346
    .line 347
    invoke-virtual {v14}, Lu21;->d()I

    .line 348
    .line 349
    .line 350
    move-result v14

    .line 351
    if-le v13, v14, :cond_15

    .line 352
    .line 353
    :cond_14
    new-instance v13, Ljava/lang/ref/WeakReference;

    .line 354
    .line 355
    invoke-direct {v13, v8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    iput-object v13, v12, Ln31;->I0:Ljava/lang/ref/WeakReference;

    .line 359
    .line 360
    :cond_15
    iget-boolean v12, v0, Lm31;->k:Z

    .line 361
    .line 362
    if-eqz v12, :cond_16

    .line 363
    .line 364
    iget-boolean v12, v0, Lm31;->l:Z

    .line 365
    .line 366
    if-eqz v12, :cond_16

    .line 367
    .line 368
    move/from16 v12, v17

    .line 369
    .line 370
    iput-boolean v12, v0, Lm31;->k:Z

    .line 371
    .line 372
    iput-boolean v12, v0, Lm31;->l:Z

    .line 373
    .line 374
    return-void

    .line 375
    :cond_16
    iget-object v12, v0, Lm31;->f:[Z

    .line 376
    .line 377
    if-eqz p2, :cond_1a

    .line 378
    .line 379
    iget-object v13, v0, Lm31;->d:Ly03;

    .line 380
    .line 381
    if-eqz v13, :cond_1a

    .line 382
    .line 383
    iget-object v14, v0, Lm31;->e:Lkv8;

    .line 384
    .line 385
    if-eqz v14, :cond_1a

    .line 386
    .line 387
    move-object/from16 v23, v10

    .line 388
    .line 389
    iget-object v10, v13, Lk09;->h:Lsi1;

    .line 390
    .line 391
    move-object/from16 v24, v12

    .line 392
    .line 393
    iget-boolean v12, v10, Lsi1;->j:Z

    .line 394
    .line 395
    if-eqz v12, :cond_19

    .line 396
    .line 397
    iget-object v12, v13, Lk09;->i:Lsi1;

    .line 398
    .line 399
    iget-boolean v12, v12, Lsi1;->j:Z

    .line 400
    .line 401
    if-eqz v12, :cond_19

    .line 402
    .line 403
    iget-object v12, v14, Lk09;->h:Lsi1;

    .line 404
    .line 405
    iget-boolean v12, v12, Lsi1;->j:Z

    .line 406
    .line 407
    if-eqz v12, :cond_19

    .line 408
    .line 409
    iget-object v12, v14, Lk09;->i:Lsi1;

    .line 410
    .line 411
    iget-boolean v12, v12, Lsi1;->j:Z

    .line 412
    .line 413
    if-eqz v12, :cond_19

    .line 414
    .line 415
    iget v2, v10, Lsi1;->g:I

    .line 416
    .line 417
    invoke-virtual {v1, v3, v2}, Lka4;->d(Lge7;I)V

    .line 418
    .line 419
    .line 420
    iget-object v2, v0, Lm31;->d:Ly03;

    .line 421
    .line 422
    iget-object v2, v2, Lk09;->i:Lsi1;

    .line 423
    .line 424
    iget v2, v2, Lsi1;->g:I

    .line 425
    .line 426
    invoke-virtual {v1, v5, v2}, Lka4;->d(Lge7;I)V

    .line 427
    .line 428
    .line 429
    iget-object v2, v0, Lm31;->e:Lkv8;

    .line 430
    .line 431
    iget-object v2, v2, Lk09;->h:Lsi1;

    .line 432
    .line 433
    iget v2, v2, Lsi1;->g:I

    .line 434
    .line 435
    invoke-virtual {v1, v7, v2}, Lka4;->d(Lge7;I)V

    .line 436
    .line 437
    .line 438
    iget-object v2, v0, Lm31;->e:Lkv8;

    .line 439
    .line 440
    iget-object v2, v2, Lk09;->i:Lsi1;

    .line 441
    .line 442
    iget v2, v2, Lsi1;->g:I

    .line 443
    .line 444
    invoke-virtual {v1, v9, v2}, Lka4;->d(Lge7;I)V

    .line 445
    .line 446
    .line 447
    iget-object v2, v0, Lm31;->e:Lkv8;

    .line 448
    .line 449
    iget-object v2, v2, Lkv8;->k:Lsi1;

    .line 450
    .line 451
    iget v2, v2, Lsi1;->g:I

    .line 452
    .line 453
    invoke-virtual {v1, v11, v2}, Lka4;->d(Lge7;I)V

    .line 454
    .line 455
    .line 456
    iget-object v2, v0, Lm31;->T:Ln31;

    .line 457
    .line 458
    if-eqz v2, :cond_18

    .line 459
    .line 460
    if-eqz v22, :cond_17

    .line 461
    .line 462
    const/4 v12, 0x0

    .line 463
    aget-boolean v2, v24, v12

    .line 464
    .line 465
    if-eqz v2, :cond_17

    .line 466
    .line 467
    invoke-virtual {v0}, Lm31;->x()Z

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    if-nez v2, :cond_17

    .line 472
    .line 473
    iget-object v2, v0, Lm31;->T:Ln31;

    .line 474
    .line 475
    iget-object v2, v2, Lm31;->K:Lu21;

    .line 476
    .line 477
    invoke-virtual {v1, v2}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    const/16 v3, 0x8

    .line 482
    .line 483
    invoke-virtual {v1, v2, v5, v12, v3}, Lka4;->f(Lge7;Lge7;II)V

    .line 484
    .line 485
    .line 486
    :cond_17
    if-eqz v20, :cond_18

    .line 487
    .line 488
    aget-boolean v2, v24, v18

    .line 489
    .line 490
    if-eqz v2, :cond_18

    .line 491
    .line 492
    invoke-virtual {v0}, Lm31;->y()Z

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    if-nez v2, :cond_18

    .line 497
    .line 498
    iget-object v2, v0, Lm31;->T:Ln31;

    .line 499
    .line 500
    iget-object v2, v2, Lm31;->L:Lu21;

    .line 501
    .line 502
    invoke-virtual {v1, v2}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    const/16 v3, 0x8

    .line 507
    .line 508
    const/4 v12, 0x0

    .line 509
    invoke-virtual {v1, v2, v9, v12, v3}, Lka4;->f(Lge7;Lge7;II)V

    .line 510
    .line 511
    .line 512
    goto :goto_9

    .line 513
    :cond_18
    const/4 v12, 0x0

    .line 514
    :goto_9
    iput-boolean v12, v0, Lm31;->k:Z

    .line 515
    .line 516
    iput-boolean v12, v0, Lm31;->l:Z

    .line 517
    .line 518
    return-void

    .line 519
    :cond_19
    :goto_a
    const/4 v12, 0x0

    .line 520
    goto :goto_b

    .line 521
    :cond_1a
    move-object/from16 v23, v10

    .line 522
    .line 523
    move-object/from16 v24, v12

    .line 524
    .line 525
    goto :goto_a

    .line 526
    :goto_b
    iget-object v10, v0, Lm31;->T:Ln31;

    .line 527
    .line 528
    if-eqz v10, :cond_1f

    .line 529
    .line 530
    invoke-virtual {v0, v12}, Lm31;->w(I)Z

    .line 531
    .line 532
    .line 533
    move-result v10

    .line 534
    if-eqz v10, :cond_1b

    .line 535
    .line 536
    iget-object v10, v0, Lm31;->T:Ln31;

    .line 537
    .line 538
    invoke-virtual {v10, v0, v12}, Ln31;->R(Lm31;I)V

    .line 539
    .line 540
    .line 541
    move/from16 v10, v18

    .line 542
    .line 543
    move v12, v10

    .line 544
    goto :goto_c

    .line 545
    :cond_1b
    invoke-virtual {v0}, Lm31;->x()Z

    .line 546
    .line 547
    .line 548
    move-result v10

    .line 549
    move/from16 v12, v18

    .line 550
    .line 551
    :goto_c
    invoke-virtual {v0, v12}, Lm31;->w(I)Z

    .line 552
    .line 553
    .line 554
    move-result v13

    .line 555
    if-eqz v13, :cond_1c

    .line 556
    .line 557
    iget-object v13, v0, Lm31;->T:Ln31;

    .line 558
    .line 559
    invoke-virtual {v13, v0, v12}, Ln31;->R(Lm31;I)V

    .line 560
    .line 561
    .line 562
    const/4 v12, 0x1

    .line 563
    goto :goto_d

    .line 564
    :cond_1c
    invoke-virtual {v0}, Lm31;->y()Z

    .line 565
    .line 566
    .line 567
    move-result v12

    .line 568
    :goto_d
    if-nez v10, :cond_1d

    .line 569
    .line 570
    if-eqz v22, :cond_1d

    .line 571
    .line 572
    iget v13, v0, Lm31;->g0:I

    .line 573
    .line 574
    const/16 v14, 0x8

    .line 575
    .line 576
    if-eq v13, v14, :cond_1d

    .line 577
    .line 578
    iget-object v13, v2, Lu21;->f:Lu21;

    .line 579
    .line 580
    if-nez v13, :cond_1d

    .line 581
    .line 582
    iget-object v13, v4, Lu21;->f:Lu21;

    .line 583
    .line 584
    if-nez v13, :cond_1d

    .line 585
    .line 586
    iget-object v13, v0, Lm31;->T:Ln31;

    .line 587
    .line 588
    iget-object v13, v13, Lm31;->K:Lu21;

    .line 589
    .line 590
    invoke-virtual {v1, v13}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 591
    .line 592
    .line 593
    move-result-object v13

    .line 594
    move-object/from16 v25, v2

    .line 595
    .line 596
    const/4 v2, 0x0

    .line 597
    const/4 v14, 0x1

    .line 598
    invoke-virtual {v1, v13, v5, v2, v14}, Lka4;->f(Lge7;Lge7;II)V

    .line 599
    .line 600
    .line 601
    goto :goto_e

    .line 602
    :cond_1d
    move-object/from16 v25, v2

    .line 603
    .line 604
    :goto_e
    if-nez v12, :cond_1e

    .line 605
    .line 606
    if-eqz v20, :cond_1e

    .line 607
    .line 608
    iget v2, v0, Lm31;->g0:I

    .line 609
    .line 610
    const/16 v14, 0x8

    .line 611
    .line 612
    if-eq v2, v14, :cond_1e

    .line 613
    .line 614
    iget-object v2, v6, Lu21;->f:Lu21;

    .line 615
    .line 616
    if-nez v2, :cond_1e

    .line 617
    .line 618
    iget-object v2, v8, Lu21;->f:Lu21;

    .line 619
    .line 620
    if-nez v2, :cond_1e

    .line 621
    .line 622
    if-nez v23, :cond_1e

    .line 623
    .line 624
    iget-object v2, v0, Lm31;->T:Ln31;

    .line 625
    .line 626
    iget-object v2, v2, Lm31;->L:Lu21;

    .line 627
    .line 628
    invoke-virtual {v1, v2}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    const/4 v13, 0x0

    .line 633
    const/4 v14, 0x1

    .line 634
    invoke-virtual {v1, v2, v9, v13, v14}, Lka4;->f(Lge7;Lge7;II)V

    .line 635
    .line 636
    .line 637
    :cond_1e
    move-object v2, v4

    .line 638
    move/from16 v4, v20

    .line 639
    .line 640
    move/from16 v20, v12

    .line 641
    .line 642
    move v12, v10

    .line 643
    goto :goto_f

    .line 644
    :cond_1f
    move-object/from16 v25, v2

    .line 645
    .line 646
    move-object v2, v4

    .line 647
    move/from16 v4, v20

    .line 648
    .line 649
    const/4 v12, 0x0

    .line 650
    const/16 v20, 0x0

    .line 651
    .line 652
    :goto_f
    iget v10, v0, Lm31;->U:I

    .line 653
    .line 654
    iget v13, v0, Lm31;->b0:I

    .line 655
    .line 656
    if-ge v10, v13, :cond_20

    .line 657
    .line 658
    goto :goto_10

    .line 659
    :cond_20
    move v13, v10

    .line 660
    :goto_10
    iget v14, v0, Lm31;->V:I

    .line 661
    .line 662
    move-object/from16 v26, v2

    .line 663
    .line 664
    iget v2, v0, Lm31;->c0:I

    .line 665
    .line 666
    if-ge v14, v2, :cond_21

    .line 667
    .line 668
    move/from16 v27, v2

    .line 669
    .line 670
    goto :goto_11

    .line 671
    :cond_21
    move/from16 v27, v14

    .line 672
    .line 673
    :goto_11
    iget-object v2, v0, Lm31;->p0:[I

    .line 674
    .line 675
    move-object/from16 v28, v2

    .line 676
    .line 677
    const/16 v17, 0x0

    .line 678
    .line 679
    aget v2, v28, v17

    .line 680
    .line 681
    move/from16 v29, v4

    .line 682
    .line 683
    const/4 v4, 0x3

    .line 684
    if-eq v2, v4, :cond_22

    .line 685
    .line 686
    const/16 v30, 0x1

    .line 687
    .line 688
    :goto_12
    move-object/from16 v31, v6

    .line 689
    .line 690
    const/16 v18, 0x1

    .line 691
    .line 692
    goto :goto_13

    .line 693
    :cond_22
    const/16 v30, 0x0

    .line 694
    .line 695
    goto :goto_12

    .line 696
    :goto_13
    aget v6, v28, v18

    .line 697
    .line 698
    if-eq v6, v4, :cond_23

    .line 699
    .line 700
    const/16 v32, 0x1

    .line 701
    .line 702
    goto :goto_14

    .line 703
    :cond_23
    const/16 v32, 0x0

    .line 704
    .line 705
    :goto_14
    iget v4, v0, Lm31;->X:I

    .line 706
    .line 707
    iput v4, v0, Lm31;->A:I

    .line 708
    .line 709
    move-object/from16 v33, v7

    .line 710
    .line 711
    iget v7, v0, Lm31;->W:F

    .line 712
    .line 713
    iput v7, v0, Lm31;->B:F

    .line 714
    .line 715
    move/from16 v34, v7

    .line 716
    .line 717
    iget v7, v0, Lm31;->r:I

    .line 718
    .line 719
    move/from16 v35, v7

    .line 720
    .line 721
    iget v7, v0, Lm31;->s:I

    .line 722
    .line 723
    const/16 v36, 0x0

    .line 724
    .line 725
    cmpl-float v36, v34, v36

    .line 726
    .line 727
    move/from16 v37, v7

    .line 728
    .line 729
    const/high16 v38, 0x3f800000    # 1.0f

    .line 730
    .line 731
    if-lez v36, :cond_39

    .line 732
    .line 733
    iget v7, v0, Lm31;->g0:I

    .line 734
    .line 735
    move-object/from16 v39, v8

    .line 736
    .line 737
    const/16 v8, 0x8

    .line 738
    .line 739
    if-eq v7, v8, :cond_38

    .line 740
    .line 741
    const/4 v7, 0x3

    .line 742
    if-ne v2, v7, :cond_24

    .line 743
    .line 744
    if-nez v35, :cond_24

    .line 745
    .line 746
    move v8, v7

    .line 747
    goto :goto_15

    .line 748
    :cond_24
    move/from16 v8, v35

    .line 749
    .line 750
    :goto_15
    if-ne v6, v7, :cond_25

    .line 751
    .line 752
    if-nez v37, :cond_25

    .line 753
    .line 754
    move-object/from16 v40, v9

    .line 755
    .line 756
    move v9, v7

    .line 757
    goto :goto_16

    .line 758
    :cond_25
    move-object/from16 v40, v9

    .line 759
    .line 760
    move/from16 v9, v37

    .line 761
    .line 762
    :goto_16
    if-ne v2, v7, :cond_32

    .line 763
    .line 764
    if-ne v6, v7, :cond_32

    .line 765
    .line 766
    if-ne v8, v7, :cond_32

    .line 767
    .line 768
    if-ne v9, v7, :cond_32

    .line 769
    .line 770
    const/4 v7, -0x1

    .line 771
    if-ne v4, v7, :cond_28

    .line 772
    .line 773
    if-eqz v30, :cond_26

    .line 774
    .line 775
    if-nez v32, :cond_26

    .line 776
    .line 777
    const/4 v2, 0x0

    .line 778
    iput v2, v0, Lm31;->A:I

    .line 779
    .line 780
    const/4 v4, 0x0

    .line 781
    goto :goto_17

    .line 782
    :cond_26
    if-nez v30, :cond_28

    .line 783
    .line 784
    if-eqz v32, :cond_28

    .line 785
    .line 786
    const/4 v14, 0x1

    .line 787
    iput v14, v0, Lm31;->A:I

    .line 788
    .line 789
    if-ne v4, v7, :cond_27

    .line 790
    .line 791
    div-float v7, v38, v34

    .line 792
    .line 793
    iput v7, v0, Lm31;->B:F

    .line 794
    .line 795
    :cond_27
    const/4 v4, 0x1

    .line 796
    :cond_28
    :goto_17
    if-nez v4, :cond_2a

    .line 797
    .line 798
    invoke-virtual/range {v31 .. v31}, Lu21;->h()Z

    .line 799
    .line 800
    .line 801
    move-result v2

    .line 802
    if-eqz v2, :cond_29

    .line 803
    .line 804
    invoke-virtual/range {v39 .. v39}, Lu21;->h()Z

    .line 805
    .line 806
    .line 807
    move-result v2

    .line 808
    if-nez v2, :cond_2a

    .line 809
    .line 810
    :cond_29
    const/4 v14, 0x1

    .line 811
    goto :goto_18

    .line 812
    :cond_2a
    const/4 v14, 0x1

    .line 813
    goto :goto_19

    .line 814
    :goto_18
    iput v14, v0, Lm31;->A:I

    .line 815
    .line 816
    goto :goto_1a

    .line 817
    :goto_19
    iget v2, v0, Lm31;->A:I

    .line 818
    .line 819
    if-ne v2, v14, :cond_2c

    .line 820
    .line 821
    invoke-virtual/range {v25 .. v25}, Lu21;->h()Z

    .line 822
    .line 823
    .line 824
    move-result v2

    .line 825
    if-eqz v2, :cond_2b

    .line 826
    .line 827
    invoke-virtual/range {v26 .. v26}, Lu21;->h()Z

    .line 828
    .line 829
    .line 830
    move-result v2

    .line 831
    if-nez v2, :cond_2c

    .line 832
    .line 833
    :cond_2b
    const/4 v2, 0x0

    .line 834
    iput v2, v0, Lm31;->A:I

    .line 835
    .line 836
    :cond_2c
    :goto_1a
    iget v2, v0, Lm31;->A:I

    .line 837
    .line 838
    const/4 v7, -0x1

    .line 839
    if-ne v2, v7, :cond_2f

    .line 840
    .line 841
    invoke-virtual/range {v31 .. v31}, Lu21;->h()Z

    .line 842
    .line 843
    .line 844
    move-result v2

    .line 845
    if-eqz v2, :cond_2d

    .line 846
    .line 847
    invoke-virtual/range {v39 .. v39}, Lu21;->h()Z

    .line 848
    .line 849
    .line 850
    move-result v2

    .line 851
    if-eqz v2, :cond_2d

    .line 852
    .line 853
    invoke-virtual/range {v25 .. v25}, Lu21;->h()Z

    .line 854
    .line 855
    .line 856
    move-result v2

    .line 857
    if-eqz v2, :cond_2d

    .line 858
    .line 859
    invoke-virtual/range {v26 .. v26}, Lu21;->h()Z

    .line 860
    .line 861
    .line 862
    move-result v2

    .line 863
    if-nez v2, :cond_2f

    .line 864
    .line 865
    :cond_2d
    invoke-virtual/range {v31 .. v31}, Lu21;->h()Z

    .line 866
    .line 867
    .line 868
    move-result v2

    .line 869
    if-eqz v2, :cond_2e

    .line 870
    .line 871
    invoke-virtual/range {v39 .. v39}, Lu21;->h()Z

    .line 872
    .line 873
    .line 874
    move-result v2

    .line 875
    if-eqz v2, :cond_2e

    .line 876
    .line 877
    const/4 v2, 0x0

    .line 878
    iput v2, v0, Lm31;->A:I

    .line 879
    .line 880
    goto :goto_1b

    .line 881
    :cond_2e
    invoke-virtual/range {v25 .. v25}, Lu21;->h()Z

    .line 882
    .line 883
    .line 884
    move-result v2

    .line 885
    if-eqz v2, :cond_2f

    .line 886
    .line 887
    invoke-virtual/range {v26 .. v26}, Lu21;->h()Z

    .line 888
    .line 889
    .line 890
    move-result v2

    .line 891
    if-eqz v2, :cond_2f

    .line 892
    .line 893
    iget v2, v0, Lm31;->B:F

    .line 894
    .line 895
    div-float v7, v38, v2

    .line 896
    .line 897
    iput v7, v0, Lm31;->B:F

    .line 898
    .line 899
    const/4 v14, 0x1

    .line 900
    iput v14, v0, Lm31;->A:I

    .line 901
    .line 902
    :cond_2f
    :goto_1b
    iget v2, v0, Lm31;->A:I

    .line 903
    .line 904
    const/4 v7, -0x1

    .line 905
    if-ne v2, v7, :cond_31

    .line 906
    .line 907
    iget v4, v0, Lm31;->u:I

    .line 908
    .line 909
    if-lez v4, :cond_30

    .line 910
    .line 911
    iget v6, v0, Lm31;->x:I

    .line 912
    .line 913
    if-nez v6, :cond_30

    .line 914
    .line 915
    const/4 v6, 0x0

    .line 916
    iput v6, v0, Lm31;->A:I

    .line 917
    .line 918
    const/4 v2, 0x0

    .line 919
    goto :goto_1c

    .line 920
    :cond_30
    if-nez v4, :cond_31

    .line 921
    .line 922
    iget v4, v0, Lm31;->x:I

    .line 923
    .line 924
    if-lez v4, :cond_31

    .line 925
    .line 926
    iget v2, v0, Lm31;->B:F

    .line 927
    .line 928
    div-float v7, v38, v2

    .line 929
    .line 930
    iput v7, v0, Lm31;->B:F

    .line 931
    .line 932
    const/4 v14, 0x1

    .line 933
    iput v14, v0, Lm31;->A:I

    .line 934
    .line 935
    const/4 v2, 0x1

    .line 936
    :cond_31
    :goto_1c
    move v4, v2

    .line 937
    goto :goto_20

    .line 938
    :cond_32
    if-ne v2, v7, :cond_34

    .line 939
    .line 940
    if-ne v8, v7, :cond_34

    .line 941
    .line 942
    const/4 v7, 0x0

    .line 943
    iput v7, v0, Lm31;->A:I

    .line 944
    .line 945
    int-to-float v2, v14

    .line 946
    mul-float v7, v34, v2

    .line 947
    .line 948
    float-to-int v2, v7

    .line 949
    const/4 v7, 0x3

    .line 950
    move v13, v2

    .line 951
    if-eq v6, v7, :cond_33

    .line 952
    .line 953
    move-object/from16 v2, v23

    .line 954
    .line 955
    move/from16 v30, v27

    .line 956
    .line 957
    const/4 v4, 0x0

    .line 958
    const/4 v7, 0x4

    .line 959
    const/16 v31, 0x0

    .line 960
    .line 961
    :goto_1d
    move/from16 v23, v9

    .line 962
    .line 963
    goto :goto_23

    .line 964
    :cond_33
    move v7, v8

    .line 965
    move-object/from16 v2, v23

    .line 966
    .line 967
    move/from16 v30, v27

    .line 968
    .line 969
    const/4 v4, 0x0

    .line 970
    :goto_1e
    const/16 v31, 0x1

    .line 971
    .line 972
    goto :goto_1d

    .line 973
    :cond_34
    if-ne v6, v7, :cond_37

    .line 974
    .line 975
    if-ne v9, v7, :cond_37

    .line 976
    .line 977
    const/4 v14, 0x1

    .line 978
    iput v14, v0, Lm31;->A:I

    .line 979
    .line 980
    const/4 v6, -0x1

    .line 981
    if-ne v4, v6, :cond_35

    .line 982
    .line 983
    div-float v4, v38, v34

    .line 984
    .line 985
    iput v4, v0, Lm31;->B:F

    .line 986
    .line 987
    move/from16 v34, v4

    .line 988
    .line 989
    :cond_35
    int-to-float v4, v10

    .line 990
    mul-float v4, v4, v34

    .line 991
    .line 992
    float-to-int v4, v4

    .line 993
    move/from16 v30, v4

    .line 994
    .line 995
    if-eq v2, v7, :cond_36

    .line 996
    .line 997
    move v7, v8

    .line 998
    move-object/from16 v2, v23

    .line 999
    .line 1000
    const/4 v4, 0x1

    .line 1001
    const/16 v23, 0x4

    .line 1002
    .line 1003
    :goto_1f
    const/16 v31, 0x0

    .line 1004
    .line 1005
    goto :goto_23

    .line 1006
    :cond_36
    move v7, v8

    .line 1007
    move-object/from16 v2, v23

    .line 1008
    .line 1009
    const/4 v4, 0x1

    .line 1010
    goto :goto_1e

    .line 1011
    :cond_37
    :goto_20
    move v7, v8

    .line 1012
    move-object/from16 v2, v23

    .line 1013
    .line 1014
    move/from16 v30, v27

    .line 1015
    .line 1016
    goto :goto_1e

    .line 1017
    :cond_38
    :goto_21
    move-object/from16 v40, v9

    .line 1018
    .line 1019
    goto :goto_22

    .line 1020
    :cond_39
    move-object/from16 v39, v8

    .line 1021
    .line 1022
    goto :goto_21

    .line 1023
    :goto_22
    move-object/from16 v2, v23

    .line 1024
    .line 1025
    move/from16 v30, v27

    .line 1026
    .line 1027
    move/from16 v7, v35

    .line 1028
    .line 1029
    move/from16 v23, v37

    .line 1030
    .line 1031
    goto :goto_1f

    .line 1032
    :goto_23
    iget-object v6, v0, Lm31;->t:[I

    .line 1033
    .line 1034
    const/16 v17, 0x0

    .line 1035
    .line 1036
    aput v7, v6, v17

    .line 1037
    .line 1038
    const/4 v14, 0x1

    .line 1039
    aput v23, v6, v14

    .line 1040
    .line 1041
    const/4 v6, -0x1

    .line 1042
    if-eqz v31, :cond_3b

    .line 1043
    .line 1044
    if-eqz v4, :cond_3a

    .line 1045
    .line 1046
    if-ne v4, v6, :cond_3b

    .line 1047
    .line 1048
    :cond_3a
    move v8, v14

    .line 1049
    goto :goto_24

    .line 1050
    :cond_3b
    const/4 v8, 0x0

    .line 1051
    :goto_24
    if-eqz v31, :cond_3d

    .line 1052
    .line 1053
    if-eq v4, v14, :cond_3c

    .line 1054
    .line 1055
    if-ne v4, v6, :cond_3d

    .line 1056
    .line 1057
    :cond_3c
    const/16 v32, 0x1

    .line 1058
    .line 1059
    :goto_25
    const/16 v17, 0x0

    .line 1060
    .line 1061
    goto :goto_26

    .line 1062
    :cond_3d
    const/16 v32, 0x0

    .line 1063
    .line 1064
    goto :goto_25

    .line 1065
    :goto_26
    aget v4, v28, v17

    .line 1066
    .line 1067
    const/4 v6, 0x2

    .line 1068
    if-ne v4, v6, :cond_3e

    .line 1069
    .line 1070
    instance-of v4, v0, Ln31;

    .line 1071
    .line 1072
    if-eqz v4, :cond_3e

    .line 1073
    .line 1074
    const/4 v9, 0x1

    .line 1075
    goto :goto_27

    .line 1076
    :cond_3e
    const/4 v9, 0x0

    .line 1077
    :goto_27
    if-eqz v9, :cond_3f

    .line 1078
    .line 1079
    const/4 v13, 0x0

    .line 1080
    :cond_3f
    iget-object v4, v0, Lm31;->P:Lu21;

    .line 1081
    .line 1082
    invoke-virtual {v4}, Lu21;->h()Z

    .line 1083
    .line 1084
    .line 1085
    move-result v6

    .line 1086
    const/16 v18, 0x1

    .line 1087
    .line 1088
    xor-int/lit8 v27, v6, 0x1

    .line 1089
    .line 1090
    const/16 v14, 0x8

    .line 1091
    .line 1092
    const/16 v17, 0x0

    .line 1093
    .line 1094
    aget-boolean v21, v15, v17

    .line 1095
    .line 1096
    aget-boolean v34, v15, v18

    .line 1097
    .line 1098
    iget v6, v0, Lm31;->o:I

    .line 1099
    .line 1100
    iget-object v10, v0, Lm31;->C:[I

    .line 1101
    .line 1102
    const/16 v35, 0x0

    .line 1103
    .line 1104
    const/4 v15, 0x2

    .line 1105
    if-eq v6, v15, :cond_42

    .line 1106
    .line 1107
    iget-boolean v6, v0, Lm31;->k:Z

    .line 1108
    .line 1109
    if-nez v6, :cond_42

    .line 1110
    .line 1111
    if-eqz p2, :cond_43

    .line 1112
    .line 1113
    iget-object v6, v0, Lm31;->d:Ly03;

    .line 1114
    .line 1115
    if-eqz v6, :cond_43

    .line 1116
    .line 1117
    iget-object v14, v6, Lk09;->h:Lsi1;

    .line 1118
    .line 1119
    iget-boolean v15, v14, Lsi1;->j:Z

    .line 1120
    .line 1121
    if-eqz v15, :cond_40

    .line 1122
    .line 1123
    iget-object v6, v6, Lk09;->i:Lsi1;

    .line 1124
    .line 1125
    iget-boolean v6, v6, Lsi1;->j:Z

    .line 1126
    .line 1127
    if-nez v6, :cond_41

    .line 1128
    .line 1129
    :cond_40
    const/16 v14, 0x8

    .line 1130
    .line 1131
    goto :goto_28

    .line 1132
    :cond_41
    if-eqz p2, :cond_42

    .line 1133
    .line 1134
    iget v6, v14, Lsi1;->g:I

    .line 1135
    .line 1136
    invoke-virtual {v1, v3, v6}, Lka4;->d(Lge7;I)V

    .line 1137
    .line 1138
    .line 1139
    iget-object v6, v0, Lm31;->d:Ly03;

    .line 1140
    .line 1141
    iget-object v6, v6, Lk09;->i:Lsi1;

    .line 1142
    .line 1143
    iget v6, v6, Lsi1;->g:I

    .line 1144
    .line 1145
    invoke-virtual {v1, v5, v6}, Lka4;->d(Lge7;I)V

    .line 1146
    .line 1147
    .line 1148
    iget-object v6, v0, Lm31;->T:Ln31;

    .line 1149
    .line 1150
    if-eqz v6, :cond_42

    .line 1151
    .line 1152
    if-eqz v22, :cond_42

    .line 1153
    .line 1154
    const/4 v13, 0x0

    .line 1155
    aget-boolean v6, v24, v13

    .line 1156
    .line 1157
    if-eqz v6, :cond_42

    .line 1158
    .line 1159
    invoke-virtual {v0}, Lm31;->x()Z

    .line 1160
    .line 1161
    .line 1162
    move-result v6

    .line 1163
    if-nez v6, :cond_42

    .line 1164
    .line 1165
    iget-object v6, v0, Lm31;->T:Ln31;

    .line 1166
    .line 1167
    iget-object v6, v6, Lm31;->K:Lu21;

    .line 1168
    .line 1169
    invoke-virtual {v1, v6}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v6

    .line 1173
    const/16 v14, 0x8

    .line 1174
    .line 1175
    invoke-virtual {v1, v6, v5, v13, v14}, Lka4;->f(Lge7;Lge7;II)V

    .line 1176
    .line 1177
    .line 1178
    :cond_42
    move-object/from16 v19, v28

    .line 1179
    .line 1180
    move-object/from16 v28, v4

    .line 1181
    .line 1182
    move/from16 v4, v29

    .line 1183
    .line 1184
    move-object/from16 v29, v19

    .line 1185
    .line 1186
    move-object/from16 v55, v2

    .line 1187
    .line 1188
    move-object/from16 v49, v3

    .line 1189
    .line 1190
    move-object/from16 v50, v5

    .line 1191
    .line 1192
    move-object/from16 v46, v10

    .line 1193
    .line 1194
    move-object/from16 v53, v11

    .line 1195
    .line 1196
    move/from16 v19, v12

    .line 1197
    .line 1198
    move/from16 v3, v22

    .line 1199
    .line 1200
    move-object/from16 v51, v33

    .line 1201
    .line 1202
    move-object/from16 v54, v39

    .line 1203
    .line 1204
    move-object/from16 v52, v40

    .line 1205
    .line 1206
    move/from16 v22, v7

    .line 1207
    .line 1208
    move-object/from16 v33, v24

    .line 1209
    .line 1210
    goto/16 :goto_2d

    .line 1211
    .line 1212
    :cond_43
    :goto_28
    iget-object v6, v0, Lm31;->T:Ln31;

    .line 1213
    .line 1214
    if-eqz v6, :cond_44

    .line 1215
    .line 1216
    iget-object v6, v6, Lm31;->K:Lu21;

    .line 1217
    .line 1218
    invoke-virtual {v1, v6}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v6

    .line 1222
    goto :goto_29

    .line 1223
    :cond_44
    move-object/from16 v6, v35

    .line 1224
    .line 1225
    :goto_29
    iget-object v15, v0, Lm31;->T:Ln31;

    .line 1226
    .line 1227
    if-eqz v15, :cond_45

    .line 1228
    .line 1229
    iget-object v15, v15, Lm31;->I:Lu21;

    .line 1230
    .line 1231
    invoke-virtual {v1, v15}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v15

    .line 1235
    :goto_2a
    move-object/from16 v19, v5

    .line 1236
    .line 1237
    const/16 v17, 0x0

    .line 1238
    .line 1239
    goto :goto_2b

    .line 1240
    :cond_45
    move-object/from16 v15, v35

    .line 1241
    .line 1242
    goto :goto_2a

    .line 1243
    :goto_2b
    aget-boolean v5, v24, v17

    .line 1244
    .line 1245
    move/from16 v26, v17

    .line 1246
    .line 1247
    move/from16 v17, v8

    .line 1248
    .line 1249
    aget v8, v28, v26

    .line 1250
    .line 1251
    move-object/from16 v36, v19

    .line 1252
    .line 1253
    move/from16 v19, v12

    .line 1254
    .line 1255
    iget v12, v0, Lm31;->Y:I

    .line 1256
    .line 1257
    move/from16 v37, v14

    .line 1258
    .line 1259
    iget v14, v0, Lm31;->b0:I

    .line 1260
    .line 1261
    move-object/from16 v41, v3

    .line 1262
    .line 1263
    move/from16 v3, v22

    .line 1264
    .line 1265
    move/from16 v22, v7

    .line 1266
    .line 1267
    move-object v7, v6

    .line 1268
    move-object v6, v15

    .line 1269
    aget v15, v10, v26

    .line 1270
    .line 1271
    iget v1, v0, Lm31;->d0:F

    .line 1272
    .line 1273
    move/from16 v42, v1

    .line 1274
    .line 1275
    const/16 v18, 0x1

    .line 1276
    .line 1277
    aget v1, v28, v18

    .line 1278
    .line 1279
    move-object/from16 v43, v2

    .line 1280
    .line 1281
    const/4 v2, 0x3

    .line 1282
    if-ne v1, v2, :cond_46

    .line 1283
    .line 1284
    goto :goto_2c

    .line 1285
    :cond_46
    move/from16 v18, v26

    .line 1286
    .line 1287
    :goto_2c
    iget v1, v0, Lm31;->u:I

    .line 1288
    .line 1289
    iget v2, v0, Lm31;->v:I

    .line 1290
    .line 1291
    move/from16 v44, v1

    .line 1292
    .line 1293
    iget v1, v0, Lm31;->w:F

    .line 1294
    .line 1295
    move/from16 v25, v2

    .line 1296
    .line 1297
    const/16 v45, 0x2

    .line 1298
    .line 1299
    const/4 v2, 0x1

    .line 1300
    move-object/from16 v46, v10

    .line 1301
    .line 1302
    iget-object v10, v0, Lm31;->I:Lu21;

    .line 1303
    .line 1304
    move-object/from16 v47, v11

    .line 1305
    .line 1306
    iget-object v11, v0, Lm31;->K:Lu21;

    .line 1307
    .line 1308
    move-object/from16 v16, v28

    .line 1309
    .line 1310
    move-object/from16 v28, v4

    .line 1311
    .line 1312
    move/from16 v4, v29

    .line 1313
    .line 1314
    move-object/from16 v29, v16

    .line 1315
    .line 1316
    move/from16 v26, v1

    .line 1317
    .line 1318
    move-object/from16 v51, v33

    .line 1319
    .line 1320
    move-object/from16 v50, v36

    .line 1321
    .line 1322
    move-object/from16 v54, v39

    .line 1323
    .line 1324
    move-object/from16 v52, v40

    .line 1325
    .line 1326
    move-object/from16 v49, v41

    .line 1327
    .line 1328
    move/from16 v16, v42

    .line 1329
    .line 1330
    move-object/from16 v55, v43

    .line 1331
    .line 1332
    move-object/from16 v53, v47

    .line 1333
    .line 1334
    move-object/from16 v1, p1

    .line 1335
    .line 1336
    move-object/from16 v33, v24

    .line 1337
    .line 1338
    move/from16 v24, v44

    .line 1339
    .line 1340
    invoke-virtual/range {v0 .. v27}, Lm31;->d(Lka4;ZZZZLge7;Lge7;IZLu21;Lu21;IIIIFZZZZZIIIIFZ)V

    .line 1341
    .line 1342
    .line 1343
    :goto_2d
    if-eqz p2, :cond_49

    .line 1344
    .line 1345
    iget-object v2, v0, Lm31;->e:Lkv8;

    .line 1346
    .line 1347
    if-eqz v2, :cond_49

    .line 1348
    .line 1349
    iget-object v5, v2, Lk09;->h:Lsi1;

    .line 1350
    .line 1351
    iget-boolean v6, v5, Lsi1;->j:Z

    .line 1352
    .line 1353
    if-eqz v6, :cond_49

    .line 1354
    .line 1355
    iget-object v2, v2, Lk09;->i:Lsi1;

    .line 1356
    .line 1357
    iget-boolean v2, v2, Lsi1;->j:Z

    .line 1358
    .line 1359
    if-eqz v2, :cond_49

    .line 1360
    .line 1361
    iget v2, v5, Lsi1;->g:I

    .line 1362
    .line 1363
    move-object/from16 v5, v51

    .line 1364
    .line 1365
    invoke-virtual {v1, v5, v2}, Lka4;->d(Lge7;I)V

    .line 1366
    .line 1367
    .line 1368
    iget-object v2, v0, Lm31;->e:Lkv8;

    .line 1369
    .line 1370
    iget-object v2, v2, Lk09;->i:Lsi1;

    .line 1371
    .line 1372
    iget v2, v2, Lsi1;->g:I

    .line 1373
    .line 1374
    move-object/from16 v6, v52

    .line 1375
    .line 1376
    invoke-virtual {v1, v6, v2}, Lka4;->d(Lge7;I)V

    .line 1377
    .line 1378
    .line 1379
    iget-object v2, v0, Lm31;->e:Lkv8;

    .line 1380
    .line 1381
    iget-object v2, v2, Lkv8;->k:Lsi1;

    .line 1382
    .line 1383
    iget v2, v2, Lsi1;->g:I

    .line 1384
    .line 1385
    move-object/from16 v7, v53

    .line 1386
    .line 1387
    invoke-virtual {v1, v7, v2}, Lka4;->d(Lge7;I)V

    .line 1388
    .line 1389
    .line 1390
    iget-object v2, v0, Lm31;->T:Ln31;

    .line 1391
    .line 1392
    if-eqz v2, :cond_48

    .line 1393
    .line 1394
    if-nez v20, :cond_48

    .line 1395
    .line 1396
    if-eqz v4, :cond_48

    .line 1397
    .line 1398
    const/16 v18, 0x1

    .line 1399
    .line 1400
    aget-boolean v8, v33, v18

    .line 1401
    .line 1402
    if-eqz v8, :cond_47

    .line 1403
    .line 1404
    iget-object v2, v2, Lm31;->L:Lu21;

    .line 1405
    .line 1406
    invoke-virtual {v1, v2}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v2

    .line 1410
    const/4 v8, 0x0

    .line 1411
    const/16 v14, 0x8

    .line 1412
    .line 1413
    invoke-virtual {v1, v2, v6, v8, v14}, Lka4;->f(Lge7;Lge7;II)V

    .line 1414
    .line 1415
    .line 1416
    goto :goto_2e

    .line 1417
    :cond_47
    const/4 v8, 0x0

    .line 1418
    const/16 v14, 0x8

    .line 1419
    .line 1420
    goto :goto_2e

    .line 1421
    :cond_48
    const/4 v8, 0x0

    .line 1422
    const/16 v14, 0x8

    .line 1423
    .line 1424
    const/16 v18, 0x1

    .line 1425
    .line 1426
    :goto_2e
    move v15, v8

    .line 1427
    goto :goto_2f

    .line 1428
    :cond_49
    move-object/from16 v5, v51

    .line 1429
    .line 1430
    move-object/from16 v6, v52

    .line 1431
    .line 1432
    move-object/from16 v7, v53

    .line 1433
    .line 1434
    const/4 v8, 0x0

    .line 1435
    const/16 v14, 0x8

    .line 1436
    .line 1437
    const/16 v18, 0x1

    .line 1438
    .line 1439
    move/from16 v15, v18

    .line 1440
    .line 1441
    :goto_2f
    iget v2, v0, Lm31;->p:I

    .line 1442
    .line 1443
    const/4 v9, 0x2

    .line 1444
    if-ne v2, v9, :cond_4a

    .line 1445
    .line 1446
    move v15, v8

    .line 1447
    :cond_4a
    const/4 v2, 0x5

    .line 1448
    if-eqz v15, :cond_55

    .line 1449
    .line 1450
    iget-boolean v10, v0, Lm31;->l:Z

    .line 1451
    .line 1452
    if-nez v10, :cond_55

    .line 1453
    .line 1454
    aget v10, v29, v18

    .line 1455
    .line 1456
    if-ne v10, v9, :cond_4b

    .line 1457
    .line 1458
    instance-of v10, v0, Ln31;

    .line 1459
    .line 1460
    if-eqz v10, :cond_4b

    .line 1461
    .line 1462
    move/from16 v15, v18

    .line 1463
    .line 1464
    goto :goto_30

    .line 1465
    :cond_4b
    move v15, v8

    .line 1466
    :goto_30
    if-eqz v15, :cond_4c

    .line 1467
    .line 1468
    move v13, v8

    .line 1469
    goto :goto_31

    .line 1470
    :cond_4c
    move/from16 v13, v30

    .line 1471
    .line 1472
    :goto_31
    iget-object v10, v0, Lm31;->T:Ln31;

    .line 1473
    .line 1474
    if-eqz v10, :cond_4d

    .line 1475
    .line 1476
    iget-object v10, v10, Lm31;->L:Lu21;

    .line 1477
    .line 1478
    invoke-virtual {v1, v10}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v10

    .line 1482
    goto :goto_32

    .line 1483
    :cond_4d
    move-object/from16 v10, v35

    .line 1484
    .line 1485
    :goto_32
    iget-object v11, v0, Lm31;->T:Ln31;

    .line 1486
    .line 1487
    if-eqz v11, :cond_4e

    .line 1488
    .line 1489
    iget-object v11, v11, Lm31;->J:Lu21;

    .line 1490
    .line 1491
    invoke-virtual {v1, v11}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v35

    .line 1495
    :cond_4e
    iget v11, v0, Lm31;->a0:I

    .line 1496
    .line 1497
    if-gtz v11, :cond_4f

    .line 1498
    .line 1499
    iget v12, v0, Lm31;->g0:I

    .line 1500
    .line 1501
    if-ne v12, v14, :cond_53

    .line 1502
    .line 1503
    :cond_4f
    move-object/from16 v12, v55

    .line 1504
    .line 1505
    iget-object v9, v12, Lu21;->f:Lu21;

    .line 1506
    .line 1507
    if-eqz v9, :cond_51

    .line 1508
    .line 1509
    invoke-virtual {v1, v7, v5, v11, v14}, Lka4;->e(Lge7;Lge7;II)V

    .line 1510
    .line 1511
    .line 1512
    iget-object v9, v12, Lu21;->f:Lu21;

    .line 1513
    .line 1514
    invoke-virtual {v1, v9}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v9

    .line 1518
    invoke-virtual {v12}, Lu21;->e()I

    .line 1519
    .line 1520
    .line 1521
    move-result v11

    .line 1522
    invoke-virtual {v1, v7, v9, v11, v14}, Lka4;->e(Lge7;Lge7;II)V

    .line 1523
    .line 1524
    .line 1525
    if-eqz v4, :cond_50

    .line 1526
    .line 1527
    move-object/from16 v7, v54

    .line 1528
    .line 1529
    invoke-virtual {v1, v7}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v7

    .line 1533
    invoke-virtual {v1, v10, v7, v8, v2}, Lka4;->f(Lge7;Lge7;II)V

    .line 1534
    .line 1535
    .line 1536
    :cond_50
    move/from16 v27, v8

    .line 1537
    .line 1538
    goto :goto_33

    .line 1539
    :cond_51
    iget v9, v0, Lm31;->g0:I

    .line 1540
    .line 1541
    if-ne v9, v14, :cond_52

    .line 1542
    .line 1543
    invoke-virtual {v12}, Lu21;->e()I

    .line 1544
    .line 1545
    .line 1546
    move-result v9

    .line 1547
    invoke-virtual {v1, v7, v5, v9, v14}, Lka4;->e(Lge7;Lge7;II)V

    .line 1548
    .line 1549
    .line 1550
    goto :goto_33

    .line 1551
    :cond_52
    invoke-virtual {v1, v7, v5, v11, v14}, Lka4;->e(Lge7;Lge7;II)V

    .line 1552
    .line 1553
    .line 1554
    :cond_53
    :goto_33
    aget-boolean v7, v33, v18

    .line 1555
    .line 1556
    move/from16 v17, v8

    .line 1557
    .line 1558
    aget v8, v29, v18

    .line 1559
    .line 1560
    iget v12, v0, Lm31;->Z:I

    .line 1561
    .line 1562
    iget v14, v0, Lm31;->c0:I

    .line 1563
    .line 1564
    aget v9, v46, v18

    .line 1565
    .line 1566
    iget v11, v0, Lm31;->e0:F

    .line 1567
    .line 1568
    aget v2, v29, v17

    .line 1569
    .line 1570
    const/4 v1, 0x3

    .line 1571
    move/from16 v16, v18

    .line 1572
    .line 1573
    if-ne v2, v1, :cond_54

    .line 1574
    .line 1575
    goto :goto_34

    .line 1576
    :cond_54
    move/from16 v18, v17

    .line 1577
    .line 1578
    :goto_34
    iget v2, v0, Lm31;->x:I

    .line 1579
    .line 1580
    iget v1, v0, Lm31;->y:I

    .line 1581
    .line 1582
    move/from16 v21, v1

    .line 1583
    .line 1584
    iget v1, v0, Lm31;->z:F

    .line 1585
    .line 1586
    move/from16 v24, v2

    .line 1587
    .line 1588
    const/4 v2, 0x0

    .line 1589
    move-object/from16 v33, v5

    .line 1590
    .line 1591
    move v5, v7

    .line 1592
    move-object v7, v10

    .line 1593
    iget-object v10, v0, Lm31;->J:Lu21;

    .line 1594
    .line 1595
    move/from16 v48, v16

    .line 1596
    .line 1597
    move/from16 v16, v11

    .line 1598
    .line 1599
    iget-object v11, v0, Lm31;->L:Lu21;

    .line 1600
    .line 1601
    move/from16 v17, v4

    .line 1602
    .line 1603
    move v4, v3

    .line 1604
    move/from16 v3, v17

    .line 1605
    .line 1606
    move/from16 v17, v15

    .line 1607
    .line 1608
    move v15, v9

    .line 1609
    move/from16 v9, v17

    .line 1610
    .line 1611
    move/from16 v17, v20

    .line 1612
    .line 1613
    move/from16 v20, v19

    .line 1614
    .line 1615
    move/from16 v19, v17

    .line 1616
    .line 1617
    move/from16 v17, v23

    .line 1618
    .line 1619
    move/from16 v23, v22

    .line 1620
    .line 1621
    move/from16 v22, v17

    .line 1622
    .line 1623
    move/from16 v26, v1

    .line 1624
    .line 1625
    move-object/from16 v57, v6

    .line 1626
    .line 1627
    move/from16 v25, v21

    .line 1628
    .line 1629
    move/from16 v17, v32

    .line 1630
    .line 1631
    move-object/from16 v56, v33

    .line 1632
    .line 1633
    move/from16 v21, v34

    .line 1634
    .line 1635
    move-object/from16 v6, v35

    .line 1636
    .line 1637
    move-object/from16 v1, p1

    .line 1638
    .line 1639
    invoke-virtual/range {v0 .. v27}, Lm31;->d(Lka4;ZZZZLge7;Lge7;IZLu21;Lu21;IIIIFZZZZZIIIIFZ)V

    .line 1640
    .line 1641
    .line 1642
    goto :goto_35

    .line 1643
    :cond_55
    move-object/from16 v56, v5

    .line 1644
    .line 1645
    move-object/from16 v57, v6

    .line 1646
    .line 1647
    :goto_35
    if-eqz v31, :cond_57

    .line 1648
    .line 1649
    iget v2, v0, Lm31;->A:I

    .line 1650
    .line 1651
    iget v3, v0, Lm31;->B:F

    .line 1652
    .line 1653
    const/high16 v4, -0x40800000    # -1.0f

    .line 1654
    .line 1655
    const/4 v14, 0x1

    .line 1656
    if-ne v2, v14, :cond_56

    .line 1657
    .line 1658
    invoke-virtual {v1}, Lka4;->l()Lzt;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v2

    .line 1662
    iget-object v5, v2, Lzt;->d:Lmt;

    .line 1663
    .line 1664
    move-object/from16 v6, v57

    .line 1665
    .line 1666
    invoke-virtual {v5, v6, v4}, Lmt;->g(Lge7;F)V

    .line 1667
    .line 1668
    .line 1669
    iget-object v4, v2, Lzt;->d:Lmt;

    .line 1670
    .line 1671
    move-object/from16 v5, v56

    .line 1672
    .line 1673
    const/high16 v7, 0x3f800000    # 1.0f

    .line 1674
    .line 1675
    invoke-virtual {v4, v5, v7}, Lmt;->g(Lge7;F)V

    .line 1676
    .line 1677
    .line 1678
    iget-object v4, v2, Lzt;->d:Lmt;

    .line 1679
    .line 1680
    move-object/from16 v8, v50

    .line 1681
    .line 1682
    invoke-virtual {v4, v8, v3}, Lmt;->g(Lge7;F)V

    .line 1683
    .line 1684
    .line 1685
    iget-object v4, v2, Lzt;->d:Lmt;

    .line 1686
    .line 1687
    neg-float v3, v3

    .line 1688
    move-object/from16 v9, v49

    .line 1689
    .line 1690
    invoke-virtual {v4, v9, v3}, Lmt;->g(Lge7;F)V

    .line 1691
    .line 1692
    .line 1693
    invoke-virtual {v1, v2}, Lka4;->c(Lzt;)V

    .line 1694
    .line 1695
    .line 1696
    goto :goto_36

    .line 1697
    :cond_56
    move-object/from16 v9, v49

    .line 1698
    .line 1699
    move-object/from16 v8, v50

    .line 1700
    .line 1701
    move-object/from16 v5, v56

    .line 1702
    .line 1703
    move-object/from16 v6, v57

    .line 1704
    .line 1705
    const/high16 v7, 0x3f800000    # 1.0f

    .line 1706
    .line 1707
    invoke-virtual {v1}, Lka4;->l()Lzt;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v2

    .line 1711
    iget-object v10, v2, Lzt;->d:Lmt;

    .line 1712
    .line 1713
    invoke-virtual {v10, v8, v4}, Lmt;->g(Lge7;F)V

    .line 1714
    .line 1715
    .line 1716
    iget-object v4, v2, Lzt;->d:Lmt;

    .line 1717
    .line 1718
    invoke-virtual {v4, v9, v7}, Lmt;->g(Lge7;F)V

    .line 1719
    .line 1720
    .line 1721
    iget-object v4, v2, Lzt;->d:Lmt;

    .line 1722
    .line 1723
    invoke-virtual {v4, v6, v3}, Lmt;->g(Lge7;F)V

    .line 1724
    .line 1725
    .line 1726
    iget-object v4, v2, Lzt;->d:Lmt;

    .line 1727
    .line 1728
    neg-float v3, v3

    .line 1729
    invoke-virtual {v4, v5, v3}, Lmt;->g(Lge7;F)V

    .line 1730
    .line 1731
    .line 1732
    invoke-virtual {v1, v2}, Lka4;->c(Lzt;)V

    .line 1733
    .line 1734
    .line 1735
    :cond_57
    :goto_36
    invoke-virtual/range {v28 .. v28}, Lu21;->h()Z

    .line 1736
    .line 1737
    .line 1738
    move-result v2

    .line 1739
    if-eqz v2, :cond_58

    .line 1740
    .line 1741
    move-object/from16 v2, v28

    .line 1742
    .line 1743
    iget-object v3, v2, Lu21;->f:Lu21;

    .line 1744
    .line 1745
    iget-object v3, v3, Lu21;->d:Lm31;

    .line 1746
    .line 1747
    iget v4, v0, Lm31;->D:F

    .line 1748
    .line 1749
    const/high16 v5, 0x42b40000    # 90.0f

    .line 1750
    .line 1751
    add-float/2addr v4, v5

    .line 1752
    float-to-double v4, v4

    .line 1753
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 1754
    .line 1755
    .line 1756
    move-result-wide v4

    .line 1757
    double-to-float v4, v4

    .line 1758
    invoke-virtual {v2}, Lu21;->e()I

    .line 1759
    .line 1760
    .line 1761
    move-result v2

    .line 1762
    const/4 v15, 0x2

    .line 1763
    invoke-virtual {v0, v15}, Lm31;->i(I)Lu21;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v5

    .line 1767
    invoke-virtual {v1, v5}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v5

    .line 1771
    const/4 v7, 0x3

    .line 1772
    invoke-virtual {v0, v7}, Lm31;->i(I)Lu21;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v6

    .line 1776
    invoke-virtual {v1, v6}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v6

    .line 1780
    const/4 v8, 0x4

    .line 1781
    invoke-virtual {v0, v8}, Lm31;->i(I)Lu21;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v9

    .line 1785
    invoke-virtual {v1, v9}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v9

    .line 1789
    const/4 v10, 0x5

    .line 1790
    invoke-virtual {v0, v10}, Lm31;->i(I)Lu21;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v11

    .line 1794
    invoke-virtual {v1, v11}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v11

    .line 1798
    invoke-virtual {v3, v15}, Lm31;->i(I)Lu21;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v12

    .line 1802
    invoke-virtual {v1, v12}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v12

    .line 1806
    invoke-virtual {v3, v7}, Lm31;->i(I)Lu21;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v7

    .line 1810
    invoke-virtual {v1, v7}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v7

    .line 1814
    invoke-virtual {v3, v8}, Lm31;->i(I)Lu21;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v8

    .line 1818
    invoke-virtual {v1, v8}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v8

    .line 1822
    invoke-virtual {v3, v10}, Lm31;->i(I)Lu21;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v3

    .line 1826
    invoke-virtual {v1, v3}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v3

    .line 1830
    invoke-virtual {v1}, Lka4;->l()Lzt;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v10

    .line 1834
    float-to-double v13, v4

    .line 1835
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 1836
    .line 1837
    .line 1838
    move-result-wide v15

    .line 1839
    move-wide/from16 v17, v13

    .line 1840
    .line 1841
    int-to-double v13, v2

    .line 1842
    move-wide/from16 v19, v13

    .line 1843
    .line 1844
    mul-double v13, v15, v19

    .line 1845
    .line 1846
    double-to-float v2, v13

    .line 1847
    iget-object v4, v10, Lzt;->d:Lmt;

    .line 1848
    .line 1849
    const/high16 v13, 0x3f000000    # 0.5f

    .line 1850
    .line 1851
    invoke-virtual {v4, v7, v13}, Lmt;->g(Lge7;F)V

    .line 1852
    .line 1853
    .line 1854
    iget-object v4, v10, Lzt;->d:Lmt;

    .line 1855
    .line 1856
    invoke-virtual {v4, v3, v13}, Lmt;->g(Lge7;F)V

    .line 1857
    .line 1858
    .line 1859
    iget-object v3, v10, Lzt;->d:Lmt;

    .line 1860
    .line 1861
    const/high16 v4, -0x41000000    # -0.5f

    .line 1862
    .line 1863
    invoke-virtual {v3, v6, v4}, Lmt;->g(Lge7;F)V

    .line 1864
    .line 1865
    .line 1866
    iget-object v3, v10, Lzt;->d:Lmt;

    .line 1867
    .line 1868
    invoke-virtual {v3, v11, v4}, Lmt;->g(Lge7;F)V

    .line 1869
    .line 1870
    .line 1871
    neg-float v2, v2

    .line 1872
    iput v2, v10, Lzt;->b:F

    .line 1873
    .line 1874
    invoke-virtual {v1, v10}, Lka4;->c(Lzt;)V

    .line 1875
    .line 1876
    .line 1877
    invoke-virtual {v1}, Lka4;->l()Lzt;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v2

    .line 1881
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->cos(D)D

    .line 1882
    .line 1883
    .line 1884
    move-result-wide v6

    .line 1885
    mul-double v6, v6, v19

    .line 1886
    .line 1887
    double-to-float v3, v6

    .line 1888
    iget-object v6, v2, Lzt;->d:Lmt;

    .line 1889
    .line 1890
    invoke-virtual {v6, v12, v13}, Lmt;->g(Lge7;F)V

    .line 1891
    .line 1892
    .line 1893
    iget-object v6, v2, Lzt;->d:Lmt;

    .line 1894
    .line 1895
    invoke-virtual {v6, v8, v13}, Lmt;->g(Lge7;F)V

    .line 1896
    .line 1897
    .line 1898
    iget-object v6, v2, Lzt;->d:Lmt;

    .line 1899
    .line 1900
    invoke-virtual {v6, v5, v4}, Lmt;->g(Lge7;F)V

    .line 1901
    .line 1902
    .line 1903
    iget-object v5, v2, Lzt;->d:Lmt;

    .line 1904
    .line 1905
    invoke-virtual {v5, v9, v4}, Lmt;->g(Lge7;F)V

    .line 1906
    .line 1907
    .line 1908
    neg-float v3, v3

    .line 1909
    iput v3, v2, Lzt;->b:F

    .line 1910
    .line 1911
    invoke-virtual {v1, v2}, Lka4;->c(Lzt;)V

    .line 1912
    .line 1913
    .line 1914
    :cond_58
    const/4 v2, 0x0

    .line 1915
    iput-boolean v2, v0, Lm31;->k:Z

    .line 1916
    .line 1917
    iput-boolean v2, v0, Lm31;->l:Z

    .line 1918
    .line 1919
    return-void
.end method

.method public c()Z
    .locals 1

    .line 1
    iget p0, p0, Lm31;->g0:I

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final d(Lka4;ZZZZLge7;Lge7;IZLu21;Lu21;IIIIFZZZZZIIIIFZ)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move/from16 v14, p14

    move/from16 v2, p15

    move/from16 v4, p24

    move/from16 v5, p25

    move/from16 v6, p26

    .line 1
    invoke-virtual {v1, v12}, Lka4;->k(Ljava/lang/Object;)Lge7;

    move-result-object v7

    .line 2
    invoke-virtual {v1, v13}, Lka4;->k(Ljava/lang/Object;)Lge7;

    move-result-object v8

    .line 3
    iget-object v9, v12, Lu21;->f:Lu21;

    .line 4
    invoke-virtual {v1, v9}, Lka4;->k(Ljava/lang/Object;)Lge7;

    move-result-object v9

    .line 5
    iget-object v15, v13, Lu21;->f:Lu21;

    .line 6
    invoke-virtual {v1, v15}, Lka4;->k(Ljava/lang/Object;)Lge7;

    move-result-object v15

    .line 7
    invoke-virtual {v12}, Lu21;->h()Z

    move-result v16

    .line 8
    invoke-virtual {v13}, Lu21;->h()Z

    move-result v17

    .line 9
    iget-object v11, v0, Lm31;->P:Lu21;

    invoke-virtual {v11}, Lu21;->h()Z

    move-result v11

    if-eqz v17, :cond_0

    add-int/lit8 v18, v16, 0x1

    goto :goto_0

    :cond_0
    move/from16 v18, v16

    :goto_0
    if-eqz v11, :cond_1

    add-int/lit8 v18, v18, 0x1

    :cond_1
    move/from16 v19, v11

    move/from16 v11, v18

    if-eqz p17, :cond_2

    const/4 v3, 0x3

    goto :goto_1

    :cond_2
    move/from16 v3, p22

    .line 10
    :goto_1
    invoke-static/range {p8 .. p8}, Lp61;->B(I)I

    move-result v13

    const/4 v10, 0x1

    move-object/from16 v20, v15

    if-eqz v13, :cond_3

    if-eq v13, v10, :cond_3

    const/4 v10, 0x2

    if-eq v13, v10, :cond_4

    :cond_3
    const/4 v10, 0x0

    goto :goto_2

    :cond_4
    const/4 v10, 0x4

    if-eq v3, v10, :cond_3

    const/4 v10, 0x1

    .line 11
    :goto_2
    iget v13, v0, Lm31;->h:I

    const/4 v15, -0x1

    if-eq v13, v15, :cond_5

    if-eqz p2, :cond_5

    .line 12
    iput v15, v0, Lm31;->h:I

    const/16 p13, 0x0

    goto :goto_3

    :cond_5
    move/from16 v13, p13

    move/from16 p13, v10

    .line 13
    :goto_3
    iget v10, v0, Lm31;->i:I

    if-eq v10, v15, :cond_6

    if-nez p2, :cond_6

    .line 14
    iput v15, v0, Lm31;->i:I

    move v13, v10

    const/4 v10, 0x0

    goto :goto_4

    :cond_6
    move/from16 v10, p13

    .line 15
    :goto_4
    iget v15, v0, Lm31;->g0:I

    move/from16 p13, v10

    const/16 v10, 0x8

    if-ne v15, v10, :cond_7

    const/4 v13, 0x0

    const/4 v15, 0x0

    goto :goto_5

    :cond_7
    move v15, v13

    move/from16 v13, p13

    :goto_5
    if-eqz p27, :cond_a

    if-nez v16, :cond_9

    if-nez v17, :cond_9

    if-nez v19, :cond_9

    move/from16 v10, p12

    .line 16
    invoke-virtual {v1, v7, v10}, Lka4;->d(Lge7;I)V

    :cond_8
    move/from16 v24, v13

    const/16 v13, 0x8

    goto :goto_6

    :cond_9
    if-eqz v16, :cond_8

    if-nez v17, :cond_8

    .line 17
    invoke-virtual {v12}, Lu21;->e()I

    move-result v10

    move/from16 v24, v13

    const/16 v13, 0x8

    .line 18
    invoke-virtual {v1, v7, v9, v10, v13}, Lka4;->e(Lge7;Lge7;II)V

    goto :goto_6

    :cond_a
    move/from16 v24, v13

    move v13, v10

    :goto_6
    if-nez v24, :cond_e

    if-eqz p9, :cond_c

    const/4 v6, 0x3

    const/4 v10, 0x0

    .line 19
    invoke-virtual {v1, v8, v7, v10, v6}, Lka4;->e(Lge7;Lge7;II)V

    if-lez v14, :cond_b

    .line 20
    invoke-virtual {v1, v8, v7, v14, v13}, Lka4;->f(Lge7;Lge7;II)V

    :cond_b
    const v6, 0x7fffffff

    if-ge v2, v6, :cond_d

    .line 21
    invoke-virtual {v1, v8, v7, v2, v13}, Lka4;->g(Lge7;Lge7;II)V

    goto :goto_7

    .line 22
    :cond_c
    invoke-virtual {v1, v8, v7, v15, v13}, Lka4;->e(Lge7;Lge7;II)V

    :cond_d
    :goto_7
    move/from16 v10, p5

    move v13, v4

    goto/16 :goto_b

    :cond_e
    const/4 v10, 0x2

    if-eq v11, v10, :cond_11

    if-nez p17, :cond_11

    const/4 v2, 0x1

    if-eq v3, v2, :cond_f

    if-nez v3, :cond_11

    .line 23
    :cond_f
    invoke-static {v4, v15}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-lez v5, :cond_10

    .line 24
    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_10
    const/16 v13, 0x8

    .line 25
    invoke-virtual {v1, v8, v7, v2, v13}, Lka4;->e(Lge7;Lge7;II)V

    move/from16 v10, p5

    move v13, v4

    const/16 v24, 0x0

    goto/16 :goto_b

    :cond_11
    const/4 v2, -0x2

    if-ne v4, v2, :cond_12

    move v4, v15

    :cond_12
    if-ne v5, v2, :cond_13

    move v5, v15

    :cond_13
    if-lez v15, :cond_14

    const/4 v2, 0x1

    if-eq v3, v2, :cond_14

    const/4 v15, 0x0

    :cond_14
    const/16 v13, 0x8

    if-lez v4, :cond_15

    .line 26
    invoke-virtual {v1, v8, v7, v4, v13}, Lka4;->f(Lge7;Lge7;II)V

    .line 27
    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    move-result v15

    :cond_15
    const/4 v2, 0x1

    if-lez v5, :cond_17

    if-eqz p3, :cond_16

    if-ne v3, v2, :cond_16

    goto :goto_8

    .line 28
    :cond_16
    invoke-virtual {v1, v8, v7, v5, v13}, Lka4;->g(Lge7;Lge7;II)V

    .line 29
    :goto_8
    invoke-static {v15, v5}, Ljava/lang/Math;->min(II)I

    move-result v15

    :cond_17
    if-ne v3, v2, :cond_1a

    if-eqz p3, :cond_18

    .line 30
    invoke-virtual {v1, v8, v7, v15, v13}, Lka4;->e(Lge7;Lge7;II)V

    const/4 v2, 0x5

    goto :goto_7

    :cond_18
    if-eqz p19, :cond_19

    const/4 v2, 0x5

    .line 31
    invoke-virtual {v1, v8, v7, v15, v2}, Lka4;->e(Lge7;Lge7;II)V

    .line 32
    invoke-virtual {v1, v8, v7, v15, v13}, Lka4;->g(Lge7;Lge7;II)V

    goto :goto_7

    :cond_19
    const/4 v2, 0x5

    .line 33
    invoke-virtual {v1, v8, v7, v15, v2}, Lka4;->e(Lge7;Lge7;II)V

    .line 34
    invoke-virtual {v1, v8, v7, v15, v13}, Lka4;->g(Lge7;Lge7;II)V

    goto :goto_7

    :cond_1a
    const/4 v2, 0x5

    const/4 v10, 0x2

    if-ne v3, v10, :cond_1e

    .line 35
    iget v13, v12, Lu21;->e:I

    const/4 v15, 0x3

    if-eq v13, v15, :cond_1b

    if-ne v13, v2, :cond_1c

    :cond_1b
    const/4 v13, 0x4

    goto :goto_9

    .line 36
    :cond_1c
    iget-object v2, v0, Lm31;->T:Ln31;

    .line 37
    invoke-virtual {v2, v10}, Lm31;->i(I)Lu21;

    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, Lka4;->k(Ljava/lang/Object;)Lge7;

    move-result-object v2

    .line 39
    iget-object v10, v0, Lm31;->T:Ln31;

    const/4 v13, 0x4

    .line 40
    invoke-virtual {v10, v13}, Lm31;->i(I)Lu21;

    move-result-object v10

    .line 41
    invoke-virtual {v1, v10}, Lka4;->k(Ljava/lang/Object;)Lge7;

    move-result-object v10

    goto :goto_a

    .line 42
    :goto_9
    iget-object v2, v0, Lm31;->T:Ln31;

    const/4 v15, 0x3

    .line 43
    invoke-virtual {v2, v15}, Lm31;->i(I)Lu21;

    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Lka4;->k(Ljava/lang/Object;)Lge7;

    move-result-object v2

    .line 45
    iget-object v10, v0, Lm31;->T:Ln31;

    const/4 v15, 0x5

    .line 46
    invoke-virtual {v10, v15}, Lm31;->i(I)Lu21;

    move-result-object v10

    .line 47
    invoke-virtual {v1, v10}, Lka4;->k(Ljava/lang/Object;)Lge7;

    move-result-object v10

    .line 48
    :goto_a
    invoke-virtual {v1}, Lka4;->l()Lzt;

    move-result-object v15

    .line 49
    iget-object v13, v15, Lzt;->d:Lmt;

    move/from16 p9, v4

    const/high16 v4, -0x40800000    # -1.0f

    invoke-virtual {v13, v8, v4}, Lmt;->g(Lge7;F)V

    .line 50
    iget-object v4, v15, Lzt;->d:Lmt;

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-virtual {v4, v7, v13}, Lmt;->g(Lge7;F)V

    .line 51
    iget-object v4, v15, Lzt;->d:Lmt;

    invoke-virtual {v4, v10, v6}, Lmt;->g(Lge7;F)V

    .line 52
    iget-object v4, v15, Lzt;->d:Lmt;

    neg-float v6, v6

    invoke-virtual {v4, v2, v6}, Lmt;->g(Lge7;F)V

    .line 53
    invoke-virtual {v1, v15}, Lka4;->c(Lzt;)V

    if-eqz p3, :cond_1d

    const/16 v24, 0x0

    :cond_1d
    move/from16 v10, p5

    move/from16 v13, p9

    goto :goto_b

    :cond_1e
    move/from16 p9, v4

    move/from16 v13, p9

    const/4 v10, 0x1

    :goto_b
    if-eqz p27, :cond_1f

    if-eqz p19, :cond_20

    :cond_1f
    move-object/from16 v15, p6

    move-object/from16 v4, p7

    move-object v2, v7

    move-object v7, v8

    move/from16 p5, v10

    const/4 v3, 0x3

    const/4 v10, 0x2

    goto/16 :goto_2c

    :cond_20
    if-nez v16, :cond_21

    if-nez v17, :cond_21

    if-nez v19, :cond_21

    move-object/from16 v13, p11

    move-object v7, v8

    move/from16 p5, v10

    move-object/from16 v6, v20

    :goto_c
    const/4 v15, 0x5

    goto/16 :goto_28

    :cond_21
    if-eqz v16, :cond_23

    if-nez v17, :cond_23

    .line 54
    iget-object v0, v12, Lu21;->f:Lu21;

    iget-object v0, v0, Lu21;->d:Lm31;

    if-eqz p3, :cond_22

    .line 55
    instance-of v0, v0, Lf10;

    if-eqz v0, :cond_22

    const/16 v0, 0x8

    goto :goto_d

    :cond_22
    const/4 v0, 0x5

    :goto_d
    move-object/from16 v13, p11

    move-object v7, v8

    move/from16 p5, v10

    move-object/from16 v6, v20

    move/from16 v20, p3

    move v10, v0

    goto/16 :goto_29

    :cond_23
    if-nez v16, :cond_25

    if-eqz v17, :cond_25

    .line 56
    invoke-virtual/range {p11 .. p11}, Lu21;->e()I

    move-result v0

    neg-int v0, v0

    move-object/from16 v6, v20

    const/16 v13, 0x8

    .line 57
    invoke-virtual {v1, v8, v6, v0, v13}, Lka4;->e(Lge7;Lge7;II)V

    if-eqz p3, :cond_24

    move-object/from16 v15, p6

    const/4 v0, 0x0

    const/4 v2, 0x5

    .line 58
    invoke-virtual {v1, v7, v15, v0, v2}, Lka4;->f(Lge7;Lge7;II)V

    move-object/from16 v13, p11

    move v15, v2

    move-object v7, v8

    move/from16 p5, v10

    goto/16 :goto_28

    :cond_24
    move-object/from16 v13, p11

    move-object v7, v8

    move/from16 p5, v10

    goto :goto_c

    :cond_25
    move-object/from16 v15, p6

    move-object/from16 v6, v20

    if-eqz v16, :cond_24

    if-eqz v17, :cond_24

    .line 59
    iget-object v2, v12, Lu21;->f:Lu21;

    iget-object v11, v2, Lu21;->d:Lm31;

    move-object/from16 v2, p11

    .line 60
    iget-object v4, v2, Lu21;->f:Lu21;

    iget-object v4, v4, Lu21;->d:Lm31;

    move/from16 p5, v10

    .line 61
    iget-object v10, v0, Lm31;->T:Ln31;

    const/16 v16, 0x6

    if-eqz v24, :cond_3a

    if-nez v3, :cond_2a

    if-nez v5, :cond_27

    if-nez v13, :cond_27

    .line 62
    iget-boolean v5, v9, Lge7;->h0:Z

    if-eqz v5, :cond_26

    iget-boolean v5, v6, Lge7;->h0:Z

    if-eqz v5, :cond_26

    .line 63
    invoke-virtual {v12}, Lu21;->e()I

    move-result v0

    const/16 v13, 0x8

    .line 64
    invoke-virtual {v1, v7, v9, v0, v13}, Lka4;->e(Lge7;Lge7;II)V

    .line 65
    invoke-virtual {v2}, Lu21;->e()I

    move-result v0

    neg-int v0, v0

    .line 66
    invoke-virtual {v1, v8, v6, v0, v13}, Lka4;->e(Lge7;Lge7;II)V

    return-void

    :cond_26
    const/16 v5, 0x8

    const/16 v17, 0x8

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v23, 0x0

    goto :goto_e

    :cond_27
    const/4 v5, 0x5

    const/16 v17, 0x5

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v23, 0x1

    .line 67
    :goto_e
    instance-of v1, v11, Lf10;

    if-nez v1, :cond_29

    instance-of v1, v4, Lf10;

    if-eqz v1, :cond_28

    goto :goto_10

    :cond_28
    move-object/from16 v1, p1

    move-object v2, v7

    move-object v7, v8

    move/from16 v25, v20

    move v8, v5

    move-object v5, v9

    move/from16 v9, v16

    move/from16 v20, v19

    move/from16 v19, v17

    move/from16 v17, v3

    :goto_f
    move-object/from16 v3, p7

    goto/16 :goto_1d

    :cond_29
    :goto_10
    move-object/from16 v1, p1

    move/from16 v17, v3

    move-object v2, v7

    move-object v7, v8

    move/from16 v25, v20

    move-object/from16 v3, p7

    move v8, v5

    move-object v5, v9

    move/from16 v9, v16

    move/from16 v20, v19

    const/16 v19, 0x4

    goto/16 :goto_1d

    :cond_2a
    const/4 v1, 0x2

    if-ne v3, v1, :cond_2d

    .line 68
    instance-of v1, v11, Lf10;

    if-nez v1, :cond_2c

    instance-of v1, v4, Lf10;

    if-eqz v1, :cond_2b

    goto :goto_12

    :cond_2b
    move-object/from16 v1, p1

    move/from16 v17, v3

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x5

    :goto_11
    const/16 v20, 0x1

    const/16 v23, 0x1

    const/16 v25, 0x0

    goto :goto_f

    :cond_2c
    :goto_12
    move-object/from16 v1, p1

    move/from16 v17, v3

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    :goto_13
    const/16 v19, 0x4

    goto :goto_11

    :cond_2d
    const/4 v1, 0x1

    if-ne v3, v1, :cond_2e

    move-object/from16 v1, p1

    move/from16 v17, v3

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/16 v8, 0x8

    goto :goto_13

    :cond_2e
    const/4 v1, 0x3

    if-ne v3, v1, :cond_39

    .line 69
    iget v1, v0, Lm31;->A:I

    move/from16 v17, v3

    const/4 v3, -0x1

    if-ne v1, v3, :cond_31

    if-eqz p20, :cond_30

    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    const/16 v8, 0x8

    if-eqz p3, :cond_2f

    const/4 v9, 0x5

    :goto_14
    const/16 v19, 0x5

    :goto_15
    const/16 v20, 0x1

    const/16 v23, 0x1

    const/16 v25, 0x1

    goto/16 :goto_1d

    :cond_2f
    const/4 v9, 0x4

    goto :goto_14

    :cond_30
    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    const/16 v8, 0x8

    const/16 v9, 0x8

    goto :goto_14

    :cond_31
    if-eqz p17, :cond_34

    move/from16 v3, p23

    const/4 v1, 0x2

    if-eq v3, v1, :cond_33

    const/4 v1, 0x1

    if-ne v3, v1, :cond_32

    goto :goto_16

    :cond_32
    const/16 v1, 0x8

    const/4 v3, 0x5

    goto :goto_17

    :cond_33
    :goto_16
    const/4 v1, 0x5

    const/4 v3, 0x4

    :goto_17
    move/from16 v19, v3

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/16 v20, 0x1

    const/16 v23, 0x1

    const/16 v25, 0x1

    move-object/from16 v3, p7

    :goto_18
    move v8, v1

    move-object/from16 v1, p1

    goto/16 :goto_1d

    :cond_34
    if-lez v5, :cond_35

    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    goto :goto_14

    :cond_35
    if-nez v5, :cond_38

    if-nez v13, :cond_38

    if-nez p20, :cond_36

    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x8

    goto :goto_15

    :cond_36
    if-eq v11, v10, :cond_37

    if-eq v4, v10, :cond_37

    const/4 v1, 0x4

    goto :goto_19

    :cond_37
    const/4 v1, 0x5

    :goto_19
    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/16 v19, 0x4

    const/16 v20, 0x1

    const/16 v23, 0x1

    const/16 v25, 0x1

    goto :goto_18

    :cond_38
    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x4

    goto :goto_15

    :cond_39
    move/from16 v17, v3

    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x4

    const/16 v20, 0x0

    const/16 v23, 0x0

    :goto_1a
    const/16 v25, 0x0

    goto :goto_1d

    :cond_3a
    move/from16 v17, v3

    .line 70
    iget-boolean v1, v9, Lge7;->h0:Z

    if-eqz v1, :cond_3c

    iget-boolean v1, v6, Lge7;->h0:Z

    if-eqz v1, :cond_3c

    .line 71
    invoke-virtual {v12}, Lu21;->e()I

    move-result v0

    .line 72
    invoke-virtual {v2}, Lu21;->e()I

    move-result v1

    const/16 v3, 0x8

    move-object/from16 p17, p1

    move/from16 p21, p16

    move/from16 p20, v0

    move/from16 p24, v1

    move/from16 p25, v3

    move-object/from16 p22, v6

    move-object/from16 p18, v7

    move-object/from16 p23, v8

    move-object/from16 p19, v9

    .line 73
    invoke-virtual/range {p17 .. p25}, Lka4;->b(Lge7;Lge7;IFLge7;Lge7;II)V

    move-object/from16 v1, p17

    move-object/from16 v7, p23

    if-eqz p3, :cond_5b

    if-eqz p5, :cond_5b

    .line 74
    iget-object v0, v2, Lu21;->f:Lu21;

    if-eqz v0, :cond_3b

    .line 75
    invoke-virtual {v2}, Lu21;->e()I

    move-result v15

    :goto_1b
    move-object/from16 v3, p7

    goto :goto_1c

    :cond_3b
    const/4 v15, 0x0

    goto :goto_1b

    :goto_1c
    if-eq v6, v3, :cond_5b

    const/4 v2, 0x5

    .line 76
    invoke-virtual {v1, v3, v7, v15, v2}, Lka4;->f(Lge7;Lge7;II)V

    return-void

    :cond_3c
    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x4

    const/16 v20, 0x1

    const/16 v23, 0x1

    goto :goto_1a

    :goto_1d
    if-eqz v23, :cond_3d

    if-ne v5, v6, :cond_3d

    if-eq v11, v10, :cond_3d

    const/16 v23, 0x0

    const/16 v26, 0x0

    goto :goto_1e

    :cond_3d
    const/16 v26, 0x1

    :goto_1e
    if-eqz v20, :cond_3f

    if-nez v24, :cond_3e

    if-nez p18, :cond_3e

    if-nez p20, :cond_3e

    if-ne v5, v15, :cond_3e

    if-ne v6, v3, :cond_3e

    const/16 v9, 0x8

    const/16 v20, 0x0

    const/16 v26, 0x8

    const/16 v27, 0x0

    :goto_1f
    move-object v8, v4

    goto :goto_20

    :cond_3e
    move/from16 v20, p3

    move/from16 v27, v26

    move/from16 v26, v8

    goto :goto_1f

    .line 77
    :goto_20
    invoke-virtual {v12}, Lu21;->e()I

    move-result v4

    move-object/from16 v28, v8

    .line 78
    invoke-virtual/range {p11 .. p11}, Lu21;->e()I

    move-result v8

    move-object v3, v5

    move/from16 p8, v13

    move/from16 v14, v17

    move-object/from16 v12, v28

    move-object/from16 v13, p11

    move/from16 v5, p16

    .line 79
    invoke-virtual/range {v1 .. v9}, Lka4;->b(Lge7;Lge7;IFLge7;Lge7;II)V

    move-object v5, v3

    move/from16 v8, v26

    move/from16 v26, v27

    goto :goto_21

    :cond_3f
    move-object v12, v4

    move/from16 p8, v13

    move/from16 v14, v17

    move-object/from16 v13, p11

    move/from16 v20, p3

    .line 80
    :goto_21
    iget v0, v0, Lm31;->g0:I

    const/16 v3, 0x8

    if-ne v0, v3, :cond_41

    .line 81
    iget-object v0, v13, Lu21;->a:Ljava/util/HashSet;

    if-nez v0, :cond_40

    goto/16 :goto_30

    .line 82
    :cond_40
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-lez v0, :cond_5b

    :cond_41
    if-eqz v23, :cond_44

    if-eqz v20, :cond_43

    if-eq v5, v6, :cond_43

    if-nez v24, :cond_43

    .line 83
    instance-of v0, v11, Lf10;

    if-nez v0, :cond_42

    instance-of v0, v12, Lf10;

    if-eqz v0, :cond_43

    :cond_42
    move/from16 v8, v16

    .line 84
    :cond_43
    invoke-virtual/range {p10 .. p10}, Lu21;->e()I

    move-result v0

    .line 85
    invoke-virtual {v1, v2, v5, v0, v8}, Lka4;->f(Lge7;Lge7;II)V

    .line 86
    invoke-virtual {v13}, Lu21;->e()I

    move-result v0

    neg-int v0, v0

    invoke-virtual {v1, v7, v6, v0, v8}, Lka4;->g(Lge7;Lge7;II)V

    :cond_44
    if-eqz v20, :cond_45

    if-eqz p21, :cond_45

    .line 87
    instance-of v0, v11, Lf10;

    if-nez v0, :cond_45

    instance-of v0, v12, Lf10;

    if-nez v0, :cond_45

    if-eq v12, v10, :cond_45

    move/from16 v0, v16

    move v8, v0

    const/16 v21, 0x1

    goto :goto_22

    :cond_45
    move/from16 v0, v19

    move/from16 v21, v26

    :goto_22
    if-eqz v21, :cond_51

    if-eqz v25, :cond_4e

    if-eqz p20, :cond_46

    if-eqz p4, :cond_4e

    :cond_46
    if-eq v11, v10, :cond_48

    if-ne v12, v10, :cond_47

    goto :goto_23

    :cond_47
    move/from16 v16, v0

    .line 88
    :cond_48
    :goto_23
    instance-of v3, v11, Lav2;

    if-nez v3, :cond_49

    instance-of v3, v12, Lav2;

    if-eqz v3, :cond_4a

    :cond_49
    const/16 v16, 0x5

    .line 89
    :cond_4a
    instance-of v3, v11, Lf10;

    if-nez v3, :cond_4b

    instance-of v3, v12, Lf10;

    if-eqz v3, :cond_4c

    :cond_4b
    const/16 v16, 0x5

    :cond_4c
    if-eqz p20, :cond_4d

    const/4 v3, 0x5

    goto :goto_24

    :cond_4d
    move/from16 v3, v16

    .line 90
    :goto_24
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_4e
    if-eqz v20, :cond_50

    .line 91
    invoke-static {v8, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-eqz p17, :cond_50

    if-nez p20, :cond_50

    if-eq v11, v10, :cond_4f

    if-ne v12, v10, :cond_50

    :cond_4f
    const/4 v10, 0x4

    goto :goto_25

    :cond_50
    move v10, v0

    .line 92
    :goto_25
    invoke-virtual/range {p10 .. p10}, Lu21;->e()I

    move-result v0

    .line 93
    invoke-virtual {v1, v2, v5, v0, v10}, Lka4;->e(Lge7;Lge7;II)V

    .line 94
    invoke-virtual {v13}, Lu21;->e()I

    move-result v0

    neg-int v0, v0

    invoke-virtual {v1, v7, v6, v0, v10}, Lka4;->e(Lge7;Lge7;II)V

    :cond_51
    if-eqz v20, :cond_53

    if-ne v15, v5, :cond_52

    .line 95
    invoke-virtual/range {p10 .. p10}, Lu21;->e()I

    move-result v0

    goto :goto_26

    :cond_52
    const/4 v0, 0x0

    :goto_26
    if-eq v5, v15, :cond_53

    const/4 v3, 0x5

    .line 96
    invoke-virtual {v1, v2, v15, v0, v3}, Lka4;->f(Lge7;Lge7;II)V

    :cond_53
    if-eqz v20, :cond_54

    if-eqz v24, :cond_54

    if-nez p14, :cond_54

    if-nez p8, :cond_54

    if-eqz v24, :cond_55

    const/4 v3, 0x3

    if-ne v14, v3, :cond_55

    const/16 v3, 0x8

    const/4 v10, 0x0

    .line 97
    invoke-virtual {v1, v7, v2, v10, v3}, Lka4;->f(Lge7;Lge7;II)V

    :cond_54
    const/4 v15, 0x5

    goto :goto_27

    :cond_55
    const/4 v10, 0x0

    const/4 v15, 0x5

    .line 98
    invoke-virtual {v1, v7, v2, v10, v15}, Lka4;->f(Lge7;Lge7;II)V

    :goto_27
    move v10, v15

    goto :goto_29

    :goto_28
    move/from16 v20, p3

    goto :goto_27

    :goto_29
    if-eqz v20, :cond_5b

    if-eqz p5, :cond_5b

    .line 99
    iget-object v0, v13, Lu21;->f:Lu21;

    if-eqz v0, :cond_56

    .line 100
    invoke-virtual {v13}, Lu21;->e()I

    move-result v15

    :goto_2a
    move-object/from16 v4, p7

    goto :goto_2b

    :cond_56
    const/4 v15, 0x0

    goto :goto_2a

    :goto_2b
    if-eq v6, v4, :cond_5b

    .line 101
    invoke-virtual {v1, v4, v7, v15, v10}, Lka4;->f(Lge7;Lge7;II)V

    return-void

    :goto_2c
    if-ge v11, v10, :cond_5b

    if-eqz p3, :cond_5b

    if-eqz p5, :cond_5b

    const/4 v10, 0x0

    const/16 v13, 0x8

    .line 102
    invoke-virtual {v1, v2, v15, v10, v13}, Lka4;->f(Lge7;Lge7;II)V

    .line 103
    iget-object v0, v0, Lm31;->M:Lu21;

    if-nez p2, :cond_58

    iget-object v2, v0, Lu21;->f:Lu21;

    if-nez v2, :cond_57

    goto :goto_2d

    :cond_57
    const/4 v10, 0x0

    goto :goto_2e

    :cond_58
    :goto_2d
    const/4 v10, 0x1

    :goto_2e
    if-nez p2, :cond_5a

    .line 104
    iget-object v0, v0, Lu21;->f:Lu21;

    if-eqz v0, :cond_5a

    .line 105
    iget-object v0, v0, Lu21;->d:Lm31;

    .line 106
    iget v2, v0, Lm31;->W:F

    const/4 v5, 0x0

    cmpl-float v2, v2, v5

    if-eqz v2, :cond_59

    iget-object v0, v0, Lm31;->p0:[I

    const/16 v22, 0x0

    aget v2, v0, v22

    if-ne v2, v3, :cond_59

    const/16 v21, 0x1

    aget v0, v0, v21

    if-ne v0, v3, :cond_59

    move/from16 v10, v21

    goto :goto_2f

    :cond_59
    const/4 v10, 0x0

    :cond_5a
    :goto_2f
    if-eqz v10, :cond_5b

    const/4 v10, 0x0

    const/16 v13, 0x8

    .line 107
    invoke-virtual {v1, v4, v7, v10, v13}, Lka4;->f(Lge7;Lge7;II)V

    :cond_5b
    :goto_30
    return-void
.end method

.method public final e(ILm31;II)V
    .locals 10

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x5

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x7

    .line 11
    if-ne p1, v7, :cond_c

    .line 12
    .line 13
    if-ne p3, v7, :cond_8

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Lm31;->i(I)Lu21;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, v4}, Lm31;->i(I)Lu21;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-virtual {p0, v3}, Lm31;->i(I)Lu21;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    invoke-virtual {p0, v5}, Lm31;->i(I)Lu21;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    const/4 v9, 0x1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Lu21;->h()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    :cond_0
    if-eqz p3, :cond_2

    .line 41
    .line 42
    invoke-virtual {p3}, Lu21;->h()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    :cond_1
    move p1, v6

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {p0, v2, p2, v2, v6}, Lm31;->e(ILm31;II)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v4, p2, v4, v6}, Lm31;->e(ILm31;II)V

    .line 54
    .line 55
    .line 56
    move p1, v9

    .line 57
    :goto_0
    if-eqz p4, :cond_3

    .line 58
    .line 59
    invoke-virtual {p4}, Lu21;->h()Z

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-nez p3, :cond_4

    .line 64
    .line 65
    :cond_3
    if-eqz v8, :cond_5

    .line 66
    .line 67
    invoke-virtual {v8}, Lu21;->h()Z

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    if-eqz p3, :cond_5

    .line 72
    .line 73
    :cond_4
    move v9, v6

    .line 74
    goto :goto_1

    .line 75
    :cond_5
    invoke-virtual {p0, v3, p2, v3, v6}, Lm31;->e(ILm31;II)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v5, p2, v5, v6}, Lm31;->e(ILm31;II)V

    .line 79
    .line 80
    .line 81
    :goto_1
    if-eqz p1, :cond_6

    .line 82
    .line 83
    if-eqz v9, :cond_6

    .line 84
    .line 85
    invoke-virtual {p0, v7}, Lm31;->i(I)Lu21;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p2, v7}, Lm31;->i(I)Lu21;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p0, p1, v6}, Lu21;->a(Lu21;I)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_6
    if-eqz p1, :cond_7

    .line 98
    .line 99
    invoke-virtual {p0, v1}, Lm31;->i(I)Lu21;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p2, v1}, Lm31;->i(I)Lu21;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p0, p1, v6}, Lu21;->a(Lu21;I)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_7
    if-eqz v9, :cond_1c

    .line 112
    .line 113
    invoke-virtual {p0, v0}, Lm31;->i(I)Lu21;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p2, v0}, Lm31;->i(I)Lu21;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p0, p1, v6}, Lu21;->a(Lu21;I)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_8
    if-eq p3, v2, :cond_b

    .line 126
    .line 127
    if-ne p3, v4, :cond_9

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_9
    if-eq p3, v3, :cond_a

    .line 131
    .line 132
    if-ne p3, v5, :cond_1c

    .line 133
    .line 134
    :cond_a
    invoke-virtual {p0, v3, p2, p3, v6}, Lm31;->e(ILm31;II)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v5, p2, p3, v6}, Lm31;->e(ILm31;II)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v7}, Lm31;->i(I)Lu21;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {p2, p3}, Lm31;->i(I)Lu21;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p0, p1, v6}, Lu21;->a(Lu21;I)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_b
    :goto_2
    invoke-virtual {p0, v2, p2, p3, v6}, Lm31;->e(ILm31;II)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v4, p2, p3, v6}, Lm31;->e(ILm31;II)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v7}, Lm31;->i(I)Lu21;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-virtual {p2, p3}, Lm31;->i(I)Lu21;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p0, p1, v6}, Lu21;->a(Lu21;I)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_c
    if-ne p1, v1, :cond_e

    .line 171
    .line 172
    if-eq p3, v2, :cond_d

    .line 173
    .line 174
    if-ne p3, v4, :cond_e

    .line 175
    .line 176
    :cond_d
    invoke-virtual {p0, v2}, Lm31;->i(I)Lu21;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {p2, p3}, Lm31;->i(I)Lu21;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-virtual {p0, v4}, Lm31;->i(I)Lu21;

    .line 185
    .line 186
    .line 187
    move-result-object p3

    .line 188
    invoke-virtual {p1, p2, v6}, Lu21;->a(Lu21;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p3, p2, v6}, Lu21;->a(Lu21;I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v1}, Lm31;->i(I)Lu21;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-virtual {p0, p2, v6}, Lu21;->a(Lu21;I)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_e
    if-ne p1, v0, :cond_10

    .line 203
    .line 204
    if-eq p3, v3, :cond_f

    .line 205
    .line 206
    if-ne p3, v5, :cond_10

    .line 207
    .line 208
    :cond_f
    invoke-virtual {p2, p3}, Lm31;->i(I)Lu21;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {p0, v3}, Lm31;->i(I)Lu21;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    invoke-virtual {p2, p1, v6}, Lu21;->a(Lu21;I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0, v5}, Lm31;->i(I)Lu21;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    invoke-virtual {p2, p1, v6}, Lu21;->a(Lu21;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v0}, Lm31;->i(I)Lu21;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-virtual {p0, p1, v6}, Lu21;->a(Lu21;I)V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :cond_10
    if-ne p1, v1, :cond_11

    .line 235
    .line 236
    if-ne p3, v1, :cond_11

    .line 237
    .line 238
    invoke-virtual {p0, v2}, Lm31;->i(I)Lu21;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-virtual {p2, v2}, Lm31;->i(I)Lu21;

    .line 243
    .line 244
    .line 245
    move-result-object p4

    .line 246
    invoke-virtual {p1, p4, v6}, Lu21;->a(Lu21;I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0, v4}, Lm31;->i(I)Lu21;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-virtual {p2, v4}, Lm31;->i(I)Lu21;

    .line 254
    .line 255
    .line 256
    move-result-object p4

    .line 257
    invoke-virtual {p1, p4, v6}, Lu21;->a(Lu21;I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0, v1}, Lm31;->i(I)Lu21;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-virtual {p2, p3}, Lm31;->i(I)Lu21;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-virtual {p0, p1, v6}, Lu21;->a(Lu21;I)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :cond_11
    if-ne p1, v0, :cond_12

    .line 273
    .line 274
    if-ne p3, v0, :cond_12

    .line 275
    .line 276
    invoke-virtual {p0, v3}, Lm31;->i(I)Lu21;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-virtual {p2, v3}, Lm31;->i(I)Lu21;

    .line 281
    .line 282
    .line 283
    move-result-object p4

    .line 284
    invoke-virtual {p1, p4, v6}, Lu21;->a(Lu21;I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p0, v5}, Lm31;->i(I)Lu21;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    invoke-virtual {p2, v5}, Lm31;->i(I)Lu21;

    .line 292
    .line 293
    .line 294
    move-result-object p4

    .line 295
    invoke-virtual {p1, p4, v6}, Lu21;->a(Lu21;I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0, v0}, Lm31;->i(I)Lu21;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-virtual {p2, p3}, Lm31;->i(I)Lu21;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-virtual {p0, p1, v6}, Lu21;->a(Lu21;I)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_12
    invoke-virtual {p0, p1}, Lm31;->i(I)Lu21;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    invoke-virtual {p2, p3}, Lm31;->i(I)Lu21;

    .line 315
    .line 316
    .line 317
    move-result-object p2

    .line 318
    invoke-virtual {v6, p2}, Lu21;->i(Lu21;)Z

    .line 319
    .line 320
    .line 321
    move-result p3

    .line 322
    if-eqz p3, :cond_1c

    .line 323
    .line 324
    const/4 p3, 0x6

    .line 325
    if-ne p1, p3, :cond_14

    .line 326
    .line 327
    invoke-virtual {p0, v3}, Lm31;->i(I)Lu21;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    invoke-virtual {p0, v5}, Lm31;->i(I)Lu21;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    if-eqz p1, :cond_13

    .line 336
    .line 337
    invoke-virtual {p1}, Lu21;->j()V

    .line 338
    .line 339
    .line 340
    :cond_13
    if-eqz p0, :cond_1b

    .line 341
    .line 342
    invoke-virtual {p0}, Lu21;->j()V

    .line 343
    .line 344
    .line 345
    goto :goto_4

    .line 346
    :cond_14
    if-eq p1, v3, :cond_18

    .line 347
    .line 348
    if-ne p1, v5, :cond_15

    .line 349
    .line 350
    goto :goto_3

    .line 351
    :cond_15
    if-eq p1, v2, :cond_16

    .line 352
    .line 353
    if-ne p1, v4, :cond_1b

    .line 354
    .line 355
    :cond_16
    invoke-virtual {p0, v7}, Lm31;->i(I)Lu21;

    .line 356
    .line 357
    .line 358
    move-result-object p3

    .line 359
    iget-object v0, p3, Lu21;->f:Lu21;

    .line 360
    .line 361
    if-eq v0, p2, :cond_17

    .line 362
    .line 363
    invoke-virtual {p3}, Lu21;->j()V

    .line 364
    .line 365
    .line 366
    :cond_17
    invoke-virtual {p0, p1}, Lm31;->i(I)Lu21;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    invoke-virtual {p1}, Lu21;->f()Lu21;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    invoke-virtual {p0, v1}, Lm31;->i(I)Lu21;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    invoke-virtual {p0}, Lu21;->h()Z

    .line 379
    .line 380
    .line 381
    move-result p3

    .line 382
    if-eqz p3, :cond_1b

    .line 383
    .line 384
    invoke-virtual {p1}, Lu21;->j()V

    .line 385
    .line 386
    .line 387
    invoke-virtual {p0}, Lu21;->j()V

    .line 388
    .line 389
    .line 390
    goto :goto_4

    .line 391
    :cond_18
    :goto_3
    invoke-virtual {p0, p3}, Lm31;->i(I)Lu21;

    .line 392
    .line 393
    .line 394
    move-result-object p3

    .line 395
    if-eqz p3, :cond_19

    .line 396
    .line 397
    invoke-virtual {p3}, Lu21;->j()V

    .line 398
    .line 399
    .line 400
    :cond_19
    invoke-virtual {p0, v7}, Lm31;->i(I)Lu21;

    .line 401
    .line 402
    .line 403
    move-result-object p3

    .line 404
    iget-object v1, p3, Lu21;->f:Lu21;

    .line 405
    .line 406
    if-eq v1, p2, :cond_1a

    .line 407
    .line 408
    invoke-virtual {p3}, Lu21;->j()V

    .line 409
    .line 410
    .line 411
    :cond_1a
    invoke-virtual {p0, p1}, Lm31;->i(I)Lu21;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    invoke-virtual {p1}, Lu21;->f()Lu21;

    .line 416
    .line 417
    .line 418
    move-result-object p1

    .line 419
    invoke-virtual {p0, v0}, Lm31;->i(I)Lu21;

    .line 420
    .line 421
    .line 422
    move-result-object p0

    .line 423
    invoke-virtual {p0}, Lu21;->h()Z

    .line 424
    .line 425
    .line 426
    move-result p3

    .line 427
    if-eqz p3, :cond_1b

    .line 428
    .line 429
    invoke-virtual {p1}, Lu21;->j()V

    .line 430
    .line 431
    .line 432
    invoke-virtual {p0}, Lu21;->j()V

    .line 433
    .line 434
    .line 435
    :cond_1b
    :goto_4
    invoke-virtual {v6, p2, p4}, Lu21;->a(Lu21;I)V

    .line 436
    .line 437
    .line 438
    :cond_1c
    return-void
.end method

.method public final f(Lu21;Lu21;I)V
    .locals 1

    .line 1
    iget-object v0, p1, Lu21;->d:Lm31;

    .line 2
    .line 3
    if-ne v0, p0, :cond_0

    .line 4
    .line 5
    iget p1, p1, Lu21;->e:I

    .line 6
    .line 7
    iget-object v0, p2, Lu21;->d:Lm31;

    .line 8
    .line 9
    iget p2, p2, Lu21;->e:I

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, p2, p3}, Lm31;->e(ILm31;II)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final g(Lka4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm31;->I:Lu21;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm31;->J:Lu21;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lm31;->K:Lu21;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lm31;->L:Lu21;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 19
    .line 20
    .line 21
    iget v0, p0, Lm31;->a0:I

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Lm31;->M:Lu21;

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lka4;->k(Ljava/lang/Object;)Lge7;

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lm31;->d:Ly03;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ly03;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lk09;-><init>(Lm31;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lk09;->h:Lsi1;

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    iput v2, v1, Lsi1;->e:I

    .line 14
    .line 15
    iget-object v1, v0, Lk09;->i:Lsi1;

    .line 16
    .line 17
    const/4 v2, 0x5

    .line 18
    iput v2, v1, Lsi1;->e:I

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput v1, v0, Lk09;->f:I

    .line 22
    .line 23
    iput-object v0, p0, Lm31;->d:Ly03;

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lm31;->e:Lkv8;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    new-instance v0, Lkv8;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lk09;-><init>(Lm31;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lsi1;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Lsi1;-><init>(Lk09;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, v0, Lkv8;->k:Lsi1;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    iput-object v2, v0, Lkv8;->l:Lw20;

    .line 43
    .line 44
    iget-object v2, v0, Lk09;->h:Lsi1;

    .line 45
    .line 46
    const/4 v3, 0x6

    .line 47
    iput v3, v2, Lsi1;->e:I

    .line 48
    .line 49
    iget-object v2, v0, Lk09;->i:Lsi1;

    .line 50
    .line 51
    const/4 v3, 0x7

    .line 52
    iput v3, v2, Lsi1;->e:I

    .line 53
    .line 54
    const/16 v2, 0x8

    .line 55
    .line 56
    iput v2, v1, Lsi1;->e:I

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    iput v1, v0, Lk09;->f:I

    .line 60
    .line 61
    iput-object v0, p0, Lm31;->e:Lkv8;

    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public i(I)Lu21;
    .locals 1

    .line 1
    invoke-static {p1}, Lp61;->B(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Loi0;->z(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Lbt;->g(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    iget-object p0, p0, Lm31;->O:Lu21;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_1
    iget-object p0, p0, Lm31;->N:Lu21;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_2
    iget-object p0, p0, Lm31;->P:Lu21;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_3
    iget-object p0, p0, Lm31;->M:Lu21;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_4
    iget-object p0, p0, Lm31;->L:Lu21;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_5
    iget-object p0, p0, Lm31;->K:Lu21;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_6
    iget-object p0, p0, Lm31;->J:Lu21;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_7
    iget-object p0, p0, Lm31;->I:Lu21;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_8
    const/4 p0, 0x0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(I)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lm31;->p0:[I

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    aget p0, p0, v0

    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    const/4 v1, 0x1

    .line 10
    if-ne p1, v1, :cond_1

    .line 11
    .line 12
    aget p0, p0, v1

    .line 13
    .line 14
    return p0

    .line 15
    :cond_1
    return v0
.end method

.method public final k()I
    .locals 2

    .line 1
    iget v0, p0, Lm31;->g0:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget p0, p0, Lm31;->V:I

    .line 10
    .line 11
    return p0
.end method

.method public final l(I)Lm31;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lm31;->K:Lu21;

    .line 4
    .line 5
    iget-object p1, p0, Lu21;->f:Lu21;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-object v0, p1, Lu21;->f:Lu21;

    .line 10
    .line 11
    if-ne v0, p0, :cond_1

    .line 12
    .line 13
    iget-object p0, p1, Lu21;->d:Lm31;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lm31;->L:Lu21;

    .line 20
    .line 21
    iget-object p1, p0, Lu21;->f:Lu21;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object v0, p1, Lu21;->f:Lu21;

    .line 26
    .line 27
    if-ne v0, p0, :cond_1

    .line 28
    .line 29
    iget-object p0, p1, Lu21;->d:Lm31;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public final m(I)Lm31;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lm31;->I:Lu21;

    .line 4
    .line 5
    iget-object p1, p0, Lu21;->f:Lu21;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-object v0, p1, Lu21;->f:Lu21;

    .line 10
    .line 11
    if-ne v0, p0, :cond_1

    .line 12
    .line 13
    iget-object p0, p1, Lu21;->d:Lm31;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lm31;->J:Lu21;

    .line 20
    .line 21
    iget-object p1, p0, Lu21;->f:Lu21;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object v0, p1, Lu21;->f:Lu21;

    .line 26
    .line 27
    if-ne v0, p0, :cond_1

    .line 28
    .line 29
    iget-object p0, p1, Lu21;->d:Lm31;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public n(Ljava/lang/StringBuilder;)V
    .locals 14

    .line 1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v3, "  "

    .line 4
    .line 5
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v3, p0, Lm31;->j:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v3, ":{\n"

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v3, "    actualWidth:"

    .line 28
    .line 29
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget v3, p0, Lm31;->U:I

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v2, "\n"

    .line 45
    .line 46
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    new-instance v3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v4, "    actualHeight:"

    .line 52
    .line 53
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget v4, p0, Lm31;->V:I

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v4, "    actualLeft:"

    .line 74
    .line 75
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget v4, p0, Lm31;->Y:I

    .line 79
    .line 80
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    new-instance v3, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v4, "    actualTop:"

    .line 96
    .line 97
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget v4, p0, Lm31;->Z:I

    .line 101
    .line 102
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v2, "left"

    .line 116
    .line 117
    iget-object v3, p0, Lm31;->I:Lu21;

    .line 118
    .line 119
    invoke-static {p1, v2, v3}, Lm31;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Lu21;)V

    .line 120
    .line 121
    .line 122
    const-string v2, "top"

    .line 123
    .line 124
    iget-object v3, p0, Lm31;->J:Lu21;

    .line 125
    .line 126
    invoke-static {p1, v2, v3}, Lm31;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Lu21;)V

    .line 127
    .line 128
    .line 129
    const-string v2, "right"

    .line 130
    .line 131
    iget-object v3, p0, Lm31;->K:Lu21;

    .line 132
    .line 133
    invoke-static {p1, v2, v3}, Lm31;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Lu21;)V

    .line 134
    .line 135
    .line 136
    const-string v2, "bottom"

    .line 137
    .line 138
    iget-object v3, p0, Lm31;->L:Lu21;

    .line 139
    .line 140
    invoke-static {p1, v2, v3}, Lm31;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Lu21;)V

    .line 141
    .line 142
    .line 143
    const-string v2, "baseline"

    .line 144
    .line 145
    iget-object v3, p0, Lm31;->M:Lu21;

    .line 146
    .line 147
    invoke-static {p1, v2, v3}, Lm31;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Lu21;)V

    .line 148
    .line 149
    .line 150
    const-string v2, "centerX"

    .line 151
    .line 152
    iget-object v3, p0, Lm31;->N:Lu21;

    .line 153
    .line 154
    invoke-static {p1, v2, v3}, Lm31;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Lu21;)V

    .line 155
    .line 156
    .line 157
    const-string v2, "centerY"

    .line 158
    .line 159
    iget-object v3, p0, Lm31;->O:Lu21;

    .line 160
    .line 161
    invoke-static {p1, v2, v3}, Lm31;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Lu21;)V

    .line 162
    .line 163
    .line 164
    iget v3, p0, Lm31;->U:I

    .line 165
    .line 166
    iget v4, p0, Lm31;->b0:I

    .line 167
    .line 168
    iget-object v10, p0, Lm31;->C:[I

    .line 169
    .line 170
    const/4 v11, 0x0

    .line 171
    aget v5, v10, v11

    .line 172
    .line 173
    iget v6, p0, Lm31;->u:I

    .line 174
    .line 175
    iget v7, p0, Lm31;->r:I

    .line 176
    .line 177
    iget v8, p0, Lm31;->w:F

    .line 178
    .line 179
    iget-object v12, p0, Lm31;->p0:[I

    .line 180
    .line 181
    aget v9, v12, v11

    .line 182
    .line 183
    iget-object v13, p0, Lm31;->k0:[F

    .line 184
    .line 185
    aget v2, v13, v11

    .line 186
    .line 187
    const-string v2, "    width"

    .line 188
    .line 189
    move-object v1, p1

    .line 190
    invoke-static/range {v1 .. v9}, Lm31;->o(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIFI)V

    .line 191
    .line 192
    .line 193
    iget v3, p0, Lm31;->V:I

    .line 194
    .line 195
    iget v4, p0, Lm31;->c0:I

    .line 196
    .line 197
    const/4 v1, 0x1

    .line 198
    aget v5, v10, v1

    .line 199
    .line 200
    iget v6, p0, Lm31;->x:I

    .line 201
    .line 202
    iget v7, p0, Lm31;->s:I

    .line 203
    .line 204
    iget v8, p0, Lm31;->z:F

    .line 205
    .line 206
    aget v9, v12, v1

    .line 207
    .line 208
    aget v1, v13, v1

    .line 209
    .line 210
    const-string v2, "    height"

    .line 211
    .line 212
    move-object v1, p1

    .line 213
    invoke-static/range {v1 .. v9}, Lm31;->o(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIFI)V

    .line 214
    .line 215
    .line 216
    iget v2, p0, Lm31;->W:F

    .line 217
    .line 218
    iget v3, p0, Lm31;->X:I

    .line 219
    .line 220
    const/4 v4, 0x0

    .line 221
    cmpl-float v4, v2, v4

    .line 222
    .line 223
    if-nez v4, :cond_0

    .line 224
    .line 225
    goto :goto_0

    .line 226
    :cond_0
    const-string v4, "    dimensionRatio"

    .line 227
    .line 228
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v4, " :  ["

    .line 232
    .line 233
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const-string v2, ","

    .line 240
    .line 241
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v2, ""

    .line 248
    .line 249
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v2, "],\n"

    .line 253
    .line 254
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    :goto_0
    const-string v2, "    horizontalBias"

    .line 258
    .line 259
    iget v3, p0, Lm31;->d0:F

    .line 260
    .line 261
    const/high16 v4, 0x3f000000    # 0.5f

    .line 262
    .line 263
    invoke-static {p1, v2, v3, v4}, Lm31;->H(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    .line 264
    .line 265
    .line 266
    const-string v2, "    verticalBias"

    .line 267
    .line 268
    iget v3, p0, Lm31;->e0:F

    .line 269
    .line 270
    invoke-static {p1, v2, v3, v4}, Lm31;->H(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    .line 271
    .line 272
    .line 273
    const-string v2, "    horizontalChainStyle"

    .line 274
    .line 275
    iget v3, p0, Lm31;->i0:I

    .line 276
    .line 277
    invoke-static {v3, v11, v2, p1}, Lm31;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 278
    .line 279
    .line 280
    const-string v2, "    verticalChainStyle"

    .line 281
    .line 282
    iget v0, p0, Lm31;->j0:I

    .line 283
    .line 284
    invoke-static {v0, v11, v2, p1}, Lm31;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 285
    .line 286
    .line 287
    const-string v0, "  }"

    .line 288
    .line 289
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    return-void
.end method

.method public final q()I
    .locals 2

    .line 1
    iget v0, p0, Lm31;->g0:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget p0, p0, Lm31;->U:I

    .line 10
    .line 11
    return p0
.end method

.method public final r()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm31;->T:Ln31;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, v0, Ln31;->x0:I

    .line 6
    .line 7
    iget p0, p0, Lm31;->Y:I

    .line 8
    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0

    .line 11
    :cond_0
    iget p0, p0, Lm31;->Y:I

    .line 12
    .line 13
    return p0
.end method

.method public final s()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm31;->T:Ln31;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, v0, Ln31;->y0:I

    .line 6
    .line 7
    iget p0, p0, Lm31;->Z:I

    .line 8
    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0

    .line 11
    :cond_0
    iget p0, p0, Lm31;->Z:I

    .line 12
    .line 13
    return p0
.end method

.method public final t(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-nez p1, :cond_2

    .line 5
    .line 6
    iget-object p1, p0, Lm31;->I:Lu21;

    .line 7
    .line 8
    iget-object p1, p1, Lu21;->f:Lu21;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    move p1, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p1, v1

    .line 15
    :goto_0
    iget-object p0, p0, Lm31;->K:Lu21;

    .line 16
    .line 17
    iget-object p0, p0, Lu21;->f:Lu21;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    move p0, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p0, v1

    .line 24
    :goto_1
    add-int/2addr p1, p0

    .line 25
    if-ge p1, v0, :cond_6

    .line 26
    .line 27
    goto :goto_5

    .line 28
    :cond_2
    iget-object p1, p0, Lm31;->J:Lu21;

    .line 29
    .line 30
    iget-object p1, p1, Lu21;->f:Lu21;

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    move p1, v2

    .line 35
    goto :goto_2

    .line 36
    :cond_3
    move p1, v1

    .line 37
    :goto_2
    iget-object v3, p0, Lm31;->L:Lu21;

    .line 38
    .line 39
    iget-object v3, v3, Lu21;->f:Lu21;

    .line 40
    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    move v3, v2

    .line 44
    goto :goto_3

    .line 45
    :cond_4
    move v3, v1

    .line 46
    :goto_3
    add-int/2addr p1, v3

    .line 47
    iget-object p0, p0, Lm31;->M:Lu21;

    .line 48
    .line 49
    iget-object p0, p0, Lu21;->f:Lu21;

    .line 50
    .line 51
    if-eqz p0, :cond_5

    .line 52
    .line 53
    move p0, v2

    .line 54
    goto :goto_4

    .line 55
    :cond_5
    move p0, v1

    .line 56
    :goto_4
    add-int/2addr p1, p0

    .line 57
    if-ge p1, v0, :cond_6

    .line 58
    .line 59
    :goto_5
    return v2

    .line 60
    :cond_6
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lm31;->h0:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "id: "

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lm31;->h0:Ljava/lang/String;

    .line 15
    .line 16
    const-string v3, " "

    .line 17
    .line 18
    invoke-static {v1, v2, v3}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string v1, ""

    .line 24
    .line 25
    :goto_0
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v1, "("

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget v1, p0, Lm31;->Y:I

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, ", "

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget v1, p0, Lm31;->Z:I

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ") - ("

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget v1, p0, Lm31;->U:I

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, " x "

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget p0, p0, Lm31;->V:I

    .line 64
    .line 65
    const-string v1, ")"

    .line 66
    .line 67
    invoke-static {v0, p0, v1}, Loi0;->n(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method

.method public final u(II)Z
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lm31;->I:Lu21;

    .line 4
    .line 5
    iget-object v0, p1, Lu21;->f:Lu21;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, v0, Lu21;->c:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lm31;->K:Lu21;

    .line 14
    .line 15
    iget-object v0, p0, Lu21;->f:Lu21;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-boolean v1, v0, Lu21;->c:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Lu21;->d()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Lu21;->e()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    sub-int/2addr v0, p0

    .line 32
    iget-object p0, p1, Lu21;->f:Lu21;

    .line 33
    .line 34
    invoke-virtual {p0}, Lu21;->d()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-virtual {p1}, Lu21;->e()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    add-int/2addr p1, p0

    .line 43
    sub-int/2addr v0, p1

    .line 44
    if-lt v0, p2, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object p1, p0, Lm31;->J:Lu21;

    .line 48
    .line 49
    iget-object v0, p1, Lu21;->f:Lu21;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iget-boolean v0, v0, Lu21;->c:Z

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iget-object p0, p0, Lm31;->L:Lu21;

    .line 58
    .line 59
    iget-object v0, p0, Lu21;->f:Lu21;

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    iget-boolean v1, v0, Lu21;->c:Z

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    invoke-virtual {v0}, Lu21;->d()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-virtual {p0}, Lu21;->e()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    sub-int/2addr v0, p0

    .line 76
    iget-object p0, p1, Lu21;->f:Lu21;

    .line 77
    .line 78
    invoke-virtual {p0}, Lu21;->d()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    invoke-virtual {p1}, Lu21;->e()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    add-int/2addr p1, p0

    .line 87
    sub-int/2addr v0, p1

    .line 88
    if-lt v0, p2, :cond_1

    .line 89
    .line 90
    :goto_0
    const/4 p0, 0x1

    .line 91
    return p0

    .line 92
    :cond_1
    const/4 p0, 0x0

    .line 93
    return p0
.end method

.method public final v(IIIILm31;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lm31;->i(I)Lu21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p5, p2}, Lm31;->i(I)Lu21;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 p2, 0x1

    .line 10
    invoke-virtual {p0, p1, p3, p4, p2}, Lu21;->b(Lu21;IIZ)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final w(I)Z
    .locals 2

    .line 1
    mul-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    iget-object p0, p0, Lm31;->Q:[Lu21;

    .line 4
    .line 5
    aget-object v0, p0, p1

    .line 6
    .line 7
    iget-object v1, v0, Lu21;->f:Lu21;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, v1, Lu21;->f:Lu21;

    .line 12
    .line 13
    if-eq v1, v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    add-int/2addr p1, v0

    .line 17
    aget-object p0, p0, p1

    .line 18
    .line 19
    iget-object p1, p0, Lu21;->f:Lu21;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object p1, p1, Lu21;->f:Lu21;

    .line 24
    .line 25
    if-ne p1, p0, :cond_0

    .line 26
    .line 27
    return v0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public final x()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm31;->I:Lu21;

    .line 2
    .line 3
    iget-object v1, v0, Lu21;->f:Lu21;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, Lu21;->f:Lu21;

    .line 8
    .line 9
    if-eq v1, v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, Lm31;->K:Lu21;

    .line 12
    .line 13
    iget-object v0, p0, Lu21;->f:Lu21;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, v0, Lu21;->f:Lu21;

    .line 18
    .line 19
    if-ne v0, p0, :cond_2

    .line 20
    .line 21
    :cond_1
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_2
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final y()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm31;->J:Lu21;

    .line 2
    .line 3
    iget-object v1, v0, Lu21;->f:Lu21;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, Lu21;->f:Lu21;

    .line 8
    .line 9
    if-eq v1, v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, Lm31;->L:Lu21;

    .line 12
    .line 13
    iget-object v0, p0, Lu21;->f:Lu21;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, v0, Lu21;->f:Lu21;

    .line 18
    .line 19
    if-ne v0, p0, :cond_2

    .line 20
    .line 21
    :cond_1
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_2
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final z()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm31;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Lm31;->g0:I

    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    if-eq p0, v0, :cond_0

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
