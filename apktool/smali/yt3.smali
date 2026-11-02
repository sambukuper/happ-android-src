.class public final Lyt3;
.super Ljm4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final m0:Lfx5;

.field public final n0:Lcz5;

.field public final o0:Lfu3;

.field public final p0:Lw15;

.field public final q0:Lux4;

.field public final r0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lfx5;Lcz5;Lfu3;Lw15;Lux4;)V
    .locals 3

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyt3;->m0:Lfx5;

    .line 8
    .line 9
    iput-object p2, p0, Lyt3;->n0:Lcz5;

    .line 10
    .line 11
    iput-object p3, p0, Lyt3;->o0:Lfu3;

    .line 12
    .line 13
    iput-object p4, p0, Lyt3;->p0:Lw15;

    .line 14
    .line 15
    iput-object p5, p0, Lyt3;->q0:Lux4;

    .line 16
    .line 17
    invoke-virtual {p3}, Lfu3;->i()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object p1, p3, Lfu3;->g0:Ldu3;

    .line 24
    .line 25
    iget p1, p1, Ldu3;->Z:I

    .line 26
    .line 27
    invoke-interface {p4, p1}, Lw15;->getString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p2, p3, Lfu3;->g0:Ldu3;

    .line 32
    .line 33
    iget p2, p2, Ldu3;->f0:I

    .line 34
    .line 35
    invoke-interface {p4, p2}, Lw15;->getString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    goto/16 :goto_2

    .line 44
    .line 45
    :cond_0
    sget-object p3, Lmu3;->a:Lr62;

    .line 46
    .line 47
    const/4 p3, 0x1

    .line 48
    invoke-static {p2, p4, p5, p3}, Lmu3;->b(Lcz5;Lw15;Lux4;Z)Lkt3;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    const/4 p3, 0x0

    .line 53
    if-eqz p2, :cond_5

    .line 54
    .line 55
    iget-object p5, p2, Lkt3;->l:Ljava/lang/String;

    .line 56
    .line 57
    iget-object p2, p2, Lkt3;->m:Ljava/lang/String;

    .line 58
    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-static {p5}, Ljs3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p5

    .line 65
    invoke-direct {v0, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p1}, Led1;->p()Led1;

    .line 69
    .line 70
    .line 71
    move-result-object p5

    .line 72
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-interface {p1}, Lts4;->e()Lfl1;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    sget-object v2, Lgl1;->d:Lfl1;

    .line 80
    .line 81
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    const-string v2, "$"

    .line 86
    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    instance-of v1, p5, Lvl1;

    .line 90
    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    check-cast p5, Lvl1;

    .line 94
    .line 95
    iget-object p1, p5, Lvl1;->g0:Lfy5;

    .line 96
    .line 97
    sget-object p3, Llu3;->g:Laq2;

    .line 98
    .line 99
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {p1, p3}, Lch3;->y(Lyp2;Laq2;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Ljava/lang/Integer;

    .line 107
    .line 108
    if-eqz p1, :cond_1

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-interface {p4, p1}, Lw15;->getString(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    goto :goto_0

    .line 119
    :cond_1
    const-string p1, "main"

    .line 120
    .line 121
    :goto_0
    sget-object p3, Ld25;->a:Lkc6;

    .line 122
    .line 123
    iget-object p3, p3, Lkc6;->X:Ljava/util/regex/Pattern;

    .line 124
    .line 125
    invoke-virtual {p3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    const-string p3, "_"

    .line 130
    .line 131
    invoke-virtual {p1, p3}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    goto :goto_1

    .line 143
    :cond_2
    invoke-interface {p1}, Lts4;->e()Lfl1;

    .line 144
    .line 145
    .line 146
    move-result-object p4

    .line 147
    sget-object v1, Lgl1;->a:Lfl1;

    .line 148
    .line 149
    invoke-static {p4, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p4

    .line 153
    if-eqz p4, :cond_4

    .line 154
    .line 155
    instance-of p4, p5, Ltf5;

    .line 156
    .line 157
    if-eqz p4, :cond_4

    .line 158
    .line 159
    check-cast p1, Lim1;

    .line 160
    .line 161
    iget-object p1, p1, Lim1;->I0:Lxl1;

    .line 162
    .line 163
    instance-of p4, p1, Lst3;

    .line 164
    .line 165
    if-eqz p4, :cond_4

    .line 166
    .line 167
    check-cast p1, Lst3;

    .line 168
    .line 169
    iget-object p4, p1, Lst3;->Y:Lzs3;

    .line 170
    .line 171
    if-eqz p4, :cond_4

    .line 172
    .line 173
    new-instance p4, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object p1, p1, Lst3;->X:Lzs3;

    .line 179
    .line 180
    iget-object p1, p1, Lzs3;->a:Ljava/lang/String;

    .line 181
    .line 182
    if-eqz p1, :cond_3

    .line 183
    .line 184
    const/16 p3, 0x2f

    .line 185
    .line 186
    invoke-static {p3, p1, p1}, Lfm7;->K0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-static {p1}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1}, Lv15;->b()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    goto :goto_1

    .line 206
    :cond_3
    const/16 p0, 0xa

    .line 207
    .line 208
    invoke-static {p0}, Lzs3;->a(I)V

    .line 209
    .line 210
    .line 211
    throw p3

    .line 212
    :cond_4
    const-string p1, ""

    .line 213
    .line 214
    :goto_1
    const-string p3, "()"

    .line 215
    .line 216
    invoke-static {v0, p1, p3, p2}, Lp61;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    :goto_2
    iput-object p1, p0, Lyt3;->r0:Ljava/lang/String;

    .line 221
    .line 222
    return-void

    .line 223
    :cond_5
    const-string p0, "No field signature for property: "

    .line 224
    .line 225
    invoke-static {p1, p0}, Lxw3;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw p3
.end method


# virtual methods
.method public final o()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt3;->r0:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
