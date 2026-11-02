.class public abstract Lbi7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:J

.field public b:Lbi7;


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lbi7;->a:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract a(Lbi7;)V
.end method

.method public b()Lbi7;
    .locals 2

    .line 1
    invoke-static {}, Lkd7;->h()Ldd7;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ldd7;->g()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    new-instance p0, Lyi1;

    .line 10
    .line 11
    invoke-direct {p0, v0, v1}, Lyi1;-><init>(J)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public c(J)Lbi7;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbi7;->b()Lbi7;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iput-wide p1, p0, Lbi7;->a:J

    .line 6
    .line 7
    return-object p0
.end method
