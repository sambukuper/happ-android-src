.class public final Lio/sentry/android/core/internal/util/h;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:C

.field public final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final c:I

.field public final d:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(JI)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lio/sentry/android/core/internal/util/h;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lio/sentry/android/core/internal/util/h;->d:Ljava/util/concurrent/atomic/AtomicLong;

    .line 20
    .line 21
    long-to-int p1, p1

    .line 22
    iput-char p1, p0, Lio/sentry/android/core/internal/util/h;->a:C

    .line 23
    .line 24
    if-gtz p3, :cond_0

    .line 25
    .line 26
    const/4 p3, 0x1

    .line 27
    :cond_0
    iput p3, p0, Lio/sentry/android/core/internal/util/h;->c:I

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 10

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lio/sentry/android/core/internal/util/h;->d:Ljava/util/concurrent/atomic/AtomicLong;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    const-wide/16 v5, 0x0

    .line 12
    .line 13
    cmp-long v3, v3, v5

    .line 14
    .line 15
    iget-object v4, p0, Lio/sentry/android/core/internal/util/h;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    iget-char v3, p0, Lio/sentry/android/core/internal/util/h;->a:C

    .line 25
    .line 26
    int-to-long v8, v3

    .line 27
    add-long/2addr v6, v8

    .line 28
    cmp-long v3, v6, v0

    .line 29
    .line 30
    if-gtz v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget p0, p0, Lio/sentry/android/core/internal/util/h;->c:I

    .line 38
    .line 39
    if-ge v0, p0, :cond_1

    .line 40
    .line 41
    return v5

    .line 42
    :cond_1
    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_2
    :goto_0
    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 51
    .line 52
    .line 53
    return v5
.end method
