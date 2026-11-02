.class public final Lrg7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lpw3;

.field public static final b:Lpw3;

.field public static final c:Lpw3;

.field public static final d:Lpw3;

.field public static final e:Ls97;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    sget-object v0, Lyb6;->a:Lzb6;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v0, v2, v3}, Lzb6;->k(Lzu3;Z)Lpw3;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sput-object v2, Lrg7;->a:Lpw3;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-virtual {v0, v1, v2}, Lzb6;->k(Lzu3;Z)Lpw3;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sput-object v1, Lrg7;->b:Lpw3;

    .line 28
    .line 29
    const-class v1, Ljava/lang/Cloneable;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1, v3}, Lzb6;->k(Lzu3;Z)Lpw3;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sput-object v1, Lrg7;->c:Lpw3;

    .line 40
    .line 41
    const-class v1, Ljava/io/Serializable;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1, v3}, Lzb6;->k(Lzu3;Z)Lpw3;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sput-object v1, Lrg7;->d:Lpw3;

    .line 52
    .line 53
    new-instance v2, Ls97;

    .line 54
    .line 55
    const-class v1, Ldn8;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    new-instance v6, Lqc3;

    .line 62
    .line 63
    sget-object v4, Ld02;->X:Ld02;

    .line 64
    .line 65
    invoke-direct {v6, v4}, Lqc3;-><init>(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const/4 v11, 0x0

    .line 69
    sget-object v12, Ltz;->r0:Ltz;

    .line 70
    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v8, 0x0

    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    invoke-direct/range {v2 .. v12}, Ls97;-><init>(Llv3;Ljava/util/List;ZLg44;Lpw3;ZZZLzu3;Ldn2;)V

    .line 77
    .line 78
    .line 79
    sput-object v2, Lrg7;->e:Ls97;

    .line 80
    .line 81
    return-void
.end method
