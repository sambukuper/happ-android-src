.class public final Lj58;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:Llh7;

.field public final synthetic Y:J

.field public final synthetic Z:Lo88;

.field public final synthetic f0:Lrn2;


# direct methods
.method public constructor <init>(Lyd8;JLo88;Lrn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj58;->X:Llh7;

    .line 5
    .line 6
    iput-wide p2, p0, Lj58;->Y:J

    .line 7
    .line 8
    iput-object p4, p0, Lj58;->Z:Lo88;

    .line 9
    .line 10
    iput-object p5, p0, Lj58;->f0:Lrn2;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lkx4;

    .line 2
    .line 3
    move-object v4, p2

    .line 4
    check-cast v4, Llp2;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    and-int/lit8 p3, p2, 0x6

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    if-nez p3, :cond_1

    .line 16
    .line 17
    invoke-virtual {v4, p1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    const/4 p3, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p3, v0

    .line 26
    :goto_0
    or-int/2addr p2, p3

    .line 27
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 28
    .line 29
    const/16 v1, 0x12

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v6, 0x1

    .line 33
    if-eq p3, v1, :cond_2

    .line 34
    .line 35
    move p3, v6

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move p3, v2

    .line 38
    :goto_1
    and-int/2addr p2, v6

    .line 39
    invoke-virtual {v4, p2, p3}, Llp2;->N(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_8

    .line 44
    .line 45
    iget-object p2, p0, Lj58;->X:Llh7;

    .line 46
    .line 47
    invoke-virtual {v4, p2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    invoke-virtual {v4}, Llp2;->K()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-nez p3, :cond_3

    .line 56
    .line 57
    sget-object p3, Lzz0;->a:Lbe;

    .line 58
    .line 59
    if-ne v1, p3, :cond_4

    .line 60
    .line 61
    :cond_3
    new-instance v1, Lsf1;

    .line 62
    .line 63
    invoke-direct {v1, p2, v0}, Lsf1;-><init>(Llh7;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_4
    check-cast v1, Lgn2;

    .line 70
    .line 71
    invoke-static {p1, v1}, Ljm4;->I(Lkx4;Lgn2;)Lkx4;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    sget-object p2, Lpz2;->Z:Lp50;

    .line 76
    .line 77
    invoke-static {p2, v2}, Lg80;->c(Lp50;Z)Lxr4;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-static {v4}, Lkm4;->I(Llp2;)I

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    invoke-virtual {v4}, Llp2;->l()Lkl5;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v4, p1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    sget-object v1, Luz0;->j:Lpz2;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Llp2;->Z()V

    .line 99
    .line 100
    .line 101
    iget-boolean v1, v4, Llp2;->S:Z

    .line 102
    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    invoke-virtual {v4}, Llp2;->k()V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    invoke-virtual {v4}, Llp2;->j0()V

    .line 110
    .line 111
    .line 112
    :goto_2
    sget-object v1, Lpz2;->B0:Ldx0;

    .line 113
    .line 114
    invoke-static {v1, v4, p2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    sget-object p2, Lpz2;->A0:Ldx0;

    .line 118
    .line 119
    invoke-static {p2, v4, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object p2, Lpz2;->C0:Ldx0;

    .line 123
    .line 124
    iget-boolean v0, v4, Llp2;->S:Z

    .line 125
    .line 126
    if-nez v0, :cond_6

    .line 127
    .line 128
    invoke-virtual {v4}, Llp2;->K()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_7

    .line 141
    .line 142
    :cond_6
    invoke-static {p3, v4, p3, p2}, Lp61;->v(ILlp2;ILdx0;)V

    .line 143
    .line 144
    .line 145
    :cond_7
    sget-object p2, Lpz2;->z0:Ldx0;

    .line 146
    .line 147
    invoke-static {p2, v4, p1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    const/4 v5, 0x0

    .line 151
    iget-wide v0, p0, Lj58;->Y:J

    .line 152
    .line 153
    iget-object v2, p0, Lj58;->Z:Lo88;

    .line 154
    .line 155
    iget-object v3, p0, Lj58;->f0:Lrn2;

    .line 156
    .line 157
    invoke-static/range {v0 .. v5}, Lpn7;->b(JLo88;Lrn2;Llp2;I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v6}, Llp2;->p(Z)V

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_8
    invoke-virtual {v4}, Llp2;->Q()V

    .line 165
    .line 166
    .line 167
    :goto_3
    sget-object p0, Ldn8;->a:Ldn8;

    .line 168
    .line 169
    return-object p0
.end method
