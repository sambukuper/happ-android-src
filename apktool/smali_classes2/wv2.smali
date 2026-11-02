.class public final synthetic Lwv2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:F

.field public final synthetic Y:Z

.field public final synthetic Z:Lzy0;

.field public final synthetic f0:Ldn2;


# direct methods
.method public synthetic constructor <init>(FZLzy0;Ldn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lwv2;->X:F

    .line 5
    .line 6
    iput-boolean p2, p0, Lwv2;->Y:Z

    .line 7
    .line 8
    iput-object p3, p0, Lwv2;->Z:Lzy0;

    .line 9
    .line 10
    iput-object p4, p0, Lwv2;->f0:Ldn2;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 p2, p1, 0x3

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v8, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    if-eq p2, v0, :cond_0

    .line 16
    .line 17
    move p2, v8

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p2, v9

    .line 20
    :goto_0
    and-int/2addr p1, v8

    .line 21
    invoke-virtual {v6, p1, p2}, Llp2;->N(IZ)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    sget-object p1, Lz91;->e:Lut8;

    .line 28
    .line 29
    sget-object p2, Lhx4;->X:Lhx4;

    .line 30
    .line 31
    invoke-static {p2, p1}, Lz91;->T(Lkx4;Lgn2;)Lkx4;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v5, 0x7

    .line 37
    const/4 v1, 0x0

    .line 38
    const/4 v2, 0x0

    .line 39
    iget v4, p0, Lwv2;->X:F

    .line 40
    .line 41
    invoke-static/range {v0 .. v5}, Los4;->A(Lkx4;FFFFI)Lkx4;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget-object v0, Lht;->c:Ldt;

    .line 46
    .line 47
    sget-object v1, Lpz2;->q0:Ln50;

    .line 48
    .line 49
    invoke-static {v0, v1, v6, v9}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-wide v1, v6, Llp2;->T:J

    .line 54
    .line 55
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-virtual {v6}, Llp2;->l()Lkl5;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v6, p1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    sget-object v3, Luz0;->j:Lpz2;

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6}, Llp2;->Z()V

    .line 73
    .line 74
    .line 75
    iget-boolean v3, v6, Llp2;->S:Z

    .line 76
    .line 77
    if-eqz v3, :cond_1

    .line 78
    .line 79
    invoke-virtual {v6}, Llp2;->k()V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-virtual {v6}, Llp2;->j0()V

    .line 84
    .line 85
    .line 86
    :goto_1
    sget-object v3, Lpz2;->B0:Ldx0;

    .line 87
    .line 88
    invoke-static {v3, v6, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, Lpz2;->A0:Ldx0;

    .line 92
    .line 93
    invoke-static {v0, v6, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sget-object v1, Lpz2;->C0:Ldx0;

    .line 101
    .line 102
    invoke-static {v1, v6, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v6}, Lpn7;->l(Llp2;)V

    .line 106
    .line 107
    .line 108
    sget-object v0, Lpz2;->z0:Ldx0;

    .line 109
    .line 110
    invoke-static {v0, v6, p1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    const/high16 p1, 0x41800000    # 16.0f

    .line 114
    .line 115
    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v6, v0}, Lch3;->f(Llp2;Lkx4;)V

    .line 120
    .line 121
    .line 122
    iget-boolean v0, p0, Lwv2;->Y:Z

    .line 123
    .line 124
    if-eqz v0, :cond_2

    .line 125
    .line 126
    const v0, 0x320f6b69

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6, v0}, Llp2;->W(I)V

    .line 130
    .line 131
    .line 132
    sget-object v0, Lpz2;->r0:Ln50;

    .line 133
    .line 134
    move-object v1, v0

    .line 135
    new-instance v0, Lr03;

    .line 136
    .line 137
    invoke-direct {v0, v1}, Lr03;-><init>(Ln50;)V

    .line 138
    .line 139
    .line 140
    invoke-interface {p2, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 141
    .line 142
    .line 143
    const-wide/16 v4, 0x0

    .line 144
    .line 145
    const/4 v7, 0x0

    .line 146
    const/4 v1, 0x0

    .line 147
    const/4 v2, 0x0

    .line 148
    const/4 v3, 0x0

    .line 149
    invoke-static/range {v0 .. v7}, Lvr3;->c(Lkx4;FFLx67;JLlp2;I)V

    .line 150
    .line 151
    .line 152
    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-static {v6, p1}, Lch3;->f(Llp2;Lkx4;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v6, v9}, Llp2;->p(Z)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_2
    const p1, 0x3211e993

    .line 164
    .line 165
    .line 166
    invoke-virtual {v6, p1}, Llp2;->W(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6, v9}, Llp2;->p(Z)V

    .line 170
    .line 171
    .line 172
    :goto_2
    const/16 p1, 0x36

    .line 173
    .line 174
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iget-object p2, p0, Lwv2;->Z:Lzy0;

    .line 179
    .line 180
    sget-object v0, Luw0;->a:Luw0;

    .line 181
    .line 182
    iget-object p0, p0, Lwv2;->f0:Ldn2;

    .line 183
    .line 184
    invoke-virtual {p2, v0, p0, v6, p1}, Lzy0;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v6, v8}, Llp2;->p(Z)V

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_3
    invoke-virtual {v6}, Llp2;->Q()V

    .line 192
    .line 193
    .line 194
    :goto_3
    sget-object p0, Ldn8;->a:Ldn8;

    .line 195
    .line 196
    return-object p0
.end method
