.class public final Lwi;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic Y:B

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lwi;->Y:B

    .line 2
    .line 3
    iput-object p1, p0, Lwi;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Lwi;->Y:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Ldn8;->a:Ldn8;

    .line 5
    .line 6
    iget-object p0, p0, Lwi;->Z:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/util/List;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast p0, Lcom/blacksquircle/ui/editorkit/widget/internal/SyntaxHighlightEditText;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/blacksquircle/ui/editorkit/widget/internal/SyntaxHighlightEditText;->y0:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/blacksquircle/ui/editorkit/widget/internal/SyntaxHighlightEditText;->c()V

    .line 27
    .line 28
    .line 29
    return-object v2

    .line 30
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 31
    .line 32
    check-cast p0, Lxb4;

    .line 33
    .line 34
    invoke-interface {p0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    :pswitch_1
    check-cast p1, Lsv1;

    .line 39
    .line 40
    check-cast p0, Lxt2;

    .line 41
    .line 42
    iget-object v0, p0, Lxt2;->l:Llf;

    .line 43
    .line 44
    iget-boolean v1, p0, Lxt2;->n:Z

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    iget-boolean v1, p0, Lxt2;->A:Z

    .line 49
    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    invoke-interface {p1}, Lsv1;->n0()Llr;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Llr;->p()J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    invoke-virtual {v1}, Llr;->k()Lsm0;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-interface {v5}, Lsm0;->g()V

    .line 67
    .line 68
    .line 69
    :try_start_0
    iget-object v5, v1, Llr;->Y:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v5, Lwl6;

    .line 72
    .line 73
    iget-object v5, v5, Lwl6;->Y:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v5, Llr;

    .line 76
    .line 77
    invoke-virtual {v5}, Llr;->k()Lsm0;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-interface {v5, v0}, Lsm0;->l(Llf;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Lxt2;->c(Lsv1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v3, v4}, Lp61;->w(Llr;J)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    invoke-static {v1, v3, v4}, Lp61;->w(Llr;J)V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    :cond_0
    invoke-virtual {p0, p1}, Lxt2;->c(Lsv1;)V

    .line 97
    .line 98
    .line 99
    :goto_0
    return-object v2

    .line 100
    :pswitch_2
    check-cast p1, Lpk6;

    .line 101
    .line 102
    check-cast p0, Llh7;

    .line 103
    .line 104
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    invoke-virtual {p1, p0}, Lpk6;->b(F)V

    .line 115
    .line 116
    .line 117
    return-object v2

    .line 118
    :pswitch_3
    check-cast p0, Lce8;

    .line 119
    .line 120
    iget-object p0, p0, Lce8;->d:Lrh5;

    .line 121
    .line 122
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p1, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    xor-int/lit8 p0, p0, 0x1

    .line 131
    .line 132
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0

    .line 137
    :pswitch_4
    check-cast p1, Lvk;

    .line 138
    .line 139
    iget v0, p1, Lvk;->b:F

    .line 140
    .line 141
    const/4 v1, 0x0

    .line 142
    cmpg-float v2, v0, v1

    .line 143
    .line 144
    if-gez v2, :cond_1

    .line 145
    .line 146
    move v0, v1

    .line 147
    :cond_1
    const/high16 v2, 0x3f800000    # 1.0f

    .line 148
    .line 149
    cmpl-float v3, v0, v2

    .line 150
    .line 151
    if-lez v3, :cond_2

    .line 152
    .line 153
    move v0, v2

    .line 154
    :cond_2
    iget v3, p1, Lvk;->c:F

    .line 155
    .line 156
    const/high16 v4, -0x41000000    # -0.5f

    .line 157
    .line 158
    cmpg-float v5, v3, v4

    .line 159
    .line 160
    if-gez v5, :cond_3

    .line 161
    .line 162
    move v3, v4

    .line 163
    :cond_3
    const/high16 v5, 0x3f000000    # 0.5f

    .line 164
    .line 165
    cmpl-float v6, v3, v5

    .line 166
    .line 167
    if-lez v6, :cond_4

    .line 168
    .line 169
    move v3, v5

    .line 170
    :cond_4
    iget v6, p1, Lvk;->d:F

    .line 171
    .line 172
    cmpg-float v7, v6, v4

    .line 173
    .line 174
    if-gez v7, :cond_5

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_5
    move v4, v6

    .line 178
    :goto_1
    cmpl-float v6, v4, v5

    .line 179
    .line 180
    if-lez v6, :cond_6

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_6
    move v5, v4

    .line 184
    :goto_2
    iget p1, p1, Lvk;->a:F

    .line 185
    .line 186
    cmpg-float v4, p1, v1

    .line 187
    .line 188
    if-gez v4, :cond_7

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_7
    move v1, p1

    .line 192
    :goto_3
    cmpl-float p1, v1, v2

    .line 193
    .line 194
    if-lez p1, :cond_8

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_8
    move v2, v1

    .line 198
    :goto_4
    sget-object p1, Lnw0;->x:Ln95;

    .line 199
    .line 200
    invoke-static {v0, v3, v5, v2, p1}, Lz51;->c(FFFFLlw0;)J

    .line 201
    .line 202
    .line 203
    move-result-wide v0

    .line 204
    check-cast p0, Llw0;

    .line 205
    .line 206
    invoke-static {v0, v1, p0}, Ldw0;->a(JLlw0;)J

    .line 207
    .line 208
    .line 209
    move-result-wide p0

    .line 210
    new-instance v0, Ldw0;

    .line 211
    .line 212
    invoke-direct {v0, p0, p1}, Ldw0;-><init>(J)V

    .line 213
    .line 214
    .line 215
    return-object v0

    .line 216
    :pswitch_5
    check-cast p1, Ldo5;

    .line 217
    .line 218
    check-cast p0, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    move v3, v1

    .line 225
    :goto_5
    if-ge v3, v0, :cond_9

    .line 226
    .line 227
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    check-cast v4, Leo5;

    .line 232
    .line 233
    invoke-static {p1, v4, v1, v1}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 234
    .line 235
    .line 236
    add-int/lit8 v3, v3, 0x1

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_9
    return-object v2

    .line 240
    :pswitch_6
    invoke-static {p1, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result p0

    .line 244
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    return-object p0

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
