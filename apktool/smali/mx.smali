.class public final Lmx;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J


# direct methods
.method public constructor <init>(JJJ)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lmx;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Lmx;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, Lmx;->c:J

    .line 9
    .line 10
    sget-wide v0, Lv88;->c:J

    .line 11
    .line 12
    invoke-static {p1, p2, v0, v1}, Lv88;->a(JJ)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_7

    .line 17
    .line 18
    invoke-static {p3, p4, v0, v1}, Lv88;->a(JJ)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_6

    .line 23
    .line 24
    invoke-static {p5, p6, v0, v1}, Lv88;->a(JJ)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_5

    .line 29
    .line 30
    invoke-static {p1, p2}, Lv88;->b(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-static {p3, p4}, Lv88;->b(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    invoke-static {v0, v1, v2, v3}, Lw88;->a(JJ)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    invoke-static {p1, p2, p3, p4}, Leu7;->d(JJ)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1, p2}, Lv88;->c(J)F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {p3, p4}, Lv88;->c(J)F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-lez v0, :cond_0

    .line 60
    .line 61
    iput-wide p3, p0, Lmx;->a:J

    .line 62
    .line 63
    move-wide p1, p3

    .line 64
    :cond_0
    invoke-static {p5, p6}, Lv88;->b(J)J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    const-wide v2, 0x100000000L

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    invoke-static {v0, v1, v2, v3}, Lw88;->a(JJ)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_2

    .line 78
    .line 79
    const p0, 0x38d1b717    # 1.0E-4f

    .line 80
    .line 81
    .line 82
    invoke-static {p0, v2, v3}, Leu7;->i(FJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    invoke-static {p5, p6, v0, v1}, Leu7;->d(JJ)V

    .line 87
    .line 88
    .line 89
    invoke-static {p5, p6}, Lv88;->c(J)F

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-static {v0, v1}, Lv88;->c(J)F

    .line 94
    .line 95
    .line 96
    move-result p5

    .line 97
    invoke-static {p0, p5}, Ljava/lang/Float;->compare(FF)I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-ltz p0, :cond_1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    const-string p0, "AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp"

    .line 105
    .line 106
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const/4 p0, 0x0

    .line 110
    throw p0

    .line 111
    :cond_2
    :goto_0
    invoke-static {p1, p2}, Lv88;->c(J)F

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    const/4 p1, 0x0

    .line 116
    cmpg-float p0, p0, p1

    .line 117
    .line 118
    if-ltz p0, :cond_4

    .line 119
    .line 120
    invoke-static {p3, p4}, Lv88;->c(J)F

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    cmpg-float p0, p0, p1

    .line 125
    .line 126
    if-ltz p0, :cond_3

    .line 127
    .line 128
    return-void

    .line 129
    :cond_3
    const-string p0, "AutoSize.StepBased: maxFontSize must not be negative"

    .line 130
    .line 131
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const/4 p0, 0x0

    .line 135
    throw p0

    .line 136
    :cond_4
    const-string p0, "AutoSize.StepBased: minFontSize must not be negative"

    .line 137
    .line 138
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    const/4 p0, 0x0

    .line 142
    throw p0

    .line 143
    :cond_5
    const-string p0, "AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp"

    .line 144
    .line 145
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    const/4 p0, 0x0

    .line 149
    throw p0

    .line 150
    :cond_6
    const-string p0, "AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp"

    .line 151
    .line 152
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    const/4 p0, 0x0

    .line 156
    throw p0

    .line 157
    :cond_7
    const-string p0, "AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp"

    .line 158
    .line 159
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const/4 p0, 0x0

    .line 163
    throw p0
.end method

.method public static a(Lx78;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lx78;->b:Lbz4;

    .line 2
    .line 3
    iget-wide v1, p0, Lx78;->c:J

    .line 4
    .line 5
    iget-object v3, p0, Lx78;->a:Lw78;

    .line 6
    .line 7
    iget v3, v3, Lw78;->f:I

    .line 8
    .line 9
    const/16 v4, 0x20

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    if-ne v3, v6, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v7, 0x3

    .line 17
    if-ne v3, v7, :cond_3

    .line 18
    .line 19
    :goto_0
    shr-long/2addr v1, v4

    .line 20
    long-to-int v1, v1

    .line 21
    int-to-float v1, v1

    .line 22
    iget v0, v0, Lbz4;->d:F

    .line 23
    .line 24
    cmpg-float v0, v1, v0

    .line 25
    .line 26
    if-gez v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {p0}, Lx78;->d()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    :goto_1
    return v6

    .line 36
    :cond_2
    return v5

    .line 37
    :cond_3
    const/4 v7, 0x2

    .line 38
    const/4 v8, 0x5

    .line 39
    const/4 v9, 0x4

    .line 40
    if-ne v3, v9, :cond_4

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_4
    if-ne v3, v8, :cond_5

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_5
    if-ne v3, v7, :cond_c

    .line 47
    .line 48
    :goto_2
    iget v10, v0, Lbz4;->f:I

    .line 49
    .line 50
    if-eqz v10, :cond_b

    .line 51
    .line 52
    if-eq v10, v6, :cond_a

    .line 53
    .line 54
    if-ne v3, v9, :cond_6

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_6
    if-ne v3, v8, :cond_9

    .line 58
    .line 59
    :goto_3
    shr-long/2addr v1, v4

    .line 60
    long-to-int v1, v1

    .line 61
    int-to-float v1, v1

    .line 62
    iget v0, v0, Lbz4;->d:F

    .line 63
    .line 64
    cmpg-float v0, v1, v0

    .line 65
    .line 66
    if-gez v0, :cond_7

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_7
    invoke-virtual {p0}, Lx78;->d()Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_8

    .line 74
    .line 75
    :goto_4
    return v6

    .line 76
    :cond_8
    return v5

    .line 77
    :cond_9
    if-ne v3, v7, :cond_b

    .line 78
    .line 79
    sub-int/2addr v10, v6

    .line 80
    invoke-virtual {p0, v10}, Lx78;->l(I)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0

    .line 85
    :cond_a
    invoke-virtual {p0, v5}, Lx78;->l(I)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    return p0

    .line 90
    :cond_b
    return v5

    .line 91
    :cond_c
    invoke-static {v3}, Lgs8;->o(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    const-string v0, "TextOverflow type "

    .line 96
    .line 97
    const-string v1, " is not supported."

    .line 98
    .line 99
    invoke-static {v0, p0, v1}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return v5
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    instance-of v2, p1, Lmx;

    .line 10
    .line 11
    if-nez v2, :cond_2

    .line 12
    .line 13
    return v1

    .line 14
    :cond_2
    check-cast p1, Lmx;

    .line 15
    .line 16
    iget-wide v2, p1, Lmx;->a:J

    .line 17
    .line 18
    iget-wide v4, p0, Lmx;->a:J

    .line 19
    .line 20
    invoke-static {v2, v3, v4, v5}, Lv88;->a(JJ)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-wide v2, p1, Lmx;->b:J

    .line 28
    .line 29
    iget-wide v4, p0, Lmx;->b:J

    .line 30
    .line 31
    invoke-static {v2, v3, v4, v5}, Lv88;->a(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_4

    .line 36
    .line 37
    return v1

    .line 38
    :cond_4
    iget-wide v2, p1, Lmx;->c:J

    .line 39
    .line 40
    iget-wide p0, p0, Lmx;->c:J

    .line 41
    .line 42
    invoke-static {v2, v3, p0, p1}, Lv88;->a(JJ)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_5

    .line 47
    .line 48
    return v1

    .line 49
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget-object v0, Lv88;->b:[Lw88;

    .line 2
    .line 3
    iget-wide v0, p0, Lmx;->a:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-wide v2, p0, Lmx;->b:J

    .line 13
    .line 14
    invoke-static {v0, v2, v3, v1}, Lp61;->g(IJI)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-wide v1, p0, Lmx;->c:J

    .line 19
    .line 20
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method
