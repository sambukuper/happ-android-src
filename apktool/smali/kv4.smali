.class public final Lkv4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ler8;
.implements Le63;


# instance fields
.field public final X:Lk05;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lk05;->j()Lk05;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Ler8;->N:Lzx;

    .line 9
    .line 10
    sget-object v2, Lrl0;->a:Lrl0;

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lu18;->I:Lzx;

    .line 16
    .line 17
    const-string v2, "MeteringRepeating"

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v1, Ler8;->W:Lzx;

    .line 23
    .line 24
    sget-object v2, Lgr8;->h0:Lgr8;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lkv4;->X:Lk05;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final m()Ll11;
    .locals 0

    .line 1
    iget-object p0, p0, Lkv4;->X:Lk05;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()I
    .locals 0

    .line 1
    const/16 p0, 0x22

    .line 2
    .line 3
    return p0
.end method

.method public final s()Lgr8;
    .locals 0

    .line 1
    sget-object p0, Lgr8;->h0:Lgr8;

    .line 2
    .line 3
    return-object p0
.end method
