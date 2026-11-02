.class public final Lrr4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lde3;


# instance fields
.field public final X:S


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-short p1, p0, Lrr4;->X:S

    .line 5
    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "maxLength must be at least zero"

    .line 10
    .line 11
    invoke-static {p0}, Lzc3;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lrr4;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lrr4;

    .line 10
    .line 11
    iget-short p0, p0, Lrr4;->X:S

    .line 12
    .line 13
    iget-short p1, p1, Lrr4;->X:S

    .line 14
    .line 15
    if-eq p0, p1, :cond_2

    .line 16
    .line 17
    :goto_0
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 20
    return p0
.end method

.method public final h(Lf17;)V
    .locals 3

    .line 1
    sget-object v0, Ld17;->a:[Lnw3;

    .line 2
    .line 3
    sget-object v0, Lc17;->R:Le17;

    .line 4
    .line 5
    sget-object v1, Ld17;->a:[Lnw3;

    .line 6
    .line 7
    const/16 v2, 0x1d

    .line 8
    .line 9
    aget-object v1, v1, v2

    .line 10
    .line 11
    iget-short p0, p0, Lrr4;->X:S

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v0, p0}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-short p0, p0, Lrr4;->X:S

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final i(Lg48;)V
    .locals 7

    .line 1
    iget-object v0, p1, Lg48;->Z:Lmi5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmi5;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-short p0, p0, Lrr4;->X:S

    .line 8
    .line 9
    if-le v1, p0, :cond_4

    .line 10
    .line 11
    invoke-virtual {v0}, Lmi5;->length()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    iget-object v0, p1, Lg48;->X:Lh48;

    .line 16
    .line 17
    iget-object v1, v0, Lh48;->Z:Ljava/lang/CharSequence;

    .line 18
    .line 19
    iget-object v2, v0, Lh48;->Y:Lc78;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {p1, v3, p0, v1}, Lg48;->c(IILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-wide v0, v0, Lh48;->f0:J

    .line 30
    .line 31
    invoke-virtual {p1, v0, v1}, Lg48;->g(J)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lg48;->a()Lmj0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Lmj0;->A()V

    .line 39
    .line 40
    .line 41
    iget-object p0, p1, Lg48;->f0:Lp88;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    const/4 v1, 0x4

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    if-nez p0, :cond_0

    .line 48
    .line 49
    new-instance p0, Lp88;

    .line 50
    .line 51
    const/4 v4, 0x3

    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-direct {p0, v5, v4}, Lp88;-><init>(Lp88;I)V

    .line 54
    .line 55
    .line 56
    iput-object p0, p1, Lg48;->f0:Lp88;

    .line 57
    .line 58
    :cond_0
    iget-object p1, v2, Lc78;->a:Lp88;

    .line 59
    .line 60
    iget-boolean v2, p0, Lp88;->a:Z

    .line 61
    .line 62
    if-nez v2, :cond_1

    .line 63
    .line 64
    const-string v2, "This buffer is immutable"

    .line 65
    .line 66
    invoke-static {v2}, Lzc3;->c(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    iget v2, p1, Lp88;->c:I

    .line 70
    .line 71
    iput v2, p0, Lp88;->c:I

    .line 72
    .line 73
    iget v2, p1, Lp88;->d:I

    .line 74
    .line 75
    iput v2, p0, Lp88;->d:I

    .line 76
    .line 77
    iget-object p0, p0, Lp88;->b:Ldf3;

    .line 78
    .line 79
    iget-object p1, p1, Lp88;->b:Ldf3;

    .line 80
    .line 81
    iget-object v2, p0, Ldf3;->a:Lj05;

    .line 82
    .line 83
    iget-object v4, p0, Ldf3;->b:Lzz4;

    .line 84
    .line 85
    iget v5, p1, Ldf3;->d:I

    .line 86
    .line 87
    iget v6, p1, Ldf3;->e:I

    .line 88
    .line 89
    if-ne v5, v6, :cond_2

    .line 90
    .line 91
    iget p1, p0, Ldf3;->e:I

    .line 92
    .line 93
    iput p1, p0, Ldf3;->d:I

    .line 94
    .line 95
    iget p1, v4, Lzz4;->b:I

    .line 96
    .line 97
    invoke-virtual {v4, v1, p1}, Lzz4;->e(II)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Ldf3;->a:Lj05;

    .line 101
    .line 102
    iget v1, p1, Lj05;->b:I

    .line 103
    .line 104
    invoke-virtual {p1, v0, v1}, Lj05;->m(II)V

    .line 105
    .line 106
    .line 107
    iput v3, p0, Ldf3;->c:I

    .line 108
    .line 109
    return-void

    .line 110
    :cond_2
    iput v3, v4, Lzz4;->b:I

    .line 111
    .line 112
    iget-object v0, p1, Ldf3;->b:Lzz4;

    .line 113
    .line 114
    invoke-virtual {v4, v3, v0}, Lzz4;->b(ILzz4;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Lj05;->d()V

    .line 118
    .line 119
    .line 120
    iget-object v0, p1, Ldf3;->a:Lj05;

    .line 121
    .line 122
    invoke-virtual {v2, v0}, Lj05;->b(Lj05;)V

    .line 123
    .line 124
    .line 125
    iget v0, p1, Ldf3;->d:I

    .line 126
    .line 127
    iput v0, p0, Ldf3;->d:I

    .line 128
    .line 129
    iget v0, p1, Ldf3;->c:I

    .line 130
    .line 131
    iput v0, p0, Ldf3;->c:I

    .line 132
    .line 133
    iget-boolean p1, p1, Ldf3;->f:Z

    .line 134
    .line 135
    iput-boolean p1, p0, Ldf3;->f:Z

    .line 136
    .line 137
    return-void

    .line 138
    :cond_3
    if-eqz p0, :cond_4

    .line 139
    .line 140
    iget-object p0, p0, Lp88;->b:Ldf3;

    .line 141
    .line 142
    iget p1, p0, Ldf3;->e:I

    .line 143
    .line 144
    iput p1, p0, Ldf3;->d:I

    .line 145
    .line 146
    iget-object p1, p0, Ldf3;->b:Lzz4;

    .line 147
    .line 148
    iget v2, p1, Lzz4;->b:I

    .line 149
    .line 150
    invoke-virtual {p1, v1, v2}, Lzz4;->e(II)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Ldf3;->a:Lj05;

    .line 154
    .line 155
    iget v1, p1, Lj05;->b:I

    .line 156
    .line 157
    invoke-virtual {p1, v0, v1}, Lj05;->m(II)V

    .line 158
    .line 159
    .line 160
    iput v3, p0, Ldf3;->c:I

    .line 161
    .line 162
    :cond_4
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "InputTransformation.maxLength("

    .line 2
    .line 3
    const-string v1, ")"

    .line 4
    .line 5
    iget-short p0, p0, Lrr4;->X:S

    .line 6
    .line 7
    invoke-static {v0, p0, v1}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
