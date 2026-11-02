.class public final Lnd4;
.super Lg1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lsc0;


# direct methods
.method public constructor <init>(Lsc0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnd4;->a:Lsc0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b()Lsc0;
    .locals 0

    .line 1
    iget-object p0, p0, Lnd4;->a:Lsc0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()Lh61;
    .locals 0

    .line 1
    sget-object p0, Lod4;->b:Ldb3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(Lld4;)Lh61;
    .locals 2

    .line 1
    new-instance p0, Ldb3;

    .line 2
    .line 3
    invoke-direct {p0}, Ldb3;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldd4;

    .line 7
    .line 8
    iget-object p1, p1, Lld4;->X:Lj$/time/LocalDateTime;

    .line 9
    .line 10
    invoke-virtual {p1}, Lj$/time/LocalDateTime;->toLocalDate()Lj$/time/LocalDate;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Ldd4;-><init>(Lj$/time/LocalDate;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Ldb3;->a:Lcb3;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lcb3;->b(Ldd4;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lxd4;

    .line 26
    .line 27
    invoke-virtual {p1}, Lj$/time/LocalDateTime;->toLocalTime()Lj$/time/LocalTime;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, p1}, Lxd4;-><init>(Lj$/time/LocalTime;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Ldb3;->b:Leb3;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Leb3;->f(Lxd4;)V

    .line 40
    .line 41
    .line 42
    return-object p0
.end method

.method public final f(Lh61;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ldb3;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, Lld4;

    .line 7
    .line 8
    iget-object v0, p1, Ldb3;->a:Lcb3;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcb3;->c()Ldd4;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object p1, p1, Ldb3;->b:Leb3;

    .line 15
    .line 16
    invoke-virtual {p1}, Leb3;->i()Lxd4;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, v0, p1}, Lld4;-><init>(Ldd4;Lxd4;)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method
