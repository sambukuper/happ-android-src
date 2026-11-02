.class public final Lqs5;
.super Lcq2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field private static final DEFAULT_INSTANCE:Lqs5;

.field private static volatile PARSER:Lji5; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lji5;"
        }
    .end annotation
.end field

.field public static final STRINGS_FIELD_NUMBER:I = 0x1


# instance fields
.field private strings_:Lcg3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcg3;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqs5;

    .line 2
    .line 3
    invoke-direct {v0}, Lqs5;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lqs5;->DEFAULT_INSTANCE:Lqs5;

    .line 7
    .line 8
    const-class v1, Lqs5;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcq2;->j(Ljava/lang/Class;Lcq2;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcq2;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lm06;->f0:Lm06;

    .line 5
    .line 6
    iput-object v0, p0, Lqs5;->strings_:Lcg3;

    .line 7
    .line 8
    return-void
.end method

.method public static m()Lqs5;
    .locals 1

    .line 1
    sget-object v0, Lqs5;->DEFAULT_INSTANCE:Lqs5;

    .line 2
    .line 3
    return-object v0
.end method

.method public static o()Lps5;
    .locals 2

    .line 1
    sget-object v0, Lqs5;->DEFAULT_INSTANCE:Lqs5;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-virtual {v0, v1}, Lqs5;->c(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lvp2;

    .line 9
    .line 10
    check-cast v0, Lps5;

    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public final c(I)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lp61;->B(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    sget-object p0, Lqs5;->PARSER:Lji5;

    .line 15
    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    const-class p1, Lqs5;

    .line 19
    .line 20
    monitor-enter p1

    .line 21
    :try_start_0
    sget-object p0, Lqs5;->PARSER:Lji5;

    .line 22
    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    new-instance p0, Lwp2;

    .line 26
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    sput-object p0, Lqs5;->PARSER:Lji5;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    monitor-exit p1

    .line 36
    return-object p0

    .line 37
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw p0

    .line 39
    :cond_1
    return-object p0

    .line 40
    :pswitch_1
    sget-object p0, Lqs5;->DEFAULT_INSTANCE:Lqs5;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_2
    new-instance p0, Lps5;

    .line 44
    .line 45
    sget-object p1, Lqs5;->DEFAULT_INSTANCE:Lqs5;

    .line 46
    .line 47
    invoke-direct {p0, p1}, Lvp2;-><init>(Lcq2;)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_3
    new-instance p0, Lqs5;

    .line 52
    .line 53
    invoke-direct {p0}, Lqs5;-><init>()V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_4
    const-string p0, "strings_"

    .line 58
    .line 59
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const-string p1, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"

    .line 64
    .line 65
    sget-object v0, Lqs5;->DEFAULT_INSTANCE:Lqs5;

    .line 66
    .line 67
    new-instance v1, Lp66;

    .line 68
    .line 69
    invoke-direct {v1, v0, p1, p0}, Lp66;-><init>(Lcq2;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :pswitch_5
    const/4 p0, 0x0

    .line 74
    return-object p0

    .line 75
    :pswitch_6
    const/4 p0, 0x1

    .line 76
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
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

.method public final l(Ljava/lang/Iterable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lqs5;->strings_:Lcg3;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lm06;

    .line 5
    .line 6
    iget-boolean v1, v1, Lm06;->X:Z

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    check-cast v0, Lm06;

    .line 11
    .line 12
    iget v1, v0, Lm06;->Z:I

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    const/16 v1, 0xa

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    mul-int/lit8 v1, v1, 0x2

    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0, v1}, Lm06;->c(I)Lm06;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lqs5;->strings_:Lcg3;

    .line 26
    .line 27
    :cond_1
    sget-object p0, Leg3;->a:Ljava/nio/charset/Charset;

    .line 28
    .line 29
    instance-of p0, p1, Lu74;

    .line 30
    .line 31
    if-nez p0, :cond_7

    .line 32
    .line 33
    instance-of p0, p1, Lau5;

    .line 34
    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    check-cast p1, Ljava/util/Collection;

    .line 38
    .line 39
    check-cast v0, Lm06;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lm06;->addAll(Ljava/util/Collection;)Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    instance-of p0, v0, Ljava/util/ArrayList;

    .line 46
    .line 47
    if-eqz p0, :cond_3

    .line 48
    .line 49
    instance-of p0, p1, Ljava/util/Collection;

    .line 50
    .line 51
    if-eqz p0, :cond_3

    .line 52
    .line 53
    move-object p0, v0

    .line 54
    check-cast p0, Ljava/util/ArrayList;

    .line 55
    .line 56
    move-object v1, v0

    .line 57
    check-cast v1, Lm06;

    .line 58
    .line 59
    iget v1, v1, Lm06;->Z:I

    .line 60
    .line 61
    move-object v2, p1

    .line 62
    check-cast v2, Ljava/util/Collection;

    .line 63
    .line 64
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    add-int/2addr v2, v1

    .line 69
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 70
    .line 71
    .line 72
    :cond_3
    check-cast v0, Lm06;

    .line 73
    .line 74
    iget p0, v0, Lm06;->Z:I

    .line 75
    .line 76
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_6

    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-nez v1, :cond_5

    .line 91
    .line 92
    new-instance p1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v1, "Element at index "

    .line 95
    .line 96
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget v1, v0, Lm06;->Z:I

    .line 100
    .line 101
    sub-int/2addr v1, p0

    .line 102
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v1, " is null."

    .line 106
    .line 107
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget v1, v0, Lm06;->Z:I

    .line 115
    .line 116
    add-int/lit8 v1, v1, -0x1

    .line 117
    .line 118
    :goto_2
    if-lt v1, p0, :cond_4

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lm06;->remove(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    add-int/lit8 v1, v1, -0x1

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    invoke-static {p1}, Lb61;->i(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_5
    invoke-virtual {v0, v1}, Lm06;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    return-void

    .line 135
    :cond_7
    check-cast p1, Lu74;

    .line 136
    .line 137
    invoke-interface {p1}, Lu74;->g()Ljava/util/List;

    .line 138
    .line 139
    .line 140
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method public final n()Lcg3;
    .locals 0

    .line 1
    iget-object p0, p0, Lqs5;->strings_:Lcg3;

    .line 2
    .line 3
    return-object p0
.end method
