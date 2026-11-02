.class public final Lfw6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lbw6;


# instance fields
.field public final synthetic X:Lrn2;

.field public final synthetic Y:Lgn2;


# direct methods
.method public constructor <init>(Lrn2;Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfw6;->X:Lrn2;

    .line 5
    .line 6
    iput-object p2, p0, Lfw6;->Y:Lgn2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final U(Lhv6;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lfw6;->X:Lrn2;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lfw6;->Y:Lgn2;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
