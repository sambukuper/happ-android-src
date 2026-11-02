.class public Lp98;
.super Ldb7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final f0:J


# direct methods
.method public constructor <init>(JJLjava/lang/String;Lcv5;)V
    .locals 0

    .line 1
    iget-object p3, p6, Ldb7;->X:Lo02;

    .line 2
    .line 3
    sget-object p4, Lnx0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 4
    .line 5
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 6
    .line 7
    .line 8
    move-result-wide p4

    .line 9
    invoke-direct {p0, p3, p4, p5}, Ldb7;-><init>(Lo02;J)V

    .line 10
    .line 11
    .line 12
    iput-wide p1, p0, Lp98;->f0:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final g()V
    .locals 0

    .line 1
    return-void
.end method
