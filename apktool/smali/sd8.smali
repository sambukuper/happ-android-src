.class public final Lsd8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lug8;

.field public final b:Lrh5;

.field public final synthetic c:Lce8;


# direct methods
.method public constructor <init>(Lce8;Lug8;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsd8;->c:Lce8;

    .line 5
    .line 6
    iput-object p2, p0, Lsd8;->a:Lug8;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lsd8;->b:Lrh5;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lgn2;Ljava/lang/Object;Lwk;Lgn2;)Lrd8;
    .locals 8

    .line 1
    iget-object v0, p0, Lsd8;->b:Lrh5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lrd8;

    .line 8
    .line 9
    iget-object v2, p0, Lsd8;->c:Lce8;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lrd8;

    .line 14
    .line 15
    new-instance v3, Lyd8;

    .line 16
    .line 17
    invoke-virtual {v2}, Lce8;->c()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-interface {p4, v4}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v2}, Lce8;->c()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {p4, v5}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v6, p0, Lsd8;->a:Lug8;

    .line 34
    .line 35
    iget-object v7, v6, Lug8;->a:Lgn2;

    .line 36
    .line 37
    invoke-interface {v7, v5}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Lwk;

    .line 42
    .line 43
    invoke-virtual {v5}, Lwk;->d()V

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, v2, v4, v5, v6}, Lyd8;-><init>(Lce8;Ljava/lang/Object;Lwk;Lug8;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, p0, v3, p1, p4}, Lrd8;-><init>(Lsd8;Lyd8;Lgn2;Lgn2;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p0, v2, Lce8;->j:Lvd7;

    .line 56
    .line 57
    invoke-virtual {p0, v3}, Lvd7;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_0
    iput-object p4, v1, Lrd8;->Z:Lgn2;

    .line 61
    .line 62
    iput-object p1, v1, Lrd8;->Y:Lgn2;

    .line 63
    .line 64
    invoke-virtual {v2}, Lce8;->f()Lwd8;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {v1, p0, p2, p3}, Lrd8;->a(Lwd8;Ljava/lang/Object;Lwk;)V

    .line 69
    .line 70
    .line 71
    return-object v1
.end method
