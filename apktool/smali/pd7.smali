.class public final Lpd7;
.super Lbi7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lbi7;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lpd7;->c:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lbi7;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lpd7;

    .line 5
    .line 6
    iget-object p1, p1, Lpd7;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p1, p0, Lpd7;->c:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public final b()Lbi7;
    .locals 3

    .line 1
    new-instance v0, Lpd7;

    .line 2
    .line 3
    invoke-static {}, Lkd7;->h()Ldd7;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ldd7;->g()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    iget-object p0, p0, Lpd7;->c:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, p0}, Lpd7;-><init>(JLjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final c(J)Lbi7;
    .locals 1

    .line 1
    new-instance v0, Lpd7;

    .line 2
    .line 3
    iget-object p0, p0, Lpd7;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, p0}, Lpd7;-><init>(JLjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
