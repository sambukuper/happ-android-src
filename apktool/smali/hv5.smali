.class public final Lhv5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ly05;
.implements Lb71;


# instance fields
.field public final synthetic X:Ly05;

.field public final Y:Ls61;


# direct methods
.method public constructor <init>(Ly05;Ls61;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhv5;->X:Ly05;

    .line 5
    .line 6
    iput-object p2, p0, Lhv5;->Y:Ls61;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getCoroutineContext()Ls61;
    .locals 0

    .line 1
    iget-object p0, p0, Lhv5;->Y:Ls61;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lhv5;->X:Ly05;

    .line 2
    .line 3
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lhv5;->X:Ly05;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
