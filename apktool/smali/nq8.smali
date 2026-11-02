.class public final Lnq8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ljr8;

.field public final b:Lpr8;

.field public final c:Lqq8;

.field public final d:Lv06;

.field public final e:Lv06;

.field public final f:Lv06;

.field public final g:I

.field public final h:Lpv;

.field public final i:Lvz7;

.field public final j:Lvz7;


# direct methods
.method public constructor <init>(Ljr8;Lpr8;Lqq8;Lv06;Lv06;Lv06;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lnq8;->a:Ljr8;

    .line 23
    .line 24
    iput-object p2, p0, Lnq8;->b:Lpr8;

    .line 25
    .line 26
    iput-object p3, p0, Lnq8;->c:Lqq8;

    .line 27
    .line 28
    iput-object p4, p0, Lnq8;->d:Lv06;

    .line 29
    .line 30
    iput-object p5, p0, Lnq8;->e:Lv06;

    .line 31
    .line 32
    iput-object p6, p0, Lnq8;->f:Lv06;

    .line 33
    .line 34
    sget-object p1, Loq8;->a:Lqv;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object p2, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iput p1, p0, Lnq8;->g:I

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    invoke-static {p1}, Lnr4;->e(Z)Lpv;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    iput-object p2, p0, Lnq8;->h:Lpv;

    .line 53
    .line 54
    const-string p2, "CXCP"

    .line 55
    .line 56
    invoke-static {p2}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_0

    .line 61
    .line 62
    invoke-virtual {p0}, Lnq8;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    :cond_0
    new-instance p2, Llq8;

    .line 66
    .line 67
    invoke-direct {p2, p0, p1}, Llq8;-><init>(Lnq8;B)V

    .line 68
    .line 69
    .line 70
    new-instance p1, Lvz7;

    .line 71
    .line 72
    invoke-direct {p1, p2}, Lvz7;-><init>(Ldn2;)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lnq8;->i:Lvz7;

    .line 76
    .line 77
    new-instance p1, Llq8;

    .line 78
    .line 79
    const/4 p2, 0x1

    .line 80
    invoke-direct {p1, p0, p2}, Llq8;-><init>(Lnq8;B)V

    .line 81
    .line 82
    .line 83
    new-instance p2, Lvz7;

    .line 84
    .line 85
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 86
    .line 87
    .line 88
    iput-object p2, p0, Lnq8;->j:Lvz7;

    .line 89
    .line 90
    new-instance p1, Llq8;

    .line 91
    .line 92
    const/4 p2, 0x2

    .line 93
    invoke-direct {p1, p0, p2}, Llq8;-><init>(Lnq8;B)V

    .line 94
    .line 95
    .line 96
    new-instance p0, Lvz7;

    .line 97
    .line 98
    invoke-direct {p0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "UseCaseCamera-"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, Lnq8;->g:I

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
