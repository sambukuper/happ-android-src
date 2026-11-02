.class public final synthetic Lbx4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:Low4;

.field public final synthetic Y:Ldn2;

.field public final synthetic Z:Lax4;

.field public final synthetic f0:J

.field public final synthetic g0:Lz24;


# direct methods
.method public synthetic constructor <init>(Low4;Ldn2;Lax4;JLz24;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbx4;->X:Low4;

    .line 5
    .line 6
    iput-object p2, p0, Lbx4;->Y:Ldn2;

    .line 7
    .line 8
    iput-object p3, p0, Lbx4;->Z:Lax4;

    .line 9
    .line 10
    iput-wide p4, p0, Lbx4;->f0:J

    .line 11
    .line 12
    iput-object p6, p0, Lbx4;->g0:Lz24;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-wide v3, p0, Lbx4;->f0:J

    .line 2
    .line 3
    iget-object v5, p0, Lbx4;->g0:Lz24;

    .line 4
    .line 5
    iget-object v0, p0, Lbx4;->X:Low4;

    .line 6
    .line 7
    iget-object v1, p0, Lbx4;->Y:Ldn2;

    .line 8
    .line 9
    iget-object v2, p0, Lbx4;->Z:Lax4;

    .line 10
    .line 11
    invoke-virtual/range {v0 .. v5}, Low4;->g(Ldn2;Lax4;JLz24;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Ldn8;->a:Ldn8;

    .line 15
    .line 16
    return-object p0
.end method
