.class public final Lmd7;
.super Lbi7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public c:I


# direct methods
.method public constructor <init>(JI)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lbi7;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lmd7;->c:I

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
    check-cast p1, Lmd7;

    .line 5
    .line 6
    iget p1, p1, Lmd7;->c:I

    .line 7
    .line 8
    iput p1, p0, Lmd7;->c:I

    .line 9
    .line 10
    return-void
.end method

.method public final b()Lbi7;
    .locals 2

    .line 1
    invoke-static {}, Lkd7;->h()Ldd7;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldd7;->g()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, v0, v1}, Lmd7;->c(J)Lbi7;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final c(J)Lbi7;
    .locals 1

    .line 1
    new-instance v0, Lmd7;

    .line 2
    .line 3
    iget p0, p0, Lmd7;->c:I

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, p0}, Lmd7;-><init>(JI)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
