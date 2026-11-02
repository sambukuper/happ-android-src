.class public final Liz7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ld53;


# instance fields
.field public final a:Lf63;

.field public final b:Lxd6;

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(Lf63;Lxd6;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Liz7;->a:Lf63;

    .line 5
    .line 6
    iput-object p2, p0, Liz7;->b:Lxd6;

    .line 7
    .line 8
    iput p3, p0, Liz7;->c:I

    .line 9
    .line 10
    iput p4, p0, Liz7;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, Liz7;->d:I

    .line 2
    .line 3
    return p0
.end method

.method public final b()I
    .locals 0

    .line 1
    iget p0, p0, Liz7;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final d(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-object v0, p0, Liz7;->a:Lf63;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lf63;->Z:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lcc0;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iget-object p0, p0, Liz7;->b:Lxd6;

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    new-instance p0, Lxd6;

    .line 16
    .line 17
    invoke-direct {p0, v2}, Lxd6;-><init>(B)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v3, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Lr05;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    int-to-float v3, v3

    .line 32
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    int-to-float v4, v4

    .line 37
    new-instance v5, Lr05;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-direct {v5, v6, v6, v3, v4}, Lr05;-><init>(FFFF)V

    .line 41
    .line 42
    .line 43
    iput-object v5, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 44
    .line 45
    :goto_0
    new-instance v3, Lfu6;

    .line 46
    .line 47
    invoke-direct {v3, v2}, Lfu6;-><init>(B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v3, Lfu6;->Y:Ljava/lang/Object;

    .line 51
    .line 52
    iput-object v0, v3, Lfu6;->Z:Ljava/lang/Object;

    .line 53
    .line 54
    iget-object p1, v0, Lf63;->Y:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Lzs6;

    .line 57
    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    goto/16 :goto_3

    .line 61
    .line 62
    :cond_2
    iget-object v0, p1, Lkt6;->o:Lr05;

    .line 63
    .line 64
    iget-object v4, p1, Lit6;->n:Lzs5;

    .line 65
    .line 66
    iget-object v5, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v5, Lcc0;

    .line 69
    .line 70
    if-eqz v5, :cond_4

    .line 71
    .line 72
    iget-object v5, v5, Lcc0;->b:Ljava/util/ArrayList;

    .line 73
    .line 74
    if-eqz v5, :cond_3

    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move v5, v2

    .line 82
    :goto_1
    if-lez v5, :cond_4

    .line 83
    .line 84
    iget-object v5, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v5, Lcc0;

    .line 87
    .line 88
    invoke-virtual {v1, v5}, Lcc0;->b(Lcc0;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    new-instance v5, Ldu6;

    .line 92
    .line 93
    invoke-direct {v5}, Ldu6;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object v5, v3, Lfu6;->f0:Ljava/lang/Object;

    .line 97
    .line 98
    new-instance v5, Ljava/util/Stack;

    .line 99
    .line 100
    invoke-direct {v5}, Ljava/util/Stack;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object v5, v3, Lfu6;->g0:Ljava/lang/Object;

    .line 104
    .line 105
    iget-object v5, v3, Lfu6;->f0:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v5, Ldu6;

    .line 108
    .line 109
    invoke-static {}, Lys6;->a()Lys6;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v3, v5, v6}, Lfu6;->B0(Ldu6;Lys6;)V

    .line 114
    .line 115
    .line 116
    iget-object v5, v3, Lfu6;->f0:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v5, Ldu6;

    .line 119
    .line 120
    const/4 v6, 0x0

    .line 121
    iput-object v6, v5, Ldu6;->f:Lr05;

    .line 122
    .line 123
    iput-boolean v2, v5, Ldu6;->h:Z

    .line 124
    .line 125
    iget-object v6, v3, Lfu6;->g0:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v6, Ljava/util/Stack;

    .line 128
    .line 129
    new-instance v7, Ldu6;

    .line 130
    .line 131
    invoke-direct {v7, v5}, Ldu6;-><init>(Ldu6;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6, v7}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    new-instance v5, Ljava/util/Stack;

    .line 138
    .line 139
    invoke-direct {v5}, Ljava/util/Stack;-><init>()V

    .line 140
    .line 141
    .line 142
    iput-object v5, v3, Lfu6;->i0:Ljava/lang/Object;

    .line 143
    .line 144
    new-instance v5, Ljava/util/Stack;

    .line 145
    .line 146
    invoke-direct {v5}, Ljava/util/Stack;-><init>()V

    .line 147
    .line 148
    .line 149
    iput-object v5, v3, Lfu6;->h0:Ljava/lang/Object;

    .line 150
    .line 151
    iget-object v5, p1, Let6;->d:Ljava/lang/Boolean;

    .line 152
    .line 153
    if-eqz v5, :cond_5

    .line 154
    .line 155
    iget-object v6, v3, Lfu6;->f0:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v6, Ldu6;

    .line 158
    .line 159
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    iput-boolean v5, v6, Ldu6;->h:Z

    .line 164
    .line 165
    :cond_5
    invoke-virtual {v3}, Lfu6;->y0()V

    .line 166
    .line 167
    .line 168
    new-instance v5, Lr05;

    .line 169
    .line 170
    iget-object v6, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v6, Lr05;

    .line 173
    .line 174
    invoke-direct {v5, v6}, Lr05;-><init>(Lr05;)V

    .line 175
    .line 176
    .line 177
    iget-object v6, p1, Lzs6;->r:Lks6;

    .line 178
    .line 179
    if-eqz v6, :cond_6

    .line 180
    .line 181
    iget v7, v5, Lr05;->d:F

    .line 182
    .line 183
    invoke-virtual {v6, v3, v7}, Lks6;->c(Lfu6;F)F

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    iput v6, v5, Lr05;->d:F

    .line 188
    .line 189
    :cond_6
    iget-object v6, p1, Lzs6;->s:Lks6;

    .line 190
    .line 191
    if-eqz v6, :cond_7

    .line 192
    .line 193
    iget v7, v5, Lr05;->e:F

    .line 194
    .line 195
    invoke-virtual {v6, v3, v7}, Lks6;->c(Lfu6;F)F

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    iput v6, v5, Lr05;->e:F

    .line 200
    .line 201
    :cond_7
    invoke-virtual {v3, p1, v5, v0, v4}, Lfu6;->n0(Lzs6;Lr05;Lr05;Lzs5;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v3}, Lfu6;->x0()V

    .line 205
    .line 206
    .line 207
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast p0, Lcc0;

    .line 210
    .line 211
    if-eqz p0, :cond_b

    .line 212
    .line 213
    iget-object p0, p0, Lcc0;->b:Ljava/util/ArrayList;

    .line 214
    .line 215
    if-eqz p0, :cond_8

    .line 216
    .line 217
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    :cond_8
    if-lez v2, :cond_b

    .line 222
    .line 223
    iget-object p0, v1, Lcc0;->b:Ljava/util/ArrayList;

    .line 224
    .line 225
    if-nez p0, :cond_9

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_9
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    :cond_a
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    if-eqz p1, :cond_b

    .line 237
    .line 238
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    check-cast p1, Lbc0;

    .line 243
    .line 244
    iget p1, p1, Lbc0;->c:I

    .line 245
    .line 246
    const/4 v0, 0x2

    .line 247
    if-ne p1, v0, :cond_a

    .line 248
    .line 249
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 250
    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_b
    :goto_3
    return-void
.end method

.method public final e()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x800

    .line 2
    .line 3
    return-wide v0
.end method
