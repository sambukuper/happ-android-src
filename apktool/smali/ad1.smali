.class public final Lad1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgk;


# instance fields
.field public a:J

.field public final b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbd1;Lug8;Ljava/lang/Object;Lwk;)V
    .locals 8

    .line 1
    new-instance v0, Lnu8;

    .line 2
    .line 3
    iget-object p1, p1, Lbd1;->a:Lqe2;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lnu8;-><init>(Lqe2;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lad1;->b:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p2, p0, Lad1;->c:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p3, p0, Lad1;->d:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object p1, p2, Lug8;->a:Lgn2;

    .line 18
    .line 19
    invoke-interface {p1, p3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lwk;

    .line 24
    .line 25
    iput-object p1, p0, Lad1;->f:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {p4}, Lci8;->p(Lwk;)Lwk;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    iput-object p3, p0, Lad1;->g:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object p2, p2, Lug8;->b:Lgn2;

    .line 34
    .line 35
    iget-object p3, v0, Lnu8;->d:Lwk;

    .line 36
    .line 37
    if-nez p3, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1}, Lwk;->c()Lwk;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    iput-object p3, v0, Lnu8;->d:Lwk;

    .line 44
    .line 45
    :cond_0
    invoke-virtual {p3}, Lwk;->b()I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    const/4 v1, 0x0

    .line 50
    move v2, v1

    .line 51
    :goto_0
    iget-object v3, v0, Lnu8;->d:Lwk;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    iget-object v5, v0, Lnu8;->a:Lqe2;

    .line 55
    .line 56
    const-string v6, "targetVector"

    .line 57
    .line 58
    if-ge v2, p3, :cond_2

    .line 59
    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    invoke-virtual {p1, v2}, Lwk;->a(I)F

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-virtual {p4, v2}, Lwk;->a(I)F

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    invoke-interface {v5, v4, v6}, Lqe2;->r0(FF)F

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-virtual {v3, v2, v4}, Lwk;->e(IF)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v4

    .line 84
    :cond_2
    if-eqz v3, :cond_6

    .line 85
    .line 86
    invoke-interface {p2, v3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    iput-object p2, p0, Lad1;->e:Ljava/lang/Object;

    .line 91
    .line 92
    iget-object p2, v0, Lnu8;->c:Lwk;

    .line 93
    .line 94
    if-nez p2, :cond_3

    .line 95
    .line 96
    invoke-virtual {p1}, Lwk;->c()Lwk;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    iput-object p2, v0, Lnu8;->c:Lwk;

    .line 101
    .line 102
    :cond_3
    invoke-virtual {p2}, Lwk;->b()I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    const-wide/16 v2, 0x0

    .line 107
    .line 108
    move p3, v1

    .line 109
    :goto_1
    if-ge p3, p2, :cond_4

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p4, p3}, Lwk;->a(I)F

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-interface {v5, v0}, Lqe2;->m0(F)J

    .line 119
    .line 120
    .line 121
    move-result-wide v6

    .line 122
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 123
    .line 124
    .line 125
    move-result-wide v2

    .line 126
    add-int/lit8 p3, p3, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    iput-wide v2, p0, Lad1;->a:J

    .line 130
    .line 131
    iget-object p1, p0, Lad1;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p1, Lnu8;

    .line 134
    .line 135
    iget-object p2, p0, Lad1;->f:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p2, Lwk;

    .line 138
    .line 139
    invoke-virtual {p1, v2, v3, p2, p4}, Lnu8;->a(JLwk;Lwk;)Lwk;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-static {p1}, Lci8;->p(Lwk;)Lwk;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iput-object p1, p0, Lad1;->h:Ljava/lang/Object;

    .line 148
    .line 149
    invoke-virtual {p1}, Lwk;->b()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    :goto_2
    if-ge v1, p1, :cond_5

    .line 154
    .line 155
    iget-object p2, p0, Lad1;->h:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p2, Lwk;

    .line 158
    .line 159
    invoke-virtual {p2, v1}, Lwk;->a(I)F

    .line 160
    .line 161
    .line 162
    move-result p3

    .line 163
    iget-object p4, p0, Lad1;->b:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p4, Lnu8;

    .line 166
    .line 167
    iget p4, p4, Lnu8;->e:F

    .line 168
    .line 169
    neg-float v0, p4

    .line 170
    invoke-static {p3, v0, p4}, Lx97;->m(FFF)F

    .line 171
    .line 172
    .line 173
    move-result p3

    .line 174
    invoke-virtual {p2, v1, p3}, Lwk;->e(IF)V

    .line 175
    .line 176
    .line 177
    add-int/lit8 v1, v1, 0x1

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_5
    return-void

    .line 181
    :cond_6
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v4
.end method

.method public constructor <init>(Lio/sentry/android/core/internal/util/t;)V
    .locals 2

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 186
    iput-object v0, p0, Lad1;->c:Ljava/lang/Object;

    .line 187
    iput-object v0, p0, Lad1;->d:Ljava/lang/Object;

    .line 188
    iput-object v0, p0, Lad1;->e:Ljava/lang/Object;

    .line 189
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    iput-object v0, p0, Lad1;->f:Ljava/lang/Object;

    .line 190
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    iput-object v0, p0, Lad1;->g:Ljava/lang/Object;

    .line 191
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    iput-object v0, p0, Lad1;->h:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 192
    iput-wide v0, p0, Lad1;->a:J

    .line 193
    iput-object p1, p0, Lad1;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lad1;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public c()Lug8;
    .locals 0

    .line 1
    iget-object p0, p0, Lad1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lug8;

    .line 4
    .line 5
    return-object p0
.end method

.method public d(J)Lwk;
    .locals 2

    .line 1
    invoke-interface {p0, p1, p2}, Lgk;->e(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lad1;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lnu8;

    .line 10
    .line 11
    iget-object v1, p0, Lad1;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lwk;

    .line 14
    .line 15
    iget-object p0, p0, Lad1;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lwk;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2, v1, p0}, Lnu8;->a(JLwk;Lwk;)Lwk;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    iget-object p0, p0, Lad1;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lwk;

    .line 27
    .line 28
    return-object p0
.end method

.method public f(J)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-interface {p0, p1, p2}, Lgk;->e(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, Lad1;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lug8;

    .line 10
    .line 11
    iget-object v0, v0, Lug8;->b:Lgn2;

    .line 12
    .line 13
    iget-object v1, p0, Lad1;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lnu8;

    .line 16
    .line 17
    iget-object v2, p0, Lad1;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lwk;

    .line 20
    .line 21
    iget-object p0, p0, Lad1;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lwk;

    .line 24
    .line 25
    iget-object v3, v1, Lnu8;->b:Lwk;

    .line 26
    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {v2}, Lwk;->c()Lwk;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iput-object v3, v1, Lnu8;->b:Lwk;

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v3}, Lwk;->b()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x0

    .line 40
    :goto_0
    iget-object v5, v1, Lnu8;->b:Lwk;

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    const-string v7, "valueVector"

    .line 44
    .line 45
    if-ge v4, v3, :cond_2

    .line 46
    .line 47
    if-eqz v5, :cond_1

    .line 48
    .line 49
    iget-object v6, v1, Lnu8;->a:Lqe2;

    .line 50
    .line 51
    invoke-virtual {v2, v4}, Lwk;->a(I)F

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    invoke-virtual {p0, v4}, Lwk;->a(I)F

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    invoke-interface {v6, v7, v8, p1, p2}, Lqe2;->T(FFJ)F

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    invoke-virtual {v5, v4, v6}, Lwk;->e(IF)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v4, v4, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v6

    .line 73
    :cond_2
    if-eqz v5, :cond_3

    .line 74
    .line 75
    invoke-interface {v0, v5}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_3
    invoke-static {v7}, Ldh3;->T(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v6

    .line 84
    :cond_4
    iget-object p0, p0, Lad1;->e:Ljava/lang/Object;

    .line 85
    .line 86
    return-object p0
.end method

.method public g()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lad1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method
