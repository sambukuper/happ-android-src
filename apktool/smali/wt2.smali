.class public final Lwt2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lvc6;


# instance fields
.field public final X:Lvt2;

.field public final Y:Lxt2;


# direct methods
.method public constructor <init>(Lvt2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwt2;->X:Lvt2;

    .line 5
    .line 6
    invoke-interface {p1}, Lvt2;->c()Lxt2;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lwt2;->Y:Lxt2;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lwt2;->X:Lvt2;

    .line 2
    .line 3
    iget-object p0, p0, Lwt2;->Y:Lxt2;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lvt2;->a(Lxt2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lwt2;->X:Lvt2;

    .line 2
    .line 3
    iget-object p0, p0, Lwt2;->Y:Lxt2;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lvt2;->a(Lxt2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final c()V
    .locals 0

    .line 1
    return-void
.end method
