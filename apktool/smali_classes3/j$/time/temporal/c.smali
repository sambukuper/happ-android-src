.class public final enum Lj$/time/temporal/c;
.super Lj$/time/temporal/g;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "DAY_OF_QUARTER"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final C(Ljava/util/Map;Lj$/time/format/u;Lj$/time/format/v;)Lj$/time/temporal/TemporalAccessor;
    .locals 11

    .line 1
    sget-object v0, Lj$/time/temporal/ChronoField;->YEAR:Lj$/time/temporal/ChronoField;

    .line 2
    .line 3
    check-cast p1, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Long;

    .line 10
    .line 11
    sget-object v2, Lj$/time/temporal/g;->QUARTER_OF_YEAR:Lj$/time/temporal/g;

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/lang/Long;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v1, :cond_6

    .line 21
    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    iget-object v1, v0, Lj$/time/temporal/ChronoField;->b:Lj$/time/temporal/s;

    .line 31
    .line 32
    invoke-virtual {v1, v5, v6, v0}, Lj$/time/temporal/s;->a(JLj$/time/temporal/TemporalField;)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    sget-object v5, Lj$/time/temporal/g;->DAY_OF_QUARTER:Lj$/time/temporal/g;

    .line 37
    .line 38
    invoke-virtual {p1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Ljava/lang/Long;

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    sget-object v7, Lj$/time/temporal/i;->a:Lj$/time/temporal/g;

    .line 49
    .line 50
    invoke-static {p2}, Lj$/time/chrono/k;->o(Lj$/time/temporal/TemporalAccessor;)Lj$/time/chrono/k;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    sget-object v7, Lj$/time/chrono/r;->c:Lj$/time/chrono/r;

    .line 55
    .line 56
    invoke-interface {p2, v7}, Lj$/time/chrono/k;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_5

    .line 61
    .line 62
    sget-object p2, Lj$/time/format/v;->LENIENT:Lj$/time/format/v;

    .line 63
    .line 64
    const-wide/16 v7, 0x1

    .line 65
    .line 66
    const/4 v4, 0x1

    .line 67
    if-ne p3, p2, :cond_1

    .line 68
    .line 69
    invoke-static {v1, v4, v4}, Lj$/time/LocalDate;->of(III)Lj$/time/LocalDate;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 74
    .line 75
    .line 76
    move-result-wide v3

    .line 77
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->subtractExact(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v3

    .line 81
    const-wide/16 v9, 0x3

    .line 82
    .line 83
    invoke-static {v3, v4, v9, v10}, Ljava/lang/Math;->multiplyExact(JJ)J

    .line 84
    .line 85
    .line 86
    move-result-wide v3

    .line 87
    invoke-virtual {p2, v3, v4}, Lj$/time/LocalDate;->V(J)Lj$/time/LocalDate;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->subtractExact(JJ)J

    .line 92
    .line 93
    .line 94
    move-result-wide v3

    .line 95
    goto :goto_1

    .line 96
    :cond_1
    invoke-interface {v2}, Lj$/time/temporal/TemporalField;->range()Lj$/time/temporal/s;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v9

    .line 104
    invoke-virtual {p2, v9, v10, v2}, Lj$/time/temporal/s;->a(JLj$/time/temporal/TemporalField;)I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    sub-int/2addr p2, v4

    .line 109
    mul-int/lit8 p2, p2, 0x3

    .line 110
    .line 111
    add-int/2addr p2, v4

    .line 112
    invoke-static {v1, p2, v4}, Lj$/time/LocalDate;->of(III)Lj$/time/LocalDate;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    cmp-long v1, v5, v7

    .line 117
    .line 118
    if-ltz v1, :cond_2

    .line 119
    .line 120
    const-wide/16 v3, 0x5a

    .line 121
    .line 122
    cmp-long v1, v5, v3

    .line 123
    .line 124
    if-lez v1, :cond_4

    .line 125
    .line 126
    :cond_2
    sget-object v1, Lj$/time/format/v;->STRICT:Lj$/time/format/v;

    .line 127
    .line 128
    if-ne p3, v1, :cond_3

    .line 129
    .line 130
    invoke-virtual {p0, p2}, Lj$/time/temporal/c;->x(Lj$/time/temporal/TemporalAccessor;)Lj$/time/temporal/s;

    .line 131
    .line 132
    .line 133
    move-result-object p3

    .line 134
    invoke-virtual {p3, v5, v6, p0}, Lj$/time/temporal/s;->b(JLj$/time/temporal/TemporalField;)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_3
    invoke-virtual {p0}, Lj$/time/temporal/c;->range()Lj$/time/temporal/s;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    invoke-virtual {p3, v5, v6, p0}, Lj$/time/temporal/s;->b(JLj$/time/temporal/TemporalField;)V

    .line 143
    .line 144
    .line 145
    :cond_4
    :goto_0
    sub-long v3, v5, v7

    .line 146
    .line 147
    :goto_1
    invoke-virtual {p1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2, v3, v4}, Lj$/time/LocalDate;->U(J)Lj$/time/LocalDate;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :cond_5
    const-string p0, "Resolve requires IsoChronology"

    .line 162
    .line 163
    invoke-static {p0}, Lj$/time/g;->a(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :cond_6
    :goto_2
    return-object v4
.end method

.method public final I(Lj$/time/temporal/TemporalAccessor;)J
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lj$/time/temporal/c;->t(Lj$/time/temporal/TemporalAccessor;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    sget-object p0, Lj$/time/temporal/ChronoField;->DAY_OF_YEAR:Lj$/time/temporal/ChronoField;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lj$/time/temporal/TemporalAccessor;->h(Lj$/time/temporal/TemporalField;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    sget-object v0, Lj$/time/temporal/ChronoField;->MONTH_OF_YEAR:Lj$/time/temporal/ChronoField;

    .line 14
    .line 15
    invoke-interface {p1, v0}, Lj$/time/temporal/TemporalAccessor;->h(Lj$/time/temporal/TemporalField;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    sget-object v1, Lj$/time/temporal/ChronoField;->YEAR:Lj$/time/temporal/ChronoField;

    .line 20
    .line 21
    invoke-interface {p1, v1}, Lj$/time/temporal/TemporalAccessor;->k(Lj$/time/temporal/TemporalField;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    add-int/lit8 v0, v0, -0x1

    .line 26
    .line 27
    div-int/lit8 v0, v0, 0x3

    .line 28
    .line 29
    sget-object p1, Lj$/time/chrono/r;->c:Lj$/time/chrono/r;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lj$/time/chrono/r;->R(J)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    const/4 p1, 0x4

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    :goto_0
    add-int/2addr v0, p1

    .line 44
    sget-object p1, Lj$/time/temporal/g;->a:[I

    .line 45
    .line 46
    aget p1, p1, v0

    .line 47
    .line 48
    sub-int/2addr p0, p1

    .line 49
    int-to-long p0, p0

    .line 50
    return-wide p0

    .line 51
    :cond_1
    new-instance p0, Lj$/time/temporal/r;

    .line 52
    .line 53
    const-string p1, "Unsupported field: DayOfQuarter"

    .line 54
    .line 55
    invoke-direct {p0, p1}, Lj$/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0
.end method

.method public final N(Lj$/time/temporal/l;J)Lj$/time/temporal/l;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lj$/time/temporal/c;->I(Lj$/time/temporal/TemporalAccessor;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0}, Lj$/time/temporal/c;->range()Lj$/time/temporal/s;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2, p2, p3, p0}, Lj$/time/temporal/s;->b(JLj$/time/temporal/TemporalField;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lj$/time/temporal/ChronoField;->DAY_OF_YEAR:Lj$/time/temporal/ChronoField;

    .line 13
    .line 14
    invoke-interface {p1, p0}, Lj$/time/temporal/TemporalAccessor;->k(Lj$/time/temporal/TemporalField;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    sub-long/2addr p2, v0

    .line 19
    add-long/2addr p2, v2

    .line 20
    invoke-interface {p1, p2, p3, p0}, Lj$/time/temporal/l;->b(JLj$/time/temporal/TemporalField;)Lj$/time/temporal/l;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final range()Lj$/time/temporal/s;
    .locals 4

    .line 1
    const-wide/16 v0, 0x5a

    .line 2
    .line 3
    const-wide/16 v2, 0x5c

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Lj$/time/temporal/s;->g(JJ)Lj$/time/temporal/s;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final t(Lj$/time/temporal/TemporalAccessor;)Z
    .locals 0

    .line 1
    sget-object p0, Lj$/time/temporal/ChronoField;->DAY_OF_YEAR:Lj$/time/temporal/ChronoField;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lj$/time/temporal/TemporalAccessor;->i(Lj$/time/temporal/TemporalField;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lj$/time/temporal/ChronoField;->MONTH_OF_YEAR:Lj$/time/temporal/ChronoField;

    .line 10
    .line 11
    invoke-interface {p1, p0}, Lj$/time/temporal/TemporalAccessor;->i(Lj$/time/temporal/TemporalField;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    sget-object p0, Lj$/time/temporal/ChronoField;->YEAR:Lj$/time/temporal/ChronoField;

    .line 18
    .line 19
    invoke-interface {p1, p0}, Lj$/time/temporal/TemporalAccessor;->i(Lj$/time/temporal/TemporalField;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    sget-object p0, Lj$/time/temporal/i;->a:Lj$/time/temporal/g;

    .line 26
    .line 27
    invoke-static {p1}, Lj$/time/chrono/k;->o(Lj$/time/temporal/TemporalAccessor;)Lj$/time/chrono/k;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object p1, Lj$/time/chrono/r;->c:Lj$/time/chrono/r;

    .line 32
    .line 33
    invoke-interface {p0, p1}, Lj$/time/chrono/k;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_0
    const/4 p0, 0x0

    .line 42
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "DayOfQuarter"

    .line 2
    .line 3
    return-object p0
.end method

.method public final x(Lj$/time/temporal/TemporalAccessor;)Lj$/time/temporal/s;
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Lj$/time/temporal/c;->t(Lj$/time/temporal/TemporalAccessor;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    sget-object v0, Lj$/time/temporal/g;->QUARTER_OF_YEAR:Lj$/time/temporal/g;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lj$/time/temporal/TemporalAccessor;->k(Lj$/time/temporal/TemporalField;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x1

    .line 14
    .line 15
    cmp-long v4, v0, v2

    .line 16
    .line 17
    const-wide/16 v5, 0x5b

    .line 18
    .line 19
    if-nez v4, :cond_1

    .line 20
    .line 21
    sget-object p0, Lj$/time/temporal/ChronoField;->YEAR:Lj$/time/temporal/ChronoField;

    .line 22
    .line 23
    invoke-interface {p1, p0}, Lj$/time/temporal/TemporalAccessor;->k(Lj$/time/temporal/TemporalField;)J

    .line 24
    .line 25
    .line 26
    move-result-wide p0

    .line 27
    sget-object v0, Lj$/time/chrono/r;->c:Lj$/time/chrono/r;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {p0, p1}, Lj$/time/chrono/r;->R(J)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    invoke-static {v2, v3, v5, v6}, Lj$/time/temporal/s;->f(JJ)Lj$/time/temporal/s;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_0
    const-wide/16 p0, 0x5a

    .line 44
    .line 45
    invoke-static {v2, v3, p0, p1}, Lj$/time/temporal/s;->f(JJ)Lj$/time/temporal/s;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_1
    const-wide/16 v7, 0x2

    .line 51
    .line 52
    cmp-long p1, v0, v7

    .line 53
    .line 54
    if-nez p1, :cond_2

    .line 55
    .line 56
    invoke-static {v2, v3, v5, v6}, Lj$/time/temporal/s;->f(JJ)Lj$/time/temporal/s;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_2
    const-wide/16 v4, 0x3

    .line 62
    .line 63
    cmp-long p1, v0, v4

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    const-wide/16 v4, 0x4

    .line 68
    .line 69
    cmp-long p1, v0, v4

    .line 70
    .line 71
    if-nez p1, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    invoke-virtual {p0}, Lj$/time/temporal/c;->range()Lj$/time/temporal/s;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_4
    :goto_0
    const-wide/16 p0, 0x5c

    .line 80
    .line 81
    invoke-static {v2, v3, p0, p1}, Lj$/time/temporal/s;->f(JJ)Lj$/time/temporal/s;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :cond_5
    new-instance p0, Lj$/time/temporal/r;

    .line 87
    .line 88
    const-string p1, "Unsupported field: DayOfQuarter"

    .line 89
    .line 90
    invoke-direct {p0, p1}, Lj$/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p0
.end method
