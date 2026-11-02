.class public final Ls84;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lc94;


# instance fields
.field public final X:Lt84;

.field public final Y:Ld94;


# direct methods
.method public constructor <init>(Ld94;Lt84;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls84;->Y:Ld94;

    .line 5
    .line 6
    iput-object p2, p0, Ls84;->X:Lt84;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onDestroy(Ld94;)V
    .locals 0
    .annotation runtime Lqa5;
        value = .enum Ln84;->ON_DESTROY:Ln84;
    .end annotation

    .line 1
    iget-object p0, p0, Ls84;->X:Lt84;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lt84;->l(Ld94;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStart(Ld94;)V
    .locals 0
    .annotation runtime Lqa5;
        value = .enum Ln84;->ON_START:Ln84;
    .end annotation

    .line 1
    iget-object p0, p0, Ls84;->X:Lt84;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lt84;->g(Ld94;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStop(Ld94;)V
    .locals 0
    .annotation runtime Lqa5;
        value = .enum Ln84;->ON_STOP:Ln84;
    .end annotation

    .line 1
    iget-object p0, p0, Ls84;->X:Lt84;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lt84;->h(Ld94;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
