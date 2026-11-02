.class public final Lye2;
.super Lxz2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public A0:I

.field public B0:Ld30;

.field public C0:Le30;

.field public D0:I

.field public E0:I

.field public F0:I

.field public G0:I

.field public H0:I

.field public I0:I

.field public J0:F

.field public K0:F

.field public L0:F

.field public M0:F

.field public N0:F

.field public O0:F

.field public P0:I

.field public Q0:I

.field public R0:I

.field public S0:I

.field public T0:I

.field public U0:I

.field public V0:I

.field public W0:Ljava/util/ArrayList;

.field public X0:[Lm31;

.field public Y0:[Lm31;

.field public Z0:[I

.field public a1:[Lm31;

.field public b1:I

.field public s0:I

.field public t0:I

.field public u0:I

.field public v0:I

.field public w0:I

.field public x0:I

.field public y0:Z

.field public z0:I


# virtual methods
.method public final S()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lxz2;->r0:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v1, p0, Lxz2;->q0:[Lm31;

    .line 7
    .line 8
    aget-object v1, v1, v0

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    iput-boolean v2, v1, Lm31;->F:Z

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    return-void
.end method

.method public final T(Lm31;I)I
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p1, Lm31;->p0:[I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    aget v3, v1, v2

    .line 9
    .line 10
    const/4 v4, 0x3

    .line 11
    if-ne v3, v4, :cond_5

    .line 12
    .line 13
    iget v3, p1, Lm31;->s:I

    .line 14
    .line 15
    if-nez v3, :cond_1

    .line 16
    .line 17
    :goto_0
    return v0

    .line 18
    :cond_1
    const/4 v5, 0x2

    .line 19
    if-ne v3, v5, :cond_3

    .line 20
    .line 21
    iget v3, p1, Lm31;->z:F

    .line 22
    .line 23
    int-to-float p2, p2

    .line 24
    mul-float/2addr v3, p2

    .line 25
    float-to-int v8, v3

    .line 26
    invoke-virtual {p1}, Lm31;->k()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eq v8, p2, :cond_2

    .line 31
    .line 32
    iput-boolean v2, p1, Lm31;->g:Z

    .line 33
    .line 34
    aget v5, v1, v0

    .line 35
    .line 36
    invoke-virtual {p1}, Lm31;->q()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const/4 v7, 0x1

    .line 41
    move-object v4, p0

    .line 42
    move-object v9, p1

    .line 43
    invoke-virtual/range {v4 .. v9}, Lye2;->V(IIIILm31;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    return v8

    .line 47
    :cond_3
    move-object v9, p1

    .line 48
    if-ne v3, v2, :cond_4

    .line 49
    .line 50
    invoke-virtual {v9}, Lm31;->k()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :cond_4
    if-ne v3, v4, :cond_6

    .line 56
    .line 57
    invoke-virtual {v9}, Lm31;->q()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    int-to-float p0, p0

    .line 62
    iget p1, v9, Lm31;->W:F

    .line 63
    .line 64
    mul-float/2addr p0, p1

    .line 65
    const/high16 p1, 0x3f000000    # 0.5f

    .line 66
    .line 67
    add-float/2addr p0, p1

    .line 68
    float-to-int p0, p0

    .line 69
    return p0

    .line 70
    :cond_5
    move-object v9, p1

    .line 71
    :cond_6
    invoke-virtual {v9}, Lm31;->k()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    return p0
.end method

.method public final U(Lm31;I)I
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p1, Lm31;->p0:[I

    .line 6
    .line 7
    aget v2, v1, v0

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    if-ne v2, v3, :cond_5

    .line 11
    .line 12
    iget v2, p1, Lm31;->r:I

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    :goto_0
    return v0

    .line 17
    :cond_1
    const/4 v0, 0x2

    .line 18
    const/4 v4, 0x1

    .line 19
    if-ne v2, v0, :cond_3

    .line 20
    .line 21
    iget v0, p1, Lm31;->w:F

    .line 22
    .line 23
    int-to-float p2, p2

    .line 24
    mul-float/2addr v0, p2

    .line 25
    float-to-int v7, v0

    .line 26
    invoke-virtual {p1}, Lm31;->q()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eq v7, p2, :cond_2

    .line 31
    .line 32
    iput-boolean v4, p1, Lm31;->g:Z

    .line 33
    .line 34
    aget v8, v1, v4

    .line 35
    .line 36
    invoke-virtual {p1}, Lm31;->k()I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    const/4 v6, 0x1

    .line 41
    move-object v5, p0

    .line 42
    move-object v10, p1

    .line 43
    invoke-virtual/range {v5 .. v10}, Lye2;->V(IIIILm31;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    return v7

    .line 47
    :cond_3
    move-object v10, p1

    .line 48
    if-ne v2, v4, :cond_4

    .line 49
    .line 50
    invoke-virtual {v10}, Lm31;->q()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :cond_4
    if-ne v2, v3, :cond_6

    .line 56
    .line 57
    invoke-virtual {v10}, Lm31;->k()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    int-to-float p0, p0

    .line 62
    iget p1, v10, Lm31;->W:F

    .line 63
    .line 64
    mul-float/2addr p0, p1

    .line 65
    const/high16 p1, 0x3f000000    # 0.5f

    .line 66
    .line 67
    add-float/2addr p0, p1

    .line 68
    float-to-int p0, p0

    .line 69
    return p0

    .line 70
    :cond_5
    move-object v10, p1

    .line 71
    :cond_6
    invoke-virtual {v10}, Lm31;->q()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    return p0
.end method

.method public final V(IIIILm31;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lye2;->B0:Ld30;

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, Lye2;->C0:Le30;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, Lm31;->T:Ln31;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-object v1, v2, Ln31;->u0:Le30;

    .line 12
    .line 13
    iput-object v1, p0, Lye2;->C0:Le30;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iput p1, v0, Ld30;->a:I

    .line 17
    .line 18
    iput p3, v0, Ld30;->b:I

    .line 19
    .line 20
    iput p2, v0, Ld30;->c:I

    .line 21
    .line 22
    iput p4, v0, Ld30;->d:I

    .line 23
    .line 24
    check-cast v1, Landroidx/constraintlayout/widget/b;

    .line 25
    .line 26
    invoke-virtual {v1, p5, v0}, Landroidx/constraintlayout/widget/b;->b(Lm31;Ld30;)V

    .line 27
    .line 28
    .line 29
    iget p0, v0, Ld30;->e:I

    .line 30
    .line 31
    invoke-virtual {p5, p0}, Lm31;->O(I)V

    .line 32
    .line 33
    .line 34
    iget p0, v0, Ld30;->f:I

    .line 35
    .line 36
    invoke-virtual {p5, p0}, Lm31;->L(I)V

    .line 37
    .line 38
    .line 39
    iget-boolean p0, v0, Ld30;->h:Z

    .line 40
    .line 41
    iput-boolean p0, p5, Lm31;->E:Z

    .line 42
    .line 43
    iget p0, v0, Ld30;->g:I

    .line 44
    .line 45
    invoke-virtual {p5, p0}, Lm31;->I(I)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final b(Lka4;Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lye2;->W0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lm31;->b(Lka4;Z)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm31;->T:Ln31;

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-boolean p1, p1, Ln31;->v0:Z

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    move p1, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move p1, p2

    .line 19
    :goto_0
    iget v2, p0, Lye2;->T0:I

    .line 20
    .line 21
    if-eqz v2, :cond_1b

    .line 22
    .line 23
    if-eq v2, v1, :cond_19

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    const/4 v3, 0x3

    .line 29
    if-eq v2, v3, :cond_1

    .line 30
    .line 31
    goto/16 :goto_e

    .line 32
    .line 33
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    move v3, p2

    .line 38
    :goto_1
    if-ge v3, v2, :cond_1c

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Lwe2;

    .line 45
    .line 46
    add-int/lit8 v5, v2, -0x1

    .line 47
    .line 48
    if-ne v3, v5, :cond_2

    .line 49
    .line 50
    move v5, v1

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move v5, p2

    .line 53
    :goto_2
    invoke-virtual {v4, v3, p1, v5}, Lwe2;->b(IZZ)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    iget-object v0, p0, Lye2;->Z0:[I

    .line 60
    .line 61
    if-eqz v0, :cond_1c

    .line 62
    .line 63
    iget-object v0, p0, Lye2;->Y0:[Lm31;

    .line 64
    .line 65
    if-eqz v0, :cond_1c

    .line 66
    .line 67
    iget-object v0, p0, Lye2;->X0:[Lm31;

    .line 68
    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    goto/16 :goto_e

    .line 72
    .line 73
    :cond_4
    move v0, p2

    .line 74
    :goto_3
    iget v2, p0, Lye2;->b1:I

    .line 75
    .line 76
    if-ge v0, v2, :cond_5

    .line 77
    .line 78
    iget-object v2, p0, Lye2;->a1:[Lm31;

    .line 79
    .line 80
    aget-object v2, v2, v0

    .line 81
    .line 82
    invoke-virtual {v2}, Lm31;->D()V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v0, v0, 0x1

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    iget-object v0, p0, Lye2;->Z0:[I

    .line 89
    .line 90
    aget v2, v0, p2

    .line 91
    .line 92
    aget v0, v0, v1

    .line 93
    .line 94
    iget v3, p0, Lye2;->J0:F

    .line 95
    .line 96
    const/4 v4, 0x0

    .line 97
    move v5, p2

    .line 98
    :goto_4
    const/16 v6, 0x8

    .line 99
    .line 100
    if-ge v5, v2, :cond_c

    .line 101
    .line 102
    if-eqz p1, :cond_6

    .line 103
    .line 104
    sub-int v3, v2, v5

    .line 105
    .line 106
    sub-int/2addr v3, v1

    .line 107
    const/high16 v7, 0x3f800000    # 1.0f

    .line 108
    .line 109
    iget v8, p0, Lye2;->J0:F

    .line 110
    .line 111
    sub-float/2addr v7, v8

    .line 112
    goto :goto_5

    .line 113
    :cond_6
    move v7, v3

    .line 114
    move v3, v5

    .line 115
    :goto_5
    iget-object v8, p0, Lye2;->Y0:[Lm31;

    .line 116
    .line 117
    aget-object v3, v8, v3

    .line 118
    .line 119
    if-eqz v3, :cond_b

    .line 120
    .line 121
    iget-object v8, v3, Lm31;->I:Lu21;

    .line 122
    .line 123
    iget v9, v3, Lm31;->g0:I

    .line 124
    .line 125
    if-ne v9, v6, :cond_7

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_7
    if-nez v5, :cond_8

    .line 129
    .line 130
    iget-object v6, p0, Lm31;->I:Lu21;

    .line 131
    .line 132
    iget v9, p0, Lye2;->w0:I

    .line 133
    .line 134
    invoke-virtual {v3, v8, v6, v9}, Lm31;->f(Lu21;Lu21;I)V

    .line 135
    .line 136
    .line 137
    iget v6, p0, Lye2;->D0:I

    .line 138
    .line 139
    iput v6, v3, Lm31;->i0:I

    .line 140
    .line 141
    iput v7, v3, Lm31;->d0:F

    .line 142
    .line 143
    :cond_8
    add-int/lit8 v6, v2, -0x1

    .line 144
    .line 145
    if-ne v5, v6, :cond_9

    .line 146
    .line 147
    iget-object v6, v3, Lm31;->K:Lu21;

    .line 148
    .line 149
    iget-object v9, p0, Lm31;->K:Lu21;

    .line 150
    .line 151
    iget v10, p0, Lye2;->x0:I

    .line 152
    .line 153
    invoke-virtual {v3, v6, v9, v10}, Lm31;->f(Lu21;Lu21;I)V

    .line 154
    .line 155
    .line 156
    :cond_9
    if-lez v5, :cond_a

    .line 157
    .line 158
    if-eqz v4, :cond_a

    .line 159
    .line 160
    iget-object v6, v4, Lm31;->K:Lu21;

    .line 161
    .line 162
    iget v9, p0, Lye2;->P0:I

    .line 163
    .line 164
    invoke-virtual {v3, v8, v6, v9}, Lm31;->f(Lu21;Lu21;I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v6, v8, p2}, Lm31;->f(Lu21;Lu21;I)V

    .line 168
    .line 169
    .line 170
    :cond_a
    move-object v4, v3

    .line 171
    :cond_b
    :goto_6
    add-int/lit8 v5, v5, 0x1

    .line 172
    .line 173
    move v3, v7

    .line 174
    goto :goto_4

    .line 175
    :cond_c
    move p1, p2

    .line 176
    :goto_7
    if-ge p1, v0, :cond_12

    .line 177
    .line 178
    iget-object v3, p0, Lye2;->X0:[Lm31;

    .line 179
    .line 180
    aget-object v3, v3, p1

    .line 181
    .line 182
    if-eqz v3, :cond_11

    .line 183
    .line 184
    iget-object v5, v3, Lm31;->J:Lu21;

    .line 185
    .line 186
    iget v7, v3, Lm31;->g0:I

    .line 187
    .line 188
    if-ne v7, v6, :cond_d

    .line 189
    .line 190
    goto :goto_8

    .line 191
    :cond_d
    if-nez p1, :cond_e

    .line 192
    .line 193
    iget-object v7, p0, Lm31;->J:Lu21;

    .line 194
    .line 195
    iget v8, p0, Lye2;->s0:I

    .line 196
    .line 197
    invoke-virtual {v3, v5, v7, v8}, Lm31;->f(Lu21;Lu21;I)V

    .line 198
    .line 199
    .line 200
    iget v7, p0, Lye2;->E0:I

    .line 201
    .line 202
    iput v7, v3, Lm31;->j0:I

    .line 203
    .line 204
    iget v7, p0, Lye2;->K0:F

    .line 205
    .line 206
    iput v7, v3, Lm31;->e0:F

    .line 207
    .line 208
    :cond_e
    add-int/lit8 v7, v0, -0x1

    .line 209
    .line 210
    if-ne p1, v7, :cond_f

    .line 211
    .line 212
    iget-object v7, v3, Lm31;->L:Lu21;

    .line 213
    .line 214
    iget-object v8, p0, Lm31;->L:Lu21;

    .line 215
    .line 216
    iget v9, p0, Lye2;->t0:I

    .line 217
    .line 218
    invoke-virtual {v3, v7, v8, v9}, Lm31;->f(Lu21;Lu21;I)V

    .line 219
    .line 220
    .line 221
    :cond_f
    if-lez p1, :cond_10

    .line 222
    .line 223
    if-eqz v4, :cond_10

    .line 224
    .line 225
    iget-object v7, v4, Lm31;->L:Lu21;

    .line 226
    .line 227
    iget v8, p0, Lye2;->Q0:I

    .line 228
    .line 229
    invoke-virtual {v3, v5, v7, v8}, Lm31;->f(Lu21;Lu21;I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v4, v7, v5, p2}, Lm31;->f(Lu21;Lu21;I)V

    .line 233
    .line 234
    .line 235
    :cond_10
    move-object v4, v3

    .line 236
    :cond_11
    :goto_8
    add-int/lit8 p1, p1, 0x1

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_12
    move p1, p2

    .line 240
    :goto_9
    if-ge p1, v2, :cond_1c

    .line 241
    .line 242
    move v3, p2

    .line 243
    :goto_a
    if-ge v3, v0, :cond_18

    .line 244
    .line 245
    mul-int v4, v3, v2

    .line 246
    .line 247
    add-int/2addr v4, p1

    .line 248
    iget v5, p0, Lye2;->V0:I

    .line 249
    .line 250
    if-ne v5, v1, :cond_13

    .line 251
    .line 252
    mul-int v4, p1, v0

    .line 253
    .line 254
    add-int/2addr v4, v3

    .line 255
    :cond_13
    iget-object v5, p0, Lye2;->a1:[Lm31;

    .line 256
    .line 257
    array-length v7, v5

    .line 258
    if-lt v4, v7, :cond_14

    .line 259
    .line 260
    goto :goto_b

    .line 261
    :cond_14
    aget-object v4, v5, v4

    .line 262
    .line 263
    if-eqz v4, :cond_17

    .line 264
    .line 265
    iget v5, v4, Lm31;->g0:I

    .line 266
    .line 267
    if-ne v5, v6, :cond_15

    .line 268
    .line 269
    goto :goto_b

    .line 270
    :cond_15
    iget-object v5, p0, Lye2;->Y0:[Lm31;

    .line 271
    .line 272
    aget-object v5, v5, p1

    .line 273
    .line 274
    iget-object v7, p0, Lye2;->X0:[Lm31;

    .line 275
    .line 276
    aget-object v7, v7, v3

    .line 277
    .line 278
    if-eq v4, v5, :cond_16

    .line 279
    .line 280
    iget-object v8, v4, Lm31;->I:Lu21;

    .line 281
    .line 282
    iget-object v9, v5, Lm31;->I:Lu21;

    .line 283
    .line 284
    invoke-virtual {v4, v8, v9, p2}, Lm31;->f(Lu21;Lu21;I)V

    .line 285
    .line 286
    .line 287
    iget-object v8, v4, Lm31;->K:Lu21;

    .line 288
    .line 289
    iget-object v5, v5, Lm31;->K:Lu21;

    .line 290
    .line 291
    invoke-virtual {v4, v8, v5, p2}, Lm31;->f(Lu21;Lu21;I)V

    .line 292
    .line 293
    .line 294
    :cond_16
    if-eq v4, v7, :cond_17

    .line 295
    .line 296
    iget-object v5, v4, Lm31;->J:Lu21;

    .line 297
    .line 298
    iget-object v8, v7, Lm31;->J:Lu21;

    .line 299
    .line 300
    invoke-virtual {v4, v5, v8, p2}, Lm31;->f(Lu21;Lu21;I)V

    .line 301
    .line 302
    .line 303
    iget-object v5, v4, Lm31;->L:Lu21;

    .line 304
    .line 305
    iget-object v7, v7, Lm31;->L:Lu21;

    .line 306
    .line 307
    invoke-virtual {v4, v5, v7, p2}, Lm31;->f(Lu21;Lu21;I)V

    .line 308
    .line 309
    .line 310
    :cond_17
    :goto_b
    add-int/lit8 v3, v3, 0x1

    .line 311
    .line 312
    goto :goto_a

    .line 313
    :cond_18
    add-int/lit8 p1, p1, 0x1

    .line 314
    .line 315
    goto :goto_9

    .line 316
    :cond_19
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    move v3, p2

    .line 321
    :goto_c
    if-ge v3, v2, :cond_1c

    .line 322
    .line 323
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    check-cast v4, Lwe2;

    .line 328
    .line 329
    add-int/lit8 v5, v2, -0x1

    .line 330
    .line 331
    if-ne v3, v5, :cond_1a

    .line 332
    .line 333
    move v5, v1

    .line 334
    goto :goto_d

    .line 335
    :cond_1a
    move v5, p2

    .line 336
    :goto_d
    invoke-virtual {v4, v3, p1, v5}, Lwe2;->b(IZZ)V

    .line 337
    .line 338
    .line 339
    add-int/lit8 v3, v3, 0x1

    .line 340
    .line 341
    goto :goto_c

    .line 342
    :cond_1b
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    if-lez v2, :cond_1c

    .line 347
    .line 348
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    check-cast v0, Lwe2;

    .line 353
    .line 354
    invoke-virtual {v0, p2, p1, v1}, Lwe2;->b(IZZ)V

    .line 355
    .line 356
    .line 357
    :cond_1c
    :goto_e
    iput-boolean p2, p0, Lye2;->y0:Z

    .line 358
    .line 359
    return-void
.end method
