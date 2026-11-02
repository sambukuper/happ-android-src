.class public final Lf74;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;

.field public final c:Lp8;

.field public final d:Lz24;

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:J

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Ld64;

.field public final l:J

.field public m:I

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:I

.field public r:Z

.field public s:I

.field public t:I

.field public u:I

.field public final v:[I


# direct methods
.method public constructor <init>(ILjava/util/List;Lp8;Lz24;IIIJLjava/lang/Object;Ljava/lang/Object;Ld64;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lf74;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lf74;->b:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lf74;->c:Lp8;

    .line 9
    .line 10
    iput-object p4, p0, Lf74;->d:Lz24;

    .line 11
    .line 12
    iput p5, p0, Lf74;->e:I

    .line 13
    .line 14
    iput p6, p0, Lf74;->f:I

    .line 15
    .line 16
    iput p7, p0, Lf74;->g:I

    .line 17
    .line 18
    iput-wide p8, p0, Lf74;->h:J

    .line 19
    .line 20
    iput-object p10, p0, Lf74;->i:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p11, p0, Lf74;->j:Ljava/lang/Object;

    .line 23
    .line 24
    iput-object p12, p0, Lf74;->k:Ld64;

    .line 25
    .line 26
    iput-wide p13, p0, Lf74;->l:J

    .line 27
    .line 28
    const/high16 p1, -0x80000000

    .line 29
    .line 30
    iput p1, p0, Lf74;->s:I

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    const/4 p3, 0x0

    .line 37
    move p4, p3

    .line 38
    move p5, p4

    .line 39
    :goto_0
    if-ge p3, p1, :cond_0

    .line 40
    .line 41
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p6

    .line 45
    check-cast p6, Leo5;

    .line 46
    .line 47
    iget p7, p6, Leo5;->Y:I

    .line 48
    .line 49
    add-int/2addr p4, p7

    .line 50
    iget p6, p6, Leo5;->X:I

    .line 51
    .line 52
    invoke-static {p5, p6}, Ljava/lang/Math;->max(II)I

    .line 53
    .line 54
    .line 55
    move-result p5

    .line 56
    add-int/lit8 p3, p3, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iput p4, p0, Lf74;->n:I

    .line 60
    .line 61
    iput p5, p0, Lf74;->q:I

    .line 62
    .line 63
    iget-object p1, p0, Lf74;->b:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    mul-int/lit8 p1, p1, 0x2

    .line 70
    .line 71
    new-array p1, p1, [I

    .line 72
    .line 73
    iput-object p1, p0, Lf74;->v:[I

    .line 74
    .line 75
    iget p1, p0, Lf74;->g:I

    .line 76
    .line 77
    iput p1, p0, Lf74;->p:I

    .line 78
    .line 79
    iput p4, p0, Lf74;->o:I

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lf74;->o:I

    .line 2
    .line 3
    iget p0, p0, Lf74;->p:I

    .line 4
    .line 5
    add-int/2addr v0, p0

    .line 6
    if-gez v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :cond_0
    return v0
.end method

.method public final b(I)J
    .locals 4

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iget-object v2, p0, Lf74;->b:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iget p0, p0, Lf74;->m:I

    .line 17
    .line 18
    int-to-long p0, p0

    .line 19
    and-long/2addr p0, v0

    .line 20
    return-wide p0

    .line 21
    :cond_0
    mul-int/lit8 p1, p1, 0x2

    .line 22
    .line 23
    iget-object p0, p0, Lf74;->v:[I

    .line 24
    .line 25
    aget v2, p0, p1

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    aget p0, p0, p1

    .line 30
    .line 31
    int-to-long v2, v2

    .line 32
    const/16 p1, 0x20

    .line 33
    .line 34
    shl-long/2addr v2, p1

    .line 35
    int-to-long p0, p0

    .line 36
    and-long/2addr p0, v0

    .line 37
    or-long/2addr p0, v2

    .line 38
    return-wide p0
.end method

.method public final c(Ldo5;Z)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lf74;->s:I

    .line 6
    .line 7
    const/high16 v3, -0x80000000

    .line 8
    .line 9
    if-eq v2, v3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v2, "position() should be called first"

    .line 13
    .line 14
    invoke-static {v2}, Lzc3;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iget-object v2, v0, Lf74;->b:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    :goto_1
    if-ge v4, v3, :cond_a

    .line 25
    .line 26
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Leo5;

    .line 31
    .line 32
    iget v6, v0, Lf74;->t:I

    .line 33
    .line 34
    iget v7, v5, Leo5;->Y:I

    .line 35
    .line 36
    sub-int/2addr v6, v7

    .line 37
    iget v7, v0, Lf74;->u:I

    .line 38
    .line 39
    invoke-virtual {v0, v4}, Lf74;->b(I)J

    .line 40
    .line 41
    .line 42
    move-result-wide v8

    .line 43
    iget-object v10, v0, Lf74;->i:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v11, v0, Lf74;->k:Ld64;

    .line 46
    .line 47
    iget-object v11, v11, Ld64;->a:Ls05;

    .line 48
    .line 49
    invoke-virtual {v11, v10}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    check-cast v10, Lb64;

    .line 54
    .line 55
    const/4 v11, 0x0

    .line 56
    if-eqz v10, :cond_1

    .line 57
    .line 58
    iget-object v10, v10, Lb64;->a:[Lz54;

    .line 59
    .line 60
    aget-object v10, v10, v4

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    move-object v10, v11

    .line 64
    :goto_2
    if-eqz v10, :cond_7

    .line 65
    .line 66
    if-eqz p2, :cond_2

    .line 67
    .line 68
    iput-wide v8, v10, Lz54;->n:J

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_2
    iget-wide v12, v10, Lz54;->n:J

    .line 72
    .line 73
    const-wide v14, 0x7fffffff7fffffffL

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-static {v12, v13, v14, v15}, Lhf3;->a(JJ)Z

    .line 79
    .line 80
    .line 81
    move-result v12

    .line 82
    if-nez v12, :cond_3

    .line 83
    .line 84
    iget-wide v8, v10, Lz54;->n:J

    .line 85
    .line 86
    :cond_3
    iget-object v12, v10, Lz54;->r:Lrh5;

    .line 87
    .line 88
    invoke-virtual {v12}, Lrh5;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    check-cast v12, Lhf3;

    .line 93
    .line 94
    iget-wide v12, v12, Lhf3;->a:J

    .line 95
    .line 96
    invoke-static {v8, v9, v12, v13}, Lhf3;->c(JJ)J

    .line 97
    .line 98
    .line 99
    move-result-wide v12

    .line 100
    const-wide v14, 0xffffffffL

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    and-long/2addr v8, v14

    .line 106
    long-to-int v8, v8

    .line 107
    move-wide/from16 v16, v14

    .line 108
    .line 109
    if-gt v8, v6, :cond_4

    .line 110
    .line 111
    and-long v14, v12, v16

    .line 112
    .line 113
    long-to-int v9, v14

    .line 114
    if-le v9, v6, :cond_5

    .line 115
    .line 116
    :cond_4
    if-lt v8, v7, :cond_6

    .line 117
    .line 118
    and-long v8, v12, v16

    .line 119
    .line 120
    long-to-int v6, v8

    .line 121
    if-lt v6, v7, :cond_6

    .line 122
    .line 123
    :cond_5
    iget-object v6, v10, Lz54;->h:Lrh5;

    .line 124
    .line 125
    invoke-virtual {v6}, Lrh5;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    check-cast v6, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_6

    .line 136
    .line 137
    iget-object v6, v10, Lz54;->a:Lb71;

    .line 138
    .line 139
    new-instance v7, Lw54;

    .line 140
    .line 141
    const/4 v8, 0x1

    .line 142
    invoke-direct {v7, v10, v11, v8}, Lw54;-><init>(Lz54;Lq51;B)V

    .line 143
    .line 144
    .line 145
    const/4 v8, 0x3

    .line 146
    invoke-static {v6, v11, v11, v7, v8}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 147
    .line 148
    .line 149
    :cond_6
    move-wide v8, v12

    .line 150
    :goto_3
    iget-object v11, v10, Lz54;->o:Lxt2;

    .line 151
    .line 152
    :cond_7
    iget-wide v6, v0, Lf74;->h:J

    .line 153
    .line 154
    invoke-static {v8, v9, v6, v7}, Lhf3;->c(JJ)J

    .line 155
    .line 156
    .line 157
    move-result-wide v6

    .line 158
    if-nez p2, :cond_8

    .line 159
    .line 160
    if-eqz v10, :cond_8

    .line 161
    .line 162
    iput-wide v6, v10, Lz54;->m:J

    .line 163
    .line 164
    :cond_8
    const/4 v8, 0x0

    .line 165
    if-eqz v11, :cond_9

    .line 166
    .line 167
    invoke-virtual {v1, v5}, Ldo5;->d(Leo5;)V

    .line 168
    .line 169
    .line 170
    iget-wide v9, v5, Leo5;->g0:J

    .line 171
    .line 172
    invoke-static {v6, v7, v9, v10}, Lhf3;->c(JJ)J

    .line 173
    .line 174
    .line 175
    move-result-wide v6

    .line 176
    invoke-virtual {v5, v6, v7, v8, v11}, Leo5;->T(JFLxt2;)V

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_9
    sget-object v9, Lfo5;->a:Ldx4;

    .line 181
    .line 182
    invoke-virtual {v1, v5}, Ldo5;->d(Leo5;)V

    .line 183
    .line 184
    .line 185
    iget-wide v10, v5, Leo5;->g0:J

    .line 186
    .line 187
    invoke-static {v6, v7, v10, v11}, Lhf3;->c(JJ)J

    .line 188
    .line 189
    .line 190
    move-result-wide v6

    .line 191
    invoke-virtual {v5, v6, v7, v8, v9}, Leo5;->S(JFLgn2;)V

    .line 192
    .line 193
    .line 194
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 195
    .line 196
    goto/16 :goto_1

    .line 197
    .line 198
    :cond_a
    return-void
.end method

.method public final d(III)V
    .locals 7

    .line 1
    iput p1, p0, Lf74;->m:I

    .line 2
    .line 3
    iput p3, p0, Lf74;->s:I

    .line 4
    .line 5
    iget-object p3, p0, Lf74;->b:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_1

    .line 13
    .line 14
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Leo5;

    .line 19
    .line 20
    mul-int/lit8 v3, v1, 0x2

    .line 21
    .line 22
    iget-object v4, p0, Lf74;->c:Lp8;

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    iget v5, v2, Leo5;->X:I

    .line 27
    .line 28
    iget-object v6, p0, Lf74;->d:Lz24;

    .line 29
    .line 30
    invoke-interface {v4, v5, p2, v6}, Lp8;->a(IILz24;)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    iget-object v5, p0, Lf74;->v:[I

    .line 35
    .line 36
    aput v4, v5, v3

    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    aput p1, v5, v3

    .line 41
    .line 42
    iget v2, v2, Leo5;->Y:I

    .line 43
    .line 44
    add-int/2addr p1, v2

    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const-string p0, "null horizontalAlignment when isVertical == true"

    .line 49
    .line 50
    invoke-static {p0}, Lie2;->d(Ljava/lang/String;)Lo14;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    throw p0

    .line 55
    :cond_1
    iget p1, p0, Lf74;->e:I

    .line 56
    .line 57
    neg-int p1, p1

    .line 58
    iput p1, p0, Lf74;->t:I

    .line 59
    .line 60
    iget p1, p0, Lf74;->s:I

    .line 61
    .line 62
    iget p2, p0, Lf74;->f:I

    .line 63
    .line 64
    add-int/2addr p1, p2

    .line 65
    iput p1, p0, Lf74;->u:I

    .line 66
    .line 67
    return-void
.end method
