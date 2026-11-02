.class public final synthetic Lw95;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic X:Lg94;

.field public final synthetic Y:Ljf1;


# direct methods
.method public synthetic constructor <init>(Lg94;Ljf1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw95;->X:Lg94;

    .line 5
    .line 6
    iput-object p2, p0, Lw95;->Y:Ljf1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw95;->X:Lg94;

    .line 2
    .line 3
    iget-object p0, p0, Lw95;->Y:Ljf1;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lg94;->f(Lc94;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
