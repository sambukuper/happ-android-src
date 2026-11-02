.class public final Lrd8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Llh7;


# instance fields
.field public final X:Lyd8;

.field public Y:Lgn2;

.field public Z:Lgn2;

.field public final synthetic f0:Lsd8;


# direct methods
.method public constructor <init>(Lsd8;Lyd8;Lgn2;Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrd8;->f0:Lsd8;

    .line 5
    .line 6
    iput-object p2, p0, Lrd8;->X:Lyd8;

    .line 7
    .line 8
    iput-object p3, p0, Lrd8;->Y:Lgn2;

    .line 9
    .line 10
    iput-object p4, p0, Lrd8;->Z:Lgn2;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lwd8;Ljava/lang/Object;Lwk;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lrd8;->Z:Lgn2;

    .line 2
    .line 3
    invoke-interface {p1}, Lwd8;->c()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lrd8;->f0:Lsd8;

    .line 12
    .line 13
    iget-object v1, v1, Lsd8;->c:Lce8;

    .line 14
    .line 15
    invoke-virtual {v1}, Lce8;->g()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, Lrd8;->X:Lyd8;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object p2, p0, Lrd8;->Z:Lgn2;

    .line 24
    .line 25
    invoke-interface {p1}, Lwd8;->a()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-interface {p2, p3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iget-object p0, p0, Lrd8;->Y:Lgn2;

    .line 34
    .line 35
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Lta2;

    .line 40
    .line 41
    invoke-virtual {v2, p2, v0, p0}, Lyd8;->f(Ljava/lang/Object;Ljava/lang/Object;Lta2;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget-object p0, p0, Lrd8;->Y:Lgn2;

    .line 46
    .line 47
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Lta2;

    .line 52
    .line 53
    invoke-virtual {v2, v0, p0, p2, p3}, Lyd8;->g(Ljava/lang/Object;Lta2;Ljava/lang/Object;Lwk;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lrd8;->f0:Lsd8;

    .line 2
    .line 3
    iget-object v0, v0, Lsd8;->c:Lce8;

    .line 4
    .line 5
    invoke-virtual {v0}, Lce8;->f()Lwd8;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v0, v1, v1}, Lrd8;->a(Lwd8;Ljava/lang/Object;Lwk;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lrd8;->X:Lyd8;

    .line 14
    .line 15
    iget-object p0, p0, Lyd8;->j0:Lrh5;

    .line 16
    .line 17
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
