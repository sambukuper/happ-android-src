.class public final Lo02;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final Z:Lo02;

.field public static f0:Lcv5;

.field public static final g0:Ln02;


# instance fields
.field public final X:Ljava/lang/Object;

.field public volatile Y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lo02;

    .line 2
    .line 3
    invoke-direct {v0}, Lo02;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lo02;->Z:Lo02;

    .line 7
    .line 8
    new-instance v7, Li02;

    .line 9
    .line 10
    invoke-direct {v7, v0}, Li02;-><init>(Lo02;)V

    .line 11
    .line 12
    .line 13
    sput-object v7, Lo02;->f0:Lcv5;

    .line 14
    .line 15
    new-instance v1, Ln02;

    .line 16
    .line 17
    const-wide/16 v4, -0x1

    .line 18
    .line 19
    const-string v6, "Empty Thread"

    .line 20
    .line 21
    const-wide/16 v2, -0x1

    .line 22
    .line 23
    invoke-direct/range {v1 .. v7}, Lp98;-><init>(JJLjava/lang/String;Lcv5;)V

    .line 24
    .line 25
    .line 26
    sput-object v1, Lo02;->g0:Ln02;

    .line 27
    .line 28
    sget-object v0, Lnx0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lp02;->X:Lp02;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lo02;->X:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    sget-object p0, Lp02;->X:Lp02;

    .line 2
    .line 3
    invoke-virtual {p0}, Lp02;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
