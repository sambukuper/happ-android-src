.class public final Li79;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic Y:B

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Li79;->Y:B

    .line 2
    .line 3
    iput-object p1, p0, Li79;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Li79;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Li79;->Y:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget-object v4, p0, Li79;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Li79;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Lio/sentry/android/replay/capture/k;

    .line 15
    .line 16
    check-cast p0, Lio/sentry/android/replay/capture/m;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    instance-of v0, p1, Lio/sentry/android/replay/capture/i;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    check-cast p1, Lio/sentry/android/replay/capture/i;

    .line 26
    .line 27
    iget-object v0, p0, Lio/sentry/android/replay/capture/m;->w:Lio/sentry/i1;

    .line 28
    .line 29
    invoke-static {p1, v0}, Lio/sentry/android/replay/capture/i;->a(Lio/sentry/android/replay/capture/i;Lio/sentry/i1;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p1, -0x1

    .line 33
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/c;->k(I)V

    .line 34
    .line 35
    .line 36
    check-cast v4, Ljava/io/File;

    .line 37
    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {v4}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_4

    .line 46
    .line 47
    array-length p1, p0

    .line 48
    :goto_0
    if-ge v2, p1, :cond_4

    .line 49
    .line 50
    aget-object v0, p0, v2

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    invoke-static {v0}, Lda2;->S(Ljava/io/File;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-string v5, "mp4"

    .line 63
    .line 64
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_3

    .line 69
    .line 70
    :cond_2
    invoke-static {v0}, Lio/sentry/util/b;->g(Ljava/io/File;)Z

    .line 71
    .line 72
    .line 73
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 77
    .line 78
    .line 79
    :goto_1
    return-object v3

    .line 80
    :pswitch_0
    check-cast p1, Lio/sentry/android/replay/capture/k;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    check-cast p0, Lio/sentry/android/replay/capture/f;

    .line 86
    .line 87
    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->y:Ljava/util/ArrayList;

    .line 88
    .line 89
    iget-object p0, p0, Lio/sentry/android/replay/capture/f;->w:Lio/sentry/i1;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-eqz v5, :cond_5

    .line 99
    .line 100
    move-object v5, v1

    .line 101
    goto :goto_2

    .line 102
    :cond_5
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    :goto_2
    check-cast v5, Lio/sentry/android/replay/capture/i;

    .line 107
    .line 108
    :goto_3
    if-eqz v5, :cond_7

    .line 109
    .line 110
    invoke-static {v5, p0}, Lio/sentry/android/replay/capture/i;->a(Lio/sentry/android/replay/capture/i;Lio/sentry/i1;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_6

    .line 118
    .line 119
    move-object v5, v1

    .line 120
    goto :goto_4

    .line 121
    :cond_6
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    :goto_4
    check-cast v5, Lio/sentry/android/replay/capture/i;

    .line 126
    .line 127
    const-wide/16 v6, 0x64

    .line 128
    .line 129
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    instance-of v0, p1, Lio/sentry/android/replay/capture/i;

    .line 134
    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    check-cast p1, Lio/sentry/android/replay/capture/i;

    .line 138
    .line 139
    invoke-static {p1, p0}, Lio/sentry/android/replay/capture/i;->a(Lio/sentry/android/replay/capture/i;Lio/sentry/i1;)V

    .line 140
    .line 141
    .line 142
    check-cast v4, Lgn2;

    .line 143
    .line 144
    iget-object p0, p1, Lio/sentry/android/replay/capture/i;->a:Lio/sentry/u6;

    .line 145
    .line 146
    iget-object p0, p0, Lio/sentry/u6;->w0:Ljava/util/Date;

    .line 147
    .line 148
    invoke-interface {v4, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    :cond_8
    return-object v3

    .line 152
    :pswitch_1
    check-cast p1, Ldo5;

    .line 153
    .line 154
    check-cast v4, Lj79;

    .line 155
    .line 156
    check-cast p0, Leo5;

    .line 157
    .line 158
    iget v0, v4, Lj79;->q0:F

    .line 159
    .line 160
    invoke-virtual {p1, p0}, Ldo5;->d(Leo5;)V

    .line 161
    .line 162
    .line 163
    iget-wide v4, p0, Leo5;->g0:J

    .line 164
    .line 165
    const-wide/16 v6, 0x0

    .line 166
    .line 167
    invoke-static {v6, v7, v4, v5}, Lhf3;->c(JJ)J

    .line 168
    .line 169
    .line 170
    move-result-wide v4

    .line 171
    invoke-virtual {p0, v4, v5, v0, v1}, Leo5;->S(JFLgn2;)V

    .line 172
    .line 173
    .line 174
    return-object v3

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
